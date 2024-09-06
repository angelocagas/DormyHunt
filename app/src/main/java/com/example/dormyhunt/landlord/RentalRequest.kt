package com.example.dormyhunt.landlord

data class RentalRequest(
    val requestId: String?,
    val status: String?,
    val requesterFullName: String?,
    val timestamp: com.google.firebase.Timestamp?,
    val dormitoryId: String?
)

