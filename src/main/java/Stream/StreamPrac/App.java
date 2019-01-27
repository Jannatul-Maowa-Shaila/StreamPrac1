package Stream.StreamPrac;

import java.util.*; 
import java.util.stream.*; 
public class App 
{
	public static void main(String args[]) 
	  { 
	  
	    // create a list of integers 
	    List<Integer> number = Arrays.asList(6,7,8,9); 
	  
	    // demonstration of map method 
	    List<Object> square = number.stream().map(x -> x*x). collect(Collectors.toList()); 
	    System.out.println(square); 
	  
	    // create a list of String 
	    List<String> names = Arrays.asList("Reflection","Collection","Stream"); 
	  
	    // demonstration of filter method 
	    List<Object> result = names.stream().filter(s->s.startsWith("S")). collect(Collectors.toList()); 
	    System.out.println(result); 
	  
	    // demonstration of sorted method 
	    List<Object> show = names.stream().sorted().collect(Collectors.toList()); 
	            
	    System.out.println(show); 
	  
	    // create a list of integers 
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
	  
	    // collect method returns a set 
	    Set<Object> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
	         
	    System.out.println("squareSet:"+squareSet); 
	  
	    // demonstration of forEach method 
	    number.stream().map(x->x*x).forEach(y->System.out.println(y)); 
	  
	    // demonstration of reduce method 
	    int even = 
	       number.stream().filter(x->x%2==0).reduce(1,(ans,i)-> ans+i); 
	  
	    System.out.println(even); 
	  } 
}
