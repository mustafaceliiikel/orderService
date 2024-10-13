package com.etiya.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ListOrderResponseDto {
    private UUID id;
    private int cartId;
    private LocalDate date;
    private LocalDateTime createdTime;
}
