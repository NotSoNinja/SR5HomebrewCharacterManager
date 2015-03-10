package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.GridLayout;

import javax.swing.JTabbedPane;

import objects.system.QuickStatPanel;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 6841497333789115515L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
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
		
		QuickStatPanel quickInfoPanel = new QuickStatPanel(null);//TODO a proper default value for this
		selectionTab.add(quickInfoPanel, BorderLayout.WEST);
		
		JPanel characterPanel = new JPanel();
		selectionTab.add(characterPanel, BorderLayout.CENTER);
		
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
	
	private void initContentPane(){
		//TODO copy stuff here
	}

}
