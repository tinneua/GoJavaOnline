package Module10;


import java.io.*;

public class CompareFiles {
    public static boolean compare (String inFile, String outFile) throws IOException {
        FileReader file1 = new FileReader(new File(inFile));
        FileReader file2 = new FileReader(new File(outFile));
        int flag = 1;
        try (BufferedReader bufferedReader1 = new BufferedReader(file1);
             BufferedReader bufferedReader2 = new BufferedReader(file2)) {
            String line1;
            String line2;
            while ((flag == 1) && ((line1 = bufferedReader1.readLine()) != null)
                    && ((line2 = bufferedReader2.readLine()) != null)) {
                if (!line1.equalsIgnoreCase(line2)) {
                    flag = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag == 1;
    }
}
