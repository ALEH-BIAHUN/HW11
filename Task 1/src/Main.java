public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        Phone.countryOfManufacturer = "China";

        phone1.receiveCall("Nik", "2233666", 123.5);
        phone2.receiveCall("Mike", "22115566333", 0.0);
        phone3.receiveCall("Alice");
    }
}
