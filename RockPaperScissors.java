import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RockPaperScissors {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        JButton rock = new JButton("Rock");
        JButton paper = new JButton("Paper");
        JButton scissors = new JButton("Scissors");
        panel.add(rock);
        panel.add(paper);
        panel.add(scissors);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        rock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame("Rock");
            }
        });
        paper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame("Paper");
            }
        });
        scissors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame("Scissors");
            }
        });
    }
    private static void playGame(String playerChoice) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        String computerChoice = choices[(int) (Math.random() * choices.length)];
        System.out.println("Player chose " + playerChoice);
        System.out.println("Computer chose " + computerChoice);
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Tie!");
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Paper")) {
            System.out.println("Computer wins!");
        } else if (playerChoice .equals("Rock") && computerChoice.equals("Scissors")) {
            System.out.println("Player wins!");
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            System.out.println("Player wins!");
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            System.out.println("Computer wins!");
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            System.out.println("Computer wins!");
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            System.out.println("Player wins!");
        }
    }
}
