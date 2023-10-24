package part2;

import java.util.Scanner;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int a = 3625;

        System.out.println(a % 10);   //일의 자리수 출력
        System.out.println(a / 10 % 10); //십의 자리수 출력
        System.out.println(a / 100 % 10); //백의 자리수 출력
        System.out.println(a / 1000 % 10);//천의 자리수 출력

        int num = 2579;
        //1의 자리
        int a1 = num & 10;
        //10의 자리
        int a10 = num / 10 & 10;
        //100의 자리
        int a100 = num / 100 & 10;
        //1000의 자리
        int a1000 = num / 1000 & 10;

        System.out.println(a1 + a10 + a100 + a1000);

        System.out.println();

        //짝수(0) 출력, 홀수(1) 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력:");
        int cmd = scan.nextInt();

        if (cmd % 2 == 0) {
            System.out.println("입력 숫자:짝수");
        } else {
            System.out.println("입력 숫자:홀수");
        }


    }
}
