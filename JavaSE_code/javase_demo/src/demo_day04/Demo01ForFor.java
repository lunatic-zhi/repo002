package demo_day04;

public class Demo01ForFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }

            System.out.println();
        }
    }
}
