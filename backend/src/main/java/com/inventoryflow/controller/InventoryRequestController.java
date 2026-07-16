package com.inventoryflow.controller;

import com.inventoryflow.entity.InventoryRequest;
import com.inventoryflow.service.InventoryRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventoryRequests")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class InventoryRequestController {

    private final InventoryRequestService service;

    @GetMapping("/getAllRequests")
    public ResponseEntity<List<InventoryRequest>> getAllRequests() {
        return ResponseEntity.ok(service.getAllRequests());
    }

    @PostMapping("/addRequest")
    public ResponseEntity<InventoryRequest> addRequest(@RequestBody InventoryRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(request));
    }

    @PutMapping("/updateRequest/{id}")
    public ResponseEntity<InventoryRequest> updateRequest(
            @PathVariable Long id,
            @RequestBody InventoryRequest request) {

        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/deleteRequest/{id}")
    public ResponseEntity<String> deleteRequest(@PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.ok("Request deleted successfully.");
    }

    @PostMapping("/test")
    public String testPost() {
        return "POST is working";
    }
}