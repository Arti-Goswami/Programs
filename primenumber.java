package com.test;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=33;
		int flag=0;
		 int i,m=0;    
		  
		  m=n/2;  
		  
		  if(n==0||n==1){
		   System.out.println(n+" is not prime number");    
		  }else{
		   for(i=2;i<=m;i++){    
		    if(n%i==0){    
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(n+" is prime number"); }
		  }//end of else

}
}