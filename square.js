/*
# initialise arr array; Ex: const iTAB = [2,3,4];
# call square() function then assign return into an array variable; Ex: const fTAB = square(iTAB);
# use console.log(fTAB) to display function Output. In this case, output will be [4,9,16];
*/

function square(arr){
    return arr.map((item) => Math.pow(item,2) )
}