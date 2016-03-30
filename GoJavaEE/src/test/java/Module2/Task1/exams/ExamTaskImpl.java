package Module2.Task1.exams;

import Module2.Task1.MainClass;


public class ExamTaskImpl implements MainClass.Task<Student> {
    public ExamTaskImpl(Student student) {
        this.student = student;
    }

    private Student student;
    @Override
    public void execute() {
        student.getExamScore();
    }

    @Override
    public Student getResult() {
        return student;
    }
}
