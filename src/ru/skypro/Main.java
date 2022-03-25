package ru.skypro;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double summa(int [] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double arithmeticMean(int [] array, double sum) {
        double arithmeticMean = sum / array.length;
        return arithmeticMean;
    }


    public static void main(String[] args) {
        task6();
    }

    public static void task6() {
        int [] array = generateRandomArray();
        double sum = summa(array);
        double arithmeticMean = arithmeticMean(array,sum);
        System.out.println(arithmeticMean);
    }

    public static void task7() {

    }

}