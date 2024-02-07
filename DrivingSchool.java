//import week10.labsorulari.MyException;
public class DrivingSchool{
    private String name;
    private double price;
    public DrivingSchool(String name,double price){
        this.name=name;
        if(price<0){
            throw new ArithmeticException("price cant be neagtive");
        }
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double value){
        if(value>=0){
            this.price=value;
        }
        else{
            throw new ArithmeticException("price cant be neagtive");
        }
    }
    public double getPrice(){
        return this.price;
    }
    public boolean register(int age) throws MyException{
        if (age<18){
            //throw new IllegalArgumentException("You are not old enough to register");
            throw new MyException("You are not old enough to register");
        }
        else{
            return true;
        }
    }
}