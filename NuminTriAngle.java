import java.util.Scanner;

class NuminTriAngle{
 public static void main(String[] a){
  Scanner scanner=new Scanner (System.in);
  System.out.println("Enter the num of row");
  short row =scanner.nextShort();
  int number=1;
  
  for(int i=1; i<=row; i++){
	  for(int j=1; j<=i; j++){
           while(true){
			   if (number %2 !=0){
		              System.out.print(" "+  number);
					  number++;
					  break;
					  }else
						  number++;
	  }
  }
			System.out.println( );
  }
 }
} 
 