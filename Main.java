// Класс Main
public class Main {
    public static void main(String[] args) {
        // Создаем пользователя
        User user = new User("John Doe");

        // Создаем адрес
        Address address = new Address("Kyiv", "Shevchenko", 10);

        // Устанавливаем адрес для пользователя
        user.setAddress(address);

        // Выводим информацию о пользователе
        System.out.println(user);

        // Выводим адрес пользователя напрямую
        System.out.println("User's Address: " + user.getAddress());
    }
}
