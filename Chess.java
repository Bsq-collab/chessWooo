public class Chess{
    public String[][] board;

    public String[][] whitePieces= new String[2][8];
    public String[][] blackPieces= new String[2][8];

    public Chess(){
	board= new String[8][8];
	setUpWhites();
	setUpBlacks();
	whitePieces={{"rook","knight","bishop","queen","king","bishop","knight","rook"},
		     {"pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn"}};
	blackPieces={ {"rook","knight","bishop","queen","king","bishop","knight","rook"},
		      {"pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn"} };			     	
    }
    public String[][] setUpWhites(){
	for(int rowctr=0;rowctr<2;rowctr++){
	    for(int colctr=0;colctr<8;colctr++){
		board[rowctr][colctr]=whitePieces[rowctr][colctr];
	    }
	}
	return board;
    }
    public String[][] setUpBlacks(){
	for(int rowctr=8;rowctr>6;rowctr--){
	    for(int colctr=0;colctr<8;colctr++){
		board[rowctr][colctr]=blackPieces[rowctr][colctr];
	    }
	}
	return board;
    }
    public void toString(){
	for(int row=0;row<8;row++){
	    for(int col=0;col<8;col++){
		System.out.println(board[row][col]);
	    }
	}
    }
}
