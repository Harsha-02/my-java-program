import java.util.Scanner;
public class Linearsearch
{
    public static void main(String args[])
    {
        int n,key,i,found=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the searching element");
        key=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                found=1;
                break;
            }
        }
        if(found==1)
        {
            System.out.println("element found at "+(i+1)+" th position ");
        }
        else
        {
            System.out.println("element not found ");
        }
    }
}
