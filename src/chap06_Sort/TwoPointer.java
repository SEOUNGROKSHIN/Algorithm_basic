package chap06_Sort;

public class TwoPointer {

    class Solution {
        public String solution(String my_string, int s, int e) {
            char[] arr = my_string.toCharArray();

            while (s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

            return new String(arr);
        }
    }

    public static void main(String[] args) {
        TwoPointer tp = new TwoPointer();
        Solution sol = tp.new Solution();

        String result = sol.solution("Progra21Sremm3", 6, 12);
        System.out.println("결과 문자열: " + result);
    }
}
