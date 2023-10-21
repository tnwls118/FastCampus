import java.util.Scanner;

public class GooGooDan {
    public static void main(String[] args) {

        //Q.입력한 숫자에 대한 구구단이 출력되는 프로그램을 만드시오.

        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 출력(ex:1) :");
        int dan = sc.nextInt();

        System.out.println("입력한 숫자에 대해 구구단은 다음과 같습니다.");
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            int result = dan * i;
            System.out.println(dan + "x" + i + "=" + result);
            sum += result;
        }
        System.out.println("출력한 구구단의 합계:" + sum);
        System.out.println("프로그램 종료");
        sc.close();
    }
}
