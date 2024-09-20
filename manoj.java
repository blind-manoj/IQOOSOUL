public class Shape
{
	public void draw()
	{
		System.out.println("Drawing a shape");
	}
	public void erase()
	{
		System.out.println("Erasing a shape");
	}
	class Circle extends Shape
	{
		public void draw()
		{
			System.out.println("Drawing a circle");
		}
		public void erase()
		{
			System.out.println("Erasing a circle");
		}
	}
	class Triangle extends Shape
	{
		public void draw()
		{
			System.out.println("Drawing a triangle");
		}
		public void erase()
		{
			System.out.println("Erasing a triangle");
			}
	}
	class Square extends Shape
	{
		System.out.println("Drawing a square");
	}
	public void erase()
	{
		System.out.println("Erasing a square");
	}
}
class main
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		Triangle t = new Triangle();
		Square s = new Square();
		System.out.println("Using Circle object");
		c.draw();
		c.erase();
		System.out.println("Using Triangle object");
		t.draw();
		t.erase();
		System.out.println("Using Square object");
		s.draw();
		s.erase();
	}
}	
		
	
	

