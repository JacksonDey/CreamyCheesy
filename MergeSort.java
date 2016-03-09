/*======================================
 Class MergeSort
      Implements mergesort on array of ints.
      Summary of Algorithm: 
      Base case is one card.  If greater than one caard split the array.
      When handing back, put lowest card on top, select fromk the tops.  
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] sorta = sort(a);
	int[] sortb = sort(b);
	int sum = a.length + b.length;
	int[] ab = new int[a.length + b.length];
	int r = 0;
	int i = 0;
	for(int q = 0; q < sum; q ++){
	    if(i >= a.length){
		ab[q] =  sortb[r];
		r++;
	    }
	    else if(r >= b.length){
		ab[q] =  sorta[i];
		i++;
	    }
	    else if(sorta[i] < sortb[r] && i < a.length && r < b.length){
		ab[q] =  sorta[i];
		i++;
	    } 
	    else if( sorta[i] >=  sortb[r] && i < a.length && r < b.length){ 
		ab[q] =  sortb[r]; 
		r++;
	    }
	    
	}
	return ab;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) //recursive
    {
	if(arr.length == 1){
	    return arr;//return the only(first) element
	}
	else{
	    int ay = arr.length/2;
	    int nice = 0;
	    int[] blah = new int[ay];//first half
	    for(int i = 0; i < blah.length; i++){
		blah[i] = arr[i];
	    }
	    if(ay * 2 != arr.length){nice = ay + 1;}
	    else{nice = ay;}
	    int[] bloo = new int[nice];//second half
	    for(int r = 0; r < bloo.length; r++){
		bloo[r] = arr[ay + r];//starts from the middle
	    }
	    return merge( sort(blah) , sort(bloo) );
	}
	
    }//end sort()



    //-------------------HELPERS-------------------------
	    //tester function for exploring how arrays are passed
	    //usage: print array, mess(array), print array. Whaddayasee?
	    public static void mess( int[] a ) {
		for( int i = 0 ; i<a.length; i++ )
		    a[i] = 0;
	    }

	    //helper method for displaying an array
	    public static void printArray( int[] a ) {
		System.out.print("[");
		for( int i : a )
		    System.out.print( i + ",");
		System.out.println("]");
	    }
	    //---------------------------------------------------


	    //main method for testing
	    public static void main( String [] args ) {

		
		  int[] arr0 = {0};
		  int[] arr1 = {1};
		  int[] arr2 = {1,2};
		  int[] arr3 = {3,4};
		  int[] arr4 = {1,2,3,4};
		  int[] arr5 = {4,3,2,1};
		  int[] arr6 = {9,42,17,63,0,512,23};
		  int[] arr7 = {9,42,17,63,0,9,512,23,9};
		  
		  System.out.println("\nTesting mess-with-array method...");
		  printArray( arr3 );
		  mess(arr3);
		  printArray( arr3 );
		 
		  System.out.println("\nMerging arr1 and arr0: ");
		  printArray( merge(arr1,arr0) );
		   
		  System.out.println("\nMerging arr4 and arr6: ");
		  printArray( merge(arr4,arr6) );
		 
		  System.out.println("\nSorting arr4-7...");
		  printArray( sort( arr4 ) );
		  printArray( sort( arr5 ) );
		  printArray( sort( arr6 ) );
		  printArray( sort( arr7 ) );
		  /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
		  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	    }//end main()

}//end class MergeSort
