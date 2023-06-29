package week1.day2;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		System.out.println(args[1]+args[2]);

		Arrays.sort(arr);
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		System.out.println(sum1);
		int sum2=0;

	for(int i=0;i<=8;i++) {
		sum2=sum2+i;
		
	}
	
	
	System.out.println(sum2);
	System.out.println("The missing element is:" +(sum2-sum1));
	}
}




