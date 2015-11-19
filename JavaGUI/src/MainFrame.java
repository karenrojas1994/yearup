import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {
	
	private DetailsPanel detailsPanel;
	public MainFrame(String Title){
	super(Title);
	
	// Set layout manager
	setLayout(new BorderLayout());
	
	// Create Swing Component 
	final JTextArea textArea = new JTextArea();
	JButton button = new JButton("Who are you?");
	
	detailsPanel = new DetailsPanel();
	
	// Add Swing components to content pane
   Container c = getContentPane();
   c.add(textArea, BorderLayout.CENTER);
   c.add(button, BorderLayout.SOUTH);
   c.add(detailsPanel, BorderLayout.WEST);
   
   // Add behavior 
   button.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		textArea.append("Hello\n");
		
	}
	   
   });
   }
}
