import java.util.Scanner;

class NuminLeftTriAngle{
 public static void main(String[] a){
  Scanner scanner=new Scanner (System.in);
  System.out.println("Enter the num of row");
  short row =scanner.nextShort();
  
  
  for(int i=1; i<=row; i++){
	  for(int j=1; j<=row; j++){
		  if(i+j >= row+1)
		              
	  System.out.print(" "+ j);
	  else
 System.out.print("  ");
	  }
	  System.out.println();
	 }
	}
}