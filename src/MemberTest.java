public class MemberTest {
    public static void main(String[] args) {
        //한명의 회원 데이터를 저장하고 출력하시오.
        Member member1 = new Member();
        member1.이름 = "홍길동";
        member1.나이 = 22;
        member1.전화번호 = "010-0000-0000";
        member1.이메일 = "dsfdsf@naver.com";
        member1.거주지 = "대전광역시";
        member1.몸무게 = 72;

        System.out.println("이름:"+member1.이름 + "\t나이:"+member1.나이+"\t전화번호:"+member1.전화번호+"\t이메일:"+member1.이메일+"\t거주지:"+member1.거주지+"\t몸무게:"+member1.몸무게);
    }
}
