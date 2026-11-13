import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class nom11 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x5 = 5;
        if(x1>x2) {
            System.out.println("x1 больше x2");
        }
        else {
            System.out.println("x1<=x2");
        }

        if(x1<x2 && x2<x3) {
            System.out.println("x1 меньше x2 и x2 меньше x3");
        }

        if((x2<x5 || x3<x1) && x5>x1) {
            System.out.println("Всё верно не смотря на x3<x1");
        }
    }
}
