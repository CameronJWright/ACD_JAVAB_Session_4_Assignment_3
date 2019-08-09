package hello.world;

class Method {

	void disp() {
		System.out.println("Thanks!");
	}

	void disp(int a) {
		this.disp();
		System.out.println(a);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Method met = new Method();
		met.disp(10);
	}

}
