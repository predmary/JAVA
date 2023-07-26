import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Составить алгоритм: если введенное число больше 7, то вывести \"Привет\"");
        System.out.println("2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести \"Привет, Вячеслав\", если нет, то вывести \"Нет такого имени\"");
        System.out.println("3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        System.out.print("Какую задачу хотите запустить?: ");
        int task = scanner.nextInt();
        switch (task)
        {
            case 1:
                Task1 t1 =  new Task1();
                t1.task1(scanner);
                break;
            case 2:
                Task2 t2 =  new Task2();
                t2.task2(scanner);
                break;
            case 3:
                Task3 t3 =  new Task3();
                t3.task3(scanner);
                break;
        }

        scanner.close();
    }
}
