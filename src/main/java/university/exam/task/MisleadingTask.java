package university.exam.task;

/**
 * Подвеждаща задача – за зубрачи.
 */
public class MisleadingTask implements Task {

    @Override
    public String getType() {
        return "подвеждаща";
    }

    @Override
    public String getDescription() {
        return "Намерете грешката в кода (изглежда лесно, но не е точно така...)";
    }
}
