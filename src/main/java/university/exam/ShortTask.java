package university.exam;

/**
 * Кратка задача – за тарикати.
 */
public class ShortTask implements Task {

    @Override
    public String getType() {
        return "кратка";
    }

    @Override
    public String getDescription() {
        return "Напишете функция на не повече от 5 реда.";
    }
}
