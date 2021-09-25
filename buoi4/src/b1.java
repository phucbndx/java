import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int size; // kích thước của mảng

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài của mảng: ");
        size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(" mảng vừa nhập là: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("mang sau khi sap xep la:" + Arrays.toString(array));
        System.out.println(" nhập số muốn tìm :");
        int k = scanner.nextInt();
        int i = Arrays.binarySearch(array, k);
        System.out.println(" vi tri la: " + i);

        System.out.println(" nhập số muốn thay the :");
        int n = scanner.nextInt();
        Arrays.fill(array, n);
        System.out.println(" so sau khi thay the la: " + Arrays.toString(array));
    }
}
