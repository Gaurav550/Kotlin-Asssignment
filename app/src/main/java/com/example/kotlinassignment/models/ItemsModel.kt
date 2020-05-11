package com.example.kotlinassignment.models

data class Items(
    val title : String,
    val rows: MutableList<Row>
)

data class Row(
    val title: String?,
    val description: String?,
    val imageHref: String?
)