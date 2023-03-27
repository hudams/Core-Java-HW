package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		System.out.println("\n------- Animal Method -----------\n");
		
		// This is Hierarchical inheritance because other classes like Bird, Mammal, Reptile inherits from Animal class 
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n------- Birds Method -----------\n");
		
		// This is single inheritance because Birds inherits Animal class 
		Bird bird = new Bird();
		bird.birdInfo();
		bird.animalInfo();
		System.out.println("\n-------- Robin Method ----------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdInfo();
		robin.animalInfo();
		System.out.println("\n-------- Mammal Method ----------\n");
		
		// single inheritance because Mammal only extends Animal
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		System.out.println("\n------- Dog Method -----------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("\n-------- Bull Dog Method ----------\n");
		
		// Multilevel inheritance because BullDog extends Dog, Dog extends Mammal, Mammal extends Animal  
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n-------- Reptile Method ----------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n-------- Snake Method ----------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("\n-------- Cobra Method ----------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		snake.reptileInfo();
		cobra.animalInfo();
	}
}
