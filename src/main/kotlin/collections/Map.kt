package collections

fun main() {
    val sample = (0..5).toList()
    val after = sample.map { it * 2 }
    println("before: $sample")
    println("after: $after")
}