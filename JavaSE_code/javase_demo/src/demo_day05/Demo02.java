package demo_day05;

public class Demo02 {
    public static void main(String[] args) {

        int[] array = {4,5,6,7,8,9,10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 ){
                sum += array[i];
            }
        }
        System.out.println("数组的偶数和为：" + sum);
    }
}
