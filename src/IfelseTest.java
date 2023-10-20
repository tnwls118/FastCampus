import java.util.Scanner;

public class IfelseTest {
    public static void main(String[] args) {
        //Q.정수 1개를 입력 받아 짝수인지 홀수 인지를 판단하는 프로그램을 만드세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력:");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
