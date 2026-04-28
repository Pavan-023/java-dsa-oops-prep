import java.util.HashMap;

public class WordsFrequency {
    public static void main(String[] args) {
        String s="hello iam hi how are you hello";
        // s.split(" ");
        String[] words= s.split(" ");
        HashMap<String ,Integer> hm=new HashMap<>();
        for(String word: words){
            hm.put(word, hm.getOrDefault(word,0)+1);
        }
        for (String key : hm.keySet()) {
            System.out.println(key + ": " + hm.get(key));
        }
    }
}

