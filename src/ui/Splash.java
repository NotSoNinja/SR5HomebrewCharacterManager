package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;

import java.awt.GridLayout;

import javax.swing.JButton;

public class Splash extends JFrame {
	private static final long serialVersionUID = 9146073660186581722L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
					frame.setTitle("Shadowrun 5 Homebrew Character Manager");
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
	public Splash() {
		/* Set up the window */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JLabel label;
		JButton btnAddSelected = new JButton("Add Selected");
		JButton btnRemoveSelected = new JButton("Remove Selected");

		/* Display the Logo! */
		try {
			BufferedImage img = ImageIO.read(new File("bin/homebrewlogo.png"));
			ImageIcon icon = new ImageIcon(img);
			label = new JLabel(icon);
		} catch (IOException e) {
			e.printStackTrace();
			label = new JLabel("Missing Logo");
		}
		contentPane.add(label, BorderLayout.NORTH);

		/* ArrayLists for storing the file objects represented in the list the user sees */
		ArrayList<File> activatedFiles = new ArrayList<File>();
		ArrayList<File> deactivatedFiles = new ArrayList<File>();
		try {
			Files.walk(Paths.get("data")).forEach(filePath -> {
				if (Files.isRegularFile(filePath) && (filePath.toString().endsWith(".saf") || filePath.toString().endsWith(".scf"))) {
					deactivatedFiles.add(new File(filePath.toString()));
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*Set up the first JList */
		DefaultListModel<String> input = new DefaultListModel<String>();
		for(File f : deactivatedFiles){
			input.addElement(f.getName());
		}
		JList<String> list = new JList<String>(input);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setVisibleRowCount(-1);
		list.addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting() == false) {

					if (list.getSelectedIndex() == -1) {
						btnAddSelected.setEnabled(false);
					} else {
						btnAddSelected.setEnabled(true);
					}
				}
			}

		});
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(300, 350));
		contentPane.add(listScroller, BorderLayout.WEST);

		/*Set up the second JList */
		DefaultListModel<String> output = new DefaultListModel<String>();
		JList<String> list_1 = new JList<String>(output);
		list_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list_1.setVisibleRowCount(-1);
		list_1.addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting() == false) {

					if (list.getSelectedIndex() == -1) {
						btnRemoveSelected.setEnabled(false);
					} else {
						btnRemoveSelected.setEnabled(true);
					}
				}
			}

		});
		JScrollPane list_1Scroller = new JScrollPane(list_1);
		list_1Scroller.setPreferredSize(new Dimension(300, 350));
		contentPane.add(list_1Scroller, BorderLayout.EAST);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 1, 0, 5));

		/* configure and add buttons to the panel */
		btnAddSelected.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (list.getSelectedIndex() != -1){
					for(int i : list.getSelectedIndices()){
						output.addElement(input.remove(i));
						activatedFiles.add(deactivatedFiles.remove(i));
					}
				}
			}
		});
		panel.add(btnAddSelected);
		JButton btnAddAll = new JButton("Add All");
		btnAddAll.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i < input.size(); i++){
					output.addElement(input.remove(i));
					activatedFiles.add(deactivatedFiles.remove(i));
				}
			}
		});
		panel.add(btnAddAll);
		btnRemoveSelected.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (list_1.getSelectedIndex() != -1){
					for(int i : list_1.getSelectedIndices()){
						input.addElement(output.remove(i));
						deactivatedFiles.add(activatedFiles.remove(i));
					}
				}
			}
		});
		panel.add(btnRemoveSelected);
		JButton btnRemoveAll = new JButton("Remove All");
		btnRemoveAll.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i < output.size(); i++){
					input.addElement(output.remove(i));
					deactivatedFiles.add(activatedFiles.remove(i));
				}
			}
		});
		panel.add(btnRemoveAll);
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser selector = new JFileChooser("data");
				selector.setDialogTitle("Shadowrun 5 Homebrew Character Manager");
				selector.showOpenDialog(btnBrowse);
				for(File f : selector.getSelectedFiles()){
					input.addElement(f.toString());
					deactivatedFiles.add(f);
				}
			}
		});
		panel.add(btnBrowse);
		JButton btnLaunch = new JButton("Launch");
		btnLaunch.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
		panel.add(btnLaunch);
	}

}
