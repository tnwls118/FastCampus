package part2;

public class CallByReference {
    //Q.매개변수로 정수형 배열을 받아서 배열의 총합을 구하여 리턴 하는 메서드를 정의하세요.
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = add(a);
        System.out.println("result = " + result);

        int[] b = new int[]{11, 12, 13, 14, 15};
        int result1 = add(b);
        System.out.println("result1 = " + result1);

    }

    public static int add(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}

