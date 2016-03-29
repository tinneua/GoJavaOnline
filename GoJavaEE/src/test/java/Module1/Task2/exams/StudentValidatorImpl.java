package Module1.Task2.exams;


import Module1.Task2.MainClass.Validator;

import java.util.Objects;

public class StudentValidatorImpl implements Validator<Student> {

    @Override
    public boolean isValid(Student result) {
        return (result.getExamScore() > 29 && !Objects.equals(result.getName(), ""));
    }
}
