import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class MatcherTest {
    protected static final Pattern pattern = Pattern.compile("(GIR 0AA)|(((A[BL]|B[ABDHLNRSTX]?|" +
            "C[ABFHMORTVW]|D[ADEGHLNTY]|E[HNX]?|F[KY]|G[LUY]?|H[ADGPRSUX]|I[GMPV]|JE|K[ATWY]|L" +
            "[ADELNSU]?|M[EKL]?|N[EGNPRW]?|O[LX]|P[AEHLOR]|R[GHM]|S[AEGKLMNOPRSTY]?|T[ADFNQRSW]|UB" +
            "|W[ADFNRSV]|YO|ZE)[1-9]?[0-9]|((E|N|NW|SE|SW|W)1|EC[1-4]|WC[12])[A-HJKMNPR-Y]|(SW|W)([2-9]|" +
            "[1-9][0-9])|EC[1-9][0-9]) ?[0-9]\\s?[0-9]?[ABD-HJLNP-UW-Z]{0,2})");

    public static void main(String[] args) {
        String address = "97 Beverley Way, London, SW20 0AW";
        Matcher matcher = pattern.matcher(address.toUpperCase());
        Queue<String> matchedPostcodes = new LinkedList<String>();

        while(matcher.find()) {
            matchedPostcodes.add(matcher.group());
        }
        System.out.println(matchedPostcodes.remove());
    }
}
