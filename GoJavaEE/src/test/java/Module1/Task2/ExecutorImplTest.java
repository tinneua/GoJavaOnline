package Module1.Task2;

import Module1.Task2.MainClass.Executor;
import Module1.Task2.MainClass.Task;
import Module1.Task2.MainClass.Validator;
import Module1.Task2.exams.*;
import org.junit.Test;



public class ExecutorImplTest {

    @Test
    public void examTest() {
        Executor<Student> examExecutor = new ExecutorImpl<>();
        Validator<Student> validator = new StudentValidatorImpl();

        Task<Student> task1 = new ExamTaskImpl(new Linguist("Ivan", 20, 10, 10, 10));
        Task<Student> task2 = new ExamTaskImpl(new Engineer("Petr", 22, 5, 10, 10));
        Task<Student> task3 = new ExamTaskImpl(new Economist("Kolya", 18, 12, 10, 15));
        Task<Student> task4 = new ExamTaskImpl(new Linguist("", 20, 10, 10, 10));

        examExecutor.addTask(task1);
        examExecutor.addTask(task2);
        examExecutor.addTask(task3, validator);
        examExecutor.addTask(task4);


        examExecutor.execute();

        System.out.println("Valid results:");
        for (Student student : examExecutor.getValidResults()) {
            System.out.println(student);
        }
        System.out.println("Invalid results:");
        for (Student student : examExecutor.getInvalidResults()) {
            System.out.println(student);
        }

    }
}