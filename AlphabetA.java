class AlphabetA{
 public static void main( String[] args) {
	  int row = 6;
		for(int i=1; i<=row; i++) {
		for(int j=1; j<=row; j++) {
 if(i==1 || i==row/2 || j==1|| j==row)
System.out.print(i+""+j +" ");
else
System.out.print("   ");
}
System.out.println( );
}
}
}
					
