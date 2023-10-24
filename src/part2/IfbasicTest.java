package part2;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {

        //Q.정수 1개를 입력 받아 립력된 수가 7의 배수인지를 출력하세요.
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("cmd(숫자만 입력):");
            int cmd = scan.nextInt();

            if ((cmd % 7) == 0) {
                System.out.println("cmd: 7의 배수입니다.\n");
            } else {
                System.out.println("7의 배수가 아닙니다.");
                break;
            }
        }
        System.out.println();

        //Q.나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하세요.
        int a = 19;
        if (19 <= a) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년입니다.");
        }
    }
}