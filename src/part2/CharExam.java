package part2;

public class CharExam {
    public static void main(String[] args) {
        //'1'+'2'+'3'+'4'+'5' = 15가 나오도록 프로그래밍 하시오.
        char a = '1';
        char b = '2';
        char c = '3';
        char d = '4';
        char e = '5';

        int sum = (a-'0')+(b-'0')+(c-'0')+(d-'0')+(e-'0');
        System.out.println("sum = " + sum);

        //casting이란? 값의 타입을 다른 타입으로 변환하는 것
        int s = (int)(4.14);
        System.out.print("s = " + s);
    }
}
