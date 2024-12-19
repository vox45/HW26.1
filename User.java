// Класс User
public class User {
    private String name;
    private Address address;

    // Конструктор
    public User(String name) {
        this.name = name;
    }

    // Геттеры и сеттеры для адреса
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    // Метод toString() для вывода информации о пользователе
    @Override
    public String toString() {
        return "User: " + name + ", " + (address != null ? address.toString() : "No Address");
    }
}
