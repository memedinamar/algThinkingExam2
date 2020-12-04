public class minimumASCIIMethod{
    public static int minimumASCII(String str1, String str2){
        int sum = 0;
        if (str1.equals(str2)){
            return 0;
        }
        if(str1.length() == 0 || str2.length() == 0){
            return 0;
        }
        char char1 = str1.charAt(0);
        char char2 = str2.charAt(0);
        if(str1.length() >= str2.length()){
            if(char1 != char2){
                if(str2.indexOf(str1.charAt(0))== -1){
                    sum+= (int)str1.charAt(0) + minimumASCII(str1.substring(0), str2);
                }
                sum += minimumASCII(str1.substring(0), str2);
            }
        }else{
            if(char2 != char1){
                if(str1.indexOf(str2.charAt(0))== -1){
                    sum = (int)str2.charAt(0) + minimumASCII(str1, str2.substring(0));
                }
                sum += minimumASCII(str1, str2.substring(0));
            }
        }
        return sum;
    }
}