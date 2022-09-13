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
        return "Product: " + product + "\n" + "Qty: " + qty + "\n" + "Price: $" + price + "\n" + "Miles: " + miles + "\n" + "==========================";
    }

//    public double totalPrice(){
//        return
//    }

}
