package Module10;



import Module9.LibraryCreator;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class FileEncrypterTest {

    @Test
    public void testEncrypter() throws Exception {
        BufferedWriter fr = new BufferedWriter(new FileWriter(new File("src/test/java/Module10/files/source.txt")));
        fr.write("Test file for encoding");
        fr.close();
        List<Character> lib = LibraryCreator.createLib();
        final int STEP = 10;
        FileEncoder.writeFile("src/test/java/Module10/files/source.txt",
                "src/test/java/Module10/files/encoded.txt", STEP, lib);
        FileDecoder.readFile("src/test/java/Module10/files/encoded.txt",
                "src/test/java/Module10/files/decoded.txt", STEP, lib);
        Assert.assertEquals(true, CompareFiles.compare("src/test/java/Module10/files/source.txt",
                "src/test/java/Module10/files/decoded.txt"));
    }
}