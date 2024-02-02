raindrops <- function(number) {
  running <- ""
  if (number %% 3 == 0) running <- "Pling"
  if (number %% 5 == 0) running <- sprintf("%s%s", running, "Plang")
  if (number %% 7 == 0) running <- sprintf("%s%s", running, "Plong")
  if (running == "") running <- sprintf("%i", number)
  return (running)
}
