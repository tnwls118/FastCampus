import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        //Q.80점 이상의 학생 중에서 90점 이상은  A반, 85점 이상은 B반, 그렇지 않으면 C반으로 편성하고 점수가 80점 미만이면
        //불합격 처리를하는 프로그램을 만드시오.

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("점수:");
            int score = sc.nextInt();

            if (90 <= score) {
                System.out.println("A반");
            } else if ((85 <= score) && (score < 90)) {
                System.out.println("B반");
            } else if ((80 <= score) && (score < 85)) {
                System.out.println("C반");
            } else {
                System.out.println("불합격");
                break;
            }

        }
        sc.close();

    }
}