package wims_2017.ses3;

public class MyChaining {
    
    public MyChaining(){
        System.out.println("In default constructor...");
    }
    public MyChaining(int i){
        this();
        System.out.println("In single parameter constructor...");
    }
    public MyChaining(int i,int j){
        this(j);
        System.out.println("In double parameter constructor...");
    }
     
    public static void main(String [] args){
        //MyChaining ch = new MyChaining(10,20);
        MyChaining ch = new MyChaining(10);
}
}