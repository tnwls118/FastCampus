package part2;

public class MaxMinValue {
    public static void main(String[] args) {
        //Q.삼 항 연산자를 이용하여 정수 2개 중 max vlaue 와 min value를 출력하세요.
        int a = 20;
        int b = 10;

        //min value
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);
        //max value
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);

    }
}
