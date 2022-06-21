package lecture.time_complexity;

public class TimeComplexity {

    public static void main(String[] args) {
        // 1 единицу времени на арифм. и логические операции
        // 1 единицу времени на присваивания и return

        int n = 8;
        for (int i = 1; i <= n; i++) { // O(n)
            System.out.println("Hi");
        }
    }

    public static int sum(int one, int two) {
        int result = one + two; // cost 2
        return result; // cost 1
    }

    // (Tsum) = 2 + 1 = 3
    // O(3) -> O(1)
    // 4n^3 = O(n^3)
    // n^2 + 2 = O(n^2)
    // log2(n), log10(n) = O(log n)

    public static int listSum(int[] array) {
        int result = 0; // cost = 1 times = 1
        for (int i = 0; i < array.length; i++) { // cost = 3 times = n + 1
            result = result + array[i]; // cost = 2 times = n
        }
        return result; // cost = 1 times = 1
    }

    // (Tsum) = 1+3*(n+1)+2*n+1=O(n)

    public static void fork(int n) {
        if (n < Integer.MAX_VALUE - 1000000) {
            System.out.println("number < 5"); // best O(1)
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(i + " "); // worst = O(n)
            }
        }
    }

    public static void bubleFor(int n) {
        for (int i = 0; i <= n / 3; i++) { // O(n/3) = O(n)
            for (int j = 1; j <= n; j = j + 4) { // O(n/4)
                System.out.println("I study Big O notation");
            }
        }
    }

    // for = O(n) for = O(n) = O(n^2)
}
