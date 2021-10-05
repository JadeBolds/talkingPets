package talkingPets;
import java.util.Scanner;
import java.util.ArrayList;
//import java.io.*;

public class MainApp {
    //Scanner
    //Ask how many pets they have
    //Ask what kind each is
    //Ask for names


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<Pet>();
        //petList.add();
        System.out.println("How many pets do you have?");
        String howManyPets = scanner.nextLine();
        Integer howManyInt = Integer.valueOf(howManyPets);


        for (int pets = 0; pets < howManyInt; pets++) {
            System.out.println("What is your pets name?");
            String petsName = scanner.nextLine();

            System.out.println("What kind of pet is this?");
            String kindOfPets = scanner.nextLine();

            System.out.println("What does this pet say?");
            String whatPetSays = scanner.nextLine();


            if(kindOfPets.equalsIgnoreCase("Cat")) {
                Cat cat = new Cat(petsName, kindOfPets, whatPetSays);
                petList.add(cat);
            } else if (kindOfPets.equalsIgnoreCase("Dog")){
                Dog dog = new Dog(petsName, kindOfPets, whatPetSays);
                petList.add(dog);
            } else if (kindOfPets.equalsIgnoreCase("Snake")){
                Snake snake = new Snake(petsName, kindOfPets, whatPetSays);
                petList.add(snake);
            } else{
                System.out.println("Invalid Pet Type");
            }
        }

        System.out.println(petList);
    }
}
