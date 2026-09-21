import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soal40 extends JPanel implements ActionListener {
    private final int LEBAR = 800;
    private final int TINGGI = 400;
    private final int UKURAN_ANGKA = 40;
    private final int x = LEBAR - UKURAN_ANGKA - 10;
    private int y = 10;
    private final int KECEPATAN = 5;
    private boolean keBawah = true;
    private Timer timer;

    public Soal40() {
        setPreferredSize(
            new Dimension(LEBAR, TINGGI)
        );
        setBackground(Color.WHITE);
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (keBawah) {
            y = y + KECEPATAN;
            if (y >= TINGGI - UKURAN_ANGKA - 10) {
                y = TINGGI - UKURAN_ANGKA - 10;
                keBawah = false;
            }

        } else {
            y = y - KECEPATAN;
            if (y <= 10) {
                y = 10;
                keBawah = true;
            }
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON
        );
        g2.setColor(Color.BLACK);
        g2.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                UKURAN_ANGKA
            )
        );
        g2.drawString(
            "0",
            x,
            y + UKURAN_ANGKA
        );
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(
            "Soal 40 - Animasi Angka 0"
        );
        frame.add(new Soal40());
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}