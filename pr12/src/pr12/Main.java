package pr12;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person();
        person.getFio();
        person.print();
        Address address = new Address();
        String data = address.getData();
        address.split(data);
        address.print();
    }
}
