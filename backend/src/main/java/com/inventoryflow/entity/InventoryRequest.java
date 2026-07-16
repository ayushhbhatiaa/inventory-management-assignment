package com.inventoryflow.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "inventory_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private String employeeName;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer requestedQuantity;

    private LocalDate requestDate;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;
}