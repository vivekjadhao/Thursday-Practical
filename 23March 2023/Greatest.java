 //write a java program to take 3 numbers and findthe greatest of 
 //all the three numbers
 
 class Greatest{//Class Declaration
     public static void main(String[] args) {
	     int a=10,b=90,c=47;
		 
		 if(a>b && a>c) {//Checking the a is greatest or not
		     System.out.print("A is Greatest Number !!");
		}else if (b>a && b>c) {//Checking the b is greatest or not
		     System.out.print("B is Greatest Number !!");
		}else{// if both the condition are false than c is greatest number	 
		     System.out.print("C is Greatest Number !!");
		}
	}	
}	