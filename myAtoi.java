class Solution {
    public int myAtoi(String s) {
        int i = 0, answer = 0, sign = 1;
        if(s.length() == 0) return 0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i < s.length() && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(i < s.length() && s.charAt(i) == '+'){
            sign = 1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if ((answer > Integer.MAX_VALUE / 10) || (answer == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {       
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            answer = answer * 10 + digit;
            i++;
        }
        return answer * sign;
    }
}