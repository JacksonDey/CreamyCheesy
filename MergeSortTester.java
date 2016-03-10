/*======================================
  class MergeSortTester
  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
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
	MergeSort.sort(arr0);
	MergeSort.printArray(MergeSort.sort (arr0));
	System.out.println("----------------------------------------");
	
	MergeSort.printArray(arr1);
	System.out.println("Now lets sortsort!");
	MergeSort.printArray(MergeSort.sort(arr1));
	System.out.println("----------------------------------------");
	
       	MergeSort.printArray(arr2);
	System.out.println("Now lets sortsortsort!");
	
	MergeSort.printArray(MergeSort.sort(arr2));
	System.out.println("----------------------------------------");
	
       	MergeSort.printArray(arr3);
	System.out.println("Now lets sort it uppp!");
	MergeSort.printArray(MergeSort.sort(arr3));
	System.out.println("----------------------------------------");
	//one last attempt to see the timing
	//MergeSort.printArray(megaArr);
	System.out.println("Tbh dont wanna see all them unsorted so right to sorting!");
	MergeSort.printArray(MergeSort.sort(megaArr));
	System.out.println("----------------------------------------");

        
    }//end main

}//end class
