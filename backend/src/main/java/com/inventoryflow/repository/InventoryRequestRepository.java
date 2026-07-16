package com.inventoryflow.repository;

import com.inventoryflow.entity.InventoryRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRequestRepository
        extends JpaRepository<InventoryRequest, Long> {
}