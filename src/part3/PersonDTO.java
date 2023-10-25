package part3;

//Q.이름,나이,전화번호 상태정보와 운동, 먹다, 걷다 행위정보를 가지고 있는 Person class를 modelling하세요.

public class PersonDTO {
    public String name;
    public int age;
    public String phone;


    public PersonDTO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void play() {
        System.out.println("운동을 한다.");
    }

    public void eat() {
        System.out.println("먹는다.");
    }

    public void walk() {
        System.out.println("걷다.");
    }

}
