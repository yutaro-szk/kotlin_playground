package collections

fun main() {
    val sample = (0..5).toList()
    val after = sample.zip((6..10))
    println("before: $sample")
    println("after: $after")
    val after2 = sample.zip((6..10)) { s, a -> "$s:$a" }
    println("after: $after2")
    val after3 = after.unzip()
    println("after3: $after3")
}