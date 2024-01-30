import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

class SqueakyClean {
  static String clean(String identifier) {
    AtomicBoolean convertCamel = new AtomicBoolean(false);

    return identifier.chars()
      .mapToObj(c -> (char)c)
      .map(c -> {
        var token = c == ' ' ? "_"
          : Character.isISOControl(c) ? "CTRL"
          : !Character.isAlphabetic(c) || ('α' <= c && c <= 'ω') ? ""
          : convertCamel.get() ? String.valueOf(Character.toUpperCase(c))
          : String.valueOf(c);

        convertCamel.set(c == '-');

        return token;
      })
      .collect(Collectors.joining());
  }
}
