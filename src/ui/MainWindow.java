package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTabbedPane;

import com.google.gson.Gson;

import objects.system.CharSelectListener;
import objects.system.QuickStatPanel;
import objects.system.SR5Archive;
import objects.Character;

import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 6841497333789115515L;
	private JPanel contentPane;
	ArrayList<Character> characters;
	ArrayList<SR5Archive> archives;
	JPanel characterPanel;
	QuickStatPanel quickInfoPanel;
	Character selectedCharacter;

	/**
	 * Create the frame.
	 */
	public MainWindow(ArrayList<File> files) {
		/* Take care of the files */
		characters = new ArrayList<Character>();
		archives = new ArrayList<SR5Archive>();
		Gson converter = new Gson();
		String contents;
		for(File f : files){
			if(f.getName().endsWith(".saf")){
				try {
					contents = new Scanner(f).useDelimiter("\\Z").next();
					archives.add(converter.fromJson(contents, new SR5Archive(null, 0).getClass()));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else if(f.getName().endsWith(".scf")){
				try {
					contents = new Scanner(f).useDelimiter("\\Z").next();
					characters.add(converter.fromJson(contents, new Character(null, 0, 0, 0).getClass()));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("Invalid file, could not load: " + f.getAbsolutePath());
			}
		}
		
		/* Set window configuration */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		
		/* Set up the menu bar */
		initMenuBar();
		
		/* Set up the content pane */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		/* Set up the Character Select Tab */
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel selectionTab = new JPanel();
		tabbedPane.addTab("Select Character", null, selectionTab, null);
		selectionTab.setLayout(new BorderLayout(0, 0));
		
		/* Display the Logo! */
		JLabel label;
		try {
			BufferedImage img = ImageIO.read(new File("bin/selectCharacter.png"));
			ImageIcon icon = new ImageIcon(img);
			label = new JLabel(icon);
		} catch (IOException e) {
			e.printStackTrace();
			label = new JLabel("Missing Logo");
		}
		selectionTab.add(label, BorderLayout.NORTH);
		
		
		if(characters.size() > 0){
			quickInfoPanel = new QuickStatPanel(characters.get(0));
		}else{
			quickInfoPanel = new QuickStatPanel(null);
		}
		selectionTab.add(quickInfoPanel, BorderLayout.WEST);
		
		characterPanel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane(characterPanel);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		selectionTab.add(scrollPane);
		
		initCharacterSelect();
		
		JPanel buildTab = new JPanel();
		tabbedPane.addTab("Build Character", null, buildTab, null);
		
		JPanel gearTab = new JPanel();
		tabbedPane.addTab("Gear and Powers", null, gearTab, null);
		
		JPanel charSheet = new JPanel();
		tabbedPane.addTab("Character Sheet", null, charSheet, null);
	}
	
	private void initMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCharacter = new JMenu("Character");
		menuBar.add(mnCharacter);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnCharacter.add(mntmNew);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnCharacter.add(mntmLoad);
		
		JMenuItem mntmCharacterSettings = new JMenuItem("Character Settings");
		mnCharacter.add(mntmCharacterSettings);
		
		JMenuItem mntmAddKarma = new JMenuItem("Add Karma");
		mnCharacter.add(mntmAddKarma);
		
		JMenu mnResources = new JMenu("Resources");
		menuBar.add(mnResources);
		
		JMenuItem mntmNewArchive = new JMenuItem("New Archive");
		mnResources.add(mntmNewArchive);
		
		JMenuItem mntmLoadArchive = new JMenuItem("Load Archive");
		mnResources.add(mntmLoadArchive);
		
		JMenuItem mntmChangeActiveArchive = new JMenuItem("Change Active Archive");
		mnResources.add(mntmChangeActiveArchive);
		
		JMenuItem mntmArchiveSettings = new JMenuItem("Archive Settings");
		mnResources.add(mntmArchiveSettings);
		
		JMenu mnWindow = new JMenu("Window");
		menuBar.add(mnWindow);
		
		JMenuItem mntmItemBuilder = new JMenuItem("Item Builder");
		mnWindow.add(mntmItemBuilder);
		
		JMenuItem mntmArchiveManager = new JMenuItem("Archive Manager");
		mnWindow.add(mntmArchiveManager);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnWindow.add(mntmHelp);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnWindow.add(mntmPreferences);
	}
	
	private void initCharacterSelect(){
		//TODO display characters by name and portrait (200x200px) in characterPanel
		characterPanel.setLayout(new GridLayout(0, 6, 10, 10));
		
		Dimension size = new Dimension(200,250);
		JButton btnNewButton = new JButton("New Character");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub (New Character)
			}
		});
		btnNewButton.setMinimumSize(size);
		btnNewButton.setMaximumSize(size);
		btnNewButton.setPreferredSize(size);
		characterPanel.add(btnNewButton);
		JToggleButton btnNewToggleButton;
		
		/*Initialize things that will be used every iteration */
		ArrayList<JToggleButton> makeshiftExclusivity = new ArrayList<JToggleButton>();
		BufferedImage newImage = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics g = newImage.createGraphics();
		
		/* Display already generated Characters for selection */
		for(Character c : characters){
			g.drawImage(c.getPicture(), 0, 0, 200, 200, null);
			ImageIcon icon = new ImageIcon(newImage);
			btnNewToggleButton = new JToggleButton(c.getName(), icon);
			makeshiftExclusivity.add(btnNewToggleButton);
			btnNewToggleButton.setMinimumSize(size);
			btnNewToggleButton.setMaximumSize(size);
			btnNewToggleButton.setPreferredSize(size);
		}
		g.dispose();
		int i = 0;
		for(JToggleButton b : makeshiftExclusivity){
			b.addActionListener(new CharSelectListener(b, quickInfoPanel, makeshiftExclusivity, characters.get(i)));
			characterPanel.add(b);
			i++;
		}
	}

}
