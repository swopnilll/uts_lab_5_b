import java.util.Random;
public class Lab5Exc2 {

    static int[] generate20Numbers() {
        Random rand = new Random();

        int[] myList = new int[20];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = rand.nextInt(0, 100);
        }

        return myList;
    }

    static double calculateMean(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        double sum = 0;

        for (int j : array) {
            sum += j;
        }

        return sum / array.length;
    }


    static double calculateStandardDeviation(int[] array, double mean) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        double sum = 0;

        for (int j : array) {
            sum = sum + Math.pow((j - mean), 2);
        }

        return Math.sqrt(sum / array.length);
    }

    static void getSolution() {

        int[] myList = generate20Numbers();

        double mean = calculateMean(myList);

        double standardDeviation = calculateStandardDeviation(myList, mean);

        System.out.println("Mean " + mean);
        System.out.println("Standard Deviation " + standardDeviation);

    }
}
