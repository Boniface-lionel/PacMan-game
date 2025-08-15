import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCOUNT= 19;
        int tileSize = 32;
        int boardWidth = columnCOUNT*tileSize;
        int boardHeiht = rowCount*tileSize;

        JFrame frame = new JFrame("Pac Man");
        
        frame.setSize(boardWidth,boardHeiht);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);
       
    }
}
