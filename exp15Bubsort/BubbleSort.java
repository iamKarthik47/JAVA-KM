import java.util.*;


class BubbleSort{

public static <T>T[] BSMethod(T[] arr,int n){

String s1,s2;
for(int i=0;i<n-1;i++){
   for(int j=0;j<n-i-1;j++){
	
	s1=arr[j].toString();
	s2=arr[j+1].toString();
	
	if(s1.compareTo(s2)>0)
		{
		
			T temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			
		}
	      }
	      }
	      return arr;
	     }
	     
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the no of values : ");
	n=sc.nextInt();
	System.out.println("********************");
	String s[]=new String[n];
	for(int i=0;i<n;i++){
	   s[i]=sc.next();
	   }
	   
	System.out.println("The Array before sorting : ");
	for(int i=0;i<n;i++)
	{
	 System.out.println(s[i]);
	 }
	BubbleSort b=new BubbleSort();   
	s=b.<String>BSMethod(s,n);
	
	System.out.println("After Sorting : ");
	for(int i=0;i<n;i++){
	     System.out.println(s[i]);
	     }
	     }
	     }

