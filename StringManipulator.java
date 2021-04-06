

public class StringManipulator{
    public String trimAndConcat(String firstWord, String secondWord){
        String firstString = firstWord.trim();
        String secondString = secondWord.trim();
        String concatenatedString = firstString + secondString;
        return concatenatedString;
    }

    public Integer getIndexOrNull(String string, char letter){
        String word = string;
        char stringLetter = letter;
        int index = word.indexOf(stringLetter);
        if(index > 0){
            return index;
        }
        else{
            return null;
        }
    }

    public Integer getIndexOrNull(String string, String subString){
        String firstWord = string;
        String secondWord = subString;
        int index = firstWord.indexOf(secondWord);
        if(index > 0){
            return index;
        }
        else{
            return null;
        }
    }

    public String concatSubstring(String firstString, int startingIndex, int endingIndex, String secondString){
        String firstWord = firstString;
        String secondWord = secondString;
        String subString = firstWord.substring(startingIndex, endingIndex);
        String concatenatedString = subString + secondWord;
        return concatenatedString;
    }

}