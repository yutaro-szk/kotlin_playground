package collections

fun main() {
    val sample = (0..5).toList()
    val after = sample.associateWith { it.toFloat() }
    println("before: $sample")
    println("after: $after")
    val numbers = listOf("apple", "orange", "pumpkin juice")
    println(numbers.associateBy { it.first().uppercaseChar() })
    println(numbers.associateBy(keySelector = { it.first().uppercaseChar() }, valueTransform = { it.length }))
}