package com.perscholas.jpa.dto;

import com.perscholas.jpa.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;
}
