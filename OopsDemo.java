class Pen{
    String color;
    String type;//ball;gel
    int quantity;
    public void write(){
        System.out.println("Writing something");
    }

    Pen(String color,String type){
        this.color=color;
        this.type=type;
    }

    Pen(String color,String type,int quantity){//constructor dosent return anything 
        this.color=color;
        this.type=type;
        this.quantity=quantity;
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
    public void printQuatity(){
        System.out.println(this.quantity);
    }
}

class Stud{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Stud(){//non parameterized
        System.out.println("Student constructor called");
    }

    Stud(String name,int age){//parametrized constructor
        this.name=name;
        this.age=age;
    }

    Stud(Stud s2){//copy constructor
        this.name=s2.name;
        this.age=s2.age;
    } 

}

class MarvelCharater{
    //polymorphisum 2 types compile time and runtime
    //same function for different purposes
    //compiletime is below example
    String name;
    String power;
    int age;

    public void printDetails(String name){
        System.out.println(name);
    }

    public void printDetails(String name,String power){
        System.out.println(name+" "+power);
    }

    public void printDetails(int age){
        System.out.println(age);
    }

    MarvelCharater(String name,String poower,int age){
        this.age=age;
        this.name=name;
        this.power=poower;
    }

}

//inheritance
class Shape{
    String color;
}
class Triangle extends Shape{
    public void printColor(){
        System.out.println("Triangle color "+this.color);
    }
}

public class OopsDemo {
    public static void main(String[] args) {
        Pen p1=new Pen("Black","Ball");
        // p1.color="black";
        // p1.type="ball";
        p1.write();
        System.out.println("Color is "+p1.color+"\nType is "+p1.type);
        p1.printColor();
        p1.printType();
        Pen p2=new Pen("Blue", "Gell");
        p2.write();
        p2.printColor();
        p2.printType();
        Pen p3=new Pen("Black", "Ball", 10);
        p3.write();
        p3.printQuatity();
        Stud s=new Stud();
        s.name="Sharat";
        s.age=22;
        s.printInfo();
        Stud s2=new Stud("Groot", 2);
        s2.printInfo();
        Stud s3 =new Stud(s2);
        s3.printInfo();
        MarvelCharater m1=new MarvelCharater("Groot","Growth",2);
        m1.printDetails(m1.name);
        m1.printDetails(m1.name,m1.power);
        m1.printDetails(m1.age);
        Triangle t1=new Triangle();
        t1.color="red"; 
        t1.printColor();
    }
}
