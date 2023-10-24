package part2;

public class LogicalOperTest {
    public static void main(String[] args) {

        //Q.논리연산자의 결과 값을 쓰시오.
        int a = 1;
        int b = 2;

        System.out .println((a > 0) && (b > 0)); //true
        System.out.println((a < 0) && (b > 0)); //false
        System.out.println((a > 0) || (b > 0)); //true
        System.out.println((a < 0) || (b > 0)); //true
        System.out.println((a < 0) || (b < 0)); //false
        System.out.println(!(a > 0)); //false
        System.out.println(!(a < 0)); //ture
        System.out.println(!(a < 0) || (b > 0)); //ture
        System.out.println(!(a > 0) && (b > 0)); //false


    }
}
