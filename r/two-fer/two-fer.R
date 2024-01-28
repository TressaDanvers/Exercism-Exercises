two_fer <- function(input) {
  if (missing(input)) return ("One for you, one for me.")
  else return (paste("One for ", ", one for me.", sep = input))
}
