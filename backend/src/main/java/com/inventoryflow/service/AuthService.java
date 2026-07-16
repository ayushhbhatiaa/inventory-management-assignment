package com.inventoryflow.service;

import com.inventoryflow.dto.LoginRequest;
import com.inventoryflow.dto.LoginResponse;
import com.inventoryflow.entity.Employee;
import com.inventoryflow.repository.EmployeeRepository;
import com.inventoryflow.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final EmployeeRepository employeeRepository;
    private final JwtUtil jwtUtil;

    public LoginResponse login(LoginRequest request){

        Employee employee = employeeRepository
                .findByUsername(request.getUsername())
                .orElseThrow(() ->
                        new RuntimeException("Invalid username"));

        if(!employee.getPassword().equals(request.getPassword())){
            throw new RuntimeException("Invalid password");
        }

        String token =
                jwtUtil.generateToken(employee.getUsername());

        return LoginResponse.builder()
                .token(token)
                .username(employee.getUsername())
                .fullName(employee.getFullName())
                .role(employee.getRole().name())
                .build();
    }

}