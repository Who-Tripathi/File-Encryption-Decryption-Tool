package encryption;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FileEncryptionAndDecryption {

    public static void fileEncryptionAndDecryption(String filePath, Integer encryptionKey, String choice)throws Exception {
        File file = new File(filePath);
        String relativePath=file.getParent();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(relativePath+(choice.equals("E")?"\\encryptedFile.txt":"\\decryptedFile.txt"))));

        int data;
        while ((data=bis.read())!=-1){
            bos.write(data^encryptionKey);
        }
        file.deleteOnExit();
        bos.close();
        bis.close();
    }
}
