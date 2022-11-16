package pro.sky.java.course2.hw7;

import java.util.Scanner;

public class MyStudyException {

    public static void main(String[] args) {

//        int x = new Scanner(System.in).nextInt();
//        int y = new Scanner(System.in).nextInt();
//
//        try {
//            double result = x / y;
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("Делить на 0 нельзя!");
//        }
//        System.out.println("The end of the app!");

        int[] arr = {4, 7, 9, 55, 79};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
