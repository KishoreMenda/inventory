package com.kkm.store.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "inventory")
public class Inventory {

    @Id
    private String id;
    
    private String product; // This should match the "product" field in the Order model
    private int stock;      // Amount of stock available for the product
}
