use std::collections::HashSet;

pub fn anagrams_for<'a>(word: &str, possible_anagrams: &[&'a str]) -> HashSet<&'a str> {
    HashSet::from_iter(
        possible_anagrams.iter()
            .filter(|&&it| { it.to_lowercase() != word.to_lowercase() })
            .filter_map(|&it| {
                let mut letters_in_it = it
                    .to_lowercase()
                    .chars()
                    .collect::<Vec<char>>();
                let mut letters_in_word = word
                    .to_lowercase()
                    .chars()
                    .collect::<Vec<char>>();

                letters_in_it.sort();
                letters_in_word.sort();

                if letters_in_it == letters_in_word { Some(it) }
                else { None }
            }))
}
