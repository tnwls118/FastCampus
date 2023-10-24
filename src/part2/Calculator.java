package part2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //계산기 기능 구현

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println("sum:" + (a + b));
        System.out.println("subtract:" + (a - b));
        System.out.println("multiply:" + (a * b));
        System.out.println("divide:" + (a / b));


        System.out.println("========================");
        //두 과목의 점수를 이용하여 총점과 평균을 출력하는 프로그램

        int kor = 77;
        int eng = 87;
        int 총점, 평균;

        총점 = kor + eng;
        평균 = (kor+eng)/2;

        System.out.println("총점:" + 총점);
        System.out.println("평균:" + 평균);

    }
}