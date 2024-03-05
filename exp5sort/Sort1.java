import java.util.Scanner;
import java.util.Arrays;

class Sort1
{
   public static void main(String[] args)
   {
     System.out.println("Enter the size of the array : ");
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     String[] strings=new String[size];
     System.out.println("\n");
     System.out.println("********************");
          System.out.println("\n");
     System.out.println("Enter the elements : ");
     for(int i=0;i<size;i++)
     {
      strings[i]=sc.next();
      }
           System.out.println("\n");
           System.out.println("********************");
     System.out.println("\n");
     System.out.println("Enter the option :");
     int opt=sc.nextInt();
     System.out.println("\n1.In-built method\n2.User defined method\n");
     switch(opt)
     {
       case 1:
                Arrays.sort(strings);
                break;
                
                
                
       case 2: for(int i=0;i<size-1;i++)
       		  {
       		   for(int j=i+1;j<size;j++)
       		     {
       		       if(strings[i].compareTo(strings[j])>0)
       		         {
       		          
       		           String temp=strings[i];
       		           strings[i]=strings[j];
       		           strings[j]=temp;
       		           
       		           }
       		         }
       		       }
       		       break;
       default: System.out.println("\n***********Invalid Choice**********\n");
                break;
       		  
       		  }
       		  
       		  System.out.println("\n");
       		  System.out.println("********************");
       		  for(int a=0;a<size;a++)
       		  {
       		   System.out.println(strings[a]);
       		   }
       		 }
       		 }
                 
       
     
