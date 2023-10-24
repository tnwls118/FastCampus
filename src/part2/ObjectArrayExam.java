package part2;

import java.util.Scanner;

public class ObjectArrayExam {
    public static void main(String[] args) {

        //영화 3편을 저장하는 배열을 생성하고 출력하시오.
        Movie[] m = new Movie[3];

        m[0] = new Movie("반지의 제왕", "홉킨스", 120, 10000);
        m[1] = new Movie("해리포터", "존스", 150, 15000);
        m[2] = new Movie("타이타닉", "할리스", 200, 20000);

        Scanner cmd = new Scanner(System.in);

            for (int i = 0; i < m.length; i++) {
                System.out.println("출력하고싶은 인덱스를 입력하세요:");
                String sc = cmd.nextLine();

                if (sc.equals("0")) {
                    System.out.println(m[0]);
                } else if (sc.equals("1")) {
                    System.out.println(m[1]);
                } else if (sc.equals("2")) {
                    System.out.println(m[2]);
                }
                }
            }
        }

class Movie {
    String 제목;
    String 감독;
    int 상영시간;
    int 목표관객수;

    Movie(String 제목, String 감독, int 상영시간, int 목표관객수) {
        this.제목 = 제목;
        this.감독 = 감독;
        this.상영시간 = 상영시간;
        this.목표관객수 = 목표관객수;
    }

    @Override
    public String toString() {
        return "제목:" + 제목 + "\t감독:" + 감독 + "\t상영시간:" + 상영시간 + "\t목표관객수:" + 목표관객수;
    }
}