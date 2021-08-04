import java.util.Scanner;

class Diamondpattern{
 public static void main(String[] a){
  Scanner s =new Scanner (System.in);
  
  System.out.println("Enter the num of row");
   byte row =s.nextByte();
  
  for(int i=1; i<=row; i++){
	  for(int j=1; j<=row; j++){
  if(  i+j <= row+(row/2)+1 && j-i<=row/2 && i-j <= row/2 && i+j >= row-(row/2)+1 )
	  
System.out.print(" * ");
		 // System.out.print(i+""+j +" ");
	  else 
		  System.out.print("   ");
		  	}
			System.out.println();
  }
  }
}
