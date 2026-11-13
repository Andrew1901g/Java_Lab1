public class nom43 {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("hello");
        System.out.println(s);

        s.append(" World");
        System.out.println(s);

        s.delete(0, 3);
        System.out.println(s);

        s.setLength(5);
        System.out.println(s);

    }

}
