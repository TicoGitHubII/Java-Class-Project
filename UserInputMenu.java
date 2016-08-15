/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminsys;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author tclark
 */
public class UserInputMenu extends JFrame

{
    private JPanel adminPanel; // To hold components
    private JPanel selectedadminPanel; // To hold components
    private JComboBox adminBox;        // A list of add options
    private JLabel label;               // Displays a message
    private JTextField selectedOption;  // Selected option
    
    // Array to hold the values to be displayed in box
    
    private String [] addOptions = {"Student", "Course", "View"};
    
    // Constructior
    
    public UserInputMenu (){
            // Set the title.
      setTitle("Student Admin Menu");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager.
      setLayout(new BorderLayout());

      // Build the panels.
      buildAdminPanel();
      buildSelectedAdminPanel();

      // Add the panels to the content pane.
      add(adminPanel, BorderLayout.CENTER);
      add(selectedadminPanel, BorderLayout.EAST);

      // Pack and display the window.
      pack();
      setVisible(true);
        
    }
    //  Build admin panel with options   
    private void buildAdminPanel()
    {
           // Create a panel to hold the combo box.
      adminPanel = new JPanel();

      // Create the combo box
      adminBox = new JComboBox(addOptions);

      // Register an action listener.
      adminBox.addActionListener(new ComboBoxListener());

      // Add the combo box to the panel.
      adminPanel.add(adminBox); 
   
    }
    
    
    private void buildSelectedAdminPanel(){
        
        // Create a panel to hold the components.
      selectedadminPanel = new JPanel();

      // Create the label.
      label = new JLabel("Add : ");

      // Create the uneditable text field.
      selectedOption = new JTextField(10);
      selectedOption.setEditable(false);

      // Add the label and text field to the panel.
      selectedadminPanel.add(label);
      selectedadminPanel.add(selectedOption);
        
    }
    
    // Private inner claass that handels event where user slectes
    
    private class ComboBoxListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // get the selected option
            String selection = (String) adminBox.getSelectedItem();

            // Display the selected in the text field.
            selectedOption.setText(selection);

            try {

                if (selection == "Student") {
                    AddStudent test = new AddStudent();
                    test.writeStudent();
                } else if (selection == "View") {
                    Display testDisplay = new Display();
                    testDisplay.readStudent();
                }

            } catch (Exception r) {

                System.out.print("caught");
            }

        }
    }


   
     }

