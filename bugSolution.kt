fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = list.filter { it > 2 }
    list.removeAll(toRemove)
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = map.filter { it.value > 2 }.map { it.key }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, b=2}
}