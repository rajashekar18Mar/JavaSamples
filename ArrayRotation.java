import java.util.Scanner;

class ArrayMethods {
	Scanner l_sc = new Scanner(System.in);

	void inArray(int arr[], int n) {
		System.out.println("Enter the Array Elements:");
		for (int i = 0; i < n; i++)
			arr[i] = l_sc.nextInt();
	}

	void outArray(int arr[], int n) {
		System.out.println("Array Elements are:");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	/*
	 * void copyToTemp(int temp[], int arr[],int x){ for(int i=0;i<x;i++)
	 * temp[i]=arr[i];
	 * 
	 * } void modifyArr(int arr[],int temp[],int n, int d){ for(int
	 * i=0;i<n-d;i++) arr[i]=arr[i+d]; for(int i=n-d,j=0;i<n;i++,j++)
	 * arr[i]=temp[j];
	 * 
	 * }
	 */

	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	void modifyUsingGcd(int arr[], int n, int d) {

		int temp = 0;
		int k = gcd(n, d);
		int j;
		while (d > 0)// (t<=d)
		{
			for (int i = 0; i < k; i++) {
				temp = arr[i];
				j = i;
				for (; (j + k) < n; j = j + k) {
					arr[j] = arr[j + k];
				}
				arr[j] = temp;

			}
			// t=t+k;
			d = d - k;
		}

	}

}

public class ArrayRotation {

	public static void main(String[] args) {
		ArrayMethods am = new ArrayMethods();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements in an Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		am.inArray(arr, n);
		System.out.println("Enter the no of Elements to rotate:");
		int d = sc.nextInt();
		am.modifyUsingGcd(arr, n, d);
		am.outArray(arr, n);
		/*
		 * int temp[]=new int[d]; am.copyToTemp(temp,arr,d);
		 * am.modifyArr(arr,temp,n,d);
		 * System.out.println("Elements in an Array after rotation: ");
		 * am.outArray(arr, n);
		 */

	}

}
