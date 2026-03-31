package scenario-based;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class DynamicTemplateProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		while (t-- > 0) {
			String str = sc.nextLine();
			System.out.println(processLine(str));
		}
	}

	public static String processLine(String str) {
		Pattern pattern = Pattern.compile("\\$\\{(\\w+):(.*?)\\}");
		Matcher matcher = pattern.matcher(str);

		StringBuffer result = new StringBuffer();

		while (matcher.find()) {
			String type = matcher.group(1);
			String value = matcher.group(2);

			String replacement;

			switch (type) {

			case "UPPER":
				replacement = value.toUpperCase();
				break;

			case "LOWER":
				replacement = value.toLowerCase();
				break;

			case "DATE":
				replacement = processDate(value);
				break;

			case "REPEAT":
				replacement = processRepeat(value);
				break;

			default:
				replacement = "INVALID";
			}

			matcher.appendReplacement(result, replacement);
		}

		matcher.appendTail(result);
		return result.toString();
	}

	public static String processDate(String value) {
		try {
			DateTimeFormatter input = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy/MM/dd");

			LocalDate date = LocalDate.parse(value, input);
			return date.format(output);

		} catch (Exception e) {
			return "INVALID";
		}
	}

	public static String processRepeat(String value) {
		try {
			String[] parts = value.split(",");
			String word = parts[0];
			int count = Integer.parseInt(parts[1]);

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < count; i++) {
				sb.append(word);
			}
			return sb.toString();

		} catch (Exception e) {
			return "INVALID";
		}
	}
}