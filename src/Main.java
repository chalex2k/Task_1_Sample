import java.util.Locale;
import java.util.Scanner;

/*
// Вариант 28

Чеклист

1. Определить входные данные, выходные данные, их тип
входные данные: час, минута, секунда первого и второго момента времени. Все int
выходные данные: разница в секундах -  int

2. Придумать интерфейс
Момент времени 1
часы: 1
минуты: 30
секунды: 45
Момент времени 2
часы: 2
минуты: 0
секунды: 0
Разница в секундах: 450

3. Реализовать ввод данных
4. Решить задачу на листочке - получить формулы
5. Перенести формулу(ы) в код
6. Реализовать вывод результата
7. Вынести расчёт в функцию
8. Рефакторинг
 */
public class Main {
    static final int SECONDS_IN_MIN = 60;
    static final int MINS_IN_HOUR = 60;

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        int hour1, minute1, second1, hour2, minute2, second2;
        System.out.println("Момент времени 1");
        System.out.print("часы: ");
        hour1 = scanner.nextInt();
        System.out.print("минуты: ");
        minute1 = scanner.nextInt();
        System.out.print("секунды: ");
        second1 = scanner.nextInt();
        System.out.println("Момент времени 2");
        System.out.print("часы: ");
        hour2 = scanner.nextInt();
        System.out.print("минуты: ");
        minute2 = scanner.nextInt();
        System.out.print("секунды: ");
        second2 = scanner.nextInt();

        int ans = calcDifference(hour1, minute1, second1, hour2, minute2, second2);

        System.out.printf("Разница в секундах: %d\n", ans);
    }

    public static int calcDifference(int h1, int m1, int s1, int h2, int m2, int s2) {
        int moment1InSeconds = h1 * MINS_IN_HOUR * SECONDS_IN_MIN + m1 * SECONDS_IN_MIN + s1;
        int moment2InSeconds = h2 * MINS_IN_HOUR * SECONDS_IN_MIN + m2 * SECONDS_IN_MIN + s2;
        int dayInSeconds = 24 * MINS_IN_HOUR * SECONDS_IN_MIN;
        moment2InSeconds += dayInSeconds;
        return (moment2InSeconds - moment1InSeconds) % dayInSeconds;
    }
}