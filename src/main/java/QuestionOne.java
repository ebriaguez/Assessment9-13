import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class QuestionOne {
    /*

    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     Distance 	   = Fee
    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     0 -  4 miles  = $2
	     5 - 15 miles  = $5
	    16 - 25 miles  = $10
	    26 - 50	miles  = $15
	More than 50 miles = $20


     Given the data below. Your should should return the value below
         ________________________________________________

Invoke the method twice with the sample data below

Product:Rice
Qty:20
Price $5.0
Miles:10
===============
Total: $105.0

Product:Beans
Qty:10
Price $2.0
Miles:30
===============
Total: $35.0


 */

    public static void main(String[] args) {
        String totalMessage = "Total: $";
        QuestionOneReturn productOne = new QuestionOneReturn("Rice", 20, 5.0, 10);
        System.out.println(productOne.information());
        System.out.println(totalMessage + productOne.totalPrice());

        QuestionOneReturn productTwo = new QuestionOneReturn("Beans", 10, 2.0, 30);
        System.out.println(productTwo.information());
        System.out.println(totalMessage + productTwo.totalPrice());

        QuestionOneReturn productThree = new QuestionOneReturn("Chicken", 5, 3.5, 45);
        System.out.println(productThree.information());
        System.out.println(totalMessage + productThree.totalPrice());
    }
}
