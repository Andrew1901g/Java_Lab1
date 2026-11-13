public class nom41 {
    public static void main(String[] args) {
        String s = "Hello World!";
        String r1 = s.replace("World", "Java");
        String r2 = s.substring(6,11);
        String r3[] = s.split(" ");

        System.out.println(s);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3[0]);
        System.out.println(r3[1]);

    }
}
