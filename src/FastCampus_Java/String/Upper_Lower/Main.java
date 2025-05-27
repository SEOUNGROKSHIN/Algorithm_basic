package FastCampus_Java.String.Upper_Lower;

import java.util.Scanner;

public class Main {

    //    대소문자 알고리즘
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str =sc.next();
//        String answer = "";
//    for (int i = 0; i < str.length(); i++) {
//     char ch = str.charAt(i);
//        if ('A' <= ch && ch <= 'Z') {
//            // ch - 'A' ==> 몇번째 알파벳인지 나옴
//            // 소문자로 변환하는 과정이니까 소문자 a를 더해줌
//            answer += (char)('a' + ch - 'A');
//            System.out.print((char)('a' + ch - 'A'));
//        } else {
//            answer += (char)('A' + ch - 'a');
//            System.out.print((char)('A' + ch - 'a'));
//    }
//        System.out.println("answer : " + answer);
//    }
//     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                ans += (char)('a' + ch - 'A');
            } else {
                ans += (char)('A' + ch - 'a');
            }

            System.out.print(ans);
        }

    }
}
