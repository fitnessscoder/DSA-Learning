package hasing;

import java.util.Scanner;

public class SearchCharacterOcc {
    public static void main(String[] args) {
        String str= "abcdabefc";

        int [] st = new int[26];

        for(int i=0; i<str.length(); i++) {
            st[str.charAt(i)-'a']++;
        }
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        int sequence = ch.length()-1;

        while (sequence>=0) {
            System.out.println("character " +ch.charAt(sequence) +" occured "+ st[ch.charAt(sequence)-'a'] +" times");
            sequence--;
        }
    }
}
