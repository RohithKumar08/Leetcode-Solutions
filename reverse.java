class Solution {
    public int reverse(int x) {
        long num = 0; 
        int flag = 0;
        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return 0;
        while(x != 0){
            if(x % 10 == 0 && flag == 0){
                x /= 10;
            } 
            else{
                flag = 1;
                num = (num * 10) + x % 10;
                x /= 10;
            } 
        }
        if(num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) return 0;
        return (int)num;
    }
}