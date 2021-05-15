import java.util.Scanner;

class NumincolumnTriAngle{
 public static void main(String[] a){
  Scanner scanner=new Scanner (System.in);
  System.out.println("Enter the num of row");
  short row =scanner.nextShort();
  int number=1;
  
  for(int i=1; i<=row; i++){
	  for(int j=1; j<=i; j++){
		  
		              
	  System.out.print(" "+ j);
	  }
	  System.out.println( );
	 }
	}
}