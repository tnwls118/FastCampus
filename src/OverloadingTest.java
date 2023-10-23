public class OverloadingTest {
    //Q.매개변수로 두개의 정수 값을 받아서 총합을 구하여 리턴하는 메서드를 정의하세요.
    //Q.매개변수로 두개의 실수 값을 받아서 총합을 구하여 리턴하는 매세더를 정의하세요.
    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30, 40, 50};
        int intResult = add(a);
        System.out.println("intResult = " + intResult);

        float[] b = new float[]{5.1f, 2.1f, 3.4f, 45.5f};
        float floatResult = add(b);
        System.out.println("floatResult = " + floatResult);
    }

    public static int add(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static float add(float[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
