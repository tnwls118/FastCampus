public class CastingTest {
    public static void main(String[] args) {
        //int type 정수를 double type의 실수로 형변환하여 출력하시오(묵시적 형변환)
        int a = 5;
        double b = a;
        System.out.println("b = " + b);

        //double type의 실수를 int type의 정수로 형변환하여 출력하시오(강제적 형변환)
        double c = 14.6;
        int d = (int)c;
        System.out.println("d = " + d);



    }
}
