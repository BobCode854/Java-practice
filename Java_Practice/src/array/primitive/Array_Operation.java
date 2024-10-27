package array.primitive;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Array_Operation {

	public static void main(String[] args) {
	
		
		int arr[] = {55,1,2,3,4,22,65,22,55};
		
		/**
		 *  Find Size of the array
		 *  ====================
		 *   --) In Steam , we can use ------------------------  count() method
		 *   
		 *   --) This works with both primitive arrays (like int[]) and object arrays (like String[]).
		 */
		
			long totalCountofElements = Arrays.stream(arr).count();
			System.out.println("TotalCount : "+totalCountofElements);

		
			/**
			 * Find maximum value in an array.
			 * =================================
			 *  --) If it is primitive int max() method without argument is ok .
			 *  --) If it is non primitive Integer we have to externally compare the  object . -----max(Integer::compare)
			 *  
			 *  Conclusion : 
			 *          primitive         -- max()
			 *          non-primitive -- max(Integer :: compare)
			 *          
			 *  
			 */
			
			int maxValue = Arrays.stream(arr).max().getAsInt();
			System.out.println("MaxValue  :" + maxValue);
			
			/**
			 * Find minmum value in an array.
			 * =================================
			 *  --) If it is primitive int min() method without argument is ok .
			 *  --) If it is non primitive Integer we have to externally compare the  object . -----min(Integer::compare)
			 *  
			 *  Conclusion : 
			 *          primitive         -- min()
			 *          non-primitive -- min(Integer :: compare)
			 *          
			 *          
			 *  --) This we can use while sorting also.
			 *          
			 */
			
			int minValue = Arrays.stream(arr).min().getAsInt();
			System.out.println("Min Value : " + minValue);
		     
  
		 	/**
		 	 *  Find the Sum of the length of character of those names whose length is greater than 5.
		 	 *  ====================================================================
		 	 *  --) If you have to perform sum operation on array with Object datatype - string is an object
		 	 *       ----------------------------------------------------------------------------------
		 	 *       1) we have do mapToInt() and then apply sum() function. 
		 	 *              we can't do directly with map.
		 	 *              
		 	 *      2) If we have number directly as primitive we can directly apply -------- sum() function
		 	 *      
		 	 *      conclusion : 
		 	 *      ==============
		 	 *      primitive array           --       sum()
		 	 *      non-primitive array   --       mapToInt(num->num).sum();
		 	 *      
		 	 */
			   String[] names = {"william", "jones", "aaron", "seppe", "frank", "gilliam"};
			   int sum =  Arrays.stream(names).filter(name->name.length()>5).mapToInt(name->name.length()).sum();
		       System.out.println("Sum : "+sum);
		      
		    /**
		     *   Find the Sum of the data in an array
		     *   ===============================
		     *    primitive array           --       sum()
		 	 *    non-primitive array   --       mapToInt(num->num).sum();
		     *   
		     */
		       int[] numbers = {7,5,3,4};
		       Integer[] integerNums = {7,5,3,4};
		       int primitiveSum= Arrays.stream(numbers).sum();
		       int nonPrimitiveSum = Arrays.stream(integerNums).mapToInt(num->num).sum();
		       

		       System.out.println("sumOfNumbersInAnPrimitiveArray : " +primitiveSum);
		       System.out.println("sumOfNumbersInAnNonPrimitiveArray : " +nonPrimitiveSum);
		       
		       
		       /**
		        *   Perform the sum of array using reduce method containing 3 parameter
		        */
		       int sumUsingReduceWith3Param =Arrays.stream(numbers).reduce(0, (num1,num2)->num1+num2); // this will return int
		       System.out.println("sumUsingReduceWith3Param :"+sumUsingReduceWith3Param);
		       
		       /**
		        *   Perform the sum of array using reduce method containing 2 parameter
		        */
		       int sumUsingReduceWith2Param =Arrays.stream(numbers).reduce((num1,num2)->num1+num2).getAsInt(); // this will return optionalInt
		       System.out.println("sumUsingReduceWith2Param : "+sumUsingReduceWith2Param);
		       
		       /**
		        *  Finding duplicate element from array
		        */
		       
		       List<Integer> findingDuplicates = Arrays.asList(new Integer[]{1,2,1,3,4,4});
		       Set<Integer> allItems = new HashSet<>();
		       Set<Integer> duplicates = findingDuplicates.stream()
		    	        .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
		    	        .collect(Collectors.toSet());
		    	System.out.println(duplicates); 
			}
	 
}
