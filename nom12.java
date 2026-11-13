import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class nom12 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        int x = 3;
        switch(x) {
            case 1:
                System.out.println("первый");
                break;
            case 2:
                System.out.println("Второй");
                break;
            case 3:
                System.out.println("Третий");
                break;
            default:
                System.out.println("Другой");
        }
    }
}