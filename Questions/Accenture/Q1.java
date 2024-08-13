
/*write a function in java that accepts three parameters : 2 positive integers r and 
unit and a positive integer array of size n, where r represents the number if rats present in an area. ,
unit is the amt of food each rat consumes and each element of the array represents the amount of food present in each house, 
where the index of the array corresponds to the house number the function should 
determine the number of houses required to provide enough food for all the rats */


import java.util.*;
class Solution
{
    public static int Func(int r, int unit,int[]foodinHouse)
    {
         int totalfoodRequired=r*unit;
         int totalHomeNeeded=0;
         int currentFood=0;

         for(int i=0;i<foodinHouse.length;i++)
         {
            currentFood+=foodinHouse[i];
            totalHomeNeeded++;

            if(currentFood>=totalfoodRequired)
            {
                return totalHomeNeeded;
            }
         }
         return -1;
    }
}