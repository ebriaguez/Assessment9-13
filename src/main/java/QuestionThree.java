public class QuestionThree {
    //Create a while loop to print every double digit number
    //starting from 20 down to 0
    //but stops printing #s once it gets to single digit number
    public static void main(String[] args) {
        //Step 1 - create a variable to store the start number
        int end = 20;
        //Step 2 - create a while loop
        while (end >= 0){
            //Step 3 - an IF statement to print out numbers that are greater than and = to 10
            if (end >= 10)
            System.out.println(end);
            end--;
        }
    }
}

