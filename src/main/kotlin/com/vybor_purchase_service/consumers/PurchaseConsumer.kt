package com.vybor_purchase_service.consumers

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class PurchaseConsumer {

   @KafkaListener()
}