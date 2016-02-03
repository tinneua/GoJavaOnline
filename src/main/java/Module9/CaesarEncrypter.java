package Module9;

import java.util.List;

public class CaesarEncrypter {

    public static String encrypt(String msg, int step, List<Character> lib) throws Exception {
        StringBuilder string = new StringBuilder();

        for (int i=0; i<msg.length();i++) {
            if (lib.indexOf(msg.charAt(i)) < 0) {
                throw new Exception("Element \'"+msg.charAt(i)+"\' is out of library");}
            int indexEncrypted = (lib.indexOf(msg.charAt(i)) + step)% lib.size();
            while (indexEncrypted < 0) {
                indexEncrypted += lib.size();
            }
            string.append(lib.get(indexEncrypted));
        }
        return string.toString();
    }
    public static String decrypt(String msgEncrypted, int step, List<Character> lib) throws Exception {

        return encrypt(msgEncrypted,step*-1,lib);
    }

}
