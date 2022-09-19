package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {

        int[] arr1={0,1,2,3,4};
        int[] arr2={0,1,2,2,1};

        int[] arr3={1,2,3,4,0};
        int[] arr4={0,1,2,3,0};

        int[] arr5={1};
        int[] arr6={0};


        System.out.println(Arrays.toString(arr3(arr1,arr2)));
        System.out.println(Arrays.toString(arr3(arr3,arr4)));
        System.out.println(Arrays.toString(arr3(arr5,arr6)));


    }

    static int[] arr3(int[] nums1, int[] nums2){

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0 ; i<nums1.length; i++)
        {
            list.add(nums2[i],nums1[i]);
        }
        int[] ans = new int[list.size()];
        for(int j=0 ; j<list.size(); j++){
            ans[j] = list.get(j);
        }
        return ans;

        }
    }


