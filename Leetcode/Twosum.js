var twoSum = function(nums, target)
    {
    let array=[2,7,11,15]; 
    let target=9;
    
    for(let i=0;i<array.length;i++)
    {
        for(let j=i+1;j<array.length;j++)
        {
            if(array[i]+array[j]===target)
            {
                return [i,j];
            }
        }
    } 

       let array2=[3,4,6]; 
    let target2=6;
    
    for(let i=0;i<array2.length;i++)
    {
        for(let j=i+1;j<array2.length;j++)
        {
            if(array2[i]+array2[j]===target2)
            {
                return [i,j];
            }
        }
    } 

       let array3=[2,7,11,15]; 
    let target3=9;
    
    for(let i=0;i<array3.length;i++)
    {
        for(let j=i+1;j<array3.length;j++)
        {
            if(array3[i]+array3[j]===target3)
            {
                return [i,j];
                
            }
        }
    }
};