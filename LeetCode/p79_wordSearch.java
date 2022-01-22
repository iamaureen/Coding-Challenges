package LeetCode;

//https://leetcode.com/problems/word-search/

public class p79_wordSearch {
	
public boolean exist(char[][] board, String word) {
        
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                //if the board element is equal to the first letter of the word
                //why pass count == 0?
                if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        
        return false; //traversed entire grid, did not find the word
    }
    
    public boolean dfs(char[][] board, int i, int j, int count, String word){
        
        if(count == word.length()){ //count will be equal to the word length
            return true;
        }
        
        //check the grid boundaries
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
            return false;
        }
        
        //same letter cell may not be used more than once
        //so we mark current cell with blank
        char temp = board[i][j]; //we remember this so we can add it back -- why? 
        board[i][j] = ' ';
        //traverse top, bottom, left, and right
        boolean found = dfs(board, i+1, j, count+1, word)
            || dfs(board, i-1, j, count+1, word)
            || dfs(board, i, j+1, count+1, word)
            || dfs(board, i, j-1, count+1, word);
        
        board[i][j] = temp;
        return found;
    }

}
