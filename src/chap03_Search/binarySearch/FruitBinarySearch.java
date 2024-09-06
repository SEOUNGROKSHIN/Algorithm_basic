package chap03_Search.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FruitBinarySearch {

    public static void main(String[] args) {

        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이를 설정하세요. ");
        int n = sc.nextInt();

        System.out.println("원하는 과일을 입력하세요. ");
        String key = sc.next();

        String[] arr = new String[n];

        System.out.println("과일을 입력하세요. ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        int idx = Arrays.binarySearch(arr, key);

        if (idx < 0)
            System.out.println("찾으시는 과일은 없습니다.");
        else
            System.out.print("찾으시는 과일은 " + "arr[" + idx + "]=" + arr[idx] + "있습니다.");
    }
}
