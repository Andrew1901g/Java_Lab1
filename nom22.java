public class nom22 {

    public static void main(String [] args) {
        for (int i=0;i<10;i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        int a=0;
        while (a<5) {
            System.out.println(a);
            a++;
            if (a==3){
                break;
            }
        }
    }
}