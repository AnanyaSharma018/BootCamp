package Array;


import java.util.Scanner;
class PreFixSum{
    public static void main(String [] args){
        System.out.println("Enter the size of array and then elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int prefix[] = new int[n];
        prefix[0] = 0;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i-1];
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = prefix[r]-prefix[l-1];
        System.out.println(sum);
        sc.close();
    }
}