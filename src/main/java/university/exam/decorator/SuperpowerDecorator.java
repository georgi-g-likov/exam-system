package university.exam.decorator;

import university.exam.student.StudentComponent;
import university.exam.student.StudentType;

/**
 * Абстрактен Decorator – добавя суперсила към студент.
 */
public abstract class SuperpowerDecorator implements StudentComponent {

    protected final StudentComponent wrapped;

    public SuperpowerDecorator(StudentComponent wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getName() {
        return wrapped.getName();
    }

    @Override
    public StudentType getType() {
        return wrapped.getType();
    }

    public abstract String getSuperpower();
}
