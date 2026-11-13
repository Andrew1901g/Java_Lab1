

public class nom3 {
    public static void main(String [] args) {
        Integer a = 200;
        Boolean b = true;
        String c = "hello";

        Integer n = null;
        System.out.println(n);

        int nn = n; //ошибка NPE
        System.out.println(nn);
    }
}
