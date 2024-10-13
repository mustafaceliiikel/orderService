package com.etiya.orderservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequestDto {
    @NotNull
    private int cartId;

    @NotNull
    private int billingAccountId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
}
