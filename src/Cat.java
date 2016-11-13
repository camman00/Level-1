public class Cat {


	private String name;
	private int lives = 1;

	Cat(String name) {
		this.name = name;
	}
	Cat(String name,int Life) {
		this.name = name;
		this.lives = Life;
	}


	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}


	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}


	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}


	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */


		Cat cat = new Cat("Jill",9);
		Cat othercat = new Cat("BOB",-100);
		cat.kill();
		othercat.kill();
		


	}
}
