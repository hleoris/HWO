/**
 *Java. Level 1. Lesson 2.Home Work
 *
 *@author Sergey Khrenov
 *@version date 16.09.18
 */

class HomeWork {
    public static void main(String[] args) {
        change1To0();
        System.out.println();
        setAndFill();
        System.out.println();
        setAndWalk();
        System.out.println();
        createAndFill();
        System.out.println();
        minMax();
    }
        //call for task №1
    public static void change1To0() {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for(int i = 0; i < arr.length; i++)  {
                if (arr[i] > 0) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
                System.out.print(" " + arr[i]);
            }
        }

        //call for task №2
    public static void setAndFill() {
        int sample[] = new int[8];
        for (int a = 0; a < sample.length; a ++) {
            sample[a] = a * 3;
            System.out.print(" " + sample[a]);
        }
    }

        //call for task №3
    public static void setAndWalk() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(" " + arr[i]);
        }
    }

        //call for task №4
    public static void createAndFill() {
        int[][] ww = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++ ) {
                if ((i == j) || (i == 3) && (j == 0) || (i == 2) && (j == 1) || (i == 1) && (j == 2) || (i == 0) && (j == 3)) {
                    ww[i][j] = 1;
                }
                System.out.print(ww[i][j] + "");
            }
            System.out.println();
        }
    }
        
        //call for task №5
    public static void minMax() {
        int num[] = {1, 124, 54, 3, 98, -7, 47, 70, 2, 75};
        int min, max;
        min = max = num[0];

        for (int i = 1; i < 10; i++) {
            if (num[i] < min) min = num[i];
            if (num[i] > max) max = num[i];
        }
        System.out.println("min and max:" + min + " " + max);
    }
}