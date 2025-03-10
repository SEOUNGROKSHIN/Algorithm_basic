
public class Main {

    public static void main(String[] args) {
        int answer = 0;
        int n = 7;

        for(int i = n; i >= 0; i -= 2)
            answer += (n % 2 == 0) ? i * i : i;

        System.out.println(answer);
    }
}
