package university.exam.student;

import university.exam.task.Task;

/**
 * Конкретен студент без суперсили.
 */
public class ConcreteStudent implements StudentComponent {

    private final String name;
    private final StudentType type;

    public ConcreteStudent(String name, StudentType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public StudentType getType() {
        return type;
    }

    @Override
    public String solve(Task task) {
        return name + " (" + type.getDisplayName() + ") решава " + task.getType()
                + " задача: \"" + task.getDescription() + "\"";
    }
}
