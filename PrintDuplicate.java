package week2.day2;

public class PrintDuplicate {
	public static void main(String[] args) {
		
		int[] arr= {14,13,12,11,14,12,13,15,16};
		int length= arr.length;
		System.out.println(length);
		System.out.println("------");
		
		for(int i=0; i<arr.length;i++) {
			int count=1;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr[i]);
			}
			
		}
	}

}
