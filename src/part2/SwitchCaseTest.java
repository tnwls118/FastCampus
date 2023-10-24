package part2;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        //Q.switchCase문을 활용하여 요일에 해당하는 운동을 출력하세요.
        //sunday: 야구, monday:농구, tuesday:수영,wednesday:수영,friday:휴식,saturday:휴식

        Scanner sc = new Scanner(System.in);
        System.out.println("=====프로그램 시작=====\n요일별 스케줄 확인\n");
        System.out.print("요일 입력:");
        String cmd = sc.nextLine();

        switch (cmd) {
            case "월요일":
                System.out.println("농구");
                System.out.println("=====프로그램 종료=====");
                break;
            case "화요일":
            case "수요일":
                System.out.println("수영");
                System.out.println("=====프로그램 종료=====");
                break;
            case "금요일":
            case "토요일":
                System.out.println("휴식");
                System.out.println("=====프로그램 종료=====");
                break;
            case "일요일":
                System.out.println("야구");
                System.out.println("=====프로그램 종료=====");
                break;
            default:
                System.out.println("일치하는 요일이 없음");
        }
        sc.close();
    }
}
