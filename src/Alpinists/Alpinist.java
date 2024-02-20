package Alpinists;

public class Alpinist {
    private String name;
    private int age;



    private String address;
    public Alpinist (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getAddress() {;
        System.out.println(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
