import java.util.Arrays;

public class LogLevels {
  public static String message(String logLine) {
    return logLine
        .replaceFirst("^\\[INFO]:\\s+", "")
        .replaceFirst("^\\[WARNING]:\\s+", "")
        .replaceFirst("^\\[ERROR]:\\s+", "")
        .replaceAll("\\s+$", "");
  }

  public static String logLevel(String logLine) {
    if (logLine.startsWith("[INFO]: ")) return "info";
    else if (logLine.startsWith("[WARNING]: ")) return "warning";
    else if (logLine.startsWith("[ERROR]: ")) return "error";
    else throw new IllegalArgumentException("\"" + logLine + "\" does not contain a log-level tag.");
  }

  public static String reformat(String logLine) {
    return message(logLine) + " (" + logLevel(logLine) + ")";
  }
}
