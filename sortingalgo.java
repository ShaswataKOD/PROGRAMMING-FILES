import java.util.*;

//import javax.security.auth.kerberos.KeyTab;





public class sortingalgo
{
public static void main(String[] args) 
{   

    sort obj =new sort();
   // obj.selectionsort();
   // obj.bubblesort();
    obj.insertionsort();
   // obj.quicksort();
   // obj.mergesort();

}

}




/*
// All the sorting is in ascending order

 * insertion sort
 * selection sort 
 * bubble sort
 * merge sort
 * quick sort
 */




 /*abstract class planner
 {
     abstract void insertionsort();
     abstract void selectionsort();
     abstract void bubblesort();
     abstract void mergesort();
     abstract void quicksort();
 }*/





 class sort
 {
    Scanner sc=new Scanner(System.in);

    public void insertionsort()         //ascending order 
    {

      //  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int key;
        int A[]=new int[n];
        for(int i=1;i<n;i++)
        {
            A[i]=sc.nextInt();      //initialising the array
            int key= A[i] ;      // storing the elements of the array of i th iteration in a varible for swapping
            int j=i-1;

            while(j>=0 && A[j]>=key)
            {
                
                A[j+1]=A[j];
                j=j-1;

            }
            A[j+1]=key;                 //storing the valueof the key if lower in the lower index and moving the                            higher valie to higher index
        }

        System.out.println("Array after sorting ");
        for(int i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
        
    }





    public void selectionsort()
    {   


        int n=sc.nextInt();
        //int key;
        int A[]=new int[n];


        for(int i=0;i<n;i++)
        {
            
            A[i]=sc.nextInt(); 
            int  min_index=i;
            for(int j=i+1;j<n;j++)
            {
              
                if(A[j]<A[min_index])
                {
                   
                    min_index=j;
                    int temp=A[min_index];
                    A[min_index]=A[i];
                    A[i]=temp;   
                }
            }
          
          
            System.out.println("The array after sorting is ");
            for(i=0;i<n;i++)
            System.out.println(A[i]);
        } 



    }
   
   
   
   
   
    public void bubblesort()
    {

       


    }


    public int  mergesort()
    {




        return 0;
        
    }



    public String quicksort()
    {




        return "New programme";
    }
}








 
