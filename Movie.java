public class Movie {
    private String title;
    private String barcode;
    private MovieType type;
    public Movie(String title,String barcode,MovieType type){
        this.title=title;
        this.barcode=barcode;
        this.type=type;
    }
    public MovieType getType(){
        return this.type;
    }
    public double getDailyPrice(double exchangeRate){
        return type.getRentalPrice()*exchangeRate;

    }
}
