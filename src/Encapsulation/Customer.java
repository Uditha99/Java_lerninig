package Encapsulation;

public class Customer {
    private String name;
    private int age;
    private String NIC;

    public Customer() {
    }

    public Customer(String name, int age, String NIC) {
        this.name = name;
        this.age = age;
        this.NIC = NIC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
}
