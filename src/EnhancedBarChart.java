import javax.swing.*;
import java.awt.*;

public class EnhancedBarChart extends JPanel {
    // Define percentages and colors for each category
    private final int projectPercentage = 20;
    private final int quizPercentage = 10;
    private final int midtermPercentage = 30;
    private final int finalExamPercentage = 40;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cast Graphics to Graphics2D for enhanced rendering
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Get panel dimensions
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Set enhanced bar dimensions
        int barWidth = 120;
        int maxBarHeight = 250;

        // Calculate initial x position to center the bars
        int startX = (panelWidth - 4 * (barWidth + 20)) / 2;
        int yBottom = panelHeight - 300;

        // Set font for the labels
        Font labelFont = new Font("Arial", Font.BOLD, 16);
        g2.setFont(labelFont);
        g2.setColor(Color.BLACK);

        // Draw the Project bar in red
        g2.setColor(Color.RED);
        int projectBarHeight = (projectPercentage * maxBarHeight) / 100;
        g2.fillRect(startX, yBottom - projectBarHeight, barWidth, projectBarHeight);
        g2.drawString("Project - 20%", startX + 15, yBottom - projectBarHeight - 10);

        // Draw the Quiz bar in blue
        g2.setColor(Color.BLUE);
        int quizBarHeight = (quizPercentage * maxBarHeight) / 100;
        g2.fillRect(startX + barWidth + 40, yBottom - quizBarHeight, barWidth, quizBarHeight);
        g2.drawString("Quiz - 10%", startX + barWidth + 55, yBottom - quizBarHeight - 10);

        // Draw the Midterm bar in green
        g2.setColor(Color.GREEN);
        int midtermBarHeight = (midtermPercentage * maxBarHeight) / 100;
        g2.fillRect(startX + 2 * (barWidth + 40), yBottom - midtermBarHeight, barWidth, midtermBarHeight);
        g2.drawString("Midterm - 30%", startX + 2 * (barWidth + 40) + 10, yBottom - midtermBarHeight - 10);

        // Draw the Final Exam bar in orange
        g2.setColor(Color.ORANGE);
        int finalExamBarHeight = (finalExamPercentage * maxBarHeight) / 100;
        g2.fillRect(startX + 3 * (barWidth + 40), yBottom - finalExamBarHeight, barWidth, finalExamBarHeight);
        g2.drawString("Final - 40%", startX + 3 * (barWidth + 40) + 20, yBottom - finalExamBarHeight - 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grade Percentage Bar Chart");
        EnhancedBarChart chart = new EnhancedBarChart();

        // Set up the frame
        frame.add(chart);
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window on the screen
        frame.setVisible(true);
    }
}
