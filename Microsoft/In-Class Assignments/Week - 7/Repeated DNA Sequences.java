class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet arr = new HashSet(), dumm = new HashSet();
        for(int i=0;i<s.length()-9;i++)
        {
            String str = s.substring(i,i+10);
            if(!arr.add(str))
            {
                dumm.add(str);
            }
        }
        return new ArrayList(dumm);
    }
}
