package fundamentos

import com.fundamentos.calculateArea
import com.fundamentos.toString

fun main (){
    var rectangle = mutableMapOf("Width" to 10, "Height" to 10, "Color" to "Red")
    var area = calculateArea(rectangle)
    println(area)

    val rectangle1 = mutableMapOf("Width" to 10, "Height" to 10, "Color" to "orange", "Area" to area)
    val printOut1 = toString(rectangle1)
    println(printOut1)

    var rectangle2 = mutableMapOf("Width" to 30, "Height" to 50, "Color" to "blue", "Area" to area)
    var printOut2 = toString(rectangle2)
    println(printOut2)

    val fizzBuzz = FizzBuzz()
    val result = fizzBuzz.fizzBuzz(15)
    println(result)

}
