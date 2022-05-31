package homework.frequency_dictionary;

public class Main {
    public static void main(String[] args) {
        String text = "Cоздадим массив длинна которого равна длинне этого текста, " +
                "используя код ANSCII для каждого символа, вычисляем позицию в массиве и делаем инкремент на значение" +
                "букву Ё игнорируем";
        frequencyDictionaryRus(text);
    }

    private static void frequencyDictionaryRus(String text) {
        text = text.toLowerCase();

        int[] result = new int['я' - 'а' + 1]; // ASCII 255 - 224 + 1 = 32

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // cut letter from word
            if (ch >= 'а' && ch <= 'я') { // check letter into range 224 and 255 (according ASCII table)
                result[ch - 'а']++; // increment current value in index
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + " = " + result[i]); // print all
        }
    }
}
