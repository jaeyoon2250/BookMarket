package kr.ac.kopo.yoon.bookmarket.repository;

import kr.ac.kopo.yoon.bookmarket.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProRepository extends JpaRepository<Order,Long> {
}
