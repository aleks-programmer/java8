package java8_features;

import java.time.ZonedDateTime;

public interface AnotherTimeClient extends TimeClient {
    ZonedDateTime getZonedDateTime(String zoneString);
}
