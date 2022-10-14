package Operators;

public class UnaryOp3 {

public static void main(String[] args) {
		
		/*int a = 5, b;
		b = a++  +  ++a  +  ++a  +  a; 
		System.out.println(a);  // (5+1)6 + (1+6)7 + (7+1)8 + 8    a=8
		System.out.println(b);  // 5+7+8+8 =28                      b=28
	}
        /*
		  int a = 0 , b;
		  b = a++  +  ++a  +  ++a  +  a; 
		  System.out.println(a);// (0+1)1 + (1+1)2 + (1+2)3 +3   a=3
		  System.out.println(b); // 0 + 2 + 3 +3                 b=8
	}
		*/
		/*int a = 5, b;
		b = a--  +  --a  +  a--  +  a;
		
		System.out.println(a);   // (5-1)4 + (1-4)3 + (3-1)2 + 2  = 2
		System.out.println(b);   //  5 + 3 + 3 + 2 = 13
}	    */                     
		
		
		/*int a = 0, b;
		b = a--  +  --a  +  a--  +  a;
		
		System.out.println(a);// (0-1)-1 + (-1-(1))-2 + (-2-1)-3 + -3 a=-3
		System.out.println(b);// 0 + (-2) + (-2) + (-3)               b=-7
	}	 */                         
	                          
		/*int a = 5, b;
		b = --a  +  --a  +  --a  +  a  +  ++a  +  a++;
		
		System.out.println(a); //  (5-1)4 + (4-1)3 + (3-1)2 + 2 + (1+2)3 (3+1)4  a=4
		
		System.out.println(b);// 4+3+2+2+3+3                                     b=17
	}	*/
		
		/*int a = 0, b;
		b = --a  +  --a  +  --a  +  a  +  ++a  +  a++;
		System.out.println(a);//(-1-0)-1 + (-1-1)-2 + (-1-2)-3 + -3 +(1+(-3))-2 + (-2+1)-1 a=-1
		System.out.println(b);// -1 + (-2 ) + (-3) + (-3) + (-2) + (-2)                    b=-13
	}	*/
		
		/*int a = 5, b;
		b = a--  +  a  +  ++a  +  a++  +  ++a  +  a++  +  a;
		  //  4       4      5      5        7       8       8
		System.out.println(a); //  (5-1)4 + 4 + (1+4)5 + (5+1)6 + (1+6)7 + (7+1)8 + 8  a=8    
		System.out.println(b); //  4+4+5+5+7+8+8                                       b=41
		
	}	*/
		
		
		int a = 0, b;
		b = a--  +  a  +  ++a  +  a++  +  ++a  +  a++  +  a;
		
		
		System.out.println(a);// (0-1)-1  + (-1) + (1+(-1))0 + (0+1)1 + (1+1)2 + (2+1)3 + 3
		System.out.println(b); //0 + (-1) + 0 + 0 + 2 + 2 + 3
	
	}
	}
}
