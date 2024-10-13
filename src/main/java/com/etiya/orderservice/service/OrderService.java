package com.etiya.orderservice.service;

import com.etiya.orderservice.dto.*;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    CreateOrderResponseDto createOrder(CreateOrderRequestDto createOrderRequestDto);
    UpdateOrderResponseDto updateOrder(UpdateOrderRequestDto updateOrderRequestDto);
    void deleteOrder(UUID id);
    GetOrderResponseDto getOrder(String orderId);
    List<GetOrderResponseDto> getAllOrders();
}
