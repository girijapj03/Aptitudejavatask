class calender1{
 public static void main(String []a){
for(int i = 1; i< 30; i++){
for(int j = 0; j<7; j++){
System.out.print(i + "\t ");
            i++;
            if(j == 6){
                i--;}

           if(i > 30)
            {
                break;
            }

 }
System.out.print("\n");
}
}
}
