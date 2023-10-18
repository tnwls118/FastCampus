import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("===== 프로그램 시작 =====\n");
        System.out.println("하기 값 입력");
        System.out.print("제목:");
        String 제목 = scan.nextLine();
        System.out.print("가격:");
        int 가격 = scan.nextInt();
        scan.nextLine();
        System.out.print("출판사:");
        String 출판사 = scan.nextLine();
        System.out.print("저자:");
        String 저자 = scan.nextLine();
        System.out.print("페이지수:");
        int 페이지수 = scan.nextInt();
        scan.nextLine();
        System.out.print("ISBN:");
        int ISBN = scan.nextInt();

        System.out.println("--입력정보--\n제목:" + 제목 + "\n가격:" + 가격 + "\n출판사:" + 출판사 + "\n저자:" + 저자 + "\n페이지수:" + 페이지수 + "\nISBN:" + ISBN);
        System.out.println("===== 프로그램 종료 =====");
        scan.close();

    }
}
