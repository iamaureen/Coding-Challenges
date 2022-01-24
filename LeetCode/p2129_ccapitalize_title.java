package LeetCode;


//https://leetcode.com/problems/capitalize-the-title/

public class p2129_ccapitalize_title {
	
	public static void main(String[] args) {
		
		String title = "capiTalIze tHe titLe";
		
		String[] title_array = title.split(" ");
        
        for(int i = 0; i < title_array.length; i++){
            if(title_array[i].length() == 1 || title_array[i].length() == 2){
            	title_array[i] = title_array[i].toLowerCase();
                System.out.println(title_array[i]);
            }else{
            	title_array[i] = title_array[i].toLowerCase();
            	System.out.println(title_array[i].charAt(0));
            	
            	title_array[i] = title_array[i].substring(0, 1).toUpperCase() + title_array[i].substring(1);
               
            }
        }
        
        //convert the string array to string
        System.out.println(String.join(" ", title_array));
        
	}

}
