import java.util.Arrays;
import java.util.Scanner;

/**
 * find polygon area
 *
 * first value - number of vertices
 * next value - coordinates
 */

/*
3
-10000 10000
9000 9000
-10000 -10000

5
3 4
5 11
12 8
9 5
5 6
 */

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ver = sc.nextInt();
        int[] m = new int[ver*2];
        long s;

        for (int i = 0; i < m.length; i++) {
            m[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(m));
    }
}