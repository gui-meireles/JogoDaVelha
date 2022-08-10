import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {

    JButton[] bt = new JButton[9];
    JLabel scoreboard = new JLabel("Scoreboard");
    JLabel px = new JLabel("Player X: 0");
    JLabel po = new JLabel("Player O: 0");
    JButton newGame = new JButton("New Game");
    JButton reset = new JButton("Reset");
    int PX = 0;
    int PO = 0;
    boolean xo = false;
    boolean[] click = new boolean[9];

    public static void main(String[] args) {
        new TicTacToe();
    }

    public TicTacToe() {
        setVisible(true);
        setTitle("Tic-Tac-Toe");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250, 100, 700, 500); // background
        add(scoreboard);
        add(px);
        add(po);
        add(newGame);
        add(reset);
        scoreboard.setBounds(450, 55, 100, 30); // texto placar
        px.setBounds(390, 95, 100, 30); // texto placar do X
        po.setBounds(510, 95, 100, 30); // texto placar do O
        newGame.setBounds(415, 155, 140, 30); // botao de novo jogo
        reset.setBounds(415, 210, 140, 30); // botao de zerar placar
        newGame.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();  // começa novo jogo
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PO = 0;
                PX = 0;
                update();  // zera o placar
            }
        });
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95); // borda dos botoes / tamanho de cada botao
                bt[cont].setFont(new Font("Arial", Font.BOLD, 40));  // fonte das letras dentro do botao
                cont++;
            }
        }

        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }
        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[0] == false) {
                    click[0] = true;
                    changePlayer(bt[0]);
                }
            }
        });
        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[1] == false) {
                    click[1] = true;
                    changePlayer(bt[1]);
                }
            }
        });
        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[2] == false) {
                    click[2] = true;
                    changePlayer(bt[2]);
                }
            }
        });
        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[3] == false) {
                    click[3] = true;
                    changePlayer(bt[3]);
                }
            }
        });
        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[4] == false) {
                    click[4] = true;
                    changePlayer(bt[4]);
                }
            }
        });
        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[5] == false) {
                    click[5] = true;
                    changePlayer(bt[5]);
                }
            }
        });
        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[6] == false) {
                    click[6] = true;
                    changePlayer(bt[6]);
                }
            }
        });
        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[7] == false) {
                    click[7] = true;
                    changePlayer(bt[7]);
                }
            }
        });
        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[8] == false) {
                    click[8] = true;
                    changePlayer(bt[8]);
                }
            }
        });
    }

    public void changePlayer(JButton btn) {
        if (xo) {
            btn.setText("O");
            xo = false;
        } else {
            btn.setText("X");
            xo = true;
        }
        winGame();
    }

    public void update() {  // atualiza placar
        px.setText("Player X: " + PX);
        po.setText("Player O: " + PO);
    }

    public void winGame() {
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true) {
                cont++;
            }
        }
        if ((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X") ||
                (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X") ||
                (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X") ||
                (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X") ||
                (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X") ||
                (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X") ||
                (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X") ||
                (bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {
            JOptionPane.showMessageDialog(null, "Player X win");
            PX++;
            update();
            clear();
        } else if ((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O") ||
                (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O") ||
                (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O") ||
                (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O") ||
                (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O") ||
                (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O") ||
                (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O") ||
                (bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {
            JOptionPane.showMessageDialog(null, "Player O won");
            PO++;
            update();
            clear();
        } else if (cont == 9) {
            JOptionPane.showMessageDialog(null, "Draw");
            clear();
        }
    }

    public void clear() {
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false;
            xo = false; // o jogo começa sempre com X
        }
    }
}
