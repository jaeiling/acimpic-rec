import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class bj1152 {
    public static void main(String[] args) {
        Bufferedreader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
    }
}


