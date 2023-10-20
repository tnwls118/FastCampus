import java.util.Scanner;

public class IfelseExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("날짜를 입력하세요(format: 2023) : ");
        int year = scan.nextInt();

        if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println("입력된 년도는 윤년입니다.");
        } else {
            System.out.println("입력된 년도는 윤년이 아닙니다.");
        }

    }
}
