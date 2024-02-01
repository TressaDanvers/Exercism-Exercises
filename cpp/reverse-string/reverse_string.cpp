#include <algorithm>
#include "reverse_string.h"

namespace reverse_string {
  std::string reverse_string(const std::string& str) {
    auto reversed(str);
    std::reverse(reversed.begin(), reversed.end());
    return reversed;
  }
}
