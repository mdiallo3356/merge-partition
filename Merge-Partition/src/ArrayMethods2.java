/*Author: Mamadou Diallo
 * Project Name: AP JAVA lab 3.2- Merge and Partition
 * Date: 2/9/2018
 */
public class ArrayMethods2 {
	//Testing Arrays
	String[]test1= {"apple","cucumber","microsoft","zorro"};
	String[]test2= {"banana","cherry","mahogany","oreos","pinata"};
	String[]test3= {"mobile","implication","player","unity","birthday","tent"};
	int[]test4= {3,4,2,7,12,22,0,1};
	int[]test5= {48,50,36,39,32,24,71,94};
	
	//Merge Test
	long start = System.nanoTime();
	String[]mergeResult = Merge(test1, test2);
	long end = System.nanoTime();
	long time = end-start;
	System.out.println("Merge test took: " + time + "nanoseconds");
	System.out.println(Arrays.toString(mergeResult));
	
	public static String[]Merge(String[]Words1, String[]Words2)
	{
		int L = 0;
		int R = 0;
		String[]Merged = {};
		Merged.length= Words1.length+Words2.length;
		while(L<Words1.length && R < Words2.length)
		{
			Words1[L].compareTo(Words2[R]);
			
			 
	}
	
	public static int[]Partition(int[]nums1)
	{
		
	}
	

}
