/**
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the given number?
**/
function largestPrimeFactor(number) {
  let pf = [];
  for(let i=2;i<=number;i++) {
    if(number%i!=0) continue;
    let isPrime = 1;
    for(let j=2;j<=i/2;j++)
      if(i%j==0) {
        isPrime = 0;
        break;
      }
    if(isPrime){
      pf.push(i);
      number/=i;
    }
    
  }
  // console.log(pf);
  let max=0;
  for(let x of pf){
    if(x>max) max = x;
  }
  return max;
}