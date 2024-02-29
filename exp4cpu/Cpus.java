import java.util.Scanner;

class Cpu{

      int price=40000;
      
      class Processor{
             
             int cores=8;
             String manufacturer="INTEL";
             
             void display(){
                    
                    System.out.println("No of cores : "+cores);
                    System.out.println("Manufacturer is : "+manufacturer);
                    }}
                    
         void display(){
                      System.out.println("Price is : "+price);
                      Processor p=new Processor();
                      p.display();
                      }
                      
         static class Ram{
                   int memory=8;
                   String manufacturer="8bit";
                    void display(){
                            System.out.println("Memory is : "+memory);
                            System.out.println("manufacture is :"+manufacturer);
                   }
           }
          }
          
         class Cpus{
             
                public static void main(String[] args){
                Cpu c=new Cpu();
                c.display();
                Cpu.Ram r1=new Cpu.Ram();
                r1.display();
                
                }}             
