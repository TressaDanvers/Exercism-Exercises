use std::fmt;
use std::fmt::{Formatter};

#[derive(PartialEq, Debug)]
pub struct Clock {
    hours: i32,
    minutes: i32
}

impl Clock {
    pub fn new(hours: i32, minutes: i32) -> Self {
        let summed_hours = hours + minutes.div_euclid(60);

        let adjusted_hours = summed_hours.rem_euclid(24);
        let adjusted_minutes = minutes.rem_euclid(60);

        Self { hours: adjusted_hours, minutes: adjusted_minutes }
    }

    pub fn add_minutes(&self, minutes: i32) -> Self {
        let summed_minutes: i32 = self.minutes + minutes;
        let summed_hours = self.hours + summed_minutes.div_euclid(60);

        let adjusted_hours = summed_hours.rem_euclid(24);
        let adjusted_minutes = summed_minutes.rem_euclid(60);

        Self { hours: adjusted_hours, minutes: adjusted_minutes }
    }
}

impl fmt::Display for Clock {
    fn fmt(&self, f: &mut Formatter<'_>) -> fmt::Result {
        write!(f, "{:0width$}:{:0width$}", self.hours, self.minutes, width=2)
    }
}