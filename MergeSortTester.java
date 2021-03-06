/*======================================
  class MergeSortTester
  ALGORITHM:
  A list in random order is given to the initial method call.  Then, 
the list is broken up into two (almost) even smaller lists. 
Then these lists are broken yet again.  
This continues until there are only single item lists. At this point, ordered 
lists are passed back up the chain of command and are merged in order.
 The lists are continuously passed up. This continues until the list has been 
united.
 
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)
  EXPLAINATION:
The list once its broken down to its constituent parts is made up of exactly n
 small lists that are broken-up. Think about the merging in levels, where one 
level represents all lists of the previous level either being merged or split.
 To reassemble, you need to apple a merging function to each broken up list at
 a given level. As you move up levels, you are halving the amount of broken
 lists present, until there is one sorted list. This is where you get the log(n)
. The same is true for the splitting, just in reverse. Since you need to run a 
log(n) procedure 2n times, you get log(n)*n as the runtime. 

  Mean execution times for dataset of size n:
  Batch size: 10 times for 1-10000. Once for 1 million
  n=1       time: 0.0 ms
  n=10      time: 0.0 ms
  n=100     time: 134.0 ms
  n=1000    time: 654.0 ms
  n=10000   time: 9421.0 ms
  n=1000000  time: 27 minutes (1689200.0 ms)
  ANALYSIS:
  The results appear to follow a run time of roughly 10nlog10n, which ends up being nlogn
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	int[] arr0 = {1,3,5,6,5,0,34,45,12,2345};
	int[] arr1 = new int[100];
	for(int x = 0; x < 100; x++){
	    arr1[x] =(int)(Math.random() * 100);
	}
	int[] arr2 = new int[1000];
	for(int x = 0; x < 1000; x++){
	    arr2[x] =(int)(Math.random() * 1000);
	}
	int[] arr3 = new int[10000];
	for(int x = 0; x < 10000; x++){
	    arr3[x] =(int)(Math.random() * 10000);
	}
	int[] megaArr = new int[1000000];
	for(int x = 0; x < 1000000; x++){
	    megaArr[x] =(int)(Math.random() * 1000000);
	}
	//=======Testin Sort============
	MergeSort.printArray(arr0);
	System.out.println("Now lets sort!");
	double tenA = System.currentTimeMillis();
	MergeSort.sort(arr0);
	double tenB = System.currentTimeMillis();
	MergeSort.printArray(MergeSort.sort (arr0));

	System.out.println("----------------------------------------");
	
	MergeSort.printArray(arr1);
	System.out.println("Now lets sortsort!");
	double hunnaA = System.currentTimeMillis();
	MergeSort.printArray(MergeSort.sort(arr1));
	double hunnaB = System.currentTimeMillis();
	System.out.println("----------------------------------------");
	
       	MergeSort.printArray(arr2);
	System.out.println("Now lets sortsortsort!");
	double thoA = System.currentTimeMillis();
	MergeSort.printArray(MergeSort.sort(arr2));
	double thoB = System.currentTimeMillis();
	System.out.println("----------------------------------------");
	
       	MergeSort.printArray(arr3);
	System.out.println("Now lets sort it uppp!");
	double tenthoA = System.currentTimeMillis();
	MergeSort.printArray(MergeSort.sort(arr3));
	double tenthoB = System.currentTimeMillis();
	System.out.println("----------------------------------------");
	//one last attempt to see the timing
	//MergeSort.printArray(megaArr);

	System.out.println(tenB - tenA);
	System.out.println(hunnaB - hunnaA);
	System.out.println(thoB - thoA);
	System.out.println(tenthoB - tenthoA);

	System.out.println("Tbh dont wanna see all them unsorted so right to sorting!");
	double milA = System.currentTimeMillis();
	MergeSort.printArray(MergeSort.sort(megaArr));
	double milB = System.currentTimeMillis();
	System.out.println("----------------------------------------");


	System.out.println(milB - milA);
        
    }//end main

}//end class
