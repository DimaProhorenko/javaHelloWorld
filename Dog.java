
public class Dog {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	public void bark() {
		System.out.println("Bark");
	}
	
	public String toString() {
		return String.format("%s is a dog", this.name);
	}
}
