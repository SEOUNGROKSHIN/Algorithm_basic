package FastCampus_Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("소문자와 대문자로 이루어진 단어를 입력하세요");
        // input
        String answer = sc.nextLine();

        char[] arr = new char[100];
        char[] a;
        char[] b;
        arr = answer.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 'A' && arr[i] <= 'Z') {
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {

            }

            System.out.print(arr[i]);

        }

    }

}
