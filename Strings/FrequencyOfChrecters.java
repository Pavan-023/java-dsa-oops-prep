package Strings;

// public class FrequencyOfChrecters {
//     public static void main(String[] args) {
//         String str = "good morning pavan";
//         str = str.replaceAll("\\s+", "").toLowerCase();

//         int[] freq = new int[26]; 

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             System.out.println("hi "+ch);
//             if (ch >= 'a' && ch <= 'z') {
//                 freq[ch - 'a']++;
//                 System.out.println("Hello"+freq[ch-'a']);
//             }
//         }

//         System.out.println("Character frequencies:");
//         for (int i = 0; i < 26; i++) {
//             if (freq[i] > 0) {
//                 System.out.println((char) (i + 'a') + " : " + freq[i]);
//             }
//         }
//     }
// }
public class FrequencyOfChrecters {
    public static void main(String[] args) {
        String s = "hello";
        s = s.replace("\\s", "").toLowerCase();
        int fre[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                fre[ch - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (fre[i] > 0) {
                System.out.println((char) (i + 'a') + " " + fre[i]);
            }
        }
    }
}
