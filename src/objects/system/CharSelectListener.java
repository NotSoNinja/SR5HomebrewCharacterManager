package objects.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import objects.Character;

import javax.swing.JToggleButton;

public class CharSelectListener implements ActionListener {

	JToggleButton parent;
	QuickStatPanel quickInfoPanel;
	ArrayList<JToggleButton> makeshiftExclusivity;
	Character c;
	
	public CharSelectListener(JToggleButton b, QuickStatPanel q, ArrayList<JToggleButton> buttons, Character c){
		parent = b;
		quickInfoPanel = q;
		makeshiftExclusivity = buttons;
		this.c = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(JToggleButton b : makeshiftExclusivity){
			if(b != parent){
				b.setSelected(false);
			}
		}
		quickInfoPanel.displayInfo(c);
	}

}
