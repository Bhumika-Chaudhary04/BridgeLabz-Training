package leetcode;
class StringCompression {
    public int compress(char[] chars) {
         int c=0;
       char cha='@';
      StringBuilder s=new StringBuilder();
      for(char ch:chars){
        if(c==0){
            s.append(ch);
            c++;
            cha=ch;
        }
        else if(cha==ch){
            c++;
        }
        else{
            if(c!=1){
                s.append(c);
            }
            c=1;
            s.append(ch);
            cha=ch;
            
        }
      }
      if(c!=1)
      s.append(c);
      int n=s.toString().length();
     for(int i=0;i<n;i++){
        chars[i]=s.charAt(i);
     }
      return n;
    }

}