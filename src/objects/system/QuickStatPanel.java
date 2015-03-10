package objects.system;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import objects.Character;
import javax.swing.JSeparator;

public class QuickStatPanel extends JPanel {
	private static final long serialVersionUID = -1060189945005828759L;

	/**
	 * Create the panel.
	 */
	public QuickStatPanel(Character c) {
		this.setSize(300,500);
		setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][][][]"));
		
		JLabel lblName = new JLabel(c.getName());
		add(lblName, "cell 0 0 4 1");
		
		JLabel lblMetatype = new JLabel(c.getTypeString());
		add(lblMetatype, "cell 4 0 4 1");
		
		JLabel lblSex = new JLabel(c.getSex());
		add(lblSex, "cell 0 2 3 1");
		
		JLabel lblKarma_1 = new JLabel("Karma:");
		add(lblKarma_1, "cell 3 2,alignx right");
		
		JLabel lblKarma = new JLabel(new Integer(c.getKarma()).toString());
		add(lblKarma, "cell 4 2");
		
		JLabel lblBody = new JLabel("Body:");
		add(lblBody, "cell 0 4,alignx right");
		
		JLabel lblBdy = new JLabel(new Integer(c.getBdy()).toString());
		add(lblBdy, "cell 1 4");
		
		JLabel lblAgility = new JLabel("Agility:");
		add(lblAgility, "cell 3 4,alignx right");
		
		JLabel lblAgi = new JLabel(new Integer(c.getAgi()).toString());
		add(lblAgi, "cell 4 4");
		
		JLabel lblReaction = new JLabel("Reaction:");
		add(lblReaction, "cell 6 4,alignx right");
		
		JLabel lblRea = new JLabel(new Integer(c.getRea()).toString());
		add(lblRea, "cell 7 4");
		
		JLabel lblStrength = new JLabel("Strength:");
		add(lblStrength, "cell 0 5,alignx right");
		JLabel lblStr = new JLabel(new Integer(c.getStr()).toString());
		add(lblStr, "cell 1 5");
		
		JLabel lblWillpower = new JLabel("Willpower:");
		add(lblWillpower, "cell 3 5,alignx right");
		JLabel lblWil = new JLabel(new Integer(c.getWil()).toString());
		add(lblWil, "cell 4 5");
		
		JLabel lblLogic = new JLabel("Logic:");
		add(lblLogic, "cell 6 5,alignx right");
		JLabel lblLog = new JLabel(new Integer(c.getLog()).toString());
		add(lblLog, "cell 7 5");
		
		JLabel lblIntuition = new JLabel("Intuition:");
		add(lblIntuition, "cell 0 6,alignx right");
		JLabel lblInt = new JLabel(new Integer(c.getIntu()).toString());
		add(lblInt, "cell 1 6");
		
		JSeparator separator = new JSeparator();
		add(separator, "cell 2 6");
		
		JLabel lblCharisma = new JLabel("Charisma:");
		add(lblCharisma, "cell 3 6,alignx right");
		JLabel lblCha = new JLabel(new Integer(c.getCha()).toString());
		add(lblCha, "cell 4 6");
		
		JSeparator separator_1 = new JSeparator();
		add(separator_1, "cell 5 6");
		
		JLabel lblEdge = new JLabel("Edge:");
		add(lblEdge, "cell 6 6,alignx right");
		JLabel lblEdg = new JLabel(new Integer(c.getEdge()).toString());
		add(lblEdg, "cell 7 6");
		
		JLabel lblNuyen = new JLabel("Nuyen:");
		add(lblNuyen, "cell 0 8,alignx right");
		
		JLabel lblNuyen_1 = new JLabel(new Integer(c.getNuyen()).toString());
		add(lblNuyen_1, "cell 1 8 3 1");
		if(c != null){
			//TODO move code here when done writing
		}
	}

}
