import java.util.*;
import java.lang.*;

/*class ProdNamePrice{
    String pname;
    double price;

    public void getprice(){
        System.out.println("Product name "+this.pname);
        System.out.println("Price "+this.price);
    }

    public void discount(){
        double dis =0.1*price;
        System.out.println("discount on product is "+dis);
        System.out.println("total price after discount "+(price-dis));
    }
    public void gst(){
        double dis =0.1*price;
        double totalPrice=(price-dis);
        double gstcal = 0.7*totalPrice;
        System.out.println("Total GST is"+gstcal);
        System.out.println("Final Price is "+(totalPrice+gstcal));
    }
}*/



public class Supermarket{
    public static void billInput(int n) {
        String prodsName[]=new String[n];
        double prodPrice[]=new double[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Enter prod name ");
            prodsName[i]=sc.next();
            System.out.println("Enter price");
            prodPrice[i] = sc.nextDouble();
        }
        System.out.println("PRODUCT NAME\tPRICE");
        for(int i=0;i<n;i++){
            System.out.println(prodsName[i]+"\t"+prodPrice[i]);
        }
        double totalPrice=0;
        double totaldis;
        double gstcal;
        for(int i =0; i<n;i++){
            totalPrice += prodPrice[i];
        }
        System.out.println("Total Price is "+totalPrice);
        totaldis = 0.1*totalPrice;
        System.out.println("Total Discount is "+totaldis);
        System.out.println("Total price after discount is "+(totalPrice-totaldis));
        gstcal=0.7*totalPrice;
        System.out.println("Total GST onbill "+gstcal);
        System.out.println("Final Bill is "+(totalPrice+gstcal));
    }
    public static void main(String[] args) {
        /*ProdNamePrice p1 = new ProdNamePrice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter products ");
        p1.pname=sc.next();
        System.out.println("Eneter price");
        p1.price=sc.nextDouble();
        p1.getprice();
        p1.discount();
        p1.gst();*/
        Scanner s = new Scanner(System.in);
        System.out.println("SUPER MARKET BILL");
        System.out.println("Enter the number of products ");
        int n = s.nextInt();
        billInput(n);  
    }
}