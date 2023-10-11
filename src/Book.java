import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        BookDetail book1 = new BookDetail("어린왕자", 5000, "한빛출판사", "홍길동", 300, "직인");
        BookDetail book2 = new BookDetail("신데렐라", 10000, "금빛출판사", "영심이", 200, "직인");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("책 정보 조회: 'book1', 'book2' 또는 '종료'를 입력하세요.");
            String userInput = scanner.nextLine();

            if (userInput.equals("book1")) {
                System.out.println("book1 정보: " + book1);
                System.out.print("손님 수를 입력하세요: ");
                int 손님수 = scanner.nextInt();
                System.out.println("book1 매출 = " + book1.매출(손님수));
            } else if (userInput.equals("book2")) {
                System.out.println("book2 정보: " + book2);
                System.out.print("손님 수를 입력하세요: ");
                int 손님수 = scanner.nextInt();
                System.out.println("book2 매출 = " + book2.매출(손님수));
            } else if (userInput.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 'book1', 'book2', 또는 '종료' 중 하나를 입력하세요.");
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

class BookDetail {
    private String 제목;
    private int 가격;
    private String 출판사;
    private String 저자;
    private int 페이지수;
    private String ISBN;

    BookDetail(String 제목, int 가격, String 출판사, String 저자, int 페이지수, String ISBN) {
        this.제목 = 제목;
        this.가격 = 가격;
        this.출판사 = 출판사;
        this.저자 = 저자;
        this.페이지수 = 페이지수;
        this.ISBN = ISBN;
    }


    public int 매출(int 손님수) {
        return 가격 * 손님수;
    }

    public String toString() {
        return "[제목=" + 제목 + ", 가격=" + 가격 + ", 출판사=" + 출판사 + ", 저자=" + 저자 + ", 페이지수=" + 페이지수 + ", ISBN=" + ISBN + "]";
    }

    public String get제목() {
        return 제목;
    }

    public String get저자() {
        return 저자;
    }

    public String get출판사() {
        return 출판사;
    }

    public int get가격() {
        return 가격;
    }

    public int get페이지수() {
        return 페이지수;
    }

    public String getISBN() {
        return ISBN;
    }
}


