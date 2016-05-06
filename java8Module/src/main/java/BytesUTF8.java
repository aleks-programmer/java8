import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 *
 */
public class BytesUTF8 {



    public static void main(String[] args) {
        String s = "ывиывиы";
        ByteBuffer bb = Charset.forName("UTF-8").encode(s);
        String s1 = new String(s.getBytes(), Charset.forName("UTF-8"));
        System.out.println(s1);
    }
}
