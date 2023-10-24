public class ApiOverloding {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        //배열의 길이를 구하는 메서드(기본 제공 api)
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //문장의 특정 index 단어 추출(기본 제공 api)
        String st = "apple";
        System.out.println(st.charAt(0));
        //대문자 전환 메서드(기본 제공 api)
        System.out.println(st.toUpperCase());

        int c = 2;
        int d = 10;

        System.out.println(maxValue(c, d));
        System.out.println(minValue(c, d));

    }

    //Q.두개의 정수를 매개변수로 받아서 더 큰수를 리턴하는 메서드를 정의하시오.
    public static int maxValue(int a, int b) {
        //삼항연산자
        return (a > b) ? a : b;
    }

    //Q.두개의 정수를 매개변수로 받아서 더 큰수를 리턴하는 메서드를 정의하시오.
    public static int minValue(int a, int b) {
        //삼항연산자
        return (a < b) ? a : b;
    }
}
