use std::cmp::{max, min};
use std::fmt;
use crate::Comparison::{Equal, Sublist, Superlist, Unequal};

#[derive(Debug, PartialEq, Eq)]
pub enum Comparison {
    Equal,
    Sublist,
    Superlist,
    Unequal,
}

pub fn sublist<T: PartialEq + fmt::Debug>(_first_list: &[T], _second_list: &[T]) -> Comparison {
    let first_len = _first_list.len();
    let second_len = _second_list.len();

    let longest_is_first = first_len > second_len;

    let longest =
        if longest_is_first { _first_list }
        else { _second_list };
    let shortest =
        if longest_is_first { _second_list }
        else { _first_list };

    let longest_len = max(first_len, second_len);
    let shortest_len = min(first_len, second_len);

    for i in 0..=(longest_len - shortest_len) {
        if longest[i..(i + shortest_len)]
            .iter().zip(shortest)
            .all(|(&ref a, &ref b)| { a == b }) {
            return if longest_is_first { Superlist }
            else if first_len == second_len { Equal }
            else { Sublist }
        }
    }

    return Unequal;
}
