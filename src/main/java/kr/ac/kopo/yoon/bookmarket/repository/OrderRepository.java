package kr.ac.kopo.yoon.bookmarket.repository;

import kr.ac.kopo.yoon.bookmarket.domain.Order;

public interface OrderRepository {
    Long saveOrder(Order order);

}