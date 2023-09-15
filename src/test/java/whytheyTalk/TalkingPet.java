package whytheyTalk;
import java.util.Scanner;
import java.util.ArrayList;
public class TalkingPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pets do you have? ");
        int numPets = scanner.nextInt();
        scanner.nextLine();

        Pet[] pets = new Pet[numPets];

        for (int i = 0; i < numPets; i++) {
            System.out.println("Enter details for pet " + (i + 1) + ":");
            System.out.print("Type (Dog/Cat): ");
            String petType = scanner.nextLine();
            System.out.print("Name: ");
            String petName = scanner.nextLine();

            if (petType.equalsIgnoreCase("Dog")) {
                pets[i] = new Dog(petName);
            } else if (petType.equalsIgnoreCase("Cat")) {
                pets[i] = new Cat(petName);
            } else {
                System.out.println("Unsupported pet type: " + petType);
                i--;
            }
        }

        System.out.println("\nList of your pets and what they say:");
        for (Pet pet : pets) {
            System.out.print(pet.getName() + ": ");
            pet.speak();
        }

        scanner.close();
    }
}
