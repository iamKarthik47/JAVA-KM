import java.util.Scanner;
class Product{
int pcode,price;
String pname;
Product(int pcode,String pname,int price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}

class Products{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Product Code : ");
int pcode=sc.nextInt();
System.out.println("Enter the Product name : ");
String pname=sc.next();
System.out.println("Enter the Product price : ");
int price=sc.nextInt();
Product[] ps=new Product[3];
ps[0]=new Product(pcode,pname,price);
ps[1]=new Product(123,"Notebook",10);
ps[2]=new Product(142,"PRACTICAL RECORD",5);
int minprice=ps[0].price;
System.out.println("===============");
System.out.println("Code\tProduct name\tPrice");
System.out.println("-------\t------\t------");
for(Product p:ps){
System.out.println(p.pcode+"\t"+p.pname+"\t"+p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}
System.out.println("=======================");
System.out.println("************************");
System.out.println("LOWEST COST PRODUCT");
System.out.println("------------------");
System.out.println("Code\tProduct Name\tPrice");
System.out.println("----\t------\t--------\t");

for(Product p:ps)
{
if(minprice==p.price)
{
System.out.println(p.pcode +"\t"+p.pname+"\t"+p.price);
}
}
System.out.println("**********************");
}
} 

