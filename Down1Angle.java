import java.util.Scanner;
class Down1Angle{
 public static void main(String[] a){
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter the num of row");
  int row =sc.nextInt();
  
  for(int i=1; i<=row; i++){
	  for(int j=1; j<=row; j++){
//if((row+1)>= (i+j))
if(i<=j)
		  System.out.print(" * ");
		  	}
			System.out.println();
  }
  }
}