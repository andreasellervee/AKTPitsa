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

public class JPitsa extends JFrame {
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
    JFileChooser fc;
    List<String> a;
    List<String> b;
    List<String> c;
    List<String> d;
    Aken abc;

    //undo helpers
    protected UndoAction undoAction;
    protected SaveAction saveAction;
    protected LoadAction loadAction;
    protected RedoAction redoAction;
    protected UndoManager undo = new UndoManager();
	private RunAction runAction;

    public JPitsa() {
        super("JPitsa NomNom");
        fc = new JFileChooser();

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

        //Create the text area for the status log and configure it.
        changeLog = new JTextArea(5, 30);
        changeLog.setEditable(false);
        JScrollPane scrollPaneForLog = new JScrollPane(changeLog);

        //Create a split pane for the change log and the text area.
        JSplitPane splitPane = new JSplitPane(
                                       JSplitPane.VERTICAL_SPLIT,
                                       scrollPane, scrollPaneForLog);
        splitPane.setOneTouchExpandable(true);

        //Add the components.
        getContentPane().add(splitPane, BorderLayout.CENTER);

        //Set up the menu bar.
        actions=createActionTable(textPane);
        JMenu editMenu = createEditMenu();
        JMenuBar mb = new JMenuBar();
        mb.add(editMenu);
        setJMenuBar(mb);
        
        textPane.setCaretPosition(0);

        //Start watching for undoable edits and caret changes.
        doc.addUndoableEditListener(new MyUndoableEditListener());
        doc.addDocumentListener(new MyDocumentListener());
    }


    //This one listens for edits that can be undone.
    protected class MyUndoableEditListener
                    implements UndoableEditListener {
        public void undoableEditHappened(UndoableEditEvent e) {
            //Remember the edit and update the menus.
            undo.addEdit(e.getEdit());
            undoAction.updateUndoState();
            redoAction.updateRedoState();
        }
    }

    //And this one listens for any changes to the document.
    protected class MyDocumentListener
                    implements DocumentListener {
        public void insertUpdate(DocumentEvent e) {
            displayEditInfo(e);
        }
        public void removeUpdate(DocumentEvent e) {
            displayEditInfo(e);
        }
        public void changedUpdate(DocumentEvent e) {
            displayEditInfo(e);
        }
        private void displayEditInfo(DocumentEvent e) {
            Document document = e.getDocument();
            int changeLength = e.getLength();
            if(changeLength != 1){
            	changeLog.append(e.getType().toString() + ": " +
                        changeLength + " character" +
                        ((changeLength == 1) ? ". " : "s. ") +
                        " Text length = " + document.getLength() +
                        "." + newline);
            }
            
        }
    }

    //Add a couple of emacs key bindings for navigation.
    

    //Create the edit menu.
    protected JMenu createEditMenu() {
        JMenu menu = new JMenu("Edit");
        runAction = new RunAction();
        menu.add(runAction);
        loadAction = new LoadAction();
        menu.add(loadAction);
        saveAction = new SaveAction();
        menu.add(saveAction);
        menu.addSeparator();
        undoAction = new UndoAction();
        menu.add(undoAction);

        redoAction = new RedoAction();
        menu.add(redoAction);
        
        
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
    class RunAction extends AbstractAction {
        public RunAction() {
            super("Run");
            changeLog.setText("TERETULEMAST JPitsaMenüüsse!!");
            setEnabled(true);
        }

        public void actionPerformed(ActionEvent e) {
            changeLog.setText("");
        	String kood = textPane.getText();
        	Map<String, List<String>> menu = new HashMap<String, List<String>>();
            try{
                JPitsaMenyyParser pitsaparser = new JPitsaMenyyParser(kood);
                if(pitsaparser.showmenu){
                    Aken.run(pitsaparser.pitsad);
                }
                if(pitsaparser.showWithI){
                    Aken.run(pitsaparser.koostisega);
                }
                if(pitsaparser.showWithoutI){
                    Aken.run(pitsaparser.koostiseta);
                }
                if(pitsaparser.showWithT){
                    Aken.run(pitsaparser.tyybiga);
                }
                if(pitsaparser.showWithoutT){
                    Aken.run(pitsaparser.tyybita);
                }
            } catch (Exception ex){
                changeLog.setText(ex.getMessage());
            }
        	
        	
//        	// Test Map
//        	List<String> a = new ArrayList<String>();
//        	a.add("10");
//        	a.add("Kapsas");
//        	a.add("Porgand");
//        	a.add("Oksad");
//        	menu.put("Jänesepitsa", a);
//
//        	List<String> b = new ArrayList<String>();
//        	b.add("8");
//        	b.add("Juust");
//        	b.add("Veel juustu");
//        	b.add("VEEL JUUSTU");
//        	menu.put("Juustupitsa", b);
//
//        	List<String> c = new ArrayList<String>();
//        	c.add("9");
//        	c.add("Juust");
//        	c.add("Vorst");
//        	c.add("Pullipeenis");
//        	menu.put("Vorstipitsa", c);
//
//        	List<String> d = new ArrayList<String>();
//        	d.add("25");
//        	d.add("Juust(?)");
//        	d.add("Õied");
//        	d.add("Lehed");
//        	menu.put("Kazza", d);
//
//        	Aken.run(menu);
        }

    }
    class LoadAction extends AbstractAction {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public LoadAction() {
            super("Load");
            setEnabled(true);
        }

        public void actionPerformed(ActionEvent e) {
        	int returnVal = fc.showOpenDialog(JPitsa.this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
				BufferedReader in = new BufferedReader(new FileReader(file));
				String line;
	            try {
	            	textPane.setText("");
					while ((line = in.readLine()) != null) {
				        textPane.setCaretPosition(textPane.getDocument().getLength());
					    textPane.replaceSelection(line + "\n");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            
            changeLog.append("Opening: " + file.getName() + "." + newline);
        } else {
        	changeLog.append("Open command cancelled by user." + newline);
        }
        changeLog.setCaretPosition(changeLog.getDocument().getLength());
        }
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
        	int returnVal = fc.showSaveDialog(JPitsa.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                PrintWriter writer;
				try {
					writer = new PrintWriter(file.getAbsolutePath(), "UTF-8");
	                writer.println(textPane.getText());
	                writer.close();
				} catch (FileNotFoundException | UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
                
                changeLog.append("Saving: " + file.getName() + "." + newline);
            } else {
            	changeLog.append("Save command cancelled by user." + newline);
            }
            changeLog.setCaretPosition(changeLog.getDocument().getLength());
        }

    }
    class UndoAction extends AbstractAction {
        public UndoAction() {
            super("Undo");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                undo.undo();
            } catch (CannotUndoException ex) {
                System.out.println("Unable to undo: " + ex);
                ex.printStackTrace();
            }
            updateUndoState();
            redoAction.updateRedoState();
        }

        protected void updateUndoState() {
            if (undo.canUndo()) {
                setEnabled(true);
                putValue(Action.NAME, undo.getUndoPresentationName());
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Undo");
            }
        }
    }

    class RedoAction extends AbstractAction {
        public RedoAction() {
            super("Redo");
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                undo.redo();
            } catch (CannotRedoException ex) {
                System.out.println("Unable to redo: " + ex);
                ex.printStackTrace();
            }
            updateRedoState();
            undoAction.updateUndoState();
        }

        protected void updateRedoState() {
            if (undo.canRedo()) {
                setEnabled(true);
                putValue(Action.NAME, undo.getRedoPresentationName());
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Redo");
            }
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        final JPitsa frame = new JPitsa();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //The standard main method.
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
	        UIManager.put("swing.boldMetal", Boolean.FALSE);
		createAndShowGUI();
            }
        });
    }
}