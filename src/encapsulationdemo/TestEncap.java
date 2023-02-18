package encapsulationdemo;

public class TestEncap {

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setName("Amit");;
        System.out.println(emp1.getName());

        System.out.println(emp1.getOrgName());

        emp1.setAge(152);
        System.out.println(emp1.getAge());
    }
}
