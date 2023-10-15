public class ArrayTest {
    public static void main(String[] args) {
        //실수 5개를 저장 할 배열을 생성하고  11, 12, 13, 14, 15을 저장하고 출력하세요.
        float[] array = new float[5];

        int a =1;

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + a;
            System.out.println(array[i]);
            a++;
        }

        //정수 5개를 아래처럼 배열에 초기화하고 index 0번째와 index 3번째 값을 더하여 출력하세요.
        int[] c = new int[]{10,20,30,40,50};
        for(int i = 0 ; i<c.length; i++){
            System.out.println("c = " + c[i]);
        }
        int sum = c[0] + c[3];
        System.out.println("sum = " + sum);

    }
}
