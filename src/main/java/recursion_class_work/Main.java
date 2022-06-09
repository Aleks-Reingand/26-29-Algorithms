package recursion_class_work;

public class Main {
    public static void main(String[] args) {
        String str = "AbBc 1";

        System.out.println(countConsonantRecursion(str, str.length()));
    }
    // метод подсчета согласных букв: countConsonantIteration(String str):int
    // метод который проверяет букву: согласна или нет isConsonant(char letter):boolean

    public static int countConsonantIteration(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isConsonant(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonantRecursion(String str, int n) {
        int count = 0;
        if (n == 1) {
            count = isConsonant(str.charAt(0)) ? 1 : 0;
            System.out.println("Now count = " + count);
            return 0;
        }
        if (isConsonant(str.charAt(n - 1))) {
            count = countConsonantRecursion(str, n - 1) + 1;
            System.out.println("Now count = " + count);
        } else {
            count = countConsonantRecursion(str, n - 1);
            System.out.println("Now count = " + count);
        }
        return count;
    }
//        else {
//            count = countConsonantRecursion(str, n - 1);
//            count += isConsonant(str.charAt(n - 1)) ? 1 : 0; //inserted summation of values count (count++)
//            System.out.println("Now count = " + count);
//        }
//            return count;
//        }

        private static boolean isConsonant ( char letter){
            letter = Character.toUpperCase(letter);
            if (letter >= 'A' && letter <= 'Z' && !(letter == 'A' || letter == 'E' || letter == 'O' || letter == 'U' || letter == 'I')) {
                return true;
            }
            return false;
        }
    }



