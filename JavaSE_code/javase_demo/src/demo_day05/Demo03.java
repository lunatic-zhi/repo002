package demo_day05;

public class Demo03 {
    public static void main(String[] args) {

        int[] array  = {11,22,33,44,55};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        for (int start = 0,end = array.length-1; start < end ;start++ ,end --) {
          int temp = array[start];
          array[start] = array[end];
          array[end] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        }
    }
