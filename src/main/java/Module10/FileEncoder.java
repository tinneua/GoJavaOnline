package Module10;

import Module9.CaesarEncrypter;

import java.io.*;
import java.util.List;


public class FileEncoder {
    public static void writeFile(String readFile, String writeFile, int step, List<Character> lib) throws Exception {
        try (FileReader inputFile = new FileReader(new File(readFile));
             FileWriter outputFileEncrypted = new FileWriter(new File(writeFile))) {
            int c;
            StringBuilder input = new StringBuilder();
            while ((c = inputFile.read()) != -1) {
                input.append((char) c);
            }
            String s = CaesarEncrypter.encrypt(input.toString(), step, lib);
            outputFileEncrypted.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
