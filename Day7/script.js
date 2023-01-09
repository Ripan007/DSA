// find the sum of pair of zero

function getSumPairZero(array) {
  for (let number of array) {
    // console.log(number);
    for (let j = 1; j < array.length; j++) {
      if (number + array[j] === 0) {
        return [number, array[j]];
      }
    }
  }
}
const result = getSumPairZero([-5, -4, -3, -2, 0, 2, 4, 6, 8]);
console.log(result);

// 0(n square ) => quadratic time complexity

// reduce the time complexity

function findPairSum(array) {
  let left = 0;
  let right = array.length - 1;
  while (left < right) {
    sum = array[left] + array[right];
    if (sum === 0) {
      return [array[left], array[right]];
    } else if (sum > 0) {
      right--;
    } else {
      left++;
    }
  }
}

const result = findPairSum([-5, -4, -3, -2, 0, 2, 4, 6, 8]);
console.log(result);


0(n) linear time complexity

// find the integer is anagram or not
// condition 
// length should be same 
// letter are same

function isAnagram(string1,string2){
  if(string1!==string2){
    return false;
  }
  
  // string1 is anagram
let counter = {};
  for(let letter of string1){
   counter[letter] = (counter[letter] || 0) + 1;
  }

  for(let items of string2){
    if(!counter[items]){
      return false;
    }
    counter[items]-=1;
  }
  return true;

}

const check = isAnagram("hello","hllo");
console.log(check);


