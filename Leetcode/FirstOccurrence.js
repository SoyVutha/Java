const First_Occurrence=(haystack,needle)=>{
    if(needle.length===0) return 0;
    for(let i=0;i<haystack.length-needle.length;i++)
    {
        if(haystack.splice(i,i+needle.length)===needle)
            {
                return i;
            }   
    }
    return -1;
}