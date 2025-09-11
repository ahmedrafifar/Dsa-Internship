package Day1;

import java.util.Scanner;

public class Vowelcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your word");
        String Vowel = sc.nextLine();
        String vowel = Vowel.toLowerCase();
        int count=0;
        for(int i = 0; i < vowel.length(); i++){
            char ch =vowel.charAt(i);
            if (ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;

            }
        }
        System.out.println("the count of vowels in your word is :"+count);
    }
}
