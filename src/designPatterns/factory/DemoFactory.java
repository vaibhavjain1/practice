package designPatterns.factory;

public class DemoFactory {

	public static void main(String[] args) {
		Shape p = new Factory().drawShape(new Rectangle());
		p.draw();
	}

}
