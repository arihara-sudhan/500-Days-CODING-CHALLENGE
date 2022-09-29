/*
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 29/09/2022
    @ Problem Statement : Krishnamurthy Number - It is a number that is equal to 
    the sum of the factorial of all its digits. For example 1, 2, 145. 
    It is also called as a Strong number or Peterson number.
	Example : 
		145
		=> 1! + 4! + 5!
		=> 1 + 24 + 120
		=> 145
*/


#include<stdio.h>
int main()
{
  int number, temp, sum, currentDigit, fact;
  printf("Enter an Integer: ");
  scanf("%d",&number);
  temp = number;
  sum = 0;

  while(temp!=0)
  {
    currentDigit = temp % 10;
    fact = 1;
   for(int i=1; i<=currentDigit; i++)
    {
      fact *= i;
    }
    sum += fact;
    temp /= 10;
  }

  if(sum == number)
  {
    printf("%d is Krishnamurthy Number.",number);
  }
  else
  {
    printf("%d is not a Krishnamurthy Number.",number);
  }

  return 0;
}