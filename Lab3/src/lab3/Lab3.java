
package lab3;
public class Lab3 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0,n=2; i<10; n=n+2,i++){
            arr[i]=n;
	}
	for(int i=0; i<10; i++) {
            System.out.print(arr[i]+" ");
	}
            System.out.println();
	for(int i=0; i<10; i++) {
            System.out.println(arr[i]);               
        }
    }
}
