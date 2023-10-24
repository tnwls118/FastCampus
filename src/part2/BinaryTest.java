package part2;

import javax.lang.model.SourceVersion;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;
        //실수는 기본적으로 double로 인식되기 때문에 float으로 형변환 필요
        boolean b = false;
        char c = 'A';
        java.lang.String s = "APPLE";

        //69를 10진수, 2진수, 8진수, 16진수로 출력하시오
        //weight: 1 2 4 8 16 32 64
        //1) 10진수: (69)10
        //2) 2진수:  (01000101)2
        //3) 8진수: (105)8
        //4) 16진수: (45)16
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101;
        //앞에 0b가 있으면 컴파일러는 2진수로 인식한다.
        System.out.println("binary = " + binary);
        int octal = 0105;
        System.out.println("octal = " + octal);
        //앞에 0이 있으면 컴파일러는 8진수로 인식한다.
        int hexa = 0x45;
        System.out.println("hexa = " + hexa);
        //앞에 0x가 있으면 컴파일러는 16진수로 인식한다.
        System.out.println();
        //123을 10진수, 2진수, 8진수, 16진수로 출력
        //weight 1 2 4 8 16 32 64
        int decimal1 = 123;
        System.out.println("decimal1 = " + decimal1);
        int binary1 = 0b1111011;
        System.out.println("binary1 = " + binary1);
        int octal1 = 0173;
        System.out.println("octal1 = " + octal1);
        int hexa1 = 0x7b;
        System.out.println("hexa1 = " + hexa1);
    }
}
