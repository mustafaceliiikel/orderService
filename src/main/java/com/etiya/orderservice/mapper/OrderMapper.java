package com.etiya.orderservice.mapper;


import com.etiya.orderservice.dto.*;
import com.etiya.orderservice.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    Order createOrderFromOrderRequestDto
            (CreateOrderRequestDto createOrderRequestDto);

    GetOrderResponseDto getOrderResponseFromOrder
            (Order order);

    List<ListOrderResponseDto> getAllCorporateCustomersResponseDtoFromCorporateCustomers
            (List<Order> order);

    OrderMapper ordersFromUpdateRequestDto(UpdateOrderRequestDto dto);
    CreateOrderResponseDto creatOrderResponseDtoFromOrder
            (Order order);

    OrderMapper orderFromUpdateRequestDto (UpdateOrderRequestDto updateOrderRequestDto);

    UpdateOrderResponseDto updateOrderResponseDtoFromOrder (Order order);
}
