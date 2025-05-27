class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer.append(code.charAt(i));
            }
        }

        return answer.toString();
    }
}

// 반드시 클래스 안에 main 메서드가 있어야 함!
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.solution(3, 1, "qjnwezgrpirldywt");
        System.out.println(result);
    }
}
