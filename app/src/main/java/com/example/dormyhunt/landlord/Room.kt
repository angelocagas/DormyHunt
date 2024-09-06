package com.example.dormyhunt.landlord

data class Room(
    val roomNumber: Int?,
    val availability: String?,
    val tenantId: String?,
    val tenantName: String?,
    val capacity: Int?,
    val maxCapacity: Int?
)
