package start.lesson5;

public class ForI {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for (int i = 0; i < 3  ; i++) {
//            System.out.println(nums[i]);

        }
        int[] nums1 = {2,3,4,5,7,8};
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i] %2 == 0){
                System.out.println(nums1[i]);
            }

        }
        System.out.println("-------------");
        for(int num: nums1){
            if(num % 2 == 1){
                System.out.println(num);
            }
        }
        System.out.println("-------------");
        for (int i = 0; i < nums1.length ; i++) {
            if(i % 2 ==0){
                System.out.println(i + "i");
                System.out.println(nums1[i]);
            }
        }

    }
}
