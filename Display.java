/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminsys;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author tclark
 */
public class Display {
  
    
       public static void readStudent() throws IOException {

        boolean endOfFile = false;  //EOF flag
        //Set RandonAccessFile  getting data back from file 

        RandomAccessFile fileStream = new RandomAccessFile("student.txt", "r");
       
        long position = fileStream.length();


        while (!endOfFile) {
            try {

                fileStream.seek(0);   // pointer equal position 

                // reading  where am i 
                System.out.print("Reading .. ");
                for (int i =0; i < fileStream.length(); i++)
                {
               
              int result = fileStream.read();
                //JOptionPane.showMessageDialog(null, result + "  \n the student ID : ");
                System.out.print(result);
                //fileStream.skipBytes();
                }
                fileStream.close();
            } //catch  
            catch (IOException e) {
                endOfFile = true;
            }

        }
    }
}
  //for (int i = 0; i < array.length; i++) {
                  //  array[i] = inputFile.readInt();
