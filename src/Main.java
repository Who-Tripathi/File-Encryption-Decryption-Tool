import encryption.FileEncryptionAndDecryption;

import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---Welcome to the File encryption and Decryption Program---");
        Scanner sc = new Scanner(System.in);

        System.out.print("Type 'E' for encryption and 'D' for decryption : ");
        String choice = sc.nextLine();

        System.out.print("Please enter the complete file path with the filename which you wants to encrypt : ");
        String fileName = sc.nextLine();
        System.out.print("Please enter your encryption key here(make sure you are passing integer) : ");
        Integer encryptionKey = sc.nextInt();
    try{
        if (choice.equals("E")) {
            FileEncryptionAndDecryption.fileEncryptionAndDecryption(fileName, encryptionKey,choice);
            System.out.println("File encryption has been successfully completed");
        } else if (choice.equals("D")) {
            FileEncryptionAndDecryption.fileEncryptionAndDecryption(fileName, encryptionKey, choice);
            System.out.println("File decryption has been successfully completed");
        }
    }catch (Exception e){
        System.out.println("File encryption has been failed...file not found");
    }
    }
}