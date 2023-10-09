public class CharTest {
    public static void main(String[] args) {
        //'가'라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char c = 'A';
        System.out.println("c = " + c);

        int a ='A';
        System.out.println("a = " + a);
        //char은 int 출력 시 아스키코드로 출력된다.
        //why? char은 수치형 자료이기 때문이다.

        int b = 'B'+1;
        System.out.println("b = " + b);
        int d = 'B';
        System.out.println("d = " + (char)d);
        //casting을 하게되면 아스키코드가 아닌 문자로 출력될 수 있다.
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가';
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00';
        System.out.println("hanU = " + (char)hanU);

        char upper = 'A';
        char lower =  (char)(upper+32);
        System.out.println("lower = " + lower);

        char lower1 = 'u';
        char upper1 = (char)(lower1 -32);
        System.out.println("upper1 = " + upper1);

        //'1' + '2' = 3이 나오도록 프로그래밍 하시오.

        char f = '1';
        char g = '2';

        int sum = (f-48)+(g-48);
        System.out.println("sum = " + sum);

        int sum1 = (f-'0') + (g-'0');
        System.out.println("sum1 = " + sum1);

    }
}
