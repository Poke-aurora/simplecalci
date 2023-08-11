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
