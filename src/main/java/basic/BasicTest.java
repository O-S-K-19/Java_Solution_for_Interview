package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
	  
	  Option<Integer> resOpt = Option.none(); 
	  if( i >= 0 && n > 0){
		 
		  long res = 1;
		 
		  /*
		   * 2^3 -> 2*2*2
		   * i^n you should multiply i, n times. 
		   */
		  
		  while(n != 0){
			  
			  // check if result is integer overflow 
			  if(Math.abs(res * i) > Integer.MAX_VALUE){
				  return Option.none();
			  }
			
			  else{
				  res = res*i;
			  }
			  --n;
		  	}		  
		  
		  // the result is not integer overflow
		  resOpt = Option.of((int)res);
		  return resOpt;
	  }
	  // for positive base greater or equal to 0 and exponent equal to 0
	  else if(i >= 0 && n == 0){
		  resOpt = Option.of(1);
		  return resOpt;  
	  }
	  // for negative base and exponent
	  else{
		  return Option.none();
	  }
  }
  
}
