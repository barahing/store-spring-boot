package com.example.store.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private String address;
} 