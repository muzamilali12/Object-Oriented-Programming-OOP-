class Circle{
	
	String color;
	double radius;
	
	Circle(String color, double radius){
	this.color = color;
	this.radius = radius;
	}
	
	double calculateArea(){
	return 3.14*radius*radius;
	}

	public static void main(String[] args){
	Circle greenCircle = new Circle("Green", 12.0);
	Circle redCircle = new Circle("Red" , 13.4);
	
	greenCircle.color = "Green";
	greenCircle.radius = 12.0;
	
	redCircle.color = "Red";
	redCircle.radius = 13.4;
	System.out.println(greenCircle.color + " " + greenCircle.radius);
	System.out.println(redCircle.color + " " + greenCircle.radius);
		redCircle.calculateArea();
		
}
}