package Module9;
import Module8.CollectionPrinter;
import Module8.Guitar;
import java.util.ArrayList;
import java.util.List;
/*
Uses Module8 Class 'Guitar'
@step - integer key for encrypt/decrypt
 */

public class Runner {
    public static void main(String[] args) throws Exception {
        int step = (int) Math.log(10);
        List<Character> lib = LibraryCreator.createLib();
        String msgNoCrypt = "T_Ry to %Encryp/t mE 83?*^%@#";
        String msgEncrypt = CaesarEncrypter.encrypt(msgNoCrypt, step, lib);
        System.out.println("Initial message:   "+msgNoCrypt);
        System.out.println("Encrypted message: "+ msgEncrypt);
        String decryptedMessage = CaesarEncrypter.decrypt(msgEncrypt, step, lib);
        System.out.println("Decrypted message: "+decryptedMessage+'\n');
        if (decryptedMessage.equals(msgNoCrypt)) System.out.println("CORRECT DECODING\n");
        else System.out.println("[ERROR] Something went wrong in decoding\n");

        ArrayList<Guitar> musicShop = new ArrayList<>();
        musicShop.add(new Guitar("Stratocaster", 199.99, 1901));
        musicShop.add(new Guitar("Fendermaster", 159.99, 1959));
        musicShop.add(new Guitar("AuchanGuitar", 19.99, 1800));
        System.out.println("Encrypted music shop:"+'\n');
        for (Guitar aMusicShop : musicShop) {
            String name = aMusicShop.getName();
            aMusicShop.setName(CaesarEncrypter.encrypt(name, step, lib));
        }
        CollectionPrinter.printList(musicShop);

        System.out.println("\nDecrypted music shop:"+'\n');
        for (Guitar aMusicShop : musicShop) {
            String name = aMusicShop.getName();
            aMusicShop.setName(CaesarEncrypter.decrypt(name, step, lib));
        }
        CollectionPrinter.printList(musicShop);
    }
}
