package boggle;

import boggle.Boggle;
import java.io.IOException;

public class Main {
	
	public Boggle boggle = new Boggle();
	
	public static void main(String[] args) throws IOException{
		Main obj = new Main();    
        obj.boggle.runBoggle("board.txt","dict.txt");
    }

}