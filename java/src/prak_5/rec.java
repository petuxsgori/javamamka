package prak_5;

public class rec {

    public static String recur(String sl) {
        if(sl.length()!=0) {
            if (sl.charAt(0) == sl.charAt(sl.length() - 1)) {
                if(sl.length()>1) {
                    sl = sl.substring(1, sl.length() - 1);
                    return recur(sl);
                }
                else return "YES";
            }
        }
        else if(sl.length()==0) return"YES";
        return "NO";
    }
}

