package Module1;

import java.util.Calendar;
import java.util.Set;


public class SetOperations {
    public SetOperations(Set<Integer> inputSet, int size, String name) {
        this.inputSet = inputSet;
        this.size = size;
        this.setName = name;
    }

    Set<Integer> inputSet;
    int size;
    private String setName;
    private int numOfIterations = 100;
    private long startTime;

    public Row output() {

        return new Row(setName, timeForAdd(),0.0,timeForRemove(),timeForContains(),timeForPopulate(),
                0.0,0.0 );
    }

    public Set<Integer> populateSet(Set<Integer> inputSet) {
        inputSet.clear();
        for (int j = 0; j < size; j++) {
            inputSet.add(j);
        }
        return inputSet;

    }

    public double timeForAdd(){
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            int j = (int) (Math.random() * size);
            inputSet.add(j);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;

    }
    public double timeForRemove() {
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            int j = (int) (Math.random() * size);
            inputSet.remove(j);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;

    }
    public double timeForContains() {
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            int j = (int) (Math.random() * size);
            inputSet.contains(j);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }
    public double timeForPopulate() {
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <= numOfIterations - 1; i++) {
            populateSet(inputSet);
        }
        double sum = Calendar.getInstance().getTimeInMillis() - startTime;
        return sum / numOfIterations;
    }

}
