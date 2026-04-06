package university.exam.handler;

import university.exam.student.StudentComponent;
import university.exam.student.StudentType;

/**
 * Купчина №3 – решения на калитковци.
 */
public class KalitkoPileHandler extends SolutionHandler {

    public KalitkoPileHandler() {
        super("Купчина на калитковците");
    }

    @Override
    public void handle(StudentComponent student, String solution) {
        if (student.getType() == StudentType.KALITKO) {
            pile.add(solution);
            System.out.println("  -> Добавено в \"" + pileName + "\": " + student.getName());
        } else if (next != null) {
            next.handle(student, solution);
        } else {
            System.out.println("  [ВНИМАНИЕ] Непознат тип студент: " + student.getName());
        }
    }
}
