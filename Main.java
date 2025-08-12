class Main{
    public static void main(String[] args){
        int[] nums={23,45,1,2,8,18,-13,16};
        int target=18;
        int ans=linearsearch(nums,target);
        boolean ans1=linearsearch1(nums, target);
        System.out.println(ans);
        System.out.println(ans1);
    }
    static boolean linearsearch1(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int ele:arr){
            if(ele==target){
                return true;
            }
        }
        return false;
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int ele:arr){
            if(ele==target){
                return ele;
            }
        }
        for(int index=0;index<arr.length;index++){
            int ele=arr[index];
            if(ele==target){
               return index;
            }
        }
        return Integer.MAX_VALUE;
} 
}  
