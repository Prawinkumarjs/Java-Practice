package Week6;

import java.util.*;

public class string_methods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Word 1: ");
        String word1 = sc.nextLine();
        System.out.print("Enter the Word 2: ");
        String word2 = sc.nextLine();
        

        System.out.println("Length: " + word1.length());
        System.out.println("CharAt of index(3): " + word1.charAt(3));
        System.out.println("word 1 == word 2: " + word1.equals(word2) );
        System.out.println("Word 1 == word 2(in equals ignore case): " + word1.equalsIgnoreCase(word2));
        System.out.println("Contain : " + word1.contains("win"));
        System.out.println("Substring: " + word1.substring(3));

        System.out.print("Enter replace word: ");
        String rword = sc.nextLine();

        System.out.println("Replaced Word: " + rword + word1.substring(7));

        String tword = "prawin";

        System.out.println("Trim: " + tword.trim());

        

        System.out.println("Upper case: " + word1.toUpperCase());
        System.out.println("Lower case: " + word1.toLowerCase());
        System.out.println("Starts With: " + word1.startsWith(word2));
        System.out.println("Ends With: " + word1.endsWith(word2));
        System.out.println("Split:");

        String arr[] = word1.split(" ");

        for(String s : arr){
            System.out.println(s);
        }



        sc.close();
        

    }
    
}
