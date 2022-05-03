package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
	
	  // the result
	List<Double> resOfListOfDouble = new ArrayList<Double>();
	
	for(int x : input){
		resOfListOfDouble.add(Math.pow(((x*2)+3),5));
	}
    return resOfListOfDouble;
  }

  /**
   * operation : abc -> AbcAbc
   */
  
  public static List<String> compute2(List<String> input) {
	  
	  List<String> resOfListOfString = new ArrayList<String>();
	  
	  /*
	   * I use ternary
	   * Before add it check if the length of the string is greater than 0 so that do the transformation operation and add the result else just add the string
	   */
	  for(String s : input){
		  resOfListOfString.add(s.length() > 0 ? ((s.substring(0,1)).toUpperCase().concat(s.substring(1))) + ((s.substring(0,1)).toUpperCase().concat(s.substring(1))) : s );
	  }
	  return resOfListOfString;
  }
  
}