import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (int value : source) {
            if (value >= threshold) {
                logger.log(String.format("Элемент \"%d\" проходит", value));
                result.add(value);
            } else {
                logger.log(String.format("Элемент \"%d\" не проходит", value));
            }
        }
        return result;
    }
}
