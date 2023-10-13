public class ArrayBasicTest {
    public static void main(String[] args) {
        //정수 5개를 저장 할 배열을 생성하고 모두 10을 저장하여 합산하시오.

        int[] 정수 = new int[5];
        정수[0] = 10;
        정수[1] = 10;
        정수[2] = 10;
        정수[3] = 10;
        정수[4] = 10;

        int sum = 0;
        for(int i =0; i<=4; i++) {
            sum += 정수[i];
        }
        System.out.println("sum = " + sum);
    }
}

