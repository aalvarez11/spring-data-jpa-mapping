package com.perscholas.jpa.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long pid;
    @NonNull
    String productName;
    @NonNull
    int qty;
    @NonNull
    int price;
}
