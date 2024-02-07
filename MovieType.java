public enum MovieType {
    
        REGULAR(2.0),
        NEW_RELEASE(1.5),
        CHILDREN(1.0);
        private double rentalPrice;
        private MovieType(double rentalPrice){
            this.rentalPrice=rentalPrice;
        }

    
        public double getRentalPrice(){
            return this.rentalPrice;
        }
    

}
