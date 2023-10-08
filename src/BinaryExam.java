public class BinaryExam {
    public static void main(String[] args) {
        //decimal(10진수)
        int decimal = 123;
        System.out.println("decimal = " + decimal);
        //binary(2진수)
        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary = " + binary);
        //octal(8진수)
        String octal = Integer.toOctalString(decimal);
        System.out.println("octal = " + octal);
        //hexa(16진수)
        String hexa = Integer.toHexString(decimal);
        System.out.println("hexa = " + hexa);

        int d = 123;
        System.out.println("d = " + d);
        int b = 0b1111011;
        System.out.println("b = " + b);
        int o = 0173;
        System.out.println("o = " + o);
        int h = 0x7b;
        System.out.println("h = " + h);

    }
}
