class ArrayDemo {
	public static void main(String ar[]){
	
	int[] nums = {3,5,666,1,7,8,9,0,4};
	int max=nums[0];
	for(int i = 0 ; i < nums.length ; i++){
		for(int j = 0; j< nums.length-1; j++){
			if(nums[j] > nums[j+1]){
		                             int temp = nums[j];
			          nums[j] = nums[j+1];
			          nums[j+1] = temp;
			}
		     }
		
	         }
	

	for(int i : nums){
		System.out.println(i);
	}

	
	}
}