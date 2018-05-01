package pl.szymonchowanic.MasterSpringMvc.date;

import org.springframework.format.Formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.ParseException;

public class USLocalDateFormatter implements Formatter<LocalDate> {
	public static final String US_PATTERN = "MM/dd/yyyy";
	public static final String NORMAL_PATTERN = "yyyy-MM-dd";
	@Override public LocalDate parse(String text, Locale locale)
			throws ParseException {
		return LocalDate.parse(text,
				DateTimeFormatter.ofPattern(getPattern(locale)));
	}
	@Override public String print(LocalDate object, Locale locale) {
		return DateTimeFormatter.ofPattern(getPattern(locale)).format(object);
	}
	public static String getPattern(Locale locale) {
		return isUnitedStates(locale) ? US_PATTERN : NORMAL_PATTERN;
	}
	private static boolean isUnitedStates(Locale locale) {
		return Locale.US.getCountry().equals(locale.getCountry());
	}
}
