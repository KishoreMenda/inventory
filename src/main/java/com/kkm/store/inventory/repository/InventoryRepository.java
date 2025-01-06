package com.kkm.store.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kkm.store.inventory.model.Inventory;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String>{
    Inventory findByProduct(String product);
}
