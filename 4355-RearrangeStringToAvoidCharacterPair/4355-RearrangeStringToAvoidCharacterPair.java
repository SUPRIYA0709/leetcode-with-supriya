// Last updated: 13/08/2026, 15:51:24
class Solution {
    public String rearrangeString(String s, char x, char y) {
       StringBuilder ychars=new StringBuilder();
        StringBuilder otherChars=new StringBuilder();
        StringBuilder xChars=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==y){
                ychars.append(ch);
            }else if(ch==x){
                xChars.append(ch);
            }else{
                otherChars.append(ch);
            }
        }
        return ychars.append(otherChars).append(xChars).toString();
    }
}