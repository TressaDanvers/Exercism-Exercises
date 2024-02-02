fun never(): Nothing = throw IllegalStateException()

object Raindrops {
    fun convert(n: Int) =
			sequenceOf(3 to "Pling", 5 to "Plang", 7 to "Plong")
				.filter { (it, _) -> n % it == 0 }
				.joinToString("") { (_, it) -> it }
				.ifEmpty { "$n" }
}
