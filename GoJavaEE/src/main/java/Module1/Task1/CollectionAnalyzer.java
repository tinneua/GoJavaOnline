package Module1.Task1;


import java.io.IOException;
import java.util.*;

public class CollectionAnalyzer {

    public static void main(String[] args) throws IOException {
        int size = 1000000;
        String dir = "C:\\java\\GoJava\\GoJavaOnline\\GoJavaEE\\src\\main\\java\\Module1\\Task1";
        String fileName = String.valueOf(size) + ".txt";
        Map<Object, Row> temp = new CollectionAnalyzer().launchAnalyzer(size);
        Printer.printToConsole(temp);
        Printer.printToFile(temp, fileName, dir);
    }

    public Map<Object, Row> launchAnalyzer(int size) {

        List<Integer> testArrayList = new ArrayList<Integer>();
        List<Integer> testLinkedList = new LinkedList<Integer>();
        Set<Integer> testHashSet = new HashSet<Integer>();
        Set<Integer> testTreeSet = new TreeSet<Integer>();

        Row arrayListResult = new ListOperations(testArrayList, size, "ArrayList").output();
        Row linkedListResult = new ListOperations(testLinkedList, size, "LinkedList").output();
        Row hashSetResult = new SetOperations(testHashSet, size, "HashSet").output();
        Row treeSetResult = new SetOperations(testTreeSet, size, "TreeSet").output();

        Map<Object, Row> result = new LinkedHashMap<Object, Row>();

        Row namings = new Row("Type of array", "add", "get", "remove", "contains", "populate", "iterator.add",
                "iterator.remove");
        result.put(namings.s1, namings);
        result.put(arrayListResult.s1, arrayListResult);
        result.put(linkedListResult.s1, linkedListResult);
        result.put(hashSetResult.s1, hashSetResult);
        result.put(treeSetResult.s1, treeSetResult);

        return result;
    }
}
