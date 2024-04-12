

function toEncrypt(initStr)
{
    const ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    ALPHABET.split(""); 
    initStr = (initStr.toLowerCase()).split("");

    chaineCodee = []
l = ALPHABET.length
for(let i=0; i<initStr.length; i++){
    if(ALPHABET.includes(initStr[i])){
        pALPHABET = ALPHABET.indexOf(initStr[i])
        if(pALPHABET<22){
            chaineCodee.push(ALPHABET[pALPHABET+4])
        }
        else{
            chaineCodee.push(ALPHABET[4-(l-pALPHABET)])
        }
    }
    else{
        chaineCodee.push(initStr[i])
    }
}
resultat = ""
for(let i=0; i<chaineCodee.length; i++){
    resultat += chaineCodee[i]
}


    return resultat;
}




