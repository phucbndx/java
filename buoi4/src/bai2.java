import java.util.Scanner;

public class bai2 {
    public static int m, n, c, d;
    public static int[][] A = new int[m][n];
    public static int[][] B = new int[c][d];

    public static void nhapmang() {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dong a: ");
        m = sc.nextInt();
        System.out.println("nhap so cot a: ");
        n = sc.nextInt();
        A = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("nhap so dong b: ");
        c = sc.nextInt();
        System.out.println("nhap so cot b: ");
        d = sc.nextInt();
        B = new int[c][d];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

    }

    public static void congmang() {

        if (m != c && n != d) {
            System.out.println("khong thẻ cộng.");
        } else {
            int c[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = A[i][j] + B[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void xuatmang() {
        System.out.println("Mảng A vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println("\n");
        }

        System.out.println("Mảng B vừa nhập: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(B[i][j] + "\t");
            }

            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        nhapmang();
        xuatmang();
        congmang();
    }
}