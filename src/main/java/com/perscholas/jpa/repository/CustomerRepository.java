package com.perscholas.jpa.repository;

import com.perscholas.jpa.dto.OrderResponse;
import com.perscholas.jpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT new com.perscholas.jpa.dto.OrderResponse(c.name, p.productName) FROM CUSTOMER c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
