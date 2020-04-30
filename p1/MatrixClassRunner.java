package p1;

public class MatrixClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,1,1},{1,1,1},{1,1,1}};
		Matrix mat=new Matrix(a,3,3);
		//mat.readData();
		mat.displayData();
	    System.out.println(mat.isScalar(mat));
		/*
        int[][] res;
        int[][] a= {{1,1,1},{1,1,1},{1,1,1}};
        res=mat.addTwoMatrices(a);
        for(int i=0;i<mat.getRows();i++)
		{
			for(int j=0;j<mat.getColumns();j++)
			    System.out.print(res[i][j]+" ");
			System.out.println();
			
		}*/
        //Matrix m=new Matrix(3,2);
        /*Matrix m1=new Matrix(3,2);
        m1.readData();
       Matrix m=mat.multiplyTwoMatrices(m1);
        m.displayData();*/
	}

}
