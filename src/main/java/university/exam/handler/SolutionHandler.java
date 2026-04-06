package university.exam.handler;

import university.exam.student.StudentComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактен Handler за Chain of Responsibility.
 * Всеки handler отговаря за купчината на определен тип студенти.
 */
public abstract class SolutionHandler {

    protected SolutionHandler next;
    protected final List<String> pile = new ArrayList<>();
    protected final String pileName;

    protected SolutionHandler(String pileName) {
        this.pileName = pileName;
    }

    /** Свързва следващия handler в веригата и го връща за fluent chaining. */
    public SolutionHandler setNext(SolutionHandler next) {
        this.next = next;
        return next;
    }

    /** Обработва решението – добавя в купчината или предава нагоре по веригата. */
    public abstract void handle(StudentComponent student, String solution);

    public List<String> getPile() {
        return pile;
    }

    public String getPileName() {
        return pileName;
    }

    public void printPile() {
        System.out.println("\n=== " + pileName + " (" + pile.size() + " решения) ===");
        if (pile.isEmpty()) {
            System.out.println("  (празна купчина)");
        } else {
            pile.forEach(s -> System.out.println("  - " + s));
        }
    }
}
