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
public class AddStudent {

    protected String selection;  //  holds seleciton from window dropdown
    protected String studentID;  //holds input student ID string 
    protected String datFile = "student.dat"; // put this in Net Beans directory
     protected int studentNumId; // hold interger parsed ID
 /**
     * constructor
     * *
     */
    // Setter 
    public void setSelection(String selection) {
        this.selection = selection;
           System.out.print(this.selection+ "this class is now writing ");
    }
// Get Input for Student Informaiton 
    
    public String writeStudent() throws Exception  {
         //  removed passing Selection becuase it doesnt do anything 
        // Get Student ID String 
        studentID = JOptionPane.showInputDialog("Enter 4 -digit " + "the student ID : ");
        
 // becomes Student ID Integer 
        studentNumId = Integer.parseInt(studentID);

// Call method to write data to fill 
        
        writeBinaryStudent( studentNumId);  
        
        return studentID;
    }

    public void writeBinaryStudent( int id) throws IOException {
              
         RandomAccessFile file = new  RandomAccessFile("student.txt", "rw");  //  RandomAccess File for rw
        //File f = new File ("student.txt"); // testing credit file object to hold appended data
        long fileLength = file.length();
                     
        try {
       
        
        //Where am i
        System.out.println(" Test writing students to file");
        
        //write to existing file
        file.seek(fileLength);
        file.write(id);
        file.close();
     
        System.out.println("Finished");
        }
        catch(IOException e){
            System.out.println(" Exception caugth");
        }

        //* Array sample //for (int i =0 ; i < writeArray.length; i++) {

    }

    @Override
    public String toString() {
        return "AddStudent{" + "selection=" + selection + '}';
    }
    
    
}
