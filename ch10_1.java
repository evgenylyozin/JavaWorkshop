import javax.crypto.*;
import  java.security.Key;
import  java.security.NoSuchAlgorithmException;
import  java.security.InvalidKeyException;

public class ch10_1 {
    public static void main(String[] args) {
        try {
            String algorithm = "AES";
            Key privateKey = KeyGenerator.getInstance(algorithm).generateKey();
            String transformation = algorithm + "/CBC/PKCS5Padding";
            Cipher cipher = Cipher.getInstance(transformation);

            cipher.init(Cipher.ENCRYPT_MODE, privateKey);

            String plaintext = "My secret message";
            byte[] ciphertext = new byte[cipher.getOutputSize(plaintext.getBytes().length)];

            int encryptedLength = cipher.update(plaintext.getBytes(), 0,plaintext.getBytes().length,encrypted);
            cipher.doFinal(ciphertext,encryptedLength);
            System.out.println(ciphertext);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch  (BadPaddingException  e)  {
            e.printStackTrace();
        }  catch  (IllegalBlockSizeException  e)  {
                e.printStackTrace();
        }  catch  (ShortBufferException  e)  {
                e.printStackTrace();
        }
    }
}
