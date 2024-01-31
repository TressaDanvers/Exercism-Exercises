import java.util.regex.Pattern;

import static java.lang.String.format;

public class LogLevels {
  public static String message(String logLine) {
    return logLine.replaceFirst("^\\[(?:INFO|WARNING|ERROR)]:", "").trim();
  }

  public static String logLevel(String logLine) {
    var matcher = Pattern
      .compile("^\\[(INFO|WARNING|ERROR)]:.*", Pattern.DOTALL)
      .matcher(logLine);
    if (!matcher.matches())
      throw new IllegalArgumentException("\"" + logLine + "\" does not contain a log-level tag.");
    else return matcher
      .group(1)
      .toLowerCase();
  }

  public static String reformat(String logLine) {
    return format("%s (%s)", message(logLine), logLevel(logLine));
  }
}