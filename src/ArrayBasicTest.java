public class ArrayBasicTest {
    public static void main(String[] args) {
        //정수 5개를 저장 할 배열을 생성하고 모두 10을 저장하여 합산하시오.

        int[] 정수 = new int[50];

        int sum = 0;
        for(int i =0; i<정수.length; i++) {
            정수[i] = 10;
            sum += 정수[i];
        }
        System.out.println("sum = " + sum);
        int length = 정수.length;
        System.out.println("length = " + length);
    }
}

