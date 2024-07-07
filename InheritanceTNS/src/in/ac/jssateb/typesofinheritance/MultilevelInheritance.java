package in.ac.jssateb.typesofinheritance;
class Animall{
	void eat() {
		
	}
}

class Dogg extends Animall{
	void bark() {
		
	}
}

class Puppy extends Dogg{
	void weep() {
		
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animall a = new Animall();
		a.eat();
		
		Dogg d = new Dogg();
		d.eat();
		d.bark();
		
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weep();
		
		Animall a1 = new Dogg();
		Animall a2 = new Puppy();
		Dogg d1 = new Puppy();
	}
}
