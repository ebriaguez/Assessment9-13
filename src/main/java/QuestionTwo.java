public class QuestionTwo {
    public static void main(String[] args) {
        //A: create an array to store  each character letter of the alphabet (A-Z)
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //B: print character letter Y from array
        System.out.println(alphabet[24]); //26 letters in the alphabet - 1 to get the index position.
        //C: modify array to replace letter A with $ sign
        alphabet[0] = '$'; //replacing letter
        System.out.println(alphabet[0]); //checking to see if array updated
        //attempt to print letter y again
        System.out.println(alphabet[24]);
        //loop through to print every letter in array except letter y
        for(int indexPosition = 0; indexPosition < alphabet.length; indexPosition++){
            //created an IF statement loop through and print every element except 'Y
            if(alphabet[indexPosition] != 'Y'){
                System.out.println(alphabet[indexPosition]);
            }
        }
    }
}
