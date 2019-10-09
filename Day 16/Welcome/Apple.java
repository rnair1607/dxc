
class Apple {
	public static void myMethod() {
		System.out.println("Hello,");
	}

}

class Ball{
	public static void myMethod1() {
		System.out.println("how");
	}
}

class Cat{
	public static void myMethod2() {
		System.out.println("are");
	}
}

class Dog{
	public static void myMthod3() {
		System.out.println("you");
	}
}

class Elephant{
	public static void myMethod4() {
		System.out.println("?");
	}
}

class Client{
	public static void main(String[] args) {
		System.out.println("1.");
		
		Apple appleObject = new Apple();
		Ball ballObject = new Ball();
		Cat catObject = new Cat();
		Dog dogObject = new Dog();
		Elephant eleObject = new Elephant();
		
		eleObject.myMethod4();
		appleObject.myMethod();
		ballObject.myMethod1();
		catObject.myMethod2();
		dogObject.myMthod3();
	}
}