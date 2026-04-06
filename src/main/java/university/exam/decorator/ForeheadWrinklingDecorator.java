package university.exam.decorator;

import university.exam.student.StudentComponent;
import university.exam.task.Task;

/**
 * Decorator – суперсила „Сбръчкване на челото": активира скрита памет.
 */
public class ForeheadWrinklingDecorator extends SuperpowerDecorator {

    public ForeheadWrinklingDecorator(StudentComponent wrapped) {
        super(wrapped);
    }

    @Override
    public String getSuperpower() {
        return "Сбръчкване на челото";
    }

    @Override
    public String solve(Task task) {
        return wrapped.solve(task) + " [Суперсила: Сбръчкване на челото – активира скрита памет!]";
    }
}
