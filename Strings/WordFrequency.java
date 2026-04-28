 package Strings;

// public class WordFrequency {
//     public static void main(String[] args) {
//         String str = "hello pavan how are you pavan hello hello";

//         String[] words = str.split(" ");

//         for (int i = 0; i < words.length; i++) {
//             int count = 1;
//             if (words[i].equals("")) continue;

//             for (int j = i + 1; j < words.length; j++) {
//                 if (words[i].equals(words[j])) {
//                     count++;
//                     words[j] = ""; 
//                 }
//             }

//             if (!words[i].equals("")) {
//                 System.out.println(words[i] + " : " + count);
//             }
//         }
//     }
// }
class WordFrequency{
    public static void main(String[] args) {

        String s="hi pavan how are you pavan how is your life";
        String [] words=s.trim().split(" ");
        for(int i=0;i<words.length;i++){
            int count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                   
                }
            }
            if(!words[i].equals("")){
                System.out.println(words[i]+" "+count);
            }

        }
    }
}
