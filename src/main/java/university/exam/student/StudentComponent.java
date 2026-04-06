package university.exam.student;

import university.exam.task.Task;

/**
 * Компонентен интерфейс за Decorator шаблона.
 */
public interface StudentComponent {
    String getName();
    StudentType getType();
    String solve(Task task);
}
