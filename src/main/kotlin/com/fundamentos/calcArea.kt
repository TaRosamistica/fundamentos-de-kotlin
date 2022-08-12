package com.fundamentos

fun calculateArea(shape : Map<String, Any>) : Int {
    val width = shape["Width"] as Int
    val height = shape ["Height"] as Int
    return width * height
}

fun toString(shape : Map<String, Any>): String {
    val width = shape["Width"] as Int
    val height = shape ["Height"] as Int
    val color = shape ["Color"]
    val area = width * height
    return "The rectangle has width: ${width}, height: ${height}, color: ${color} and area ${area}."

}