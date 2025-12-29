package leetcode;
class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] ch=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            sb.append(ch[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}