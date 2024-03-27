package fsa.training.ThinhNV_JSFW.L.A3.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateUtils {
    public static String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm")
                .withLocale(new Locale("vi", "VN"));

        return dateTime.format(formatter); // Directly return formatted string
    }
}
