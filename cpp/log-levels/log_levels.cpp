#include <string>

namespace log_line {
  std::string message(const std::string& str) {
    return str.substr(str.find_first_of(':') + 2);
  }

  std::string log_level(const std::string& str) {
    return str.substr(str.find_first_of('[') + 1, str.find_first_of(']') - 1);
  }

  std::string reformat(const std::string& str) {
    return message(str) + " (" + log_level(str) + ")";
  }
}
