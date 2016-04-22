package algorithm;

public class PrintMultiplicationTable {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 ) {
                    System.out.print(j);
                }
                else if (j == 0) {
                    System.out.print(i);
                }
                else {
                    System.out.print(j * i);
                }
            }
            System.out.println();
        }

    }

}
