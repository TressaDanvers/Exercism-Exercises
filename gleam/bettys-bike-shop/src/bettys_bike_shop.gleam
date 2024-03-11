import gleam/int
import gleam/float

pub fn pence_to_pounds(pence) {
  int.to_float(pence) /. 100.0
}

pub fn pounds_to_string(pounds) {
  "£" <> float.to_string(pounds)
}
