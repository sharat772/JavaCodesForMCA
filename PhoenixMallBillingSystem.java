// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  


class Product{
    
    private int Product_Number,Quantity;
    private double Product_Cost;
    
    static double Current_Price;
    static double Final_Price;
    
    public Product(int Product_Number,double Product_Cost,int Quantity){
        this.Product_Number = Product_Number;
        this.Product_Cost = Product_Cost;
        this.Quantity = Quantity;
        
        Current_Price = Product_Cost * Quantity;
        Final_Price += Current_Price;
    }
    
    public int getProduct_Number(){
        return Product_Number;
    }
    
    public double getProduct_Cost(){
        return Product_Cost;
    }
    
    public int getQuantity(){
        return Quantity;
    }
    
    public void display(){
        System.out.println(Product_Number+" \t\t\t "+Product_Cost+" \t\t\t "+Quantity+" \t\t\t "+Current_Price);
    }
}

class PhoenixMallBillingSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int choice;
        int Product_Number;
        double Product_Cost;
        int Quantity;
        char Customer_Type;
        double Final_Price;
        int Discount=0;
        
        List<Product> product = new ArrayList<Product>();
        do{
            System.out.println("******Phoenix Mall Billing System ******");
            System.out.println("1. New Bill");
            System.out.println("2. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            
            if(choice == 2)
                break;
            
            System.out.print("Enter Customer Type (R/S) : ");
            Customer_Type = sc.next().charAt(0);
        
            while(Customer_Type!='R' && Customer_Type!='S'){
                System.out.println("Enter valid customer type!");
                System.out.print("Enter Customer Type (R/S) : ");
                Customer_Type = sc.next().charAt(0);
            }
            
            while(true){
                System.out.print("Enter Product Number or 0 to exit : ");
                Product_Number = sc.nextInt();
                if(Product_Number == 0)
                    break;
                    
                System.out.print("Enter Product Cost per unit : ");
                Product_Cost = sc.nextDouble();
                while(Product_Cost<=10){
                    System.out.println("Enter valid product cost per unit!");
                    System.out.print("Enter Product Cost per unit : ");
                    Product_Cost = sc.nextDouble();
                }
                
                System.out.print("Enter Quantity : ");
                Quantity = sc.nextInt();
                while(Quantity<1 || Quantity>100){
                    System.out.println("Enter Valid Quantity between 1 & 100!");
                    System.out.print("Enter Quantity : ");
                    Quantity = sc.nextInt();
                }
                
                product.add(new Product(Product_Number,Product_Cost,Quantity));
            }
            
            Final_Price = Product.Final_Price;
            
            if(Product.Final_Price > 1000){
                Discount +=5;
            }
            
            if(Customer_Type=='S'){
                Discount += 10;
            }
            
            
            Final_Price = Final_Price - ((Final_Price/100) * Discount);

            System.out.println("\n\n********** PHOENIX MALL BILL **********\n");
            System.out.println("Product Number \t Product Cost \t Quantity \t Total");
            System.out.println(Discount);

            for (Product p : product)   
            {  
                p.display();  
            }  
            
            System.out.println("\t\t\t\tTotal Discount : "+Discount+"%\n\t\t\t\tTotal Bill Amount : "+Final_Price+"\n\n");
            
            
        }while(choice==1);
        
        System.out.println("\n\nThank You for Shopping at Phoenix Mall :) \n\n\n");
    }
}