    package startsFrom32sec;

public class S274ArrayMaxinColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mincol=0;
		int a[][]= {{3,6,1},{5,2,3},{4,5,7}};
		int min = a[0][0];
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincol=j;
				
				}
			}
		}
		int k=0;
		int cmax=a[0][mincol];
		for(k=0;k<3;k++)
		{
			System.out.println(a[k][mincol]);
			if(a[k][mincol]>cmax)
			{
				cmax=a[k][mincol];
			}
			
			
		}
		System.out.println("colum max is "+cmax);

	
	
	
	
	}

}
