package com.vybor_purchase_service.repositories

import com.vybor_purchase_service.models.PurchaseModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface PurchaseRepository: JpaRepository<PurchaseModel, UUID> {
}