public class Chess{
    public Piece[][] board;

    public Piece[][] whitePieces= {{new Rook(),new Knight(),new Bishop(), new Queen(), new King(), new Bishop(), new Knight(), new Rook()},{new Pawn(),"pawn","pawn","pawn","pawn","pawn","pawn","pawn"}};
    public Piece[][] blackPieces= {{"rook","knight","bishop","queen","king","bishop","knight","rook"},{"pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn"} };

    public Chess(){
	board= new String[8][8];
	popW();
	popB();			     	
    }

    public void popW(){
	for(int row=0; row<2; row++){
	    for(int col=0; col<8; col++){
		board[row][col]= whitePieces[row][col];
	    }
	}
    }

    public void popB(){
	for(int row=7; row>5;row-=1){//row 7 and 6
	    for(int col=0;col<8;col++){//columns 0-7
		if(row==7){
		    board[row][col]=blackPieces[0][col];
		}
		else if(row==6){
		    board[row][col]=blackPieces[1][col];
		}
	    }
	}
	
    }
    public void move(int rowNow, int colNow){
	if(board[rowNow][colNow]){
	    
    }
    
    public String toString(){
	String ans= "";
	for(int row=0;row<8;row++){
	    for(int col=0;col<8;col++){
		ans+= board[row][col]+ "\t";
	    }
	    ans+="\n\n";			       
	}
	return ans;
    }
}
