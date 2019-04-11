import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Object;
import javax.swing.GroupLayout;
import java.util.*;
import java.awt.GridLayout;
 
 
public class start extends JFrame implements ActionListener
{
    private JButton option1Button, option2Button, option3Button, exitButton, actButton, runButton, resetButton, lol1, lol2, lol3, lol4, lol5, lol6, lol7, lol8, lol9;
    private JPanel mainPanel, sidePanel, bottomPanel;
    private JLabel optionLabel, squareLabel, directionLabel;
    private JTextField optionText, squareText, directionText;
    private Icon iconAct, iconRun, iconReset, iconMap;
    JButton map[] = new JButton[208];
    JMenuBar topMenuBar;
    JMenu fileMenu, editMenu, searchMenu, helpMenu;
    JMenuItem exitItem, fontItem, foreColor, backColor, helpItem, aboutItem;
    String  aboutBoxString = ("Karolis Malinauskas"
    							+ "\nUniversity of Northampton"
    							+ "\nBSc Computing (Web technology and security)"
    							+ "\nStudent ID: 18431618") ;
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
        
        /* Panels  */
        
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainPanel.setPreferredSize(new Dimension(600, 500));
        mainPanel.setBackground(Color.gray);
        window.add(mainPanel);
        
        sidePanel = new JPanel();
        sidePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        sidePanel.setPreferredSize(new Dimension(190, 500));
        window.add(sidePanel);
        
        bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        bottomPanel.setPreferredSize(new Dimension(795, 110));
        window.add(bottomPanel);
        
        /* Labels and TextFields */
        
        optionLabel = new JLabel("Option: ");
        sidePanel.add(optionLabel);
        optionText = new JTextField("1");
        optionText.setEditable(false);
        optionText.setPreferredSize(new Dimension(100, 20));
        sidePanel.add(optionText);
        
        squareLabel = new JLabel("Square: ");
        sidePanel.add(squareLabel);
        squareText = new JTextField("17");
        squareText.setEditable(false);
        squareText.setPreferredSize(new Dimension(100, 20));
        sidePanel.add(squareText);
        
        directionLabel = new JLabel("Direction: ");
        sidePanel.add(directionLabel);
        directionText = new JTextField("E");
        directionText.setEditable(false);
        directionText.setPreferredSize(new Dimension(100, 20));
        sidePanel.add(directionText);
        
        
        
        /* Side Panel Buttons */
        
        option1Button = new JButton("Option 1");
        option1Button.setPreferredSize(new Dimension(75, 25));
        window.add(option1Button);
        sidePanel.add(option1Button);
        option1Button.addActionListener(this);
        
        option2Button = new JButton("Option 2");
        option2Button.setPreferredSize(new Dimension(75, 25));
        window.add(option2Button);
        sidePanel.add(option2Button);
        option2Button.addActionListener(this);
        
        option3Button = new JButton("Option 3");
        option3Button.setPreferredSize(new Dimension(75, 25));
        window.add(option3Button);
        sidePanel.add(option3Button);
        option3Button.addActionListener(this);
        
        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(75, 25));
        window.add(exitButton);
        sidePanel.add(exitButton);
        exitButton.addActionListener(this);
        
        /* Direction Buttons */
        
        lol1 = new JButton("");
        window.add(lol1);
        sidePanel.add(lol1);
        
        lol2 = new JButton("");
        window.add(lol2);
        sidePanel.add(lol2);
        
        lol3 = new JButton("");
        window.add(lol3);
        sidePanel.add(lol3);
        
        lol4 = new JButton("");
        window.add(lol4);
        sidePanel.add(lol4);
        
        lol5 = new JButton("");
        window.add(lol5);
        sidePanel.add(lol5);
        
        lol6 = new JButton("");
        window.add(lol6);
        sidePanel.add(lol6);
        
        lol7 = new JButton("");
        window.add(lol7);
        sidePanel.add(lol7);
        
        lol8 = new JButton("");
        window.add(lol8);
        sidePanel.add(lol8);
        
        lol9 = new JButton("");
        window.add(lol9);
        sidePanel.add(lol9);
        
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
        
        /* Map */
        
        for (int i = 0; i < map.length; i++) {
        	map[i] = new JButton(""+i);
        	mainPanel.add(map[i]);
        	try	
            {
            	iconMap = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("space.jpg")));
            }
            catch (Exception e)
            {
                System.err.println("Act Icon ImageIcon "+e);
            }
        	map[i].setIcon(iconMap);
        	//map[i].setBorderPainted(false);
        }
        
        mainPanel.setLayout(new GridLayout(16, 13));
        
        try	
        {
        	iconAct = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("step.png")));
        	iconRun = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("run.png")));
        	iconReset = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("reset.png")));
        }
        catch (Exception e)
        {
            System.err.println("Act Icon ImageIcon "+e);
        } 
        
        actButton.setIcon(iconAct);
        runButton.setIcon(iconRun);
        resetButton.setIcon(iconReset);
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