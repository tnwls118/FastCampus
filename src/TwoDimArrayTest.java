public class TwoDimArrayTest {
    public static void main(String[] args) {
//        //2행 4열의 메트릭스 생성
//        //Q.행(row),열(column)로 데이터 저장하기
//        int[][] a = new int[][]{{10, 20, 30, 40}, {50, 60, 70, 80}};
//        //row-major 메모리 확장
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//            }
//        }
//        //이중 for문 활용

        //Q.가변 길이 배열 만들기
        int[][] b = new int[5][];

        b[0] = new int[]{1,2};
        b[1] = new int[]{3,4,5};
        b[2] = new int[]{6,7,8,9};
        b[3] = new int[]{10,11,12};
        b[4] = new int[2];
        b[4][0] = 13;
        b[4][1] = 14;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }

    }
}
