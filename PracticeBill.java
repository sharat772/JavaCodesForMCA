import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product{
    String productName;
    double price;
    double gst;
    double qty;
    double productGst;
    double finalProdPrice;
    Product(String name,double price,double gst,double qty){
        this.productName=name;
        this.price=price;
        this.gst=gst;
        this.qty=qty;
        this.productGst=(gst/100)*price;
        this.finalProdPrice=price+productGst;
    }
}

public class PracticeBill {
    static List<Product> prodInfo=new ArrayList<Product>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 to add product\nEnter 1 to printbill");
        int ch=sc.nextInt();
        do{
            System.out.println("Enter product name");
            String name=sc.next();
            System.out.println("Enter price of product");
            double price=sc.nextDouble();
            System.out.println("Enter product GST");
            double gst=sc.nextDouble();
            System.out.println("Enter Quantity");
            double qty=sc.nextDouble();
            Product p=new Product(name, price, gst, qty);
            prodInfo.add(p);
            System.out.println("Enter 0 to add product\nEnter 1 to printbill");
            ch=sc.nextInt();
        }while(ch != 1);
        printBill();
    }
    public static void printBill(){
        System.out.println("*****Invoice*****");
        double total=0;
        double maxGst=0;
        double discount=0;
        double finalPrice=0;
        String maxGstProdName="";
        for(Product p:prodInfo){
            total += p.finalProdPrice*p.qty;
            maxGst=Math.max(maxGst, (p.productGst*p.qty));
            if(maxGst==p.productGst){
                maxGstProdName=p.productName;
            }
            System.out.println(p.productName+"\t"+p.price+"\t"+p.gst+"\t"+p.qty+"\t"+p.finalProdPrice);
        }
        if(total>500){
            discount=0.05*total;
            finalPrice=total-discount;
        }
        System.out.println("Total Bill = "+total);
        System.out.println("Discount on Purchase = "+discount);
        System.out.println("Maximum GSt product = "+maxGstProdName+"  =  "+maxGst);     
        System.out.println("Has to pay = "+finalPrice);  
    }
}
