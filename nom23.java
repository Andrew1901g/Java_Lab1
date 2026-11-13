public class nom23 {

    public static void main(String[] args) {
        int [][] a = new int[5][5];
        for (int i = 0;i<5;i++) {
            for (int j = 0; j<5;j++) {
                a[i][j] = i*j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}