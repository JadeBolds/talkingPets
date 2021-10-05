package talkingPets;

public abstract class Pet {

    private String name;


    //constructor
    public Pet(String name, String petKind, String whatPetSays){
        this.name = name;
        this.petKind = petKind;
        this.whatPetSays = whatPetSays;
    }

    //prints pets name
    public void printPetName(){
        System.out.println("You can call me " + name + "!!");
    }

    public String petKind;
    public String whatPetSays;


    //name getter
    public String getName(String name) {
        return name;
    }

    //name setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", petKind='" + petKind + '\'' +
                ", whatPetSays='" + whatPetSays + '\'' +
                '}';
    }
}
