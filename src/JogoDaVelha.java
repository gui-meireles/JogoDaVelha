import javax.swing.*;

public class Application extends JFrame {

    JButton[] bt = new JButton[9];
    JLabel placar = new JLabel("placar");
    JLabel px = new JLabel("px");
    JLabel po = new JLabel("po");
    JButton novo = new JButton("novo jogo");
    JButton zerar = new JButton("zerar placar");
    int PX = 0;
    int PO = 0;
    boolean xo = false;
    boolean[] click = new boolean[9];

    public Application() {
        setVisible(true);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250, 100, 700, 500);
        add(placar);
        add(px);
        add(po);
        add(novo);
        add(zerar);
        placar.setBounds(425, 50, 100, 30);
        px.setBounds(400, 75, 100, 30);
    }

    public static void main(String[] args) {

    }
}
