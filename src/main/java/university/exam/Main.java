package university.exam;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        // ── Singleton ────────────────────────────────────────────────────────
        University uni = University.getInstance();
        System.out.println("Добре дошли в: " + uni.getName());
        System.out.println("─".repeat(60));

        // ── Студенти (конкретни компоненти) ──────────────────────────────────
        StudentComponent ivan   = new ConcreteStudent("Иван",   StudentType.ZUBRAC);
        StudentComponent petar  = new ConcreteStudent("Петър",  StudentType.TARIKAT);
        StudentComponent georgi = new ConcreteStudent("Георги", StudentType.KALITKO);
        StudentComponent maria  = new ConcreteStudent("Мария",  StudentType.ZUBRAC);
        StudentComponent elena  = new ConcreteStudent("Елена",  StudentType.TARIKAT);
        StudentComponent nikola = new ConcreteStudent("Никола", StudentType.KALITKO);

        // ── Decorator – добавяме суперсили на избрани студенти ────────────────
        // Иван (зубрач) придобива телепатия
        StudentComponent ivanWithPower   = new TelepathyDecorator(ivan);
        // Петър (тарикат) придобива инфрачервено зрение
        StudentComponent petarWithPower  = new InfraredVisionDecorator(petar);
        // Никола (калитко) сбръчква челото
        StudentComponent nikolaWithPower = new ForeheadWrinklingDecorator(nikola);
        // Мария (зубрач) – без суперсила
        // Елена (тарикат) – без суперсила
        // Георги (калитко) – без суперсила

        List<StudentComponent> students = List.of(
                ivanWithPower,
                petarWithPower,
                nikolaWithPower,
                maria,
                elena,
                georgi
        );

        // ── Factory + Университет провежда контролното ───────────────────────
        System.out.println("\nПРОВЕЖДАНЕ НА КОНТРОЛНОТО:");
        System.out.println("─".repeat(60));

        // ── Chain of Responsibility – настройка на веригата ──────────────────
        SolutionHandler grinderHandler  = new GrinderPileHandler();
        SolutionHandler tricksterHandler = new TricksterPileHandler();
        SolutionHandler kalitkoHandler  = new KalitkoPileHandler();

        grinderHandler.setNext(tricksterHandler).setNext(kalitkoHandler);

        // Всеки студент се явява на контролното и предава решението си
        System.out.println("\nСТУДЕНТИТЕ РЕШАВАТ ЗАДАЧИТЕ:");
        System.out.println("─".repeat(60));
        for (StudentComponent student : students) {
            String solution = uni.conductExam(student);
            System.out.println("  Решение: " + solution);
            System.out.println();
        }

        // Преподавателят разпределя решенията по купчини
        System.out.println("ПРЕДАВАНЕ НА РЕШЕНИЯТА – РАЗПРЕДЕЛЯНЕ ПО КУПЧИНИ:");
        System.out.println("─".repeat(60));
        for (StudentComponent student : students) {
            String solution = uni.conductExam(student);
            grinderHandler.handle(student, solution);
        }

        // ── Резултат ─────────────────────────────────────────────────────────
        System.out.println("\nРЕЗУЛТАТ – КУПЧИНИ С РЕШЕНИЯ:");
        grinderHandler.printPile();
        tricksterHandler.printPile();
        kalitkoHandler.printPile();

        System.out.println("\n" + "─".repeat(60));
        System.out.println("Контролното приключи. Успех на всички!");
    }
}
