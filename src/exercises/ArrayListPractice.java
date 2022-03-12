package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(45);
        numList.add(52);
        numList.add(1);
        numList.add(64);
        numList.add(4);
        numList.add(123);
        numList.add(5);
        numList.add(7);
        numList.add(8);
        System.out.println(sumNumList(numList));


        String sampleStr = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.";

        String[] wordArr = sampleStr.split(" ");
        ArrayList<String> wordList = new ArrayList<String>(
                Arrays.asList(wordArr));

//        ArrayList<String> wordList = new ArrayList<>();
//        wordList.add("caulk");
//        wordList.add("arise");
//        wordList.add("stones");
//        wordList.add("watch");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the words you'd like to find");
        int wordLength = in.nextInt();

        wordFinderByLength(wordList, wordLength);

    }

    public static int sumNumList(ArrayList<Integer> nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }

    public static void wordFinderByLength(ArrayList<String> words, int length){
        for(String word : words){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }
}
