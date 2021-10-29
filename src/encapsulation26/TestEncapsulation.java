package encapsulation26;

public class TestEncapsulation {


    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        obj.setName(" ");
        obj.getAge();
        obj.setRollNo(51);

        System.out.println("Prime's name:" + obj.getName());
        System.out.println("prime's age:" + obj.getAge());
        System.out.println("Prime's rollNo:" + obj.getRollNo());

    }
}
