package university.exam.task;

import university.exam.student.StudentType;

/**
 * Factory – създава задача според типа на студента.
 */
public class TaskFactory {

    private TaskFactory() {}

    public static Task createTask(StudentType type) {
        return switch (type) {
            case ZUBRAC  -> new MisleadingTask();
            case TARIKAT -> new ShortTask();
            case KALITKO -> new FamiliarTask();
        };
    }
}
