

import javax.swing.SwingUtilities;

public class BMICalculator {
    public static void main(String[] args) {
        // SwingUtilities.invokeLater é uma boa prática para evitar travamentos na interface
        SwingUtilities.invokeLater(() -> {
            BMIInterface app = new BMIInterface();
            app.setVisible(true);
        });
    }
}