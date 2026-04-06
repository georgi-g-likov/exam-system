package university.exam;

import java.util.List;

/**
 * Singleton – единственият университет, в който се провежда контролното.
 */
public class University {

    private static University instance;
    private final String name = "Технически Университет";

    private University() {
        System.out.println("Университетът отвори врати за деня на контролното.");
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    /**
     * Провежда контролното: разпознава типа студент, създава задача чрез Factory
     * и връща решение.
     */
    public String conductExam(StudentComponent student) {
        Task task = TaskFactory.createTask(student.getType());
        System.out.printf("  [%s] Студент \"%s\" получи %s задача.%n",
                getName(), student.getName(), task.getType());
        return student.solve(task);
    }
}
