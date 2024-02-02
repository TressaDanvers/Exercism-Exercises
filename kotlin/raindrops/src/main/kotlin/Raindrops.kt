fun never(): Nothing = throw IllegalStateException()

object Raindrops {
    fun convert(n: Int) =
			listOf(3, 5, 7)
				.filter { n % it == 0 }
				.joinToString("") {
					when (it) {
						3 -> "Pling"
						5 -> "Plang"
						7 -> "Plong"
						else -> never()
					}
				}
				.ifEmpty { "$n" }
}
