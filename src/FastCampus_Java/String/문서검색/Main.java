package FastCampus_Java.String.문서검색;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int startIdx = 0;
        while(true) {
            int findIdx = doc.indexOf(word, startIdx);

            if (findIdx < 0)
                break;
            count++;
            startIdx = findIdx + word.length();
        }
    }
}
