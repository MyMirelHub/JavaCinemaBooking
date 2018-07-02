package com.pluralsight.MovieProj;
public class Main {

    static int sum;
    public static void main(String[] args) {
        UserInterface cls = new UserInterface();
        // call UI input dialogs
        cls.ui();

        System.out.println(cls.getInput()); // print weekday

        // New Mathequation Creating  constructor arrays
       MathEquation[] equations = new MathEquation[4]; // create blank array
      equations[0] = new Multiplier("Standard",0,8,"");
      equations[1] = new Multiplier("OAP",0,6,"");
      equations[2] = new Multiplier("Student",0,6,"");
      equations[3] = new Multiplier("Child",0,4,"");

        cls.objectui();                                  // call UI 2


        // convert string values to integer values for number of tickets
      equations[0].setQuantity(Integer.parseInt(cls.getNostandard()));
      equations[1].setQuantity(Integer.parseInt(cls.getNooap()));
      equations[2].setQuantity(Integer.parseInt(cls.getNostudent()));
      equations[3].setQuantity(Integer.parseInt(cls.getNochild()));


        // for method to loop from new variable equation through equations
        for (MathEquation equation : equations ) {
        equation.setDay(cls.getInput());
        equation.execute();} //calls exectute method in Mathequatino

        // Sum of result to get total cost
        sum = equations[0].getResults() + equations[1].getResults() + equations[2].getResults() + equations[3].getResults();
            System.out.println("The total cost of the tickets is £"+sum);

        }
    }

