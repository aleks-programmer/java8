package java8_features;

/**
 *
 */
public class StringWithoutSurrogates {
    private String str;

    public StringWithoutSurrogates(String str) {
        this.str = str;
        deleteSurrogates();
    }

    private void deleteSurrogates() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(Character.isHighSurrogate(c) || Character.isLowSurrogate(c))) {
                sb.append(c);
            }
        }
        str = sb.toString();
    }

    public String get() {
        return str;
    }
}
