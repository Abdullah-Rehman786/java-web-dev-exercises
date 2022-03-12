package exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringType {
    public static void main(String [] args){

        String aliceQuote = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and" +
                " what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term ");

        String query = input.next().toLowerCase();
        Integer queryIndex = aliceQuote.toLowerCase().indexOf(query);
        Integer length = query.length();



        if(queryIndex > -1){
            System.out.println(aliceQuote);

            System.out.println(String.format("Query with length of %d found at index: %d",length,queryIndex));

            String editedQuote = aliceQuote.substring(0,queryIndex) + aliceQuote.substring(queryIndex+length+1);
            System.out.println(editedQuote);
        } else {
            System.out.println("Query not found");
        }

    }
}
