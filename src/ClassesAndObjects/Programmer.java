package ClassesAndObjects;
    public class Programmer {

        //Create a Java class called Programmer
        //The Programmer class will have the following instance variables:
        //name as a string
        //age as an integer
        //wearsGlasses as a boolean
        //The Programmer class will have the following methods:
        //drinkCoffe() - that prints in console Espresso is the secret!
        //printDetails() - that prints in console NameHere is a AgeHere-yo programmer
        //hasGlasses - that prints in console Is NameHere wearing glasses? followed by the value of the dedicated variable

        private String name;
        private int age;
        private boolean wearsGlasses;

        public Programmer(String name, int age, boolean wearsGlasses) {
            this.name = name;
            this.age = age;
            this.wearsGlasses = wearsGlasses;
        }

        void drinkCoffee() {
            System.out.println("Espresso is the secret!");
        }

        void printDetails() {
            System.out.println(name + " is a " + age + "-yo programmer");
        }

        void hasGlasses() {
            System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);

        }
    }