

public class Mahasiswa {
    public static void main(String[] args) {
     
        Solution solution = new Solution(); // Membuat objek Solution

        String word1 = "Hello";
        String word2 = "World";
        
        String merged = solution.mergeAlternately(word1, word2); // Memanggil metode mergeAlternately
        
        System.out.println(merged); // Menampilkan hasil penggabungan
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
