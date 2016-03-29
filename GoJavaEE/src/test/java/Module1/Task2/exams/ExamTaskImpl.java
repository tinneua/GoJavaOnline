package Module1.Task2.exams;

import Module1.Task2.MainClass.Task;


public class ExamTaskImpl implements Task<Student> {
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
