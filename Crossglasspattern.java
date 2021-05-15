import java.util.Scanner;
class Crossglasspattern{
 public static void main(String[] a){
  Scanner s =new Scanner (System.in);
  System.out.println("Enter the num of row");
   byte row =s.nextByte();
  
  for(int i=1; i<=row; i++){
	  for(int j=1; j<=row; j++){
//if(i <= j)down angle
//if(i+j<=row)
if((i <= j || i+j <= row+1) && (i >= j || i+j > row))
		  System.out.print(i + "" + j + " ");
	  else 
		  System.out.print("   ");
		  	}
			System.out.println();
  }
  }
}
