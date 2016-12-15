public class test
{
	public static void main(String[]args)
	{
		//1. d  No - e, int[] arr = {0,0,0,0}; is an initializer
		
		//2. c  Yes - if no neg int, never stop and ArrayIndexOutOfBoundsException
		
		//3. a  No - e, runtime error, when i = arr.length - 1, it gets incremented 
		//inside the loop but there is no arr[length]. 
		//int sum = arr[0], i = 0;
		//while(i < arr.length)
		//{
			//i++;
			//sum += arr[i];
		//}
		
		//4. a  Yes - all nonzero elements are transferred to arr2.
		
		//5. c  Yes - (k - 1) iterations
		
		//6. ! refer to the same data. "1 3"  Yes - changed by doSomething() 
		
		//7. b  Yes - two problems of arr[1] not tested and out of range
		
		//8. d  No - a, vIndex and wIndex has been incremented. 
		
		//9. d  No - b, paramenter in arraylist must be class type, 
		// so int not Integer 
		
		//10. b  Yes - I no exit condition, III sum(n) prevents termination
		
		//11. e  Yes - never terminate 
		
		//12. b  Yes - 2^5
		
		//13. c  Yes - total n calls
		
		//14. b  Yes - return 14
		
		//15. d  Yes 
		
		//16.    No - a , if statements stack & all if statements compared to x[0]. 
		
		//17. e  Yes - only one of the operands needs to be a string
		
		//18.    No - c, bc a, d, e Indexoutofbounds.
		
		//19. 
		
	}
}