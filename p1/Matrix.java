package p1;

public class Matrix {
	public int[][] arr;
	public int cols,rows;
	public Matrix()
	{
		this.rows=3;
		this.cols=3;
		arr=new int[3][3];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			arr[i][j]=0;
		}
	}
	public Matrix(int n,int m)
	{
		this.cols=m;
		this.rows=n;
		arr=new int[n][m];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			arr[i][j]=0;
		}
	}
	public Matrix(int[][] x,int n,int m)
	{
		arr=new int[n][m];
		this.rows=n;
		this.cols=m;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				this.arr[i][j]=x[i][j];
			}
		}
	}
	public Matrix(Matrix a) 
	{
		System.out.println("Copy constructor called");
		this.arr=a.arr;
		this.cols=a.cols;
		this.rows=a.rows;
	}
	public int getRows()
	{
		return rows;
	}
	public int getColumns()
	{
		return cols;
	}
	public void readData()
	{
		System.out.println("Enter:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			arr[i][j]=Read.br.nextInt();
		}
	}
	public void displayData()
	{
		System.out.println("Inputted Matrix is:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			    System.out.print(arr[i][j]+" ");
			System.out.println();
			
		}
	}
	public Matrix addTwoMatrices(Matrix a)
	{
		Matrix res = new Matrix(rows,cols);
		if(a.rows!=rows || a.cols!=cols)
		{
			System.out.println("Matrix addition not possible!");
			return res;
		}
		else
		{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			    res.arr[i][j]=arr[i][j]+a.arr[i][j];
		}
		return res;
		}
	}
	public boolean isScalar(Matrix a)
	{
		if(a.rows!=a.cols)
			return false;
		for (int i = 0; i < a.rows; i++) 
	    { 
	        for (int j = 0; j < a.cols; j++) 
	        { 
	        	if(a.arr[i][j]!=a.arr[j][i])
	        		return false;
	        }
	    }    
		return true;
	}
	public Matrix multiplyTwoMatrices(Matrix a)
	{
		Matrix res = new Matrix(rows,a.cols);
		if(cols==a.rows)
		{
		for (int i = 0; i < rows; i++) 
	    { 
	        for (int j = 0; j < a.cols; j++) 
	        { 
	            res.arr[i][j] = 0; 
	            for (int k = 0; k < rows; k++) 
	                res.arr[i][j] += arr[i][k] * a.arr[k][j]; 
	        } 
	    } 
		return res;
		}
		else
		{
			System.out.println("Matrix multiplication not possible!");
			return res;
		}
	}
}
