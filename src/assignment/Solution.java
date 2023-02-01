// Do not remove these imports. You may add others if you wish.
import java.io.*;
import java.util.*;

public class Solution {
  // If you need extra classes, you can define them privately here within class Solution

  /*
    Args:
      grid: an int[][], each int[] representing a grid row.
               each tile is represented by an int 0-9
      row: an int, the row of the grid the player has selected
      col: an int, the column of the grid the player has selected
    Returns:
      An int describing how many tiles will disappear from the selected tile
  */
  private static void directions(int[][] grid,int[][] tested, int i, int j, int count, int k){
    int n =grid.length;
    int m = grid[0].length;
    if((i>=0) && (i<n) && (j>=0) && (j<m))
    {
      if((tested[i][j]==0) && (grid[i][j]==k))
      {
        tested[i][j]=1;
        count= count +1;
        
        directions(grid,tested,i-1,j,count,k);
        directions(grid,tested,i+1,j,count,k);
        directions(grid,tested,i,j-1,count,k);
        directions(grid,tested,i,j+1,count,k);
      }
    }
  }
  static int disappear(int[][] grid, int row, int col) {
    // Your code goes here.
    // NOTE: You may use print statements for debugging purposes, but you may
    //       need to remove them for the tests to pass.
    int valueToMatch = grid[row][col];
    int n= grid.length;
    int m= grid[0].length;
    int count =0;
    int[][] tested = new int[n][m];
    directions(grid,tested,row,col,count,valueToMatch);
    return count;
  }

  // DO NOT MODIFY MAIN()
  public static void main(String[] args) {
    String arg0 = "";
    List<String> input_strings = new ArrayList<String>();

    String line;
    boolean first_arg = true;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      while ((line = br.readLine()) != null) {
        if (line.equals("")) {
          continue;
        }

        if(first_arg) {
          arg0 = line;
          first_arg = false;
        } else {
          input_strings.add(line);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }

    String[] tokens;
    int[][] grid = new int[input_strings.size()][];
    for(int i = 0; i < input_strings.size(); i++) {
      tokens = input_strings.get(i).split(" ");
      grid[i] = new int[tokens.length];
      for(int j = 0; j < tokens.length; j++) {
        grid[i][j] = Integer.parseInt(tokens[j]);
      }
    }
    tokens = arg0.split(" ");
    int row = Integer.parseInt(tokens[0]);
    int col = Integer.parseInt(tokens[1]);

    System.out.println(disappear(grid, row, col));

  }
}

// Previous c++ code preserved below
// // Do not remove these imports. You may add others if you wish.
// #include <iostream>
// #include <iterator>
// #include <sstream>
// #include <string>
// #include <vector>
// #include <regex>
// 
// using namespace std;
// 
// /*
//   Args:
//     grid: a vector<vector<int>>, each vector<int> representing a grid row.
//              each tile is represented by an int 0-9
//     row: a number, the row of the grid the player has selected
//     col: a number, the column of the grid the player has selected
//   Returns:
//     An int describing how many tiles will disappear from the selected tile
// */
// int disappear(const vector<vector<int>>& grid, int row, int col) {
//   // Your code here.
//   // NOTE: You may use print statements for debugging purposes, but you may
//   //       need to remove them for the tests to pass.
//   return 0;
// }
// 
// 
// // DO NOT MODIFY BELOW HERE
// 
// vector<string> spaceSplit(string s) {
//   regex re("\\s+");
//   vector<string> result {
//     sregex_token_iterator(s.begin(), s.end(), re, -1), {}
//   };
// 
//   return result;
// }
// 
// int main() {
//   string line;
//   bool firstArg = true;
//   vector<vector<int>> grid;
//   int row;
//   int col;
// 
//   while (getline(cin, line)) {
//     istringstream iss(line);
//     if (line == "") continue;
//     vector<string> tokens = spaceSplit(line);
//     if (firstArg) {
//       firstArg = false;
//       row = stoi(tokens[0]);
//       col = stoi(tokens[1]);
//     } else {
//       vector<int> row;
//       for(string token : tokens) {
//         row.push_back(stoi(token));
//       }
//       grid.push_back(row);
//     }
//   }
// 
//   cout << disappear(grid, row, col) << endl;
// }
// 
// // Previous java code preserved below
// // 
// // //Do not remove these imports. You may add others if you wish.
// // import java.io.*;
// // import java.util.*;
// // 
// // public class Solution {
// // // If you need extra classes, you can define them privately here within class Solution
// // 
// // /*
// //  Args:
// //    grid: an int[][], each int[] representing a grid row.
// //             each tile is represented by an int 0-9
// //    row: an int, the row of the grid the player has selected
// //    col: an int, the column of the grid the player has selected
// //  Returns:
// //    An int describing how many tiles will disappear from the selected tile
// // */
// //   private void directions(int [][] grid)
// // static int disappear(int[][] grid, int row, int col) {
// // 	
// //  
// //  // Your code goes here.
// //  // NOTE: You may use print statements for debugging purposes, but you may
// //  //       need to remove them for the tests to pass.
// //  return 0;
// // }
// // 
// // 
// // 
// // // DO NOT MODIFY MAIN()
// // public static void main(String[] args) {
// //  String arg0 = "";
// //  List<String> input_strings = new ArrayList<String>();
// // 
// //  String line;
// //  boolean first_arg = true;
// //  try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// //    while ((line = br.readLine()) != null) {
// //      if (line.equals("")) {
// //        continue;
// //      }
// // 
// //      if(first_arg) {
// //        arg0 = line;
// //        first_arg = false;
// //      } else {
// //        input_strings.add(line);
// //      }
// //    }
// //  } catch (IOException e) {
// //    e.printStackTrace();
// //    return;
// //  }
// // 
// //  String[] tokens;
// //  int[][] grid = new int[input_strings.size()][];
// //  for(int i = 0; i < input_strings.size(); i++) {
// //    tokens = input_strings.get(i).split(" ");
// //    grid[i] = new int[tokens.length];
// //    for(int j = 0; j < tokens.length; j++) {
// //      grid[i][j] = Integer.parseInt(tokens[j]);
// //    }
// //  }
// //  tokens = arg0.split(" ");
// //  int row = Integer.parseInt(tokens[0]);
// //  int col = Integer.parseInt(tokens[1]);
// // 
// //  System.out.println(disappear(grid, row, col));
// // 
// // }
// // }
