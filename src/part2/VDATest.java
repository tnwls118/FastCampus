package part2;

public class VDATest {
    public static void main(String[] args) {
        //정수 한 개를 저장하기 위해서 변수를 선언 하시오.
        int v = 10;
        System.out.println("v = " + v);

        //변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장하세요
        int a = 10;
        int b = a;
        int c = b*10;

        System.out.println("c = " + c);

        //sum이라는 변수에 1부터 5까지의 수를 누적해서 출력하시오.
        int sum = 0;
        for(int g = 1; g<=5; g++) {
            sum = sum+g;
        }
        System.out.println("sum = "+ sum);

        //x = 10, h = 20을 저장하고 변수의 값을 서로 교환하여 출력하시오.
        int x = 10;
        int h = 20;
        int m;
        m = h;
        h = x;
        x = m;
        System.out.println("x = " + x + ':' + "h = " + h);
    }
}
