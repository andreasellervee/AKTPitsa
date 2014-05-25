import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.undo.*;

public class Aken extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextPane textPane;
    AbstractDocument doc;
    static final int MAX_CHARACTERS = 300;
    JTextArea changeLog;
    String newline = "\n";
    HashMap<Object, Action> actions;
    JFileChooser fc2;
    public static Map<String, List<String>> map = new HashMap<String, List<String>>();
    protected SaveAction saveAction;
    protected SaveHTMLAction saveHTMLAction;

    public Aken(Map<String, List<String>> menu) {
    	
        super("Menüü");
        fc2 = new JFileChooser();
        map = menu;
        //Create the text pane and configure it.
        textPane = new JTextPane();
        textPane.setCaretPosition(0);
        textPane.setMargin(new Insets(5,5,5,5));
        StyledDocument styledDoc = textPane.getStyledDocument();
        if (styledDoc instanceof AbstractDocument) {
            doc = (AbstractDocument)styledDoc;
            doc.setDocumentFilter(new DocumentFilter());
        } else {
            System.err.println("Text pane's document isn't an AbstractDocument!");
            System.exit(-1);
        }
        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setPreferredSize(new Dimension(950, 550));

        //Add the components.
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        actions=createActionTable(textPane);
        JMenu editMenu = createEditMenu();
        JMenuBar mb = new JMenuBar();
        mb.add(editMenu);
        setJMenuBar(mb);
        
        textPane.setCaretPosition(0);
        for(String x : map.keySet()){
        	int count = 0;
        	textPane.replaceSelection(x);
            for(String y : map.get(x)){
            	if(count == 0){
            		textPane.replaceSelection("\t \t \t" + y + "EUR" + "\n    ");
            	}
            	else{
            	textPane.replaceSelection(y + "   ");
            	}
            	count ++;
            }
            textPane.replaceSelection("\n\n\n");
        }
        textPane.setEditable(false);
    }



    

    //Create the edit menu.
    protected JMenu createEditMenu() {
        JMenu menu = new JMenu("Edit");
        saveAction = new SaveAction();
        menu.add(saveAction);
        saveHTMLAction = new SaveHTMLAction();
        menu.add(saveHTMLAction);
        return menu;
    }
    
    protected SimpleAttributeSet[] initAttributes(int length) {
        //Hard-code some attributes.
        SimpleAttributeSet[] attrs = new SimpleAttributeSet[length];

        attrs[0] = new SimpleAttributeSet();
        StyleConstants.setFontFamily(attrs[0], "SansSerif");
        StyleConstants.setFontSize(attrs[0], 16);

        attrs[1] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setBold(attrs[1], true);

        attrs[2] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setItalic(attrs[2], true);

        attrs[3] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setFontSize(attrs[3], 20);

        attrs[4] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setFontSize(attrs[4], 12);

        attrs[5] = new SimpleAttributeSet(attrs[0]);
        StyleConstants.setForeground(attrs[5], Color.red);

        return attrs;
    }

    //The following two methods allow us to find an
    //action provided by the editor kit by its name.
    private HashMap<Object, Action> createActionTable(JTextComponent textComponent) {
        HashMap<Object, Action> actions = new HashMap<Object, Action>();
        Action[] actionsArray = textComponent.getActions();
        for (int i = 0; i < actionsArray.length; i++) {
            Action a = actionsArray[i];
            actions.put(a.getValue(Action.NAME), a);
        }
	return actions;
    }

    private Action getActionByName(String name) {
        return actions.get(name);
    }
    class SaveAction extends AbstractAction {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public SaveAction() {
            super("Save");
            setEnabled(true);
        }

        public void actionPerformed(ActionEvent e) {
        	int returnVal = fc2.showSaveDialog(Aken.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc2.getSelectedFile();
                PrintWriter writer;
                String nimi = file.getName();
                String path = "";
                if(nimi.split("\\.")[nimi.split("\\.").length-1].equals("txt") || nimi.split("\\.")[nimi.split("\\.").length-1].equals("TXT")){
                	path = file.getAbsolutePath();
                }
                else{
                	path = file.getAbsolutePath() + ".txt";
                }
				try {
					writer = new PrintWriter(path, "UTF-8");
	                writer.println(textPane.getText());
	                writer.close();
				} catch (FileNotFoundException | UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
            }
        }

    }
    class SaveHTMLAction extends AbstractAction {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public SaveHTMLAction() {
            super("Save as HTML");
            setEnabled(true);
        }

        public void actionPerformed(ActionEvent e) {
        	int returnVal = fc2.showSaveDialog(Aken.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc2.getSelectedFile();
                String nimi = file.getName();
                String path = "";
                if(nimi.split("\\.")[nimi.split("\\.").length-1].equals("html") || nimi.split("\\.")[nimi.split("\\.").length-1].equals("HTML")){
                	path = file.getAbsolutePath();
                }
                else{
                	path = file.getAbsolutePath() + ".html";
                }
                PrintWriter writer;
				try {
					writer = new PrintWriter(path, "UTF-8");
					String sisu = textPane.getText();
					String hind = "";
					String prinditav = "<!DOCTYPE html> \n <html> \n <head> \n <meta charset='UTF-8'> \n<style> \n table,td,th{border:1px solid black;} \n table {width:100%;position:absolute;left:25%;} \n th{height:50px;} </style> \n </head> \n <body> \n \n <table style='width:50%; text-align:center;'> \n <tr> \n <th>Pitsa</th> \n <th>Komponendid</th> \n <th>Hind</th> \n </tr>" ;
					for(String x : map.keySet()){
			        	int count = 0;
			        	prinditav = prinditav + "<tr> \n <td>" + x +"</td> \n";
//			        	textPane.replaceSelection(x);
			            for(String y : map.get(x)){
			            	if(count == 0){
			            		hind = y;
			            		prinditav = prinditav + "<td>";
//			            		textPane.replaceSelection("\t \t \t" + y + "EUR" + "\n    ");
			            	}
			            	else{
			            		prinditav = prinditav + y + ",   ";
//			            	textPane.replaceSelection(y + "   ");
			            	}
			            	count ++;
			            }
			            prinditav = prinditav + "</td><td>"+hind+"EUR</tr>";
			            
//			            textPane.replaceSelection("\n\n\n");
			        }
					prinditav = prinditav + "</table> \n </body> \n </html>";
					
	                writer.println(prinditav);
	                writer.close();
				} catch (FileNotFoundException | UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
            }
        }

    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI(Map<String, List<String>> menu) {
        //Create and set up the window.
        final Aken frame = new Aken(menu);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //The standard main method.
    public static void run(final Map<String, List<String>> menu) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
    	map = menu;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
	        UIManager.put("swing.boldMetal", Boolean.FALSE);
		createAndShowGUI(menu);
            }
        });
    }
}