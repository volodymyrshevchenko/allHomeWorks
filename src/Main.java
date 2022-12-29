import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] LazyArray = new int[25];
        int[] LazyArray2 = new int[25];
        int summ = 0;
        int summ2 = 0;
        Random random = new Random();

        for (int i = 0; i < LazyArray.length; i++) {
            LazyArray[i] = random.nextInt(22) + 18;
            summ += LazyArray[i];
            System.out.print(LazyArray[i] + " ");
        }
        System.out.println((double) summ / LazyArray.length);

        for (int i = 0; i < LazyArray2.length; i++) {
            LazyArray2[i] = random.nextInt(22) + 18;
            summ2 += LazyArray2[i];
            System.out.print(LazyArray2[i] + " ");
        }
        System.out.print((double) summ2 / LazyArray2.length);

    }

}
