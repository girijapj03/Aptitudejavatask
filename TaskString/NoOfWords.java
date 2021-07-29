class NoOfWords{
	 
	 public static void main(String[] args){
		 String str="Java is Object";
		 int count=0;
		 
		 for(int i=0; i<str.length()-1;i++){
			 if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				 count++;
		 }
		 
		 System.out.println("Number of Words :  " + (count+1));
	 }


}