import player.Player;
import triple.Triple;

import java.util.ArrayList;
import java.util.List;
import board.Board;
import game.Game;

// import board.QueenBoard;
// import game.QueenGame;

public class App {
    public static void main(String[] args) throws Exception {
      Player p = new Player("sweta", 20);
        System.out.println(p.getPlayerName());

        Board b = new Board(9);
        b.setBoardConfig(0, 0, 3);
        b.setBoardConfig(0, 2, 6);
        b.setBoardConfig(0, 0, 0);
        b.setBoardConfig(0, 5, 8);
        b.setBoardConfig(0,6, 4);

        List<Integer> col = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        col.add(0);
        col.add(1);

        val.add(5);
        val.add(2);
        b.setUpColumnWise(1, col, val);
        
        List<Triple>triple = new ArrayList<>();
        triple.add(new Triple(2, 1, 8));
        triple.add(new Triple(2, 2, 7));
        triple.add(new Triple(2, 7, 3));
        triple.add(new Triple(2, 8, 1));
        triple.add(new Triple(3, 2, 3));
        triple.add(new Triple(3, 4, 1));
        triple.add(new Triple(3, 7, 8));
        triple.add(new Triple(4, 0, 9));
        triple.add(new Triple(4, 3, 8));
        triple.add(new Triple(4, 4, 6));
        triple.add(new Triple(4, 5, 3));
        triple.add(new Triple(4, 8, 5));
        triple.add(new Triple(5, 1, 5));
        triple.add(new Triple(5, 4, 9));
        triple.add(new Triple(5, 6, 6));
        triple.add(new Triple(6, 0, 1));
        triple.add(new Triple(6, 1, 3));
        triple.add(new Triple(6, 6, 2));
        triple.add(new Triple(6, 7, 5));
        triple.add(new Triple(7, 7, 7));
        triple.add(new Triple(7, 8, 4));
        triple.add(new Triple(8, 2, 5));
        triple.add(new Triple(8, 3, 2));
        triple.add(new Triple(8, 5, 6));
        triple.add(new Triple(8, 6, 3
        ));

        b.setUpBoard(triple);
        b.printBoard();

        Game game = new Game(b, p);
        game.play();  

        // QueenBoard bd = new QueenBoard(4);
        // QueenGame game = new QueenGame(bd);
        // game.play();

    }


}
