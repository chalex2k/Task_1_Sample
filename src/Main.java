import java.util.Locale;
import java.util.Scanner;

/*
Чеклист
1. Определить входные данные, выходные данные, их тип
2. Придумать интерфейс
3. Реализовать ввод данных
4. Решить задачу на листочке - получить формулы
5. Перенести формулу(ы) в код
6. Реализовать вывод результата
7. Вынести расчёт в функцию
8. Рефакторинг
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        System.out.println(x);
    }
}