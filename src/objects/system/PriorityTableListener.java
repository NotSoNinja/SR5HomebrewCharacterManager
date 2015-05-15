package objects.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PriorityTableListener implements ActionListener {
	PriorityTablePanel parent;
	int x,y;

	public PriorityTableListener(PriorityTablePanel parent, int x, int y) {
		this.parent = parent;
		this.x = x;
		this.y = y;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(parent.getButton(x, y).isSelected()){
			parent.rectifySelection(x, y);
		}
	}

}
