package com.etiya.orderservice.service;

import com.etiya.orderservice.dto.GetOrderResponseDto;
import com.etiya.orderservice.dto.ListOrderResponseDto;
import com.etiya.orderservice.entity.Order;
import com.etiya.orderservice.mapper.OrderMapper;
import com.etiya.orderservice.repository.OrderRepository;

import java.util.List;
import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Override
    public List<ListOrderResponseDto> getOrdersAll() {
        // corporate Customer dönücek
        List<Order> corporateCustomerList = orderRepository.findAll();

        // Gelen cevabı response maple
        return OrderMapper.INSTANCE.
                getAllCorporateCustomersResponseDtoFromCorporateCustomers(orderList);
        getAllOrdersResponseDtorFromOrders

    }

    @Override
    public GetOrderResponseDto getOrderById (UUID id) {

        GetOrderResponseDto getOrderResponseDto =
                OrderMapper.INSTANCE.
                        getOrderResponseDtoFromOrder
                                (orderRepository.findById(id).orElseThrow());

        return getOrderResponseDto;

    }

    @Override
    public void deleteOrder(UUID id) {

        Order orderInDb = orderRepository.findById(id).orElseThrow();

        orderRepository.deleteById(id);
    }
}
