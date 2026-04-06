package university.exam.decorator;

import university.exam.student.StudentComponent;
import university.exam.task.Task;

/**
 * Decorator – суперсила „Телепатия": студентът чете мислите на съседа.
 */
public class TelepathyDecorator extends SuperpowerDecorator {

    public TelepathyDecorator(StudentComponent wrapped) {
        super(wrapped);
    }

    @Override
    public String getSuperpower() {
        return "Телепатия";
    }

    @Override
    public String solve(Task task) {
        return wrapped.solve(task) + " [Суперсила: Телепатия – чете мислите на съседа!]";
    }
}
