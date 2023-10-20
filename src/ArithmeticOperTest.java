public class ArithmeticOperTest {
    public static void main(String[] args) {
        int a = 3625;

        System.out.println(a % 10);   //일의 자리수 출력
        System.out.println(a / 10 % 10); //십의 자리수 출력
        System.out.println(a / 100 % 10); //백의 자리수 출력
        System.out.println(a / 1000 % 10);//천의 자리수 출력
    }
}
