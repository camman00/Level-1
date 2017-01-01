public class Platypus {
	private String name;
	private int age;
	private double height;
	public Platypus(String name,int age,double height){
		this.name = name;
		this.height = height;
		this.age = age;
	}
	public void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	public double getHeight() {
		return this.height;
	}
	public int getAge() {
		return this.age;
	}
	
	
	public static void main(String[] args) {
		Platypus haha = new Platypus("haha",55,3.2D);
		
		//2. Call the sayHi method
		haha.sayHi();
		Platypus hahaha = new Platypus("yep",-500,3.5D);
		System.out.println(hahaha.getAge() + " " + hahaha.getHeight());
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
}