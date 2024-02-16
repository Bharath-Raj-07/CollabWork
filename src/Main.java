import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        // Add 10 words to the ArrayList
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");
        words.add("kiwi");
        words.add("mango");
        words.add("strawberry");
        words.add("pineapple");
        words.add("blueberry");
        words.add("watermelon");

        int numberOfSentences = 5; // Change this to generate a different number of sentences

        ArrayList<String> arr=new ArrayList<>();
        generateSentences(words, numberOfSentences,arr);
        generateLongerSentences(words,numberOfSentences);
    }

   public static void generateSentences(ArrayList<String> words, int numberOfSentences,ArrayList<String> arr) {

        Random random = new Random();

        System.out.println("Sentences with max length 10 : "+"\n");
        for (int i = 0; i < numberOfSentences; i++) {
            int sentenceLength = random.nextInt(10) + 1;
            Collections.shuffle(words);
            String s="";

            for(int j=0;j<sentenceLength;j++) {
                    String word=words.get(j);
                    s=s+word+" ";
            }
            System.out.println(s.trim());
            if((s.chars().filter(ch->ch==' ').count())>3){
                arr.add(s);
            }
            }
       System.out.println("\n"+"Sentences with more than 3 words : ");
        for(String str:arr) {
            System.out.println(str);
        }
        }
    public static void generateLongerSentences(ArrayList<String> words, int numberOfSentences){
        Random random=new Random();

        System.out.println("\n"+"Sentences with max length 15 :");
        for(int k=0;k<numberOfSentences;k++){
            Collections.shuffle(words);
            String s = "";
            int sentenceLength=random.nextInt(15)+1;
            for(int j=0;j<sentenceLength;j++) {
                if (j >= 10) {
                    j -= 10;
                    String word = words.get(j);
                    s = s + word + " ";
                    j+=10;
                } else {
                    String word = words.get(j);
                    s = s + word + " ";
                }
            } System.out.println(s.trim());
        }
    }
    }
