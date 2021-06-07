class Solution {
    public int getSum(int a, int b) {
        int c ;
        //x or gives perfect answer other than query 
        // to overcome query we using and and shifting left to 1 so we get proper result until carry is zero
        while(b != 0){
            c = a&b;
             a= a^b;
            b = c<<1;
        }
        return a;
    }
}