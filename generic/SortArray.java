package Collection.generic;

public class SortArray {

	public static <E extends Comparable<E>> void bubbleSort(E arr[]) {
		
		int n = arr.length;
		 boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	            	 if (arr[j].compareTo(arr[j + 1]) > 0) {
	               
	                    E temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }         
	            if (!swapped) {
	                break;
	            }
	        }
	    
	}  
    public static void main(String[] args) {
    	Integer a[]= {10,20,30,40};
		Character b[]= {'v','d','e','s'};
		String d[]= {"Shivam","Sabaat","Harshal","Prajyot","Bishal"};
		bubbleSort(d);
		for(String c : d)
		{
			System.out.println(c);
		}
		
	}    
	
}
