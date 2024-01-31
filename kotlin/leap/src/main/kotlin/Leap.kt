class Year(year: Int) {
	val isLeap: Boolean =
		(year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)
}
