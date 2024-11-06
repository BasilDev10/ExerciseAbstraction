public class Movie extends Product {
    private String director;
    public Movie(){

    }
    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public double getDiscount() {
        double discountPersantage = (((double) 20 / 100) + 1);
        double discount = super.getPrice() / discountPersantage;
        return discount;
    }
    @Override
    public String toString() {
        return super.toString()+"\ndirector: "+director+"\nDiscount: "+getDiscount();
    }
}
