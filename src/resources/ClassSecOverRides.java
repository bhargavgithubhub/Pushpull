package resources;

public class ClassSecOverRides extends OtherBranch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassSecOverRides third= new ClassThird();
		OtherBranch chk= new ClassThird ();
		chk.animalSound();
	}

	public void animalSound() {
		System.out.println("Second");
	}
}