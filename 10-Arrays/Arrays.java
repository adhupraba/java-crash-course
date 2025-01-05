
class Arrays {

    public static void main(String[] args) {
        // ! SINGLE DIMENSION ARRAY
        int nums1[] = {1, 2, 3};
        System.out.println(nums1); // prints address

        int nums2[] = new int[4];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        System.out.println("length of nums2 => " + nums2.length);
        System.out.println("nums2[3] => " + nums2[3]); // prints 0

        nums2[3] = 4;

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        // ! MULTI DIMENSION ARRAY
        int nums3[][] = new int[2][3];

        // traditional for loop to loop over arrays
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3[i].length; j++) {
                nums3[i][j] = (int) (Math.random() * 100);
            }
        }

        // enhanced loop syntax for looping over arrays
        for (int n[] : nums3) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
