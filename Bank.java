class Bank {
	    public static void main(String []a){
	        System.out.println("started main method");
		String accountType = "savings";
	

		if (accountType == "zero balance"){
		   System.out.println("required minimum balance = 0");
	        }else if (accountType == "savings"){
		   System.out.println("required minimum balance = 500");
		}else if (accountType == "current"){
		   System.out.println("required minimum balance = 5000");
		}
		else {
		     System.out.println("please enter valid accountType");
		}
	    }
}


