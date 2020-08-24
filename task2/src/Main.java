import java.util.*;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка");

        int listSize = 0;
        int maxValue = 0;
        try {
            System.out.print("Введите размер списка: ");
            listSize = scanner.nextInt();
            System.out.print("Введите верхнюю границу для значений: ");
            maxValue = scanner.nextInt();
        } catch (InputMismatchException e) {
            logger.log("Произошла ошибка: " + e.toString());
            return;
        }

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> rawList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            rawList.add(random.nextInt(maxValue));
        }
        logger.log("Вот случайный список: " + rawList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int threshold = 0;
        try {
            System.out.print("Введите порог для фильтра: ");
            threshold = scanner.nextInt();
        } catch (InputMismatchException e) {
            logger.log("Произошла ошибка: " + e.toString());
            return;
        }
        Filter filter = new Filter(threshold);
        List<Integer> filteredList = filter.filterOut(rawList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);

        logger.log("Завершаем программу");
    }
}
