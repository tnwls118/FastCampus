package part3;

//Q.한 사람의 데이터를 저장할 변수를 선언 하세요.
public class PersonTest {
    public static void main(String[] args) {
        PersonDTO person = new PersonDTO("홍길동", 30, "010-0000-0000");

        System.out.println("name:" + person.name + "\t" + "age:" + person.age + "\t" + "phone:" + person.phone);

        person.play();
        person.eat();
        person.walk();
    }
}
