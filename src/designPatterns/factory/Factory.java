package designPatterns.factory;

public class Factory {

	public Shape drawShape(Shape shape) {
		if (shape instanceof Square) {
			return new Square();
		}
		else if(shape instanceof Rectangle)
			return new Rectangle();
		else
			return null;
	}
}
