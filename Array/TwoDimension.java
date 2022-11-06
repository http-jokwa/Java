public class TwoDimension {
  
   public static void main(String [] args){
     
     //2 Dimentional has rows and columns
     
     /*   
          2D Index Position
          
                    C O L U M N S
                    
              0     1    2      3     4
          -------------------------------
     R  0  | 0,0 | 0,1 | 0,2 | 0,3 | 0,4 |
     O    -------------------------------
     W  1  | 1,0 | 1,1 | 1,2 | 1,3 | 1,4 |
          -------------------------------
          
          
           2D Array representation will be like this;
      
               C O L U M N S
          ---------------------
      R   | 1 | 2 | 3 | 4 | 5  |
      O    -------------------
      W   | 6 | 7 | 8 | 9 | 10 |
          ---------------------- 
          
          Rows = lef to right (Horizontal)
          Columns = top to bottom(Vertical)
          
          
          
          To create a 2D array
          datatype [][] = {{first element},{second element}};
          
          To call the element
          
          arrayname[row index][column index];
          
     */
        //we have 5 columns each row
        //we have 2 rows        0           1
         int [][] number = {{1,2,3,4,5},{6,7,8,9,10}};
     
         System.out.println(number[1][3]); // output : 8
     
     
     
   }
  
}
