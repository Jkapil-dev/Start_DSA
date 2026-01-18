package Questions;
//Write a linear search function that works with a character array (e.g., search a letter in a word).
public class CharacterArray {
    public static void main(String[] args){
        String word="character";
        char[] characterArray=word.toCharArray();
        int answer=linearSearchCharacter(characterArray,'a');
        if(answer!=-1){
            System.out.println(" character  is at index: "+answer);
        }
       else {
            System.out.println("Character not found");
        }
    }
    static int linearSearchCharacter(char[] array,char targetElement){
        // check for each element in array=targerElement
        for (int index = 0; index <array.length ; index++) {
            if(array[index]==targetElement){
                return index;
            }
        }
        return -1;
    }
}
