package Module2.exams;


import Module2.MainClass;

import java.util.Objects;

public class StudentValidatorImpl implements MainClass.Validator<Student> {

    @Override
    public boolean isValid(Student result) {
        return (result.getExamScore() > 29 && !Objects.equals(result.getName(), ""));
    }
}
