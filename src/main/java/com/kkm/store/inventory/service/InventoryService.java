package com.kkm.store.inventory.service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkm.store.inventory.model.Inventory;
import com.kkm.store.inventory.repository.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Map<String, Object>  getStock(String product) {
        Inventory inventory = inventoryRepository.findByProduct(product);
        Map<String, Object> response = new HashMap<>();
        response.put("inventory", inventory);
        return response;
    }
    
}
