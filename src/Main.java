import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = in.nextInt();
        int[] array = new int[length];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }
        shakerSort(array);

        System.out.println("Массив после сортировки: ");
        for (int i = length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public static void shakerSort(int[] values) {
        int left = 0;
        int right = values.length - 1;
        boolean swapped;
        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (values[i - 1] > values[i]) {
                    int temp = values[i];
                    values[i] = values[i - 1];
                    values[i] = temp;
                }
            }
            left++;
            for (int i = left; i < right; ++i) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i + 1];
                    values[i + 1] = values[i];
                    values[i] = temp;
                }
            }
            right--;
        }
    }
}