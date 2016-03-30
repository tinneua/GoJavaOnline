package Module2.Task1;

import Module2.Task1.exams.*;
import org.junit.Test;



public class ExecutorImplTest {

    @Test
    public void examTest() {
        MainClass.Executor<Student> examExecutor = new ExecutorImpl<>();
        MainClass.Validator<Student> validator = new StudentValidatorImpl();

        MainClass.Task<Student> task1 = new ExamTaskImpl(new Linguist("Ivan", 20, 10, 10, 10));
        MainClass.Task<Student> task2 = new ExamTaskImpl(new Engineer("Petr", 22, 5, 10, 10));
        MainClass.Task<Student> task3 = new ExamTaskImpl(new Economist("Kolya", 18, 12, 10, 15));
        MainClass.Task<Student> task4 = new ExamTaskImpl(new Linguist("", 20, 10, 10, 10));

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