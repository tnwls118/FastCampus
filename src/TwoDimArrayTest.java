public class TwoDimArrayTest {
    public static void main(String[] args) {
        //2행 4열의 메트릭스 생성
        //Q.행(row),열(column)로 데이터 저장하기
        int[][] a = new int[2][4];
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[0][3] = 40;
        a[1][0] = 50;
        a[1][1] = 60;
        a[1][2] = 70;
        a[1][3] = 80;
        //row-major 메모리 확장

        for(int i =0; i<a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
        //이중 for문 활용
    }
}
