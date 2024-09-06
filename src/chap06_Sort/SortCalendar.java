package chap06_Sort;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

// 자연스러운 순서를 갖고 있는 배열의 정렬
// 달력의 배열을 정렬
public class SortCalendar {

    public static void main(String[] args) {
        GregorianCalendar[] x = {
                new GregorianCalendar(2022, NOVEMBER, 1),
                new GregorianCalendar(1963, OCTOBER, 18),
                new GregorianCalendar(1985, APRIL, 5),
        };

        Arrays.sort(x);

        for (int i = 0; i < x.length; i++)
            System.out.printf("%04d년 %02d월 %02d일\n",
                    x[i].get(YEAR),
                    x[i].get(MONTH) + 1,                // month로 얻는 값은 0 ~ 11이므로 1을 더함
                    x[i].get(DATE)
                  );
    }
}
