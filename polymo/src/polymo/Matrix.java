package polymo;

public class Matrix {
	void addary()
	{
		int [][]a= {{5,6,7,89},{12,22,4,5},{9,8,6,5}};
		int [][]b= {{23,2,12,59},{2,4,6,6},{1,2,3,4}};
		int size;
		size=a.length;
          int c[][]=new int[4][4];
        for(int i=0;i<size;i++)
		{
			for( int j=0;j<a[i].length;j++) {
				//System.out.println("addition is"+a[i][j]+b[i][j] );
			 c [i][j]=a[i][j]*b[i][j];
			 System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Matrix a=new Matrix();
		a.addary();
		
	}

	
}