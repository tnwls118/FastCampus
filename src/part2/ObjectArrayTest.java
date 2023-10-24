package part2;

public class ObjectArrayTest {
    public static void main(String[] args) {

        //book클래스를 만들고 book 객체 3개를 생성 후 출력하시오.
        book book1 = new book("어린왕자", "홍길동", 100, 50000);
        book book2 = new book("신데렐라", "영심이", 150, 10000);
        book book3 = new book("반지의제왕", "길동이", 300, 30000);

        System.out.println(book1.제목 + "\t" + book1.작가 + "\t" +book1.페이지수 + "\t" +book1.판매가격);
        System.out.println(book2.제목 + "\t" + book2.작가 + "\t" +book2.페이지수 + "\t" +book2.판매가격);
        System.out.println(book3.제목 + "\t" + book3.작가 + "\t" +book3.페이지수 + "\t" +book3.판매가격);
    }
}

class book {
    String 제목;
    String 작가;
    int 페이지수;
    int 판매가격;

    book(String 제목, String 작가, int 페이지수, int 판매가격){
        this.제목 = 제목;
        this.작가 = 작가;
        this.페이지수 = 페이지수;
        this.판매가격 = 판매가격;
    }
}
