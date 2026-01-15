package package_1;

class animal{
	void sound() {
		System.out.println("Animal makes a sound: ");
	}
}

class cat extends animal{
	void sound() {
		System.out.println("Cat makes sound");
	}
}

public class TC014_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal a = new cat();
//		System.out.println("Sound: " + a.sound());

		a.sound();
	}

}
