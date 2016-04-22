package algorithm;

public class FindNumber {

    public static void main(String[] args) {
        int[] i = new int[] {1, 2, 3, 8, 100, 930, 9890};
        int[] j = new int[] {2, 4, 5, 4, 5, 6, 78, 100, 439, 930, 8493};

        int ii = 0;
        int jj = 0;
        while (ii < i.length && jj < j.length) {
            if (i[ii] == j[jj]) {
                System.out.println(i[ii]);
                ii++;
            } else if (i[ii] > j[jj]) {
                jj++;
            } else {
                ii++;
            }
        }
        System.out.println(ii + jj);
    }

}
