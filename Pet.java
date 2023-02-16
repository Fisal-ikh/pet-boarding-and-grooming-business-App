//fisal ikhmayes
//project one it-145
//11/20/22

import java.util.Scanner;

public class Pet {

    // private variables
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue;

    // constructor for class 
    public Pet(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // checkIn method
    public void checkIn() {

        // amount of cat spaces
        setCatSpace(12);

        // amount of dog spaces
        setDogSpace(30);

        System.out.print("Is your pet a dog or cat?");

        // input 
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();

        // checks if its dog or cat
        if (userChoice.equals("dog")) {
            System.out.println("Dog selected");
            // check if space available
            if (getDogSpace() >= 1) {
                System.out.println("There is available spaces");
                System.out.println("Is your pet a new vistor or returning");
                // inputs if its new or returning
                String dogVisitor = input.nextLine();
                if (dogVisitor.equals("new")) {
                    System.out.println("New visitor selected");
                    System.out.println("Please fill out new information for your pet.");
                    System.out.println("What is the dogs name?");
                    String newDogName = input.nextLine();
                    setPetName(newDogName);
                    System.out.println("What is the dogs age?");
                    int newDogAge = input.nextInt();
                    setPetAge(newDogAge);

                    System.out.println("How many days will the dog stay?");
                    int dogDays = input.nextInt();
                    // if grooming is an option
                    if (dogDays >= 2){
                        System.out.println("Grooming is available");
                    } else{
                        System.out.println("Grooming is not availalbe");
                    }

                    System.out.println("Thanks for the information");

                    // decrease by 1
                    int currentDogSpace = getDogSpace();
                    setDogSpace(currentDogSpace - 1);
                } else if (dogVisitor.equals("returning")) {
                    System.out.println("Welcome back.");
                    System.out.println("Please update current information");

                    System.out.println("How many days do you want the pet to stay?");
                    int dogDays = input.nextInt();
                    // check if grooming available 
                    if(dogDays >= 2){
                        System.out.println("Grooming is available!");
                    } else{
                        System.out.println("Grooming is not available");
                    }

                    // decrease by -1
                    int currentDogSpace = getDogSpace();
                    setDogSpace(currentDogSpace - 1);
                    updatePet();
                }

            } else {
                System.out.println("There is no more room left");
            }

          
        } else if (userChoice.equals("cat")) {
            System.out.println("Cat selected");
            // if cat spots available
            if (getCatSpace() >= 1) {
                System.out.println("There is spaces available");
                System.out.println("Is this a new or returning pet?");
                // ccheck if new or returning
                String catVisitor = input.nextLine();
                if (catVisitor.equals("new")) {
                    System.out.println("Welcome");
                    System.out.println("Please fill out new information for your pet");
                    System.out.println("What is the pets name");
                    String newCatName = input.nextLine();
                    setPetName(newCatName);
                    System.out.println("How old is the pet");
                    int newCatAge = input.nextInt();
                    setPetAge(newCatAge);
                    
                    System.out.println("How many days is the pet staying");
                    int catDays = input.nextInt();
                    // set the amount of days 
                    setDaysStay(catDays);

                    System.out.println("Thanks for the information.");
                    // decrease by 1
                    int currentCatSpace = getCatSpace();
                    setCatSpace(currentCatSpace - 1);

                } else if (catVisitor.equals("returning")) {
                    System.out.println("Welcome back");
                    System.out.println("Please update current information");

                    System.out.println("How long will the cat be staying?");
                    int catDays = input.nextInt();
                    // sets the days
                    setDaysStay(catDays);

                    // decrease by 1
                    int currentCatSpace = getCatSpace();
                    setCatSpace(currentCatSpace - 1);
                    updatePet();

                }


             else {
                System.out.println("There is no more room left for your dog");
                }
          
            } else {
        	System.out.println("Please enter 'cat' or 'dog'.");
        	checkIn();
            }}
        
    }

    // method for check in 
    public void checkOut() {

        checkOut();
    }

    // method for getting pet type
    public void getPet() {
        getPet();
    }

    // cmethod that create pet
    public void createPet() {
        createPet();
    }

    // method updates pet infor 
    public void updatePet() {
        //updatePet();
    }

    

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpace() {
        return dogSpace;
    }

    public void setDogSpace(int dogSpace) {
        this.dogSpace = dogSpace;
    }

    public int getCatSpace() {
        return catSpace;
    }

    public void setCatSpace(int catSpace) {
        this.catSpace = catSpace;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

}
