import model.*;


public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		RedPanda thief = new RedPanda();
		System.out.println(thief.speak());
		Eagle bucky = new Eagle("Bald Eagle", 6.6, 12);
		System.out.println(bucky.speak());
		Mouse sneaky = new Mouse();
		System.out.println(sneaky.speak());
	}

}
