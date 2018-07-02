// Class which handles the UI and input variables
package com.pluralsight.MovieProj;

import javax.swing.*;

public class UserInterface {
    private String[] movielist = {"Black Panther", "Love Island", "Happy Feet", "Predator"};
    private String[] Weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private String input2;
    private String nostandard;
    private String nooap;
    private String nostudent;
    private String nochild;

    // getters and setters
    public String getInput() {return input2;}
    public void setInput(String input2) {this.input2 = input2;}
    public String getNostandard() {return nostandard;}
    public void setNostandard(String nostandard) {this.nostandard = nostandard;}
    public String getNooap() {return nooap;}
    public void setNooap(String nooap) {this.nooap = nooap;}
    public String getNostudent() {return nostudent;}
    public void setNostudent(String nostudent) {this.nostudent = nostudent;}
    public String getNochild() {return nochild;}
    public void setNochild(String nochild) {this.nochild = nochild;}

// method to call UI to select film and weekday

    public void ui (){
    String moviein = (String) JOptionPane.showInputDialog(null, "Choose your movie",
            "QA Cinemas", JOptionPane.QUESTION_MESSAGE, null,
            movielist, // Array of choices
            movielist[0]); // Initial choice

    String input = (String) JOptionPane.showInputDialog(null, "Choose your Day",
            moviein, JOptionPane.QUESTION_MESSAGE, null,
            Weekday, // Array of choices
            Weekday[0]); // Initial choice

        setInput(input);
    }
//  Method to object operations to select number of tickets for each ticket class
    public void objectui (){
        JTextField Standard = new JTextField();
        JTextField OAP = new JTextField();
        JTextField Student = new JTextField();
        JTextField Child = new JTextField();

        Object[] message = {"Standard:",Standard,"OAP:", OAP,"Student:", Student,"Child:", Child};

        int option = JOptionPane.showConfirmDialog(null, message,"Please Select no.of tickets", JOptionPane.OK_CANCEL_OPTION);

        // convert JText to string to later convert to int
        String s1 = Standard.getText();
        String s2 = OAP.getText();
        String s3 = Student.getText();
        String s4 = Child.getText();

        // If any elements(user inputs from Dialog) are blank - set to "0" to avoid error message when coverting to integer
        String[] tclass = {s1,s2,s3,s4};
        for(int i=0;i<tclass.length;i++)
        {
            if(tclass[i]!= null && tclass[i].length() > 0)
                System.out.println("");
            else tclass[i]="0";
            }
        // Set new array elements to access them in main
        setNostandard(tclass[0]);
        setNooap(tclass[1]);
        setNostudent(tclass[2]);
        setNochild(tclass[3]);
    }
}
