import java.util.ArrayList;
import java.util.Scanner;
class Prod{
    String prodname;
    double qty;
    double cost;
    double gst;
    Prod(String prodname,double qty,double cost,double gst){
        this.prodname=prodname;
        this.qty=qty;
        this.cost=cost;
        this.gst=gst;
    }
}
class FinalBillCalc{
    double totPriceProd;
    double gstOfProd;
    FinalBillCalc(double cost,double qty,double gst){
        this.gstOfProd=(gst/100)*cost*qty;
        this.totPriceProd=cost*qty;
    }
}
public class Bill {
    static ArrayList<Prod> lst=new ArrayList<Prod>();
    static ArrayList<FinalBillCalc> fnl=new ArrayList<FinalBillCalc>();
    public static void enterBill(){
        Scanner sc=new Scanner(System.in);
        System.out.println("*****Enter the product details purchased by customer*****");
        System.out.println("Press 1 to print bill\nPress 0 to add prodcts");
        int ch=sc.nextInt();
        do{
            System.out.println("Enter product name");
            String name=sc.next();
            System.out.println("Enter Quantity");
            double qty=sc.nextDouble();
            System.out.println("Enter cost of product");
            double cost=sc.nextDouble();
            System.out.println("Enter GST of Product");
            double gst=sc.nextDouble();
            Prod p=new Prod(name,qty,cost,gst);
            lst.add(p);
            System.out.println("Press 1 to print bill\nPress 0 to add prodcts");
            ch=sc.nextInt();
        }while(ch!=1);
        printbill();
    }
    
    public static void printbill(){
        double priceOfShopping=0;
        double finalGST=0;
        double hasToPay=0;
        double offerDiscount=0;
        double maxGstPaidProd=Double.MIN_VALUE;
        String maxGstPaidProdName="";
        System.out.println("Sl.No\tProdName\tUnitPrice\tGST\tQuantity");
        for(int i=0;i<lst.size();i++){
            System.out.println(i+1+" "+lst.get(i).prodname+"\t"+lst.get(i).cost+"\t"+lst.get(i).gst+"\t"+lst.get(i).qty);
        }
        for(int i=0;i<lst.size();i++){
            FinalBillCalc f=new FinalBillCalc(lst.get(i).cost,lst.get(i).qty,lst.get(i).gst);
            fnl.add(f);
        }
        for(int i=0;i<fnl.size();i++){
            priceOfShopping += fnl.get(i).totPriceProd;
            finalGST += fnl.get(i).gstOfProd;
            maxGstPaidProd = Math.max(maxGstPaidProd, fnl.get(i).gstOfProd);
        }
        for(int i=0;i<fnl.size();i++){
            if(maxGstPaidProd==fnl.get(i).gstOfProd){
                maxGstPaidProdName=lst.get(i).prodname;
            }
        }
        hasToPay=priceOfShopping-finalGST;
        if(priceOfShopping>500){
            offerDiscount=0.05*priceOfShopping;
            hasToPay=hasToPay-offerDiscount;
        }
        System.out.println("\t\t\tTotal Price : "+priceOfShopping);
        System.out.println("\t\t\tGST On Bill : "+finalGST);
        System.out.println("\t\t\tDiscount of 5% Special Offer : "+offerDiscount);
        System.out.println("\t\t\tFinal Bill : "+hasToPay);
        System.out.println("Max GST Paid Product is : "+maxGstPaidProdName+"="+maxGstPaidProd);
    }
    public static void main(String[] args) {
        enterBill();
    }
}
