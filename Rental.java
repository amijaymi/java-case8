import java.util.Date;


public class Rental {
    private Movie movie;
    private Date rentalDate;
    private Date dueDate;
    public Rental(Movie movie,Date rentalDate,Date dueDate){
        this.movie=movie;
        if(dueDate.compareTo(rentalDate)<=0){
            throw new ArithmeticException("due date should be forward");
        }
        this.rentalDate=rentalDate;
        this.dueDate=dueDate;
        
    } 
    public Movie get_movie(){
        return this.movie;
    }
    



}
