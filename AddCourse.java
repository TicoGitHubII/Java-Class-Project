/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminsys;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author tclark
 */
public class AddCourse {
    private String selection;  //  holds seleciton from window dropdown

 /**
     * constructor
     * *
     */
    // Setter 
    public void setSelection(String selection) {
        this.selection = selection;

    }

    public String writeStudent(String selection) throws Exception  {

        String courseID;  //holds input student ID
        String datFile;
        datFile = "C:\\Users\\tclark\\Documents\\NetBeansProjects\\StudentAdminSys\\src\\studentadminsys\\course.dat";
        int courseId;

        System.out.print(selection);

        // Student ID 
        courseID = JOptionPane.showInputDialog("Enter " + "the student ID : ");

        courseId = Integer.parseInt(courseID);

        writeBinaryStudent(datFile, courseId);
        
        return courseID;
                

    }

    public void writeBinaryStudent(String files, int id) throws IOException {
              
        
        File f = new File ("course.dat"); // testing credit file object to hold appended data
        long fileLength = f.length();
                     
        try {
        RandomAccessFile file = new  RandomAccessFile("course.dat", "rw");  //  RandomAccess File for rw
        
        //Where am i
        System.out.println(" Test writing course to file");
        
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
       //writes file
       //file.writeInt(id);
           // Close the file
        // }
    }

    
    
}
