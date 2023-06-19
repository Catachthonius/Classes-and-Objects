package ClassesAndObjects;

public class TestProgrammers {

    //create a Java tester class called TestProgrammers where you:
    //create 2 Programmer objects (class instance)
    //define the state of the objects by assigning values to the instance variables
    //call the drinkCoffee() and printDetails() methods for the first Programmer object
    //call the printDetails() and hasGlasses() methods for the second Programmer object

    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Antonio",28,true);
        Programmer programmer2 = new Programmer("Dario",24,false);

        programmer1.drinkCoffee();
        programmer1.printDetails();

        System.out.println(" ");

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
