package Strings;

public class WordsInString {
    public static void main(String[] args) {
        String s = "hello pavan how are you , i hope you are fine";
        int count = 0;

        String[] words = s.trim().split("\\s+");
        count = words.length;
        System.out.println(count);

    }
}
