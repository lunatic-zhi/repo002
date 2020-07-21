package itheima_day05;

public class Demo01 {
    public static void main(String[] args) {

        int[] array = new int[]{33,22,11,55,44};
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("数组的最大值为："+ max);

        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("数组的最小值为："+ min);
    }
}
