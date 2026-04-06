package university.exam.decorator;

import university.exam.student.StudentComponent;
import university.exam.task.Task;

/**
 * Decorator – суперсила „Инфрачервено зрение": вижда бележките под масата.
 */
public class InfraredVisionDecorator extends SuperpowerDecorator {

    public InfraredVisionDecorator(StudentComponent wrapped) {
        super(wrapped);
    }

    @Override
    public String getSuperpower() {
        return "Инфрачервено зрение";
    }

    @Override
    public String solve(Task task) {
        return wrapped.solve(task) + " [Суперсила: Инфрачервено зрение – вижда бележките под масата!]";
    }
}
