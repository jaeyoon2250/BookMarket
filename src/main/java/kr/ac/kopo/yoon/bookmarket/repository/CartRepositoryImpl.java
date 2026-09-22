package kr.ac.kopo.yoon.bookmarket.repository;

import kr.ac.kopo.yoon.bookmarket.domain.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Repository
public class CartRepositoryImpl implements CartRepository{
    private Map<String, Cart> listOfCart;

    public CartRepositoryImpl() {
        listOfCart = new HashMap<String, Cart>();
    }

    @Override
    public Cart create(Cart cart) {
        if (listOfCart.keySet().contains(cart.getCartId())){
            throw new IllegalArgumentException(String.format("장바구니를 새로 생성할 수 없습니다. 장바구니 %s id가 이미 존재합니다.", cart.getCartId()));
        }

        listOfCart.put(cart.getCartId(), cart);

        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return listOfCart.get(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        if (!listOfCart.keySet().contains(cart.getCartId())){
            throw new IllegalArgumentException(String.format("장바구니 목록을 갱신할 수 없습니다. 장바구니 %s id가 존재하지 않습니다.", cartId));
        }

        listOfCart.put(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
        if (!listOfCart.keySet().contains(cartId)){
            throw new IllegalArgumentException(String.format("장바구니 id(%s)가 존재하지 않아 장바구니 목록을 삭제할 수 없습니다.", cartId));
        }

        listOfCart.remove(cartId);
    }
}
