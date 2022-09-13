public class QuestionOneReturn {
    //declaring my variables
    public String product;
    public int qty;
    public double price;
    public int miles;
    public double total;

    //parametrize constructor
    public QuestionOneReturn(String product, int qty, double price, int miles){
        this.product = product;
        this.qty = qty;
        this.price = price;
        this.miles = miles;
    }

    //creating a method to return the info and total
    public String information(){
        return "Product: " + this.product + "\n" + "Qty: " + this.qty + "\n" + "Price: $" + this.price + "\n" + "Miles: " + this.miles + "\n" + "==========================";
    }

    public double totalPrice(){
        int startMile = 0;
        for(int x = startMile; startMile <= 50; startMile++){
            if(startMile > 0 && startMile <= 4){
                return (this.qty * this.price) + 2;
            } else if (startMile >= 5 && startMile <= 15){
                return (this.qty * this.price) + 5;
            } else if (startMile >= 16 && startMile <= 25){
                return (this.qty * this.price) + 10;
            } else if (startMile >= 26 && startMile < 50){
                return (this.qty * this.price) + 15;
            } else if (startMile >= 50){
                return (this.qty * this.price) + 20;
            }
        }
        return startMile;
    }
}
