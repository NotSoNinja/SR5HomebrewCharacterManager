package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

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

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTabbedPane;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

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
		
		QuickStatPanel quickInfoPanel;
		if(characters.size() > 0){
			quickInfoPanel = new QuickStatPanel(characters.get(0));
		}else{
			quickInfoPanel = new QuickStatPanel(null);
		}
		selectionTab.add(quickInfoPanel, BorderLayout.WEST);
		
		characterPanel = new JPanel();
		selectionTab.add(characterPanel, BorderLayout.CENTER);
		characterPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		characterPanel.add(scrollPane);
		initCharacterSelect();
		
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
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnHelp.add(mntmHelp);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnHelp.add(mntmPreferences);
	}
	
	private void initCharacterSelect(){
		//TODO display characters by name and portrait (100x100px) in characterPanel
		
	}

}
