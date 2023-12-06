class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> list = new ArrayList<>();
    for(int i =left ; i<= right;i++)
        if(isDivide(i))
            list.add(i);
    return list;

}

boolean isDivide(int x )
{
    int temp = x;
    while(x!=0)
    {
        int rem = x%10;
        if(rem == 0 || temp%rem!=0)
            return false;
        x /=10;
    }
    return true;
}
    
}