package leetcode;
class PowerOfTwo{
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n1 = 16;
        int n2 = 18;
        System.out.println(n1 + " is power of two: "+isPowerOfTwo(n1));
        System.out.println(n2 + " is power of two: "+isPowerOfTwo(n2));
    }
}
