package com.inventoryflow.service;

import com.inventoryflow.entity.Employee;
import com.inventoryflow.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public Employee update(Long id, Employee employee) {

        Employee existing = repository.findById(id).orElseThrow();

        existing.setFullName(employee.getFullName());
        existing.setUsername(employee.getUsername());
        existing.setPassword(employee.getPassword());
        existing.setEmail(employee.getEmail());
        existing.setRole(employee.getRole());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}