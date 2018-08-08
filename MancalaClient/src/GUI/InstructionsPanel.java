package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import Client.Controller;

public class InstructionsPanel extends JPanel {

    /**
	 * Default serialVersionUID used.
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon instructionsIcon = new ImageIcon(this.getClass().getResource("/Resources/directions_Image.png"));
    private JScrollPane instructionsScrollPane;

    private JLabel instructionsLabel;
    protected Controller controller;

    public InstructionsPanel(Controller c) {
        this.controller = c;
        setLayout(null);

        // note: changed to be back button to keep the stating of a game in one spot, the start screen.
        JButton BackButton = new JButton("Back");
        BackButton.setBounds(335, 530, 150, 32); // Changed bounds 
        add(BackButton);

        instructionsScrollPane = new JScrollPane(instructionsLabel = new JLabel(instructionsIcon));
        instructionsScrollPane.setBounds(0, 0, 795, 540);
        instructionsScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        instructionsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        instructionsScrollPane.setMaximumSize(getSize());
        add(instructionsScrollPane);

        instructionsLabel.setIcon(instructionsIcon);

        BackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.showStartScreen();
            }
        });


    }

}
