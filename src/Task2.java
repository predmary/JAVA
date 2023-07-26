import java.util.Scanner;

public class Task2 {
    public void task2(Scanner scanner) {
        System.out.println("Введите имя: ");
        String name = scanner.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
