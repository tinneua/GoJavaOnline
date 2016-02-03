package Module9;

import java.util.ArrayList;
import java.util.List;
/*
Creates library to use for further operations
Currently added   a...z   A...z   0...9 and symbols
 */

public class LibraryCreator {
    public static List<Character> createLib() {
        final char[] SYMBOLS = {
                '_','!',' ','-','/','\\','?',':',';','(',')','&','$','#','%','^','*','+','=','@','{','}','[',']','\''};
        List<Character> alphabet = new ArrayList<>();
        for (char a = 'a'; a<='z';a++ ) {
            alphabet.add(a);
        }
        for (char a = 'A'; a<='Z';a++ ) {
            alphabet.add(a);
        }
        for (char a = '0'; a<='9';a++ ) {
            alphabet.add(a);
        }
        for (char a : SYMBOLS) {
            alphabet.add(a);
        }
        return alphabet;
    }
}
