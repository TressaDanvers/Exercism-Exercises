raindrops <- \(number) {
  ifblank <- \(.s, alternative) ifelse(.s == "", alternative, .s)
  ifelse(number %% c(3, 5, 7) == 0, c("Pling", "Plang", "Plong"), "") |>
    paste(collapse = '') |>
    ifblank(as.character(number))
}
