import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Object;
import javax.swing.GroupLayout;
 
 
public class start extends JFrame implements ActionListener
{
    private JButton option1Button, option2Button, option3Button, exitButton, actButton, runButton, resetButton;
    private JPanel mainPanel, sidePanel, bottomPanel;
    private JLabel optionLabel, squareLabel, directionLabel;
    private JTextField optionText, squareText, directionText;
    JMenuBar topMenuBar;
    JMenu fileMenu, editMenu, searchMenu, helpMenu;
    JMenuItem exitItem, fontItem, foreColor, backColor, helpItem, aboutItem;
    String  aboutBoxString = (" Application written by\n Dr. Gary Hill BSc(Hons) MSc MPhil PhD PGCE SFHEA FBCS CITP\n"
			+ " Head of Department - Business Computing Computing & Games,\n"
			+ " University of Northampton\n University Drive,\n"
			+ " Northampton, NN1 5PH,\n United Kingdom\n E-Mail: gary.hill@northampton.ac.uk\n"
			+ " http://www.computing.northampton.ac.uk/~gary/\n") ;
    public static void main (String[] args)
    {
        start frame = new start();
        frame.setSize(810,650);
        frame.createGUI();
        frame.setVisible(true);
        frame.setResizable(false);
    }
 
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout(0) );
        
        menuSetup();
        
        /* Panels */
        
        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(600, 500));
        mainPanel.setBackground(Color.blue);
        window.add(mainPanel);
        
        sidePanel = new JPanel();
        sidePanel.setPreferredSize(new Dimension(190, 500));
        sidePanel.setBackground(Color.red);
        window.add(sidePanel);
        
        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(795, 110));
        bottomPanel.setBackground(Color.green);
        window.add(bottomPanel);
        
        /* Labels and TextFields */
        
        optionLabel = new JLabel("Option: ");
        sidePanel.add(optionLabel);
        optionText = new JTextField("1");
        optionText.setPreferredSize(new Dimension(100, 20));
        sidePanel.add(optionText);
        
        squareLabel = new JLabel("Square: ");
        sidePanel.add(squareLabel);
        squareText = new JTextField("17");
        squareText.setPreferredSize(new Dimension(100, 20));
        sidePanel.add(squareText);
        
        directionLabel = new JLabel("Direction: ");
        sidePanel.add(directionLabel);
        directionText = new JTextField("E");
        directionText.setPreferredSize(new Dimension(100, 20));
        sidePanel.add(directionText);
        
        
        
        /* Side Panel Buttons */
        
        option1Button = new JButton("Option 1");
        window.add(option1Button);
        sidePanel.add(option1Button);
        option1Button.addActionListener(this);
        
        option2Button = new JButton("Option 2");
        window.add(option2Button);
        sidePanel.add(option2Button);
        option2Button.addActionListener(this);
        
        option3Button = new JButton("Option 3");
        window.add(option3Button);
        sidePanel.add(option3Button);
        option3Button.addActionListener(this);
        
        exitButton = new JButton("Exit");
        window.add(exitButton);
        sidePanel.add(exitButton);
        exitButton.addActionListener(this);
        
        /* Bottom Panel Buttons */
        
        actButton = new JButton("Act");
        window.add(actButton);
        bottomPanel.add(actButton);
        
        runButton = new JButton("Run");
        window.add(runButton);
        bottomPanel.add(runButton);
        
        resetButton = new JButton("Reset");
        window.add(resetButton);
        bottomPanel.add(resetButton);
        
    }
    
    	/* Top Menu */
    	
    public void menuSetup() {
    	topMenuBar = new JMenuBar();      //create a menu bar
        setJMenuBar(topMenuBar);          //set the menu bar to the JFrame

        fileMenu = new JMenu("Scenario");     // File menu, with open, save, exit
        exitItem = new JMenuItem("Exit"); //EXIT item
        fileMenu.add(exitItem);           //add the items to the menu
        exitItem.addActionListener(this); //add the listener to the item
        topMenuBar.add(fileMenu);         //add the menu to the menu bar

        editMenu = new JMenu("Edit");     // edit menu, could have copy, paste
        topMenuBar.add(editMenu );

        searchMenu = new JMenu("Controls");
        topMenuBar.add(searchMenu);

        helpMenu = new JMenu("Help");   // help menu, with  help topics, about application
        helpItem = new JMenuItem("Help Topics");
        helpMenu.add(helpItem);
        helpItem.addActionListener(this);
        aboutItem = new JMenuItem("About...");
        helpMenu.add(aboutItem);
        aboutItem.addActionListener(this);
        topMenuBar.add(helpMenu);
    }
    
    	/* Action Listener */
    
    public void actionPerformed(ActionEvent e)
    {
        
    	/* Top Menu Actions */
    	
    	if (e.getSource() == exitItem)
          {
            System.exit(0);
          }
          if (e.getSource() == helpItem)
              JOptionPane.showMessageDialog(null, "Help Topics chosen.");
          if (e.getSource() == aboutItem)
              JOptionPane.showMessageDialog(null, aboutBoxString, "About the author",
                                                    JOptionPane.INFORMATION_MESSAGE);
          this.repaint();
          
          /* Side Panel Button Actions */
          
          if (e.getSource() == option1Button)
          {
        	  optionText.setText("1");
          }
          if (e.getSource() == option2Button)
          {
        	  optionText.setText("2");
          }
          if (e.getSource() == option3Button)
          {
        	  optionText.setText("3");
          }
          if (e.getSource() == exitButton)
          {
        	  System.exit(0);
          }
    }
    
}