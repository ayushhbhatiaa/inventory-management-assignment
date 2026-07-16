package com.inventoryflow.service;

import com.inventoryflow.entity.InventoryRequest;
import com.inventoryflow.repository.InventoryRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import com.inventoryflow.entity.RequestStatus;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryRequestService {

    private final InventoryRequestRepository repository;

    public List<InventoryRequest> getAllRequests() {
        return repository.findAll();
    }

    public InventoryRequest save(InventoryRequest request) {
        request.setStatus(RequestStatus.PENDING);
        request.setRequestDate(LocalDate.now());
        return repository.save(request);
    }

    public InventoryRequest update(Long id, InventoryRequest request) {

        InventoryRequest existing = repository.findById(id).orElseThrow();

        existing.setEmployeeName(request.getEmployeeName());
        existing.setProduct(request.getProduct());
        existing.setRequestedQuantity(request.getRequestedQuantity());
        existing.setStatus(request.getStatus());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}