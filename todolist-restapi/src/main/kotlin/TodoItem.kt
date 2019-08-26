package io.github.aaronwatson2975

import java.time.LocalDate

data class TodoItem(
    val title: String,
    val details: String,
    val assignedTo: String,
    val dueDate: LocalDate,
    val importance: Int
)


val todo1 = TodoItem(
    "Add RestAPI Data Access",
    "Add database support",
    "Me",
    LocalDate.of(2018, 12, 18),
    1
)

val todo2 = TodoItem(
    "Add RestAPI Service",
    "Add a service to get the data",
    "Me",
    LocalDate.of(2018, 12, 18),
    1
)
