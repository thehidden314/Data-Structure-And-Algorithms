/*
### Calc of total array items without using reduce method;
*/


function rArray(arr, init){
    var tArray = init + arr[0];
    for(let i=1; i<arr.length; i++){
        tArray += arr[i];
    }
    return tArray;
}
/*
var arr = [1,2,3,4];

var res ='Reduce is : '+ rArray(arr, 100);
console.log(res);
*/
