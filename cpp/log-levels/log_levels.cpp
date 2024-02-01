#include <string>

namespace log_line {
  std::string message(const std::string& str) {
    auto str_len = str.length();
    auto end_tag = str.find_first_of(']');
    return str.substr(end_tag + 3, str_len - end_tag - 3);
  }

  std::string log_level(const std::string& str) {
    auto start_tag = str.find_first_of('[');
    auto end_tag = str.find_first_of(']');
    return str.substr(start_tag + 1, end_tag - 1);
  }

  std::string reformat(const std::string& str) {
    return message(str) + " (" + log_level(str) + ")";
  }
}
