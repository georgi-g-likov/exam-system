package university.exam;

/**
 * Компонентен интерфейс за Decorator шаблона.
 */
public interface StudentComponent {
    String getName();
    StudentType getType();
    String solve(Task task);
}
