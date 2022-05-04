package java8_features.datetime_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start, end);

        System.out.println("Elapsed: " + elapsed.getSeconds());

        LocalDate localDate = LocalDate.now();
        System.out.println("Local date: " + localDate.toString());

        LocalDate localDate1 = LocalDate.of(2001, 4, 22);

        System.out.println("Manual local date: " + localDate1);

        LocalTime localTime = LocalTime.now();

        System.out.println("Time: " + localTime.toString());

        LocalTime localTime1 = LocalTime.of(20, 5, 30);

        System.out.println("Manual time: " + localTime1.toString());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date time: " + localDateTime.toString());

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        System.out.println("Manual local date time: " + localDateTime1);

        LocalDate localDate2 = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(df.format(localDate2));

        DateTimeFormatter df_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        String format = df_long.withLocale(Locale.US).format(localDate2);
        System.out.println(format);

        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral(":")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(":")
                .appendValue(ChronoField.YEAR)
                .appendLiteral(":");
        DateTimeFormatter f = b.toFormatter();
        System.out.println(f.format(localDate2));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(ldt));

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("GMT+0"));
        System.out.println(dateTimeFormatter.format(zdt));
    }
}
