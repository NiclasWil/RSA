package app.keyflame.rsa;
import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

import java.math.BigInteger;
import java.util.UUID;

public class KeyVault {
   public UUID id;
   private BigInteger privateKey;
   private BigInteger publicKey;
   private BigInteger p;
   private BigInteger q;
   private BigInteger e;
   public KeyVault(){

   };
   protected boolean setPrivateKey(BigInteger privateKey){
       throw new NotImplementedException("Noch nicht implementiert");
   }
   protected BigInteger getPrivateKey(){
       throw new NotImplementedException("Noch nicht implementiert");
   }
   protected boolean setPublicKey(BigInteger publicKey){
       throw new NotImplementedException("Noch nicht implementiert");
   }
   protected BigInteger getPublicKey(){
       throw new NotImplementedException("Noch nicht implementiert");
   }

}
