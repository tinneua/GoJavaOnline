package Module1.Task1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Printer {
    public static void printToConsole(Map<Object, Row> result) {
        for (Row row: result.values()) {
            System.out.print(row.toString());
        }

    }
    public static void printToFile(Map<Object, Row> result, String fileName, String dir) throws IOException {

        FileWriter outputFile = new FileWriter(new File(dir, fileName));

        for (Row row: result.values()) {
            outputFile.write(row.toString());
        }

        outputFile.close();
    }
}
