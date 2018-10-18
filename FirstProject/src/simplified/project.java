
public class project {
	public static void main(String[] args) {
		
		project obj = new project();
		obj.print(4);
	}
		void print(int n)
		{
		    int m = 1;
		    int i,j;
		    for( i=1; i<=n-1; i++)
		    {
		        if(i!=2)
		        {
		        	for(j=1; j<=n; j++){
		        		System.out.print(m+"*");
		        		m++;
		        	}
		        	System.out.println();
		        }else{
		        	m = m+n;
		        	for(j=1; j<=n; j++){
		        		System.out.print(m+"*");
		        		m++;
		        	}
		        	System.out.println();
		        }
		    }
		    for(i=n+1 ;i<=(n+n);i++){
		    	System.out.print(i+"*");
		    }
		    System.out.println();
		}
	
}
