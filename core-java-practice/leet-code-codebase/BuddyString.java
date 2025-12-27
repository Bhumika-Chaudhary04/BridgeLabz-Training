package leetcode;
import java.util.*;
class BuddyString {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                d++;
            }
        }
        if(d==2){
            int i1=0;
            int i2=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=goal.charAt(i)){
                    i1=i;
                    break;
                }
            }
            for(int j=i1+1;j<s.length();j++){
                if(s.charAt(j)!=goal.charAt(j)){
                    i2=j;
                    break;
                }
            }
            if(s.charAt(i1)==goal.charAt(i2) && s.charAt(i2)==goal.charAt(i1)){
                return true;
            }
        }
        Set<Character> sh=new HashSet<>();
        for(int i=0;i<s.length();i++){
            sh.add(s.charAt(i));
        }
            if(d==0 && s.length()!=sh.size()){
                return true;

            }
        
        return false;

        
    }
}