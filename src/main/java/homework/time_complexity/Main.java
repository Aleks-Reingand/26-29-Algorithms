package homework.time_complexity;

public class Main {
    public static void main(String[] args) {

    }

    // test 1
    void test1(int n) {
        if (n == 1) {
            return;
        }
        for (int i = 1; i <= n; i++) { // cost = 3 times = n
            for (int j = 1; j <= n; j++) { // cost = 3 times = 1
                System.out.println("*");
                break;
            }
        }
    } // best O(1), worst 3(n)*3+1 = O(n)

    // test 2
    void test2(int n) {
        int a = 0;
        int i;
        int j;
        for (i = 0; i < n; i++) { // cost = 3 times = n + 1
            for (j = n; j > i; j--) { // cost = 3 times = n - 1
                a = a + i + j;
            }
        }
    } // (3+n)*(3+n-1) = n^2+5n+6 = O(n^2)

    // test 3
    void test3(int n) {
        int a = 0;
        int i;
        int j;
        for (i = n / 2; i <= n; i++) { // cost = 4 times = n/2
            for (j = 2; j <= n; j = j * 2) { // cost = 4 times = (n = 8) (j = 2,4,8) j^x = n = log(n)
                a = a + n / 2;
            }
        }
    } // 4*n/2*log(n) = O(n log n)

    // test 4
    void test4(int n) {
        int a = 0;
        int i = n;
        while (i > 0) { // cost = 1 times = i/2 = n^x (n = 32 = n/2 = 2^4 = 16)
            a += i;
            i /= 2;
        }
    } // 1+n/2^x = O(log n)

    // additional
    void method(int a, int b) {
        while (a != b) { // cost = 1 times = n
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    } //best O(1), worst 1+n = O(n)

    void method2(int n) {
        for (int i = 0; i < n / 2; i++) { // cost = 4 times = n/2
            for (int j = 1; j + n / 2 <= n; j++) { // cost = 5 times = 1+n/2
                for (int k = 1; k <= n; k = k * 2) { // cost = 4 times = k^x = n = log(n)
                    System.out.println("I am expert!");
                }
            }
        }
    } // 4+n/2*5*1+n/2*4+log(n) = O(n^2 log n)

    void method3(int n) {
        for (int i = 1; i <= n; i++) { // cost = 3 times = n
            for (int j = 1; j <= n; j = j + i) { // cost = 4 times = worst n, best log(n)
                System.out.println("I am expert!");
            }
        }
    } // worst (3+n)*(4+n) = O(n^2), best (3+n)*(4+log(n)) = O(n log n)
}

