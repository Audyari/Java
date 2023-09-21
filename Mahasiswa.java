import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
     
        Scanner masukkan = new Scanner(System.in);
        int[] array = new int[5];

        for(int i=0; i< array.length; i++){
            array[i] = masukkan.nextInt();
        }

        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if(i < word1.length()) sb.append(word1.charAt(i));
            if(i < word2.length()) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}
