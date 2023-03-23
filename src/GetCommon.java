public class GetCommon {
//    int[] nums1={1,2,3,4,5};
//    int[]nums2={2,7,8,9};
    public int getCommon(int[] nums1, int[] nums2) {     //nums1={2,3,4,5,23 95}, nums2={20,70,80,95}

            if(nums1[nums1.length-1]<nums2[0]){
                return -1;
            }

        int test=0;
          for(int i=0; i<nums2.length; i++){
              if(nums1[i]>=nums2[0]){
                  test=i;
                  break;
              }
          }
          for(int i=test; i<nums1.length; i++){
              for(int j=0; j<nums2.length; j++){
                  if(nums1[i]==nums2[j]){
                      return nums1[i];
                  }

              }
          }
          return -1;
    }
}
