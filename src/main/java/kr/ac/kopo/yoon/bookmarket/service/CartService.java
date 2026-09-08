package kr.ac.kopo.yoon.bookmarket.service;

import kr.ac.kopo.yoon.bookmarket.domain.Cart;

public interface CartService {
    Cart create(Cart cart);
    Cart read(String cartId);
}
