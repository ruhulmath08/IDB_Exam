package exam_4.corejava;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[][] a = {
            {11, 9, 32, 56, 45},
            {7, 0, 23, 45, 23},
            {23, 19, 45, 9, 4},
            {9, 8, 9, 23, 4},
            {0, 12, 67, 78, 9}
        };
        for (int[] is : a) {
            Arrays.sort(is);
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
