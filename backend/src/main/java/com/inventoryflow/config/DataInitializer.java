package com.inventoryflow.config;

import com.inventoryflow.entity.Employee;
import com.inventoryflow.entity.UserRole;
import com.inventoryflow.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) {

        // Admin User
        if (!employeeRepository.existsByUsername("admin")) {

            Employee admin = Employee.builder()
                    .fullName("System Administrator")
                    .username("admin")
                    .password("admin123")
                    .email("admin@inventoryflow.com")
                    .role(UserRole.ADMIN)
                    .build();

            employeeRepository.save(admin);
        }

        // Creator User
        if (!employeeRepository.existsByUsername("creator")) {

            Employee creator = Employee.builder()
                    .fullName("Ayush Bhatia")
                    .username("creator")
                    .password("creator123")
                    .email("creator@inventoryflow.com")
                    .role(UserRole.CREATOR)
                    .build();

            employeeRepository.save(creator);
        }

        // Purchaser User
        if (!employeeRepository.existsByUsername("purchaser")) {

            Employee purchaser = Employee.builder()
                    .fullName("Purchase Manager")
                    .username("purchaser")
                    .password("purchaser123")
                    .email("purchaser@inventoryflow.com")
                    .role(UserRole.PURCHASER)
                    .build();

            employeeRepository.save(purchaser);
        }

    }
}