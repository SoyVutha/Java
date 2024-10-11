var removeDuplicates = function(nums) {
    if (nums.length === 0) return 0;
   

    let array = [];
    
    for (let i = 0; i < nums.length; i++) {
        if (!array.includes(nums[i])) {
            array.push(nums[i]);
        }
    }
    
  
    for (let i = array.length; i < nums.length; i++) {
        array.push("_");
    }

  
    for (let i = 0; i < nums.length; i++) {
        nums[i] = array[i];
    }

  
};