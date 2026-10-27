package kr.ac.kopo.yoon.bookmarket.service;

import kr.ac.kopo.yoon.bookmarket.domain.Order;

public interface OrderService {
    void confirmOrder(String bookId, Long quantity);
    Long saveOrder(Order order);
}