package Leetcode;

import java.util.HashSet;

public class validSudoku {
	public boolean isValidSudoku(char[][] board) {
		char[] temp = new char[9];
		for (int i = 0; i < board.length; i++) {
			if (checkValid(board[i]) == false) {
				return false;
			}
			
			for (int j = 0; j < 9; j++) {
				temp[j] = board[j][i];
			}
			if (checkValid(temp) == false) {
				return false;
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int ii=0;ii<3;ii++){
					for(int jj=0;jj<3;jj++){
						temp[ii*3+jj]=board[i*3+ii][j*3+jj];
						
					}
				}
				if(checkValid(temp) == false){
					return false;
				}
			}
		}
		return true;

	}

	public boolean checkValid(char[] array) {
		HashSet<Character> store = new HashSet<Character>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '.') {
				continue;
			}
			if (store.contains(array[i])) {
				return false;
			}
			else{
			    store.add(array[i]);
			}
		}
		return true;
	}
}
