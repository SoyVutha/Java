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

var RemoveDuplicate =function(nums){
    if(nums.length===0) return 0;
    let Array=[];
    for(let i=0;i<nums.length;i++)
    {
        if(!Array.includes(nums))
        {
            Array.push(nums[i]);
        }
    }

    for(let i=Array.length;i<nums.length;i++)
    {
        Array.push("_");
    }

    for(let i=0;i<Array.length;i++)
    {
        nums[i]=Array[i];
    }

}