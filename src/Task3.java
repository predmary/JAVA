import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public void task3(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Введите элементы массива(с новой строки каждый): ");
        for (int i = 0; i < size; i++)
        {
            if(scanner.hasNextInt()){
                list.add(scanner.nextInt());
            }
        }

        System.out.print("Элементы массива, кратные 3: ");
        for (Integer num: list)
        {
            if (num%3==0)
            {System.out.print(num + " ");}
        }
    }
}
