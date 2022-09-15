package labtest2;

public class Rectangle {
	int l,w;
	Rectangle()
	{
		l=1;
		w=1;
	}
	
	Rectangle(int l, int w )
	{
		this.l=l;
		this.w=w;
		
	}
	void area()
	{
		System.out.println("area of Rectangle is "+(l*w));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Rectangle r=new Rectangle();
      r.area();
      Rectangle r1=new Rectangle(39,67);
      r1.area();
	}

}
