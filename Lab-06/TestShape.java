class Point{

	private int x = 0;
	private int y = 0;

	Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public double distanceTo(Point p){
		double d = Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
		return d;
	}

	public String toString(){
		return ("x : "+x +" y : " +y);
	}
	

}


class Shape{

	private Point p = null;
	
	Shape(Point p){
		this.p = new Point(p.getX(),p.getY());
	}

	Point getCentre(){
		return p;
	}

	boolean contains(Point p){
		if(this.p.equals(p)){
			return true;
		}
		return false;
	}

}


class Circle extends Shape{

	private int radius = 0;

	Circle(int radius,Point p){
		super(p);
		this.radius = radius;
	}

	public int getRadius(){
		return radius;
	}

	public String toString(){
		return ("Radius : "+radius+" Centre "+getCentre());
	}

}


class Rectangle extends Shape{

	private int length = 0;
	private int width = 0;

	Rectangle(int length,int width,Point c){
		super (c);
		this.length = length;
		this.width = width;
	}

	public int getLength(){
		return length;
	}

	public int getWidth(){
		return width;
	}

	public String toString(){
		return ("Length : "+length+" Width : "+width+" Centre : "+getCentre());
	}


}



class ShapeArray{

	private Shape shapeList[];
	private int nbShapes = 0;

	ShapeArray(int size){
		shapeList = new Shape[size];
	}

	public boolean addShape(Shape s){
		if(nbShapes < shapeList.length){
			shapeList[nbShapes++] = s;
			return true;
		}
		return false;
	}

	public int getCircleCounter(){
		int count = 0;
		for(int i=0;i<nbShapes;i++){
			if(shapeList[i] instanceof Circle )
				count++;
		}
		return count;
	}

	public double getAvgRectArea(){
		int count = 0;
		double area = 0;
		for(int i=0;i<nbShapes;i++){
			if(shapeList[i] instanceof Rectangle){
				count++;
				Rectangle ref = (Rectangle) shapeList[i];
				area += ref.getLength() * ref.getWidth();
			}
		}
		return (area/count);
	}

	void removeAllRect(){
		for(int i=0;i<nbShapes;i++){
			if(shapeList[i] instanceof Rectangle){
				for(int k=i,j=k+1;j<nbShapes;j++,k++){
					shapeList[k] = shapeList[j];
				}
				nbShapes--;
			}	
		
		}
	}

	void displayRectsInfo(){
		for(int i=0;i<nbShapes;i++){
			if(shapeList[i] instanceof Rectangle){
				Rectangle ref = (Rectangle) shapeList[i];
				System.out.println("Rectangle "+i+"info : "+ref);
			
			}
		}
	}


}


public class TestShape{

 public static void main(String args[]){

	ShapeArray shape = new ShapeArray(20);
	Point point = new Point(4,5);

	Rectangle rect = new Rectangle(3,4,point);
	Circle circle = new Circle(5,point);

	shape.addShape(rect);
	shape.addShape(circle);

	Point point2 = new Point(3,2);

	Rectangle rect2 = new Rectangle(4,5,point2);
	Circle circle2 = new Circle(6,point2);

	shape.addShape(rect2);
	shape.addShape(circle2);

	shape.displayRectsInfo();

	System.out.println("\nAverage area of Rectangles : "+shape.getAvgRectArea());
	System.out.println("\nNumber of Circles  : "+shape.getCircleCounter());
	shape.removeAllRect();
	shape.displayRectsInfo();
	
	
 }

}