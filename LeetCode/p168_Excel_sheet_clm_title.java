package LeetCode;

//problem: https://leetcode.com/problems/excel-sheet-column-title/
//solution: https://www.youtube.com/watch?v=42jn_cl7g00
// well-explained

public class p168_Excel_sheet_clm_title {

	public String convertToTitle(int columnNumber) {
        
        //number conversion problem
        //in this case, subtracting 1 makes the decimal number a base 26 problem (we have 0-25 letters)
        
        //general algo: in any number conversion try to figure out the base, 
		//if range is 0-9 --> base is 10; if range is 0-25 --> base 26, and 
		//then try to convert the given number to that base number 
		//take mod by the base (in this case 26) then add the ascii value of the base 
		//calculate the amount to be deducted or add, as in this case subtracting 1 makes it base 26
        
        StringBuilder result = new StringBuilder();
        
        
        while(columnNumber > 0){
        	
            columnNumber--; //1 to 26 makes 0-25
            
            char toAdd = (char) (columnNumber%26 + 65); //char to add = the modular (base 26 so given number mod 26) + add the ascii value of that tobeConverted base value. 
            //this can be done by taking the ascii value of the toBeConverted number, i.e., (int) 'A' = 65 -- taking a character and cast them to int it gives the ascii value. 
            result.insert(0, toAdd);
            columnNumber /= 26;
            
            
        }
        
        return result.toString(); //starting from the mod, so no need to reverse. 
        
    }
	

}
