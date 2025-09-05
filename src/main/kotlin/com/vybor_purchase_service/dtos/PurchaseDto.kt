package com.vybor_purchase_service.dtos

import java.math.BigDecimal

data class PurchaseDto(
    val fullName: String,
    val itemName: String,
    val address: String,
    val amount: BigDecimal
)
