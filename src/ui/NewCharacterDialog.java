package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

public class NewCharacterDialog extends JDialog {

	private static final long serialVersionUID = -3233060217088872784L;
	int karma, essence;
	String name, player, desc;
	NewCharacterDialog parent = this;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private NewCharacterDialog d;
	private JEditorPane editorPane;

	/**
	 * Create the dialog.
	 */
	public NewCharacterDialog(MainWindow parent) {
		d = this;
		setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[104px][86px,grow]", "[20px][][][][][][][grow]"));
		{
			JLabel lblEnterStartingKarma = new JLabel("Enter Starting Karma:");
			contentPanel.add(lblEnterStartingKarma, "cell 0 0,alignx right,aligny center");
		}
		{
			textField = new JTextField();
			textField.setText("25");
			contentPanel.add(textField, "cell 1 0,alignx left,aligny center");
			textField.setColumns(10);
		}
		{
			JLabel lblEnterStartingEssence = new JLabel("Enter Starting Essence:");
			contentPanel.add(lblEnterStartingEssence, "cell 0 1,alignx trailing");
		}
		{
			textField_3 = new JTextField();
			textField_3.setText("6");
			contentPanel.add(textField_3, "cell 1 1,alignx left");
			textField_3.setColumns(10);
		}
		{
			JLabel lblEnterCharacterName = new JLabel("Enter Character Name:");
			contentPanel.add(lblEnterCharacterName, "cell 0 2,alignx right");
		}
		{
			textField_1 = new JTextField();
			contentPanel.add(textField_1, "cell 1 2,growx,aligny center");
			textField_1.setColumns(10);
		}
		{
			JLabel lblEnterYourName = new JLabel("Enter Your Name:");
			contentPanel.add(lblEnterYourName, "cell 0 3,alignx right");
		}
		{
			textField_2 = new JTextField();
			contentPanel.add(textField_2, "cell 1 3,growx");
			textField_2.setColumns(10);
		}
		{
			JLabel lblEnterAShort = new JLabel("Enter a Short Description:");
			contentPanel.add(lblEnterAShort, "cell 0 4,alignx right");
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, "cell 1 4 1 4,grow");
			{
				editorPane = new JEditorPane();
				editorPane.setToolTipText("");
				scrollPane.setViewportView(editorPane);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						karma = Integer.parseInt(textField.getText());
						essence = Integer.parseInt(textField_3.getText());
						name = textField_1.getText();
						player = textField_2.getText();
						desc = editorPane.getText();
						d.setVisible(false);
						parent.addCharacter(d);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						d.setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public int getKarma(){
		return karma;
	}
	public int getEssence(){
		return essence;
	}
	public String getName(){
		return name;
	}
	public String getPlayer(){
		return player;
	}
	public String getDescription(){
		return desc;
	}

}
