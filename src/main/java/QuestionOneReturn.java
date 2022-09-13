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
        for(int x = this.miles; x <= 50; x++){
            if(x > 0 && x <= 4){
                return (this.qty * this.price) + 2;
            }

            if (x >= 5 && x <= 15){
                return (this.qty * this.price) + 5;
            }

            if (x >= 16 && x <= 25){
                return (this.qty * this.price) + 10;
            }

            if (x >= 26 && x < 50){
                return (this.qty * this.price) + 15;
            }

            if (x >= 50){
                return (this.qty * this.price) + 20;
            }
        }
        return startMile;
    }
}
