package objects.system;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import objects.Character;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class QuickStatPanel extends JPanel {
	private static final long serialVersionUID = -1060189945005828759L;
	
	JLabel lblName, lblMetatype, lblSex, lblArchtype, lblKarma_1, lblKarma, lblBody, lblBdy, lblAgility, lblAgi, lblReaction;
	JLabel lblRea, lblStrength, lblStr, lblWillpower, lblWil, lblLogic, lblLog, lblIntuition, lblInt, lblCharisma, lblCha, lblEdge, lblEdg;
	JLabel lblNuyen, lblNuyen_1;
	JSeparator separator, separator_1;
	
	/**
	 * Create the panel.
	 */
	public QuickStatPanel(Character c) {
		setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		this.setSize(300,500);
		setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][][][]"));
		
		displayInfo(c);
	}
	
	public void displayInfo(Character c){
		if(c != null){
			lblName = new JLabel(c.getName());
			add(lblName, "cell 0 0 4 1");
			
			lblMetatype = new JLabel(c.getTypeString());
			add(lblMetatype, "cell 4 0 4 1");
			
			lblSex = new JLabel(c.getSex());
			add(lblSex, "cell 0 2 3 1");
			
			lblArchtype = new JLabel(c.getArchtype());
			add(lblArchtype, "cell 4 2 4 1");
			
			lblKarma_1 = new JLabel("Karma:");
			add(lblKarma_1, "cell 3 8,alignx right");
			
			lblKarma = new JLabel(new Integer(c.getKarma()).toString());
			add(lblKarma, "cell 4 8");
			
			lblBody = new JLabel("Body:");
			add(lblBody, "cell 0 4,alignx right");
			lblBdy = new JLabel(new Integer(c.getBdy()).toString());
			add(lblBdy, "cell 1 4");
			
			lblAgility = new JLabel("Agility:");
			add(lblAgility, "cell 3 4,alignx right");
			lblAgi = new JLabel(new Integer(c.getAgi()).toString());
			add(lblAgi, "cell 4 4");
			
			lblReaction = new JLabel("Reaction:");
			add(lblReaction, "cell 6 4,alignx right");
			lblRea = new JLabel(new Integer(c.getRea()).toString());
			add(lblRea, "cell 7 4");
			
			lblStrength = new JLabel("Strength:");
			add(lblStrength, "cell 0 5,alignx right");
			lblStr = new JLabel(new Integer(c.getStr()).toString());
			add(lblStr, "cell 1 5");
			
			lblWillpower = new JLabel("Willpower:");
			add(lblWillpower, "cell 3 5,alignx right");
			lblWil = new JLabel(new Integer(c.getWil()).toString());
			add(lblWil, "cell 4 5");
			
			lblLogic = new JLabel("Logic:");
			add(lblLogic, "cell 6 5,alignx right");
			lblLog = new JLabel(new Integer(c.getLog()).toString());
			add(lblLog, "cell 7 5");
			
			lblIntuition = new JLabel("Intuition:");
			add(lblIntuition, "cell 0 6,alignx right");
			lblInt = new JLabel(new Integer(c.getIntu()).toString());
			add(lblInt, "cell 1 6");
			
			separator = new JSeparator();
			add(separator, "cell 2 6");
			
			lblCharisma = new JLabel("Charisma:");
			add(lblCharisma, "cell 3 6,alignx right");
			lblCha = new JLabel(new Integer(c.getCha()).toString());
			add(lblCha, "cell 4 6");
			
			separator_1 = new JSeparator();
			add(separator_1, "cell 5 6");
			
			lblEdge = new JLabel("Edge:");
			add(lblEdge, "cell 6 6,alignx right");
			lblEdg = new JLabel(new Integer(c.getEdge()).toString());
			add(lblEdg, "cell 7 6");
			
			lblNuyen = new JLabel("Nuyen:");
			add(lblNuyen, "cell 0 8,alignx right");
			
			lblNuyen_1 = new JLabel(new Integer(c.getNuyen()).toString());
			add(lblNuyen_1, "cell 1 8 3 1");
		}else{
			lblName = new JLabel("No Character Selected");
			add(lblName, "cell 0 0");
		}
	}

}
