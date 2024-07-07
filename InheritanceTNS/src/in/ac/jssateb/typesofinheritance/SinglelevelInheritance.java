package in.ac.jssateb.typesofinheritance;
class Animal{
	void eat() {
		
	}
}
class Dog extends Animal{
	void bark(){
		
	}
}

public class SinglelevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.eat();
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		Animal a1 = new Dog();
		a1.eat();
		
		//Dog d1 = new Animal();//not [possible


	}

}
