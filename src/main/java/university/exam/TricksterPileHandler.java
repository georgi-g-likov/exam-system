package university.exam;

/**
 * Купчина №2 – решения на тарикати.
 */
public class TricksterPileHandler extends SolutionHandler {

    public TricksterPileHandler() {
        super("Купчина на тарикатите");
    }

    @Override
    public void handle(StudentComponent student, String solution) {
        if (student.getType() == StudentType.TARIKAT) {
            pile.add(solution);
            System.out.println("  -> Добавено в \"" + pileName + "\": " + student.getName());
        } else if (next != null) {
            next.handle(student, solution);
        }
    }
}
