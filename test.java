import java.util.Date;
import java.time.LocalDate;
public class test {
    public static void main(String[] args) {
        Movie movie1=new Movie("kuzularin sessziligi", "kuzu",MovieType.REGULAR);
        Date d=new Date(10,8,2000);
        Date a=new Date(11,9,2000);
        try{
            Rental rent=new Rental(movie1,a,d);
        }
        catch(IllegalArgumentException e){
            System.out.printf("exception %s",e.getMessage());
        }
    
    try{
            Rental rent=new Rental(movie1,d,a);
            System.out.println(MovieType.REGULAR.getRentalPrice);
        }
        catch(IllegalArgumentException e){
            System.out.printf("exception %s",e.getMessage());
        }
    }

}
