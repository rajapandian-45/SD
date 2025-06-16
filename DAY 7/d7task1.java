import java.util.Arrays;

public class d7task1 {
	
	public static void bubblesort(int []sample){
		
		System.out.println("Before Sorting: " +Arrays.toString(sample));	
		
		for(int i=0;i < sample.length ;i++) {
			
			for(int j=0;j < sample.length -1;j++) {
				
				if(sample[j] > sample[j+1]) 
				{
				int temp=sample[j];
				sample[j] = sample[j+1];
				sample[j+1] = temp;
				}
			}
		}
		System.out.println("After Sorting: " +Arrays.toString(sample));
		}
	public static void main(String[] args) {
		
		int[] arr = {15,45,35,65,55};
		bubblesort(arr);
	}

}