import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        /* input1: int t = testcases
        2: int n = number of students, int k = cancellation threshold
        3: int[] A = student arrival times
        */

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            solve();
        }

        printTests();
    }

    // method that will print YES if student attended (n)
    // is less than prof's threshold (k)
    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            if (A[i] >= 0) {
                count++; // counts the number of students attended
            }
        }
        if (count < k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Tests method as per requirements in hackerrank day27
    static void printTests() {
        System.out.println(5);
        System.out.println(5 + " " + 3);
        System.out.println("-1 90 999 100 0");
        System.out.println(4 + " " + 2);
        System.out.println("0 -1 2 1");
        System.out.println(3 + " " + 3);
        System.out.println("-1 0 1");
        System.out.println(6 + " " + 1);
        System.out.println("-1 0 1 -1 2 3");
        System.out.println(7 + " " + 3);
        System.out.println("-1 0 1 2 3 4 5");

    }

}

