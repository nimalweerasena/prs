package prs;

import java.security.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class CustomerData implements Serializable {
public String name;
public String password;
}
public class SealedObjectExample {
private SecretKey secretKey;
private Cipher encrypter = null;
private Cipher  decrypter;
public SealedObjectExample(){
        try {
            secretKey = KeyGenerator.getInstance("DES").generateKey();
            encrypter = Cipher.getInstance("DES");
            encrypter.init(Cipher.ENCRYPT_MODE, secretKey);
            decrypter = Cipher.getInstance("DES");
            decrypter.init(Cipher.DECRYPT_MODE, secretKey);
        } catch (Exception ex) {
            Logger.getLogger(SealedObjectExample.class.getName()).log(Level.SEVERE, null, ex);
        }

}
public SealedObject seal(Serializable obj)
{
try {
return(new SealedObject(obj, encrypter));
} catch(IOException e) {
} catch(IllegalBlockSizeException e) {
}
return(null);
}
public Object unseal(SealedObject so)
{
try {
String algorithmName = so.getAlgorithm();
// can use algorithmName to construct a decrypter
return(so.getObject(decrypter));
} catch(IOException e) {
} catch(IllegalBlockSizeException e) {
} catch(BadPaddingException e) {
} catch(ClassNotFoundException e) {
}
return(null);
}
public static void main(String args[])
{
CustomerData cust, unsealed;
SealedObject sealed;
SealedObjectExample soe = new SealedObjectExample();
// configure a CustomerData object
cust = new CustomerData();
cust.name = "Paul";
cust.password = "password";
// Seal it, storing it in a SealedObject
sealed = soe.seal(cust);
// Try unsealing it
unsealed = (CustomerData)soe.unseal(sealed);
  //  System.out.println("Name :" + unsealed.name);

//System.out.println("PASSWORD :" + cust.password);
}
}