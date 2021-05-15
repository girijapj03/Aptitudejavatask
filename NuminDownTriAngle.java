import java.util.Scanner;

class NuminDownTriAngle{
 public static void main(String[] a){
  Scanner scanner=new Scanner (System.in);
  System.out.println("Enter the num of row");
  short row =scanner.nextShort();
  
  
  for(int i=1; i<=row; i++){
	  for(int j=1; j<=row; j++){
		  if(i <= j)
		              
	  System.out.print(" "+ i);
	  }
	  System.out.println( );
	 }
	}
}