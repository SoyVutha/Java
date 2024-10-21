const Remove_Element=(array,target)=>{
    let duck=[];
    if(array.length===0) return 0;

    for(let i=0;i<array.length;i++)
    {
        if(array[i]!==target)
        {
            duck.push(array[i]);
        }
    }

    for(let i=duck.length;i<array.length;i++)
    {
        duck.push("_");
    }

    return duck;

}

const Remove_Base_element=(array,target)=>{
    let quack=[];
    if(array.length===0) return 0;
    for(let i=0;i<array.length;i++)
    {
        if(array[i]!=target)
        {
            quack.push(array[i]);
        }
    }
    for(let i=quack.length;i<array.length;i++)
    {
        quack.push("_");
    }
    
}