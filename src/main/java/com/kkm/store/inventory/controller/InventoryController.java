package com.kkm.store.inventory.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.kkm.store.inventory.service.InventoryService;


@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{product}")
    public Map<String, Object> getProduct(@PathVariable String product) {
        return inventoryService.getStock(product);
    }
    

}

