package br.com.trinity.saladereuniao.util;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateUtil {

	public static LocalDateTime getLocalDateTime(int year, Month month, int dayOfMonth, int hour, int minute) {
		LocalDateTime localDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
		return localDateTime;
	}

}
