// Класс Address
public class Address {
    private String city;
    private String street;
    private int houseNumber;

    // Конструктор
    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    // Геттеры и сеттеры
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    // Метод toString() для вывода адреса
    @Override
    public String toString() {
        return "Address: " + street + " St., House " + houseNumber + ", " + city;
    }
}