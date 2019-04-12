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
    private Icon iconAct, iconRun, iconReset, iconMap, iconHori, iconVert, iconNw, iconNe, iconSe, iconSw;
    JButton map[] = new JButton[208];
    int [] bricks = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,32,48,64,80,96,112,128,144,160,176,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,31,47,63,79,95,111,127,143,159,175,191};
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
        frame.setSize(810, 650);						//Setting the size of the frame
        frame.createGUI();								//GUI method
        frame.setVisible(true);
        frame.setResizable(false);						//Setting window to be non-resizable
        frame.setLocationRelativeTo(null);				//Setting the game to start in the center
        }
 
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout(0));
        
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
        	
        	map[i].setIcon(iconMap);					//Drivable icons
        	
        	if (i == 1 || i==2 ||i == 3 || i==4 ||i == 5 || i==6 ||i == 7 || i==8 || i == 9 || i==10 ||i == 11 || i == 12 || i == 13 || i == 14||
        		i == 193 || i == 194 ||i == 195 || i == 196 || i == 197 || i == 198 || i == 199 || i == 200 || i == 201 || i == 202 || i == 203 || i == 204 || i == 205 || i == 206 ||
        		i == 51 || i== 52 ||i == 53 || i== 54 ||i == 55 || i== 56 ||i == 57 || i== 58 || i == 59 || i == 60 ||
        		i == 147 || i== 148 ||i == 149 || i== 150 ||i == 151 || i== 152 ||i == 153 || i== 154 || i == 155 || i == 156){					//Horizontal icons
        		try	
                {
                	iconHori = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("wall-horiz.png")));
                }
                catch (Exception e)
                {
                    System.err.println("Act Icon ImageIcon "+e);
                }
            	map[i].setIcon(iconHori);
            }
        	
        	else if (i == 16 || i == 32 ||i == 48 || i == 64 || i == 80 || i == 96 || i == 112 || i == 128 || i == 144 || i == 160 || i == 176 ||
        			i == 31 || i == 47 ||i == 63 || i == 79 || i == 95 || i == 111 || i == 127 || i == 143 || i == 159 || i == 175 || i == 191 ||
        			i == 66 || i == 82 ||i == 98 || i== 114 ||i == 130 ||
        			i == 77 || i== 93 ||i == 109 || i== 125 ||i == 141) {				//Vertical icons
        		try	
                {
                	iconVert = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("wall-vert.png")));
                }
                catch (Exception e)
                {
                    System.err.println("Act Icon ImageIcon "+e);
                }
            	map[i].setIcon(iconVert);
        	}
        	
        	else if (i == 0 || i == 50) {				//North west corner icons
        		try	
                {
                	iconNw = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("wall-NW.png")));
                }
                catch (Exception e)
                {
                    System.err.println("Act Icon ImageIcon "+e);
                }
            	map[i].setIcon(iconNw);
        	}
        	
        	else if (i == 15 || i == 61) {				//North east corner icons
        		try	
                {
                	iconNe = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("wall-NE.png")));
                }
                catch (Exception e)
                {
                    System.err.println("Act Icon ImageIcon "+e);
                }
            	map[i].setIcon(iconNe);
        	}
        	
        	else if (i == 192 || i == 146) {			//South west corner icons
        		try	
                {
                	iconSw = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("wall-SW.png")));
                }
                catch (Exception e)
                {
                    System.err.println("Act Icon ImageIcon "+e);
                }
            	map[i].setIcon(iconSw);
        	}
        	
        	else if (i == 207 || i == 157) {			//South east corner icons
        		try	
                {
                	iconSe = new ImageIcon(Toolkit.getDefaultToolkit().createImage(start.class.getResource("wall-SE.png")));
                }
                catch (Exception e)
                {
                    System.err.println("Act Icon ImageIcon "+e);
                }
            	map[i].setIcon(iconSe);
        	}
        	
        	map[i].setBorderPainted(false); 			//Setting the icons without borders
        }
        
        mainPanel.setLayout(new GridLayout(13, 16));
        
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
    	topMenuBar = new JMenuBar();
        setJMenuBar(topMenuBar);
        
        fileMenu = new JMenu("Scenario");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        exitItem.addActionListener(this);
        topMenuBar.add(fileMenu);

        editMenu = new JMenu("Edit");
        topMenuBar.add(editMenu );

        searchMenu = new JMenu("Controls");
        topMenuBar.add(searchMenu);

        helpMenu = new JMenu("Help");
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