public class WhileTest {
    public static void main(String[] args) {

        //Q.int[] numbers = {1,2,3,4,5,6,7,8,9,10} 주어진 배열의 모든 원소를 출력하세요.

        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

        int i = 0;
        while (i<numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        //do_while문 테스트
        i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
    }
}
