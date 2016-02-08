package Module10;

import Module9.LibraryCreator;
import java.util.List;


public class Runner {
    public static void main(String[] args) throws Exception {
        List<Character> lib = LibraryCreator.createLib(); //create lib for encoding/decoding
        final int STEP = 5; // constant for encoding/decoding
        //to let user enter name of files to encrypt/decrypt please use IOUtil class
        Writer.writeFile("src/main/java/Module10/files/txt.txt",
                "src/main/java/Module10/files/EncryptedFile.txt", STEP, lib); //encode given file with "lib"
        Reader.readFile("src/main/java/Module10/files/EncryptedFile.txt",
                "src/main/java/Module10/files/Decrypted.txt", STEP, lib); //decode given file with "lib"
        IOUtil.printToConsole("Operation ended successful: "+CompareFiles.compare("src/main/java/Module10/files/txt.txt",
                "src/main/java/Module10/files/Decrypted.txt"));
    }
}
