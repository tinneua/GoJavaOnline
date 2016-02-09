package Module9;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CaesarEncrypterTest {
    @Test
    public void testEnrypter() throws Exception {
        int step = (int) Math.log(10);
        List<Character> lib = LibraryCreator.createLib();
        String msgNoCrypt = "Say hi to Kharkiv!";
        String expected = "UcA/jk/vq/Mjctmkx-";
        Assert.assertEquals(expected, CaesarEncrypter.encrypt(msgNoCrypt, step, lib));
    }
}