package com.bating;

public class Cigarparty {

		 public static boolean CigarParty(int cigars, boolean isWeekend)
	        {
	            boolean weekendStatus = isWeekend;
	            boolean result= true;

	            if ((weekendStatus = false)&&(cigars > 60)){
	                result = false;
	            }

	            else if ((cigars >= 40)&&(weekendStatus = true)){
	                result = true;
	            }
	            else if ((cigars < 40)&&(weekendStatus = true)){
	                result = false;
	            }
	            return result;
	        }
		 
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
		 boolean c =CigarParty(30, false);
		 System.out.println(c);
		 boolean c1 =CigarParty(50, false);
		 System.out.println(c1);
		 boolean c2 =CigarParty(70, false);
		 System.out.println(c2);
         
		 }
		 
}
		 
		 
