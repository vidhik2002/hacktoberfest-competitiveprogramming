import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rearrange_array {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        //testcases
        int t =Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            //size of array
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[(int)n];

            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[(int)i]  =Integer.parseInt(st[(int)i]);

            //calling arrange() function
            new Rearrange().arrange(arr, n);

            //printing the elements
            for(int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Rearrange
{

    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        long maxele=n;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[(int) arr[i]] % maxele) * maxele;
        }
            for (int j = 0; j < n; j++) {
                arr[j]/=maxele;
            }


    }
}
