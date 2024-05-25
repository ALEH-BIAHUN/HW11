public class Phone {
    static String countryOfManufacturer;
    String phoneNumber;
    String phoneModel;
    double phoneWeight;

    public Phone() {
    }

    public Phone(String phoneNumber, String phoneModel, double phoneWeight) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
    }
    public void receiveCall(String name) {
        receiveCall(name, "", 0.0);
    }
    public void receiveCall(String name, String phoneNumber, double phoneAge) {
        System.out.println("Calling subscriber named " + name + "," + (phoneNumber == "" ? "" : " his phone number is: " + phoneNumber)
        + "the weight of his phone is: " + phoneWeight + ".");
    }
}
