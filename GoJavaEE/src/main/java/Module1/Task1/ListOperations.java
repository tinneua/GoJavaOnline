package Module1.Task1;

import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;

public class ListOperations {
    public ListOperations(List<Integer> inputList, int size, String arrayName) {
        this.size = size;
        this.inputList = inputList;
        this.arrayName = arrayName;
    }

    List<Integer> inputList;

    private int size;
    private String arrayName;
    private int numOfIterations = 100;
    private long startTime;


    public Row output() {
        inputList = populateList(inputList);
        return new Row(arrayName, timeForAdd(),timeForGet(),timeForRemove(),timeForContains(),timeForPopulate(),
                iteratorAdd(),iteratorRemove() );
    }

    public List<Integer> populateList(List<Integer> inputList) {
        inputList.clear();
        for (int j = 0; j < size; j++) {
            inputList.add(j);
        }
        return inputList;
    }

    public double timeForAdd() {
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            int j = (int) (Math.random() * size);
            inputList.add(j, j);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

    public double timeForGet() {

        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            int j = (int) (Math.random() * size);
            inputList.get(j);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

    public double timeForRemove() {

        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            int j = (int) (Math.random() * size);
            inputList.remove(j);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

    public double timeForContains() {

        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            int j = (int) (Math.random() * size);
            inputList.contains(j);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

    public double timeForPopulate() {
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            populateList(inputList);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

    public double iteratorAdd() {
        ListIterator<Integer> listIterator = inputList.listIterator();
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations; i++) {
            listIterator.next();
            listIterator.add(1);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

    public double iteratorRemove() {
        ListIterator<Integer> listIterator = inputList.listIterator();
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations; i++) {
            listIterator.next();
            listIterator.remove();
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

}
