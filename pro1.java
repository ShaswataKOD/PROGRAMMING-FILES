/*this file aims at clearing all the basics of the operations of a Data structure  */
// Array 



import java.util.*;


public class pro1
{
    public static void main(String[] args)
     {
        arraydel obj=new arraydel();    
        // subclass object can call superclass method adn variables
      
        // obj.arraysum1();
        // arraysum obj =new arrayinsert();
         
        obj.insertelement();
        obj.arraydelete();

       






     }
}



 class arraysum
{
    public void arraysum1()
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int A[]=new int[n];
         
        // initializing the array 
         for(int i=0;i<n;i++)    
        {
            A[i]=sc.nextInt();      
            sum=sum+A[i];           // adding the elements of an array
        }

        System.out.println(sum);
        sc.close();
     }
}





class arrayinsert extends arraysum

{
   public void  insertelement()
    {

        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n= sc.nextInt();


        System.out.println("Enter the array element to be inserted and the position ");
         
        int pos=sc.nextInt();
        int key= sc.nextInt();

       // int B[] = new int[n];
        int A[] = new int[n+1];


        System.out.println("Enter the array elements");

        for (int i = 0; i < n ; i++) 
        {

            A[i]=sc.nextInt();
        }

        for(int i = (n-1); i >= (pos-1); i--)
        {
            A[i+1] = A[i];
        }
        A[pos-1] = key;
        System.out.print("After inserting:");
        for(int i = 0; i < n+1; i++)
        {
            System.out.println(A[i]);

        }
         
         sc.close();
    }
}

class arraydel extends arrayinsert
{
    public void arraydelete()
    {
        int n, x, flag = 1, loc = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to delete:");
        x = s.nextInt();
        for (int i = 0; i < n; i++) 
        {
            if(a[i] == x)
            {
                flag =1;
                loc = i;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            for(int i = loc+1; i < n; i++)
            {
                a[i-1] = a[i];
            }
            System.out.print("After Deleting:");
            for (int i = 0; i < n-2; i++) 
            {
                System.out.print(a[i]+",");
            }
            System.out.print(a[n-2]);
        }
        else
        {
            System.out.println("Element not found");
        }
        s.close();


    }




}



























