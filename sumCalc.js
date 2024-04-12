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

/*
function sortedSum(a) {
    //const MOD = 1000000007;
    let totalSum = 0;
  
    // Pas besoin de trier le tableau principal `a` au début,
    // car les sous-tableaux seront triés individuellement selon votre consigne.
    
    for (let i = 0; i < a.length; i++) {
        // Création du sous-tableau à partir de `a[0]` à `a[i]`
        let subArray = a.slice(0, i + 1);
  
        // Tri du sous-tableau
        subArray.sort((a, b) => a - b);
  
        // Calcul de la somme pour le sous-tableau trié
        let subSum = 0;
        for (let j = 0; j < subArray.length; j++) {
            subSum += subArray[j] * (j + 1);
            //subSum %= MOD; // Appliquer MOD pour chaque addition pour éviter les dépassements
        }
  
        // Ajout de la somme du sous-tableau à la somme totale
        totalSum += subSum;
        //totalSum %= MOD; // Appliquer MOD pour chaque addition pour éviter les dépassements
    }
  
    return totalSum;
  }
  */
