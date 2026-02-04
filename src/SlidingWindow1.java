public class SlidingWindow1 {
    //array=[2,1,5,1,3,2];
    //k=3
    public static void main(String[] args) {
//        System.out.println("hi");
        int [] arr={2,1,5,1,3,2};
        int k=3;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int maxSum=windowSum;
        for(int right=k;right<arr.length;right++) {
            windowSum += arr[right];
            windowSum -= arr[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }

//    public static void main(Integer[] args) {
//        int a=10;
//        int b=20;
//        int c=a+b;
//        System.out.println(c);
//    }
}