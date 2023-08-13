class Solution {
    public int lengthOfLastWord(String s) {
       s =s.trim();
        int lastspaceindex =s.lastIndexOf(' ');
        if(lastspaceindex ==-1){
            return s.length();
        }
        return s.length() -lastspaceindex-1;
        }
    }
note:
lastIndexOf(char ch, int beg) : This method returns the index of the last occurrence of the character
in the character sequence represented by this object that is less than or equal to beg, or -1 if the character does not occur before that point.
