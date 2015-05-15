package objects.system;

import javax.swing.JPanel;
import javax.swing.JToggleButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PriorityTablePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JToggleButton buttons[][]; //[y][x], y is priority, x is category
	private boolean canContinue = false;

	/**
	 * Create the panel.
	 */
	public PriorityTablePanel() {
		buttons = new JToggleButton[6][6];
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblPriority = new JLabel("Priority");
		GridBagConstraints gbc_lblPriority = new GridBagConstraints();
		gbc_lblPriority.insets = new Insets(0, 0, 5, 5);
		gbc_lblPriority.gridx = 0;
		gbc_lblPriority.gridy = 0;
		add(lblPriority, gbc_lblPriority);
		
		JLabel lblMetatype = new JLabel("Metatype");
		GridBagConstraints gbc_lblMetatype = new GridBagConstraints();
		gbc_lblMetatype.insets = new Insets(0, 0, 5, 5);
		gbc_lblMetatype.gridx = 1;
		gbc_lblMetatype.gridy = 0;
		add(lblMetatype, gbc_lblMetatype);
		
		JLabel lblAttributes = new JLabel("Attributes");
		GridBagConstraints gbc_lblAttributes = new GridBagConstraints();
		gbc_lblAttributes.insets = new Insets(0, 0, 5, 5);
		gbc_lblAttributes.gridx = 2;
		gbc_lblAttributes.gridy = 0;
		add(lblAttributes, gbc_lblAttributes);
		
		JLabel lblMagicresonance = new JLabel("Magic/Resonance");
		GridBagConstraints gbc_lblMagicresonance = new GridBagConstraints();
		gbc_lblMagicresonance.insets = new Insets(0, 0, 5, 5);
		gbc_lblMagicresonance.gridx = 3;
		gbc_lblMagicresonance.gridy = 0;
		add(lblMagicresonance, gbc_lblMagicresonance);
		
		JLabel lblSkills = new JLabel("Skills");
		GridBagConstraints gbc_lblSkills = new GridBagConstraints();
		gbc_lblSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkills.gridx = 4;
		gbc_lblSkills.gridy = 0;
		add(lblSkills, gbc_lblSkills);
		
		JLabel lblResources = new JLabel("Resources");
		GridBagConstraints gbc_lblResources = new GridBagConstraints();
		gbc_lblResources.insets = new Insets(0, 0, 5, 0);
		gbc_lblResources.gridx = 5;
		gbc_lblResources.gridy = 0;
		add(lblResources, gbc_lblResources);
		
		JLabel lblA = new JLabel("A");
		GridBagConstraints gbc_lblA = new GridBagConstraints();
		gbc_lblA.insets = new Insets(0, 0, 5, 5);
		gbc_lblA.gridx = 0;
		gbc_lblA.gridy = 1;
		add(lblA, gbc_lblA);
		
		JToggleButton tglbtnMetaA = new JToggleButton("<html>Human(9)<br>Elf(8)<br>Dwarf(7)<br>Ork(7)<br>Troll(5)</html>");
		GridBagConstraints gbc_tglbtnMetaA = new GridBagConstraints();
		gbc_tglbtnMetaA.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnMetaA.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMetaA.gridx = 1;
		gbc_tglbtnMetaA.gridy = 1;
		add(tglbtnMetaA, gbc_tglbtnMetaA);
		buttons[1][1] = tglbtnMetaA;
		
		JToggleButton tglbtnAttribA = new JToggleButton("24");
		GridBagConstraints gbc_tglbtnAttribA = new GridBagConstraints();
		gbc_tglbtnAttribA.fill = GridBagConstraints.BOTH;
		gbc_tglbtnAttribA.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnAttribA.gridx = 2;
		gbc_tglbtnAttribA.gridy = 1;
		add(tglbtnAttribA, gbc_tglbtnAttribA);
		buttons[1][2] = tglbtnAttribA;
		
		JToggleButton tglbtnMagResA = new JToggleButton("Magic/Resonance group A");
		tglbtnMagResA.setToolTipText("<html>Magician/Mystic Adept: Magic 6, 2 rating 5 magical skills, 10 spells<br>Technomancer: Resonance 6, 2 rating 5 resonance skills, 5 complex forms</html>");
		GridBagConstraints gbc_tglbtnMagResA = new GridBagConstraints();
		gbc_tglbtnMagResA.fill = GridBagConstraints.BOTH;
		gbc_tglbtnMagResA.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMagResA.gridx = 3;
		gbc_tglbtnMagResA.gridy = 1;
		add(tglbtnMagResA, gbc_tglbtnMagResA);
		buttons[1][3] = tglbtnMagResA;
		
		JToggleButton tglbtnSkillA = new JToggleButton("46/10");
		GridBagConstraints gbc_tglbtnSkillA = new GridBagConstraints();
		gbc_tglbtnSkillA.fill = GridBagConstraints.BOTH;
		gbc_tglbtnSkillA.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnSkillA.gridx = 4;
		gbc_tglbtnSkillA.gridy = 1;
		add(tglbtnSkillA, gbc_tglbtnSkillA);
		buttons[1][4] = tglbtnSkillA;
		
		JToggleButton tglbtnResA = new JToggleButton("450,000");
		GridBagConstraints gbc_tglbtnResA = new GridBagConstraints();
		gbc_tglbtnResA.fill = GridBagConstraints.BOTH;
		gbc_tglbtnResA.insets = new Insets(0, 0, 5, 0);
		gbc_tglbtnResA.gridx = 5;
		gbc_tglbtnResA.gridy = 1;
		add(tglbtnResA, gbc_tglbtnResA);
		buttons[1][5] = tglbtnResA;
		
		JLabel lblB = new JLabel("B");
		GridBagConstraints gbc_lblB = new GridBagConstraints();
		gbc_lblB.insets = new Insets(0, 0, 5, 5);
		gbc_lblB.gridx = 0;
		gbc_lblB.gridy = 2;
		add(lblB, gbc_lblB);
		
		JToggleButton tglbtnMetaB = new JToggleButton("<html>Human(7)<br>Elf(6)<br>Dwarf(4)<br>Ork(4)<br>Troll(0)</html>");
		GridBagConstraints gbc_tglbtnMetaB = new GridBagConstraints();
		gbc_tglbtnMetaB.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnMetaB.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMetaB.gridx = 1;
		gbc_tglbtnMetaB.gridy = 2;
		add(tglbtnMetaB, gbc_tglbtnMetaB);
		buttons[2][1] = tglbtnMetaB;
		
		JToggleButton tglbtnAttribB = new JToggleButton("20");
		GridBagConstraints gbc_tglbtnAttribB = new GridBagConstraints();
		gbc_tglbtnAttribB.fill = GridBagConstraints.BOTH;
		gbc_tglbtnAttribB.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnAttribB.gridx = 2;
		gbc_tglbtnAttribB.gridy = 2;
		add(tglbtnAttribB, gbc_tglbtnAttribB);
		buttons[2][2] = tglbtnAttribB;
		
		JToggleButton tglbtnMagResB = new JToggleButton("Magic/Resonance group B");
		tglbtnMagResB.setToolTipText("<html>Magician/Mystic Adept: Magic 4, 2 rating 4 magical skills, 7 spells<br>Technomancer: Resonance 4, 2 rating 4 resonance skills, 2 complex forms<br>Adept: Magic 6, one rating 4 active skill<br>Aspected Magician: Magic 5, one rating 4 magical skill group</html>");
		GridBagConstraints gbc_tglbtnMagResB = new GridBagConstraints();
		gbc_tglbtnMagResB.fill = GridBagConstraints.BOTH;
		gbc_tglbtnMagResB.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMagResB.gridx = 3;
		gbc_tglbtnMagResB.gridy = 2;
		add(tglbtnMagResB, gbc_tglbtnMagResB);
		buttons[2][3] = tglbtnMagResB;
		
		JToggleButton tglbtnSkillB = new JToggleButton("36/5");
		GridBagConstraints gbc_tglbtnSkillB = new GridBagConstraints();
		gbc_tglbtnSkillB.fill = GridBagConstraints.BOTH;
		gbc_tglbtnSkillB.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnSkillB.gridx = 4;
		gbc_tglbtnSkillB.gridy = 2;
		add(tglbtnSkillB, gbc_tglbtnSkillB);
		buttons[2][4] = tglbtnSkillB;
		
		JToggleButton tglbtnResB = new JToggleButton("275,000");
		GridBagConstraints gbc_tglbtnResB = new GridBagConstraints();
		gbc_tglbtnResB.fill = GridBagConstraints.BOTH;
		gbc_tglbtnResB.insets = new Insets(0, 0, 5, 0);
		gbc_tglbtnResB.gridx = 5;
		gbc_tglbtnResB.gridy = 2;
		add(tglbtnResB, gbc_tglbtnResB);
		buttons[2][5] = tglbtnResB;
		
		JLabel lblC = new JLabel("C");
		GridBagConstraints gbc_lblC = new GridBagConstraints();
		gbc_lblC.insets = new Insets(0, 0, 5, 5);
		gbc_lblC.gridx = 0;
		gbc_lblC.gridy = 3;
		add(lblC, gbc_lblC);
		
		JToggleButton tglbtnMetaC = new JToggleButton("<html>Human(5)<br>Elf(3)<br>Dwarf(1)<br>Ork(0)</html>");
		GridBagConstraints gbc_tglbtnMetaC = new GridBagConstraints();
		gbc_tglbtnMetaC.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnMetaC.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMetaC.gridx = 1;
		gbc_tglbtnMetaC.gridy = 3;
		add(tglbtnMetaC, gbc_tglbtnMetaC);
		buttons[3][1] = tglbtnMetaC;
		
		JToggleButton tglbtnAttribC = new JToggleButton("16");
		GridBagConstraints gbc_tglbtnAttribC = new GridBagConstraints();
		gbc_tglbtnAttribC.fill = GridBagConstraints.BOTH;
		gbc_tglbtnAttribC.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnAttribC.gridx = 2;
		gbc_tglbtnAttribC.gridy = 3;
		add(tglbtnAttribC, gbc_tglbtnAttribC);
		buttons[3][2] = tglbtnAttribC;
		
		JToggleButton tglbtnMagResC = new JToggleButton("Magic/Resonance group C");
		tglbtnMagResC.setToolTipText("<html>Magician/Mystic Adept: Magic 3, 5 spells<br>Technomancer: Resonance 3, 1 complex forms<br>Adept: Magic 4, one rating 2 active skill<br>Aspected Magician: Magic 3, one rating 2 magical skill group</html>");
		GridBagConstraints gbc_tglbtnMagResC = new GridBagConstraints();
		gbc_tglbtnMagResC.fill = GridBagConstraints.BOTH;
		gbc_tglbtnMagResC.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMagResC.gridx = 3;
		gbc_tglbtnMagResC.gridy = 3;
		add(tglbtnMagResC, gbc_tglbtnMagResC);
		buttons[3][3] = tglbtnMagResC;
		
		JToggleButton tglbtnSkillC = new JToggleButton("28/2");
		GridBagConstraints gbc_tglbtnSkillC = new GridBagConstraints();
		gbc_tglbtnSkillC.fill = GridBagConstraints.BOTH;
		gbc_tglbtnSkillC.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnSkillC.gridx = 4;
		gbc_tglbtnSkillC.gridy = 3;
		add(tglbtnSkillC, gbc_tglbtnSkillC);
		buttons[3][4] = tglbtnSkillC;
		
		JToggleButton tglbtnResC = new JToggleButton("140,000");
		GridBagConstraints gbc_tglbtnResC = new GridBagConstraints();
		gbc_tglbtnResC.fill = GridBagConstraints.BOTH;
		gbc_tglbtnResC.insets = new Insets(0, 0, 5, 0);
		gbc_tglbtnResC.gridx = 5;
		gbc_tglbtnResC.gridy = 3;
		add(tglbtnResC, gbc_tglbtnResC);
		buttons[3][5] = tglbtnResC;
		
		JLabel lblD = new JLabel("D");
		GridBagConstraints gbc_lblD = new GridBagConstraints();
		gbc_lblD.insets = new Insets(0, 0, 5, 5);
		gbc_lblD.gridx = 0;
		gbc_lblD.gridy = 4;
		add(lblD, gbc_lblD);
		
		JToggleButton tglbtnMetaD = new JToggleButton("<html>Human(3)<br>Elf(0)</html>");
		GridBagConstraints gbc_tglbtnMetaD = new GridBagConstraints();
		gbc_tglbtnMetaD.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnMetaD.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMetaD.gridx = 1;
		gbc_tglbtnMetaD.gridy = 4;
		add(tglbtnMetaD, gbc_tglbtnMetaD);
		buttons[4][1] = tglbtnMetaD;
		
		JToggleButton tglbtnAttribD = new JToggleButton("14");
		GridBagConstraints gbc_tglbtnAttribD = new GridBagConstraints();
		gbc_tglbtnAttribD.fill = GridBagConstraints.BOTH;
		gbc_tglbtnAttribD.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnAttribD.gridx = 2;
		gbc_tglbtnAttribD.gridy = 4;
		add(tglbtnAttribD, gbc_tglbtnAttribD);
		buttons[4][2] = tglbtnAttribD;
		
		JToggleButton tglbtnMagResD = new JToggleButton("Magic/Resonance group D");
		tglbtnMagResD.setToolTipText("<html>Adept: Magic 2<br>Aspected Magician: Magic 2</html>");
		GridBagConstraints gbc_tglbtnMagResD = new GridBagConstraints();
		gbc_tglbtnMagResD.fill = GridBagConstraints.BOTH;
		gbc_tglbtnMagResD.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMagResD.gridx = 3;
		gbc_tglbtnMagResD.gridy = 4;
		add(tglbtnMagResD, gbc_tglbtnMagResD);
		buttons[4][3] = tglbtnMagResD;
		
		JToggleButton tglbtnSkillD = new JToggleButton("22/0");
		GridBagConstraints gbc_tglbtnSkillD = new GridBagConstraints();
		gbc_tglbtnSkillD.fill = GridBagConstraints.BOTH;
		gbc_tglbtnSkillD.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnSkillD.gridx = 4;
		gbc_tglbtnSkillD.gridy = 4;
		add(tglbtnSkillD, gbc_tglbtnSkillD);
		buttons[4][4] = tglbtnSkillD;
		
		JToggleButton tglbtnResD = new JToggleButton("50,000");
		GridBagConstraints gbc_tglbtnResD = new GridBagConstraints();
		gbc_tglbtnResD.fill = GridBagConstraints.BOTH;
		gbc_tglbtnResD.insets = new Insets(0, 0, 5, 0);
		gbc_tglbtnResD.gridx = 5;
		gbc_tglbtnResD.gridy = 4;
		add(tglbtnResD, gbc_tglbtnResD);
		buttons[4][5] = tglbtnResD;
		
		JLabel lblE = new JLabel("E");
		GridBagConstraints gbc_lblE = new GridBagConstraints();
		gbc_lblE.insets = new Insets(0, 0, 0, 5);
		gbc_lblE.gridx = 0;
		gbc_lblE.gridy = 5;
		add(lblE, gbc_lblE);
		
		JToggleButton tglbtnMetaE = new JToggleButton("Human(1)");
		GridBagConstraints gbc_tglbtnMetaE = new GridBagConstraints();
		gbc_tglbtnMetaE.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnMetaE.insets = new Insets(0, 0, 0, 5);
		gbc_tglbtnMetaE.gridx = 1;
		gbc_tglbtnMetaE.gridy = 5;
		add(tglbtnMetaE, gbc_tglbtnMetaE);
		buttons[5][1] = tglbtnMetaE;
		
		JToggleButton tglbtnAttribE = new JToggleButton("12");
		GridBagConstraints gbc_tglbtnAttribE = new GridBagConstraints();
		gbc_tglbtnAttribE.fill = GridBagConstraints.BOTH;
		gbc_tglbtnAttribE.insets = new Insets(0, 0, 0, 5);
		gbc_tglbtnAttribE.gridx = 2;
		gbc_tglbtnAttribE.gridy = 5;
		add(tglbtnAttribE, gbc_tglbtnAttribE);
		buttons[5][2] = tglbtnAttribE;
		
		JToggleButton tglbtnMagResE = new JToggleButton("Magic/Resonance group E");
		tglbtnMagResE.setToolTipText("Nothing at all.");
		GridBagConstraints gbc_tglbtnMagResE = new GridBagConstraints();
		gbc_tglbtnMagResE.fill = GridBagConstraints.BOTH;
		gbc_tglbtnMagResE.insets = new Insets(0, 0, 0, 5);
		gbc_tglbtnMagResE.gridx = 3;
		gbc_tglbtnMagResE.gridy = 5;
		add(tglbtnMagResE, gbc_tglbtnMagResE);
		buttons[5][3] = tglbtnMagResE;
		
		JToggleButton tglbtnSkillE = new JToggleButton("18/0");
		GridBagConstraints gbc_tglbtnSkillE = new GridBagConstraints();
		gbc_tglbtnSkillE.fill = GridBagConstraints.BOTH;
		gbc_tglbtnSkillE.insets = new Insets(0, 0, 0, 5);
		gbc_tglbtnSkillE.gridx = 4;
		gbc_tglbtnSkillE.gridy = 5;
		add(tglbtnSkillE, gbc_tglbtnSkillE);
		buttons[5][4] = tglbtnSkillE;
		
		JToggleButton tglbtnResE = new JToggleButton("6,000");
		GridBagConstraints gbc_tglbtnResE = new GridBagConstraints();
		gbc_tglbtnResE.fill = GridBagConstraints.BOTH;
		gbc_tglbtnResE.gridx = 5;
		gbc_tglbtnResE.gridy = 5;
		add(tglbtnResE, gbc_tglbtnResE);
		buttons[5][5] = tglbtnResE;
		int i = 0;
		int j = 0;
		for(i = 1; i < 6; i++){
			for(j = 1; j < 6; j++){
				buttons[j][i].addActionListener(new PriorityTableListener(this, i, j));
			}
		}
	}
	
	/**
	 * Corrects the state of the other buttons according to the selection of a new one
	 * @param x The x-coordinate of the newly selected button
	 * @param y The y-coordinate of the newly selected button
	 */
	public void rectifySelection(int x, int y){
		int i = 0;
		for(i = 1; i < 6; i++){
			if(buttons[y][i].isSelected()){
				buttons[y][i].setSelected(false);
			}
		}
		for(i = 1; i < 6; i++){
			if(buttons[i][x].isSelected()){
				buttons[i][x].setSelected(false);
			}
		}
		int j = 0;
		int count = 0;
		for(i = 1; i < 6; i++){
			for(j = 1; j < 6; j++){
				if(buttons[j][i].isSelected()){
					count++;
					break;
				}
			}
		}
		if(count == 5){
			canContinue = true;
		}else{
			canContinue = false;
		}
	}
	
	/**
	 * @return Whether or not the configuration of the character's stats is valid.
	 */
	public boolean canContinue() {
		return canContinue;
	}

	/**
	 * Retrieves a button from the 2D array
	 * @param x the x coordinate of the button
	 * @param y the y coordinate of the button
	 * @return The button at a certain location
	 */
	public JToggleButton getButton(int x, int y) {
		return buttons[y][x];
	}
}
