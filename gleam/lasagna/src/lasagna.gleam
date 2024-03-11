// Please define the expected_minutes_in_oven function
pub fn expected_minutes_in_oven() {
  40
}

// Please define the remaining_minutes_in_oven function
pub fn remaining_minutes_in_oven(time_in_oven) {
	expected_minutes_in_oven() - time_in_oven
}

// Please define the preparation_time_in_minutes function
pub fn preparation_time_in_minutes(layers) {
	2 * layers
}

// Please define the total_time_in_minutes function
pub fn total_time_in_minutes(layers, time_in_oven) {
	preparation_time_in_minutes(layers) + time_in_oven
}

// Please define the alarm function
pub fn alarm() {
	"Ding!"
}
