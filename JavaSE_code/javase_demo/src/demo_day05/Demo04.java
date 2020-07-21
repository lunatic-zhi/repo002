package demo_day05;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        int[] array = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <array.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个评委的分数：");
            int num = sc.nextInt();
            array[i] = num;
        }

        int sum = 0;
        int max = array[0];
        int min  = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if(array[i] > max){
                max = array[i];
            }

            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("平均分为："+ (sum-max-min)/4.0);
    }
}
