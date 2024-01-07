package designPatterns.builder;

class MyBuilder{
	
	String name;
	String value;
	
	public MyBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public MyBuilder setValue(String value) {
		this.value = value;
		return this;
	}
}

public class Builder {
	public static void main(String[] args) {
		MyBuilder builder = new MyBuilder().setName("test").setValue("ss");
		System.out.println(builder.name);
	}
	
	
}
