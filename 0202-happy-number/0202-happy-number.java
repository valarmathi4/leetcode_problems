class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int rem=0;
        int mul=1;
if(n==1 || n==7){
    return true;
}
else if(n<10){
    return false;
}
else{
    while(n>0){
        rem=n%10;
        mul=rem*rem;
        sum+=mul;
        n/=10;
    }
    return isHappy(sum);
}
    }
}