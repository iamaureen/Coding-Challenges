package LeetCode;

//https://leetcode.com/problems/can-place-flowers/
import java.util.*;


public class p605_Can_place_flowers {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flower = n;
        
        for(int i=0; i<flowerbed.length;i++){
            
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1] == 0) && (i==flowerbed.length-1 || flowerbed[i+1] == 0) && flower>0) {
                flowerbed[i] = 1;
                flower--;
            }
        }
        
        if(flower == 0) return true; 
        else return false;
    }
    
	

}
