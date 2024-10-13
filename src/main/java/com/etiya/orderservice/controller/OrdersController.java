package com.etiya.orderservice.controller;

import com.etiya.orderservice.dto.*;
import com.etiya.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor

public class OrdersController {
    private final OrderService orderService;


    @GetMapping()
    public ResponseEntity<List<ListOrderResponseDto>> getAll()
    {
        return ResponseEntity.ok(orderService.getOrdersAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetOrderResponseDto> getById(@PathVariable UUID id){
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PostMapping
    public ResponseEntity<CreateOrderResponseDto> createOrder
            (@RequestBody CreateOrderRequestDto createOrderRequestDto)
    {
        return ResponseEntity.ok(orderService.saveOrderCustomer(createOrderRequestDto));
    }

    // Sipariş günceller (UpdateOrderRequestDto kullanarak)
    @PutMapping("/{id}")
    public ResponseEntity<UpdateOrderResponseDto> updateOrderCustomer(
            @PathVariable UUID id,
            @RequestBody UpdateOrderRequestDto updateOrderRequestDto)
    {
        return ResponseEntity.ok(orderService.updateOrder(updateOrderRequestDto,id));
    }

    // Sipariş siler (ID ile)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable UUID id)
    {
        orderService.deleteOrder(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
