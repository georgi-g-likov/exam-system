package university.exam;

/**
 * Позната задача – за калитковци (от минали години).
 */
public class FamiliarTask implements Task {

    @Override
    public String getType() {
        return "позната";
    }

    @Override
    public String getDescription() {
        return "Тази задача е точно като тази от контролното на миналата година.";
    }
}
