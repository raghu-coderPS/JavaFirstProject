package p1;

public class Int_Array_ProcessRunner {

	public static void main(String[] args) {
		
        //System.out.println(FigToWords.getWords(1234));
		int[] a= {1,5,7,8,9,2};
         Int_Array_Process p = new Int_Array_Process(a);	
         //Int_Array_Process p1 = new Int_Array_Process(p);
         //p.readData();
         p.sort();
         p.displayData();
         p.getSum();
         p.findingExtremesInArray();
         //Int_Array_Process p2=p1;
         //System.out.println(p);
         //System.out.println(p1);
         //System.out.println(p2);
	}

}
