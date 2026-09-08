package kr.ac.kopo.yoon.bookmarket.repository;

import kr.ac.kopo.yoon.bookmarket.domain.Cart;

public interface CartRepository {
    Cart create(Cart cart);
    Cart read(String cartId);
}
