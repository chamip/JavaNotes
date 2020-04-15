import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        int[][] a = {
//                {1,2,3,4},
//                {1,2,3},
//        };
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean gotResult = false;
        int numOfO = 0;
        int numOfX = 0;

        //读入矩阵
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }
        //检查行
        for(int i=0;i<board.length;i++){
            numOfO = 0;
            numOfX = 0;
            for(int j=0;j< board[i].length;j++){
                if(board[i][j]==1){
                    numOfX++;
                }else{
                    numOfO++;
                }
            }
            if(numOfO==SIZE || numOfX==SIZE){
                gotResult = true;
                break;
            }
        }
        if(gotResult) {
            if (numOfO == SIZE) {
                System.out.println("O获胜！");
            } else if(numOfX == SIZE) {
                System.out.println("X获胜!");
            }
        }else{
                //检查列
                for(int j = 0; j <board[j].length; j++){
                    numOfO = 0;
                    numOfX = 0;
                    for(int i = 0; i< board.length; i++){
                        if(board[i][j]==1){
                            numOfX++;
                        }else{
                            numOfO++;
                        }
                    }
                    if(numOfO==SIZE || numOfX==SIZE){
                        gotResult = true;
                        break;
                    }
                }
                if(gotResult) {
                    if (numOfO == SIZE) {
                        System.out.println("O获胜！");
                    } else if (numOfX == SIZE) {
                        System.out.println("X获胜!");
                    }
                }else{
                        //检查对角线1
                        numOfO = 0;
                        numOfX = 0;
                        for(int i=0;i<board.length;i++){
                            if(board[i][SIZE-i-1]==1){
                                numOfX++;
                            }else{
                                numOfO++;
                            }
                        }
                        if(numOfO==SIZE || numOfX==SIZE){
                            gotResult = true;
                        }
                        if(gotResult) {
                            if (numOfO == SIZE) {
                                System.out.println("O获胜！");
                            } else if (numOfX == SIZE) {
                                System.out.println("X获胜！");
                            }
                        }else{
                                //检查对角线2
                                numOfO = 0;
                                numOfX = 0;
                                for(int i=0;i<board.length;i++){
                                    if(board[i][i]==1){
                                        numOfX++;
                                    }else{
                                        numOfO++;
                                    }
                                }
                                if(numOfO==SIZE || numOfX==SIZE){
                                    gotResult = true;
                                }
                                if(gotResult) {
                                    if (numOfX == 1) {
                                        System.out.println("X获胜！");
                                    } else if (numOfO == 1) {
                                        System.out.println("O获胜！");
                                    }
                                }else{
                                        System.out.println("平局！");
                                    }
                        }
                }
        }
    }
}
