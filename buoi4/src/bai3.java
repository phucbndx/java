import java.util.Scanner;

public class bai3 {
    public static int m, n, c, d, max;
    public static int[][] A = new int[m][n];

    public static void nhapmang() {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dong : ");
        m = sc.nextInt();
        System.out.println("nhap so cot : ");
        n = sc.nextInt();
        A = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

    }

    public static void xuatmang() {
        System.out.println("Mảng Avừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println("\n");
        }

    }

    public static void maxmin() {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = A[0][0];
                if (max < A[i][j]) {
                    max = A[i][j];

                }
            }
        }
        System.out.println("max = " + max);

    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        nhapmang();
        xuatmang();
        maxmin();
    }
}
