package ru.learnup.learnup.spring.mvc.homework30.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.learnup.spring.mvc.homework30.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
