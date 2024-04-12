/*
### Create a subArray & fills it from arr[0] to arr[i]
### Calculate their some  then total of these
*/


function sumSubArray(arr){
    let total =0;
    for(let i=0; i < arr.length; i++){
        //The line below create subArray & fills it from arr[0] to arr[i];
        let subArray = arr.slice(0, i + 1);
        let subTotal = 0;
        for(let j=0; j<subArray.length; j++){
            //The line below sort subArray in increasing
            subArray.sort((a,b) => (a-b));
            subTotal +=subArray[j]*(j+1);
        }
        total +=subTotal;
    }
    return total;
}
