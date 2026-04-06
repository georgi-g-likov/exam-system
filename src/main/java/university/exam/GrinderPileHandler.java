package university.exam;

/**
 * Купчина №1 – решения на зубрачи.
 */
public class GrinderPileHandler extends SolutionHandler {

    public GrinderPileHandler() {
        super("Купчина на зубрачите");
    }

    @Override
    public void handle(StudentComponent student, String solution) {
        if (student.getType() == StudentType.ZUBRAC) {
            pile.add(solution);
            System.out.println("  -> Добавено в \"" + pileName + "\": " + student.getName());
        } else if (next != null) {
            next.handle(student, solution);
        }
    }
}
