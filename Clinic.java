import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet = null;

        switch (choice) {
            case 1:
                pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                ((Dog) pet).setBreed("German Shepherd");
                break;
            case 2:
                pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                ((Cat) pet).setNoOfLives(9);
                break;
            default:
                System.out.println("Invalid choice.");
                return; // Exit the method if the choice is invalid
        }

        petFile.setPet(pet);

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: " + petFile.getPet().makeSound("Bark")); // Example sound
        System.out.println("Play mode: " + petFile.getPet().play());
    }
}