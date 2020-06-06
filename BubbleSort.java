package Sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
	
	int[] arr= {13,45,56,33,2,6};
	int temp;
	for(int i=0;i<arr.length;i++) {
		
		int flag=0;
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0) {
			break;
		}
	}
	for(int a:arr){
		System.out.print(a+" ");
	}
	
	}
	
}
