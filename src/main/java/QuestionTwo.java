public class QuestionTwo {
    public static void main(String[] args) {
        //create an array to store  each character letter of the alphabet (A-Z)
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //print character letter Y from array
        System.out.println(alphabet[24]); //26 letters in the alphabet - 1 to get the index position.
        //modify array to replace letter A with $ sign
        alphabet[0] = '$'; //replacing letter
        System.out.println(alphabet[0]); //checking to see if array updated
        //loop through to print every letter in array except letter y
        public String returningAlphabet(){

        }
        for(int indexPosition = 0; indexPosition < alphabet.length; indexPosition++){
            if (alphabet[indexPosition] ){
                System.out.println(alphabet[indexPosition]);
            }
        }
    }
}
