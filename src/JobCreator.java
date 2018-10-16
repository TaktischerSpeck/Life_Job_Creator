import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class JobCreator {

	private JFrame frmItemcreatorVBy;
	private JTextField tf_var_name;
	private JTextField tf_amount;
	private JTextField tf_zone;
	private JTextField tf_zone_range;
	private JTextField tf_abbau_item;
	private JCheckBox chb_item_standart;
	private JTextField tf_license_name;
	private JTextField tf_liz_price;
	private boolean is_illegal, is_illegal_item, is_illegal_item2;
	private String side = "civ";
	private JTextField tf_pro_up;
	private JTextField tf_pro_p;
	private JTextField tf_no_lic;
	private JTextField tf_prozess_name;
	private JTextField tf_weight;
	private JTextField tf_buyPrice;
	private JTextField tf_sellPrice;
	private JTextField tf_icon;
	private JCheckBox cb_is_illegal_item;
	private JTextField tx_itm_string;
	private JTextField tf_weight2;
	private JTextField tf_buyPrice2;
	private JTextField tf_sellPrice2;
	private JTextField tf_icon2;
	private JCheckBox cb_is_illegal_item2;
	private JTextField tx_itm_string2;
	private JLabel lblItemName;
	private JLabel lblGewicht;
	private JLabel lblKaufpreis;
	private JLabel lblVerkaufspreis;
	private JLabel lblIllegal_1;
	private JLabel lblEssbar;
	private JLabel lblIconPfad;
	private JLabel lblItemup;
	private JLabel lblItemp;
	private JTextField tf_edible;
	private JTextField tf_edible2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JobCreator window = new JobCreator();
					window.frmItemcreatorVBy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JobCreator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmItemcreatorVBy = new JFrame();
		frmItemcreatorVBy.setTitle("Job creator V1 by TaktischerSpeck (asyetuntitled.de)");
		frmItemcreatorVBy.getContentPane().setForeground(Color.BLACK);
		frmItemcreatorVBy.getContentPane().setFont(new Font("Arial", Font.BOLD, 13));
		frmItemcreatorVBy.setBounds(100, 100, 750, 606);
		frmItemcreatorVBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmItemcreatorVBy.getContentPane().setLayout(null);
		
		tf_var_name = new JTextField();
		tf_var_name.setBounds(123, 13, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_var_name);
		tf_var_name.setColumns(10);
		
		JLabel lblVariabelName = new JLabel("Variabel Name");
		lblVariabelName.setFont(new Font("Arial", Font.BOLD, 13));
		lblVariabelName.setBounds(16, 15, 95, 19);
		frmItemcreatorVBy.getContentPane().add(lblVariabelName);
		
		JLabel lblAnzahl = new JLabel("Anzahl");
		lblAnzahl.setFont(new Font("Arial", Font.BOLD, 13));
		lblAnzahl.setBounds(16, 132, 95, 16);
		frmItemcreatorVBy.getContentPane().add(lblAnzahl);
		
		tf_amount = new JTextField();
		tf_amount.setBounds(123, 129, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_amount);
		tf_amount.setColumns(10);
		
		JLabel Zone_lbl = new JLabel("Abbauzone");
		Zone_lbl.setFont(new Font("Arial", Font.BOLD, 13));
		Zone_lbl.setBounds(16, 161, 95, 16);
		frmItemcreatorVBy.getContentPane().add(Zone_lbl);
		
		tf_zone = new JTextField();
		tf_zone.setBounds(123, 158, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_zone);
		tf_zone.setColumns(10);
		
		JLabel lblZonenGre = new JLabel("Zonen Gr\u00F6\u00DFe");
		lblZonenGre.setFont(new Font("Arial", Font.BOLD, 13));
		lblZonenGre.setBounds(16, 190, 95, 16);
		frmItemcreatorVBy.getContentPane().add(lblZonenGre);
		
		tf_zone_range = new JTextField();
		tf_zone_range.setBounds(123, 187, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_zone_range);
		tf_zone_range.setColumns(10);
		
		tf_abbau_item = new JTextField();
		tf_abbau_item.setText("pickaxe");
		tf_abbau_item.setBounds(123, 221, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_abbau_item);
		tf_abbau_item.setColumns(10);
		
		JLabel lblAbbauItem = new JLabel("Abbau Item");
		lblAbbauItem.setFont(new Font("Arial", Font.BOLD, 13));
		lblAbbauItem.setBounds(16, 224, 95, 16);
		frmItemcreatorVBy.getContentPane().add(lblAbbauItem);
		
		JButton btnGenerate = new JButton("Erstellen");
		btnGenerate.setFont(new Font("Arial", Font.BOLD, 16));
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					gather();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnGenerate.setBounds(12, 496, 150, 50);
		frmItemcreatorVBy.getContentPane().add(btnGenerate);
		
		chb_item_standart = new JCheckBox("Abbau Item standart");
		chb_item_standart.setSelected(true);
		chb_item_standart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chb_item_standart.isSelected()==true) {
					tf_abbau_item.setText("pickaxe");
			    }
				
				if (chb_item_standart.isSelected()==false) {
					tf_abbau_item.setText("");
			    }
			}
		});
		chb_item_standart.setFont(new Font("Arial", Font.BOLD, 13));
		chb_item_standart.setBounds(12, 98, 227, 25);
		frmItemcreatorVBy.getContentPane().add(chb_item_standart);
		
		tf_license_name = new JTextField();
		tf_license_name.setBounds(121, 302, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_license_name);
		tf_license_name.setColumns(10);
		
		JLabel lblNameDerLizenz = new JLabel("Lizenz Name");
		lblNameDerLizenz.setFont(new Font("Arial", Font.BOLD, 13));
		lblNameDerLizenz.setBounds(14, 305, 97, 16);
		frmItemcreatorVBy.getContentPane().add(lblNameDerLizenz);
		
		tf_liz_price = new JTextField();
		tf_liz_price.setBounds(121, 337, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_liz_price);
		tf_liz_price.setColumns(10);
		
		JLabel lblLizenzPreis = new JLabel("Lizenz Preis");
		lblLizenzPreis.setFont(new Font("Arial", Font.BOLD, 13));
		lblLizenzPreis.setBounds(12, 340, 97, 16);
		frmItemcreatorVBy.getContentPane().add(lblLizenzPreis);
		
		JCheckBox chckbxIllegal = new JCheckBox("Illegal?");
		chckbxIllegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxIllegal.isSelected() == true) {
					is_illegal = true;
				}
				
				if (chckbxIllegal.isSelected() == false) {
					is_illegal = false;
				}
			}
		});
		chckbxIllegal.setFont(new Font("Arial", Font.BOLD, 13));
		chckbxIllegal.setBounds(124, 368, 113, 25);
		frmItemcreatorVBy.getContentPane().add(chckbxIllegal);
		
		JLabel lblIllegal = new JLabel("Illegal?");
		lblIllegal.setFont(new Font("Arial", Font.BOLD, 13));
		lblIllegal.setBounds(14, 369, 56, 16);
		frmItemcreatorVBy.getContentPane().add(lblIllegal);
		
		JComboBox cobo_side = new JComboBox();
		cobo_side.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cobo_side.getSelectedItem() == "civ") {
					System.out.println("CIV");
					side = "civ";
				}
				
				if (cobo_side.getSelectedItem() == "cop") {
					System.out.println("cop");
					side = "cop";
				}
				
				if (cobo_side.getSelectedItem() == "med") {
					System.out.println("med");
					side = "med";
				}
				
				if (cobo_side.getSelectedItem() == "adac") {
					System.out.println("adac");
					side = "adac";
				}
			}
		});
		cobo_side.setModel(new DefaultComboBoxModel(new String[] {"civ", "cop", "med", "adac"}));
		cobo_side.setFont(new Font("Arial", Font.BOLD, 13));
		cobo_side.setBounds(121, 402, 116, 22);
		frmItemcreatorVBy.getContentPane().add(cobo_side);
		
		JLabel lblSide = new JLabel("Side");
		lblSide.setFont(new Font("Arial", Font.BOLD, 13));
		lblSide.setBounds(16, 405, 56, 16);
		frmItemcreatorVBy.getContentPane().add(lblSide);
		
		tf_pro_up = new JTextField();
		tf_pro_up.setBounds(459, 129, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_pro_up);
		tf_pro_up.setColumns(10);
		
		tf_pro_p = new JTextField();
		tf_pro_p.setBounds(459, 158, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_pro_p);
		tf_pro_p.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Anzahl unverarbeitet");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(305, 129, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Anzahl verarbeitet");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(305, 158, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ladebalken Schrift");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(305, 187, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lblNewLabel_2);
		
		JLabel lblKeineLizenz = new JLabel("Keine Lizenz kosten");
		lblKeineLizenz.setToolTipText("LOOOOLLL");
		lblKeineLizenz.setFont(new Font("Arial", Font.BOLD, 13));
		lblKeineLizenz.setBounds(305, 221, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lblKeineLizenz);
		
		tf_no_lic = new JTextField();
		tf_no_lic.setBounds(459, 221, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_no_lic);
		tf_no_lic.setColumns(10);
		
		tf_prozess_name = new JTextField();
		tf_prozess_name.setBounds(459, 187, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_prozess_name);
		tf_prozess_name.setColumns(10);
		
		tf_weight = new JTextField();
		tf_weight.setBounds(417, 364, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_weight);
		tf_weight.setColumns(10);
		
		tf_buyPrice = new JTextField();
		tf_buyPrice.setBounds(417, 396, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_buyPrice);
		tf_buyPrice.setColumns(10);
		
		tf_sellPrice = new JTextField();
		tf_sellPrice.setBounds(417, 429, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_sellPrice);
		tf_sellPrice.setColumns(10);
		
		tf_icon = new JTextField();
		tf_icon.setBounds(417, 524, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_icon);
		tf_icon.setColumns(10);
		
		cb_is_illegal_item = new JCheckBox("Illegal?");
		cb_is_illegal_item.setFont(new Font("Arial", Font.BOLD, 13));
		cb_is_illegal_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb_is_illegal_item.isSelected() == true) {
					is_illegal_item = true;
				}
				
				if (cb_is_illegal_item.isSelected() == false) {
					is_illegal_item = false;
				}
			}
		});
		cb_is_illegal_item.setBounds(417, 460, 113, 25);
		frmItemcreatorVBy.getContentPane().add(cb_is_illegal_item);
		
		tx_itm_string = new JTextField();
		tx_itm_string.setBounds(417, 329, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tx_itm_string);
		tx_itm_string.setColumns(10);
		
		tf_weight2 = new JTextField();
		tf_weight2.setColumns(10);
		tf_weight2.setBounds(560, 364, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_weight2);
		
		tf_buyPrice2 = new JTextField();
		tf_buyPrice2.setColumns(10);
		tf_buyPrice2.setBounds(560, 396, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_buyPrice2);
		
		tf_sellPrice2 = new JTextField();
		tf_sellPrice2.setColumns(10);
		tf_sellPrice2.setBounds(560, 429, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_sellPrice2);
		
		tf_icon2 = new JTextField();
		tf_icon2.setColumns(10);
		tf_icon2.setBounds(560, 524, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_icon2);
		
		cb_is_illegal_item2 = new JCheckBox("Illegal?");
		cb_is_illegal_item2.setFont(new Font("Arial", Font.BOLD, 13));
		cb_is_illegal_item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb_is_illegal_item2.isSelected() == true) {
					is_illegal_item2 = true;
				}
				
				if (cb_is_illegal_item2.isSelected() == false) {
					is_illegal_item2 = false;
				}
			}
		});
		cb_is_illegal_item2.setBounds(560, 460, 113, 25);
		frmItemcreatorVBy.getContentPane().add(cb_is_illegal_item2);
		
		tx_itm_string2 = new JTextField();
		tx_itm_string2.setColumns(10);
		tx_itm_string2.setBounds(560, 329, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tx_itm_string2);
		
		lblItemName = new JLabel("Item Name");
		lblItemName.setFont(new Font("Arial", Font.BOLD, 13));
		lblItemName.setBounds(305, 329, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lblItemName);
		
		lblGewicht = new JLabel("Gewicht");
		lblGewicht.setFont(new Font("Arial", Font.BOLD, 13));
		lblGewicht.setBounds(305, 364, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lblGewicht);
		
		lblKaufpreis = new JLabel("Kaufpreis");
		lblKaufpreis.setFont(new Font("Arial", Font.BOLD, 13));
		lblKaufpreis.setBounds(305, 396, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lblKaufpreis);
		
		lblVerkaufspreis = new JLabel("Verkaufspreis");
		lblVerkaufspreis.setFont(new Font("Arial", Font.BOLD, 13));
		lblVerkaufspreis.setBounds(305, 429, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lblVerkaufspreis);
		
		lblIllegal_1 = new JLabel("Illegal?");
		lblIllegal_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblIllegal_1.setBounds(305, 461, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lblIllegal_1);
		
		lblEssbar = new JLabel("Essbar?");
		lblEssbar.setFont(new Font("Arial", Font.BOLD, 13));
		lblEssbar.setBounds(305, 491, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lblEssbar);
		
		lblIconPfad = new JLabel("Icon Pfad");
		lblIconPfad.setFont(new Font("Arial", Font.BOLD, 13));
		lblIconPfad.setBounds(305, 524, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lblIconPfad);
		
		lblItemup = new JLabel("Item 1 (UP)");
		lblItemup.setFont(new Font("Arial", Font.BOLD, 13));
		lblItemup.setBounds(417, 300, 116, 16);
		frmItemcreatorVBy.getContentPane().add(lblItemup);
		
		lblItemp = new JLabel("Item 1 (P)");
		lblItemp.setFont(new Font("Arial", Font.BOLD, 13));
		lblItemp.setBounds(560, 300, 116, 16);
		frmItemcreatorVBy.getContentPane().add(lblItemp);
		
		JLabel lblLizenzEinstellungen = new JLabel("Lizenz Einstellungen");
		lblLizenzEinstellungen.setFont(new Font("Arial", Font.BOLD, 16));
		lblLizenzEinstellungen.setHorizontalAlignment(SwingConstants.CENTER);
		lblLizenzEinstellungen.setBounds(14, 273, 223, 19);
		frmItemcreatorVBy.getContentPane().add(lblLizenzEinstellungen);
		
		JLabel lblGatherEinstellungen = new JLabel("Gather Einstellungen");
		lblGatherEinstellungen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGatherEinstellungen.setFont(new Font("Arial", Font.BOLD, 16));
		lblGatherEinstellungen.setBounds(16, 68, 223, 19);
		frmItemcreatorVBy.getContentPane().add(lblGatherEinstellungen);
		
		JLabel lblItemEinstellungen = new JLabel("Item Einstellungen");
		lblItemEinstellungen.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemEinstellungen.setFont(new Font("Arial", Font.BOLD, 16));
		lblItemEinstellungen.setBounds(305, 273, 371, 19);
		frmItemcreatorVBy.getContentPane().add(lblItemEinstellungen);
		
		JLabel lblVerarbeiterEinstellungen = new JLabel("Verarbeiter Einstellungen");
		lblVerarbeiterEinstellungen.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerarbeiterEinstellungen.setFont(new Font("Arial", Font.BOLD, 16));
		lblVerarbeiterEinstellungen.setBounds(305, 102, 270, 19);
		frmItemcreatorVBy.getContentPane().add(lblVerarbeiterEinstellungen);
		
		tf_edible = new JTextField();
		tf_edible.setBounds(417, 489, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_edible);
		tf_edible.setColumns(10);
		
		tf_edible2 = new JTextField();
		tf_edible2.setText("");
		tf_edible2.setBounds(560, 489, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_edible2);
		tf_edible2.setColumns(10);
	}
	
	void gather () throws IOException {
	
		try {
		
		int amount, zone_range, liz_price, anzahl_up, anzahl_p, no_lic_cost, sellPrice, buyPrice, weight, edible, edible2, sellPrice2, buyPrice2, weight2;
		String var_name, zone, abbau_item, license_name, prozess_name, icon,  icon2, item_up, item_p;
	    
	    license_name = tf_license_name.getText();
		var_name = tf_var_name.getText();
		amount = Integer.parseInt(tf_amount.getText());
		zone = tf_zone.getText();
		zone_range = Integer.parseInt(tf_zone_range.getText());
		abbau_item = tf_abbau_item.getText();
		liz_price = Integer.parseInt(tf_liz_price.getText());
		prozess_name = tf_prozess_name.getText();
		anzahl_up = Integer.parseInt(tf_pro_up.getText());
		anzahl_p = Integer.parseInt(tf_pro_p.getText());
		no_lic_cost = Integer.parseInt(tf_no_lic.getText());
		weight = Integer.parseInt(tf_weight.getText());
		buyPrice = Integer.parseInt(tf_buyPrice.getText());
		sellPrice = Integer.parseInt(tf_sellPrice.getText());
		icon = tf_icon.getText();
		item_up = tx_itm_string.getText();
		item_p = tx_itm_string2.getText();
		weight2 = Integer.parseInt(tf_weight2.getText());
		buyPrice2 = Integer.parseInt(tf_buyPrice2.getText());
		sellPrice2 = Integer.parseInt(tf_sellPrice2.getText());
		icon2 = tf_icon2.getText();
		edible = Integer.parseInt(tf_edible.getText());
		edible2 = Integer.parseInt(tf_edible2.getText());
		
		FileWriter fw = new FileWriter("" +var_name +".hpp");
	    BufferedWriter bw = new BufferedWriter(fw);
	    
	    /* |||||||||||||||||||||||||STRING|||||||||||||||||||||||||||||||*/
	    
	    bw.write("||||stringtable.xml||||");
	    bw.newLine();
	    bw.newLine();
	    
	    
	    
	    bw.write("<Key ID=\"STR_License_" +var_name +"\">");
	    bw.newLine();
	    bw.write("			<Original>" +license_name +"</Original>");
	    bw.newLine();
	    bw.write("		</Key>");
	    
	    bw.newLine();
	    bw.write("		<Key ID=\"STR_Process_" +var_name +"\">");
	    bw.newLine();
	    bw.write("			<Original>" +prozess_name +"</Original>");
	    bw.newLine();
	    bw.write("		</Key>");
	    
	    bw.newLine();
	    bw.write("		<Key ID=\"STR_Item_" +var_name +"_unprocessed\">");
	    bw.newLine();
	    bw.write("			<Original>" +item_up +"</Original>");
	    bw.newLine();
	    bw.write("		</Key>");
	    
	    bw.newLine();
	    bw.write("		<Key ID=\"STR_Item_" +var_name +"_processed\">");
	    bw.newLine();
	    bw.write("			<Original>" +item_p +"</Original>");
	    bw.newLine();
	    bw.write("		</Key>");
	    
	    /* |||||||||||||||||||||||||GATHER|||||||||||||||||||||||||||||||*/
	    
	    bw.newLine();
	    bw.newLine();
	    bw.write("||||Config_Gather.hpp||||");
	    bw.newLine();
	    bw.newLine();
	    
	    bw.write("class " +var_name +" {");
	    bw.newLine();
	    bw.write("            amount = " +amount +";");
	    bw.newLine();
	    bw.write("            zones[] = {\"" +zone +"\"};");
	    bw.newLine();
	    bw.write("            item = \"" +abbau_item +"\";");
	    bw.newLine();
	    bw.write("            zoneSize = " +zone_range +";");
	    bw.newLine();
	    bw.write("        };");
	    
	    /* |||||||||||||||||||||||||LIZENE|||||||||||||||||||||||||||||||*/
	    bw.newLine();
	    bw.newLine();
	    bw.write("||||Config_Licenses.hpp||||");
	    bw.newLine();
	    bw.newLine();
	    
	    bw.write("class " +var_name +" {");
	    bw.newLine();
	    bw.write("        variable = \"" +var_name +"\";");
	    bw.newLine();
	    bw.write("        displayName = \"STR_License_" +var_name +"\";");
	    bw.newLine();
	    bw.write("        price = " +liz_price +";");
	    bw.newLine();
	    bw.write("        illegal = " +is_illegal +";");
	    bw.newLine();
	    bw.write("        side = \"" +side +"\";");
	    bw.newLine();
	    bw.write("	};");
	    
	    /* |||||||||||||||||||||||||Prozess|||||||||||||||||||||||||||||||*/
	    bw.newLine();
	    bw.newLine();
	    bw.write("||||Config_Process.hpp||||");
	    bw.newLine();
	    bw.newLine();
	    
	    bw.write("class " +var_name +" {");
	    bw.newLine();
	    bw.write("        MaterialsReq[] = {{ \"" +var_name +"_unprocessed\"," +anzahl_up +"}};");
	    bw.newLine();
	    bw.write("        MaterialsGive[] = {{ \"" +var_name +"_processed\"," +anzahl_p +"}};");
	    bw.newLine();
	    bw.write("        Text = \"STR_Process_" +var_name +"\";");
	    bw.newLine();
	    bw.write("        NoLicenseCost = " +no_lic_cost +";");
	    bw.newLine();
	    bw.write("	};");
		
	    /* |||||||||||||||||||||||||vItem|||||||||||||||||||||||||||||||*/
	    bw.newLine();
	    bw.newLine();
	    bw.write("||||Config_vItems.hpp||||");
	    bw.newLine();
	    bw.newLine();
	    
	    bw.write("class " +var_name +"_unprocessed {");
	    bw.newLine();
	    bw.write("        variable = \"" +var_name +"_unprocessed\"");
	    bw.newLine();
	    bw.write("        displayName = \"STR_Item_" +var_name +"_unprocessed\"");
	    bw.newLine();
	    bw.write("        weight = " +weight +";");
	    bw.newLine();
	    bw.write("        buyPrice = " +buyPrice +";");
	    bw.newLine();
	    bw.write("        sellPrice = " +sellPrice +";");
	    bw.newLine();
	    bw.write("        illegal = " +is_illegal_item +";");
	    bw.newLine();
	    bw.write("        edible = " +edible +";");
	    bw.newLine();
	    bw.write("        icon = \"" +icon +"\";");
	    bw.newLine();
	    bw.write("	};");
	    
	    bw.newLine();
	    bw.newLine();
	    
	    bw.write("	class " +var_name +"_processed {");
	    bw.newLine();
	    bw.write("        variable = \"" +var_name +"_processed\"");
	    bw.newLine();
	    bw.write("        displayName = \"STR_Item_" +var_name +"_processed\"");
	    bw.newLine();
	    bw.write("        weight = " +weight2 +";");
	    bw.newLine();
	    bw.write("        buyPrice = " +buyPrice2 +";");
	    bw.newLine();
	    bw.write("        sellPrice = " +sellPrice2 +";");
	    bw.newLine();
	    bw.write("        illegal = " +is_illegal_item2 +";");
	    bw.newLine();
	    bw.write("        edible = " +edible2 +";");
	    bw.newLine();
	    bw.write("        icon = \"" +icon2 +"\";");
	    bw.newLine();
	    bw.write("	};");
	    
	    
	    /* |||||||||||||||||||||||||NPC|||||||||||||||||||||||||||||||*/
	    bw.newLine();
	    bw.newLine();
	    bw.write("||||NPC Init||||");
	    bw.newLine();
	    bw.newLine();
	    
	    bw.write("this allowDamage false; this enableSimulation false;");
	    bw.newLine();
	    bw.write("this addAction[localize\"STR_Process_" +var_name +"\",life_fnc_processAction,\"" + var_name +"\",0,false,false,\"\",' life_inv_" +var_name +"_unprocessed > 0 && !life_is_processing && !life_action_inUse'];");
	    bw.newLine();
	    bw.write("this addAction[format [\"%1 ($%2)\",localize (getText(missionConfigFile >> \"Licenses\" >> \"" +var_name +"\" >> \"displayName\")), [(getNumber(missionConfigFile >> \"Licenses\" >> \"" +var_name +"\" >> \"price\"))] call life_fnc_numberText],life_fnc_buyLicense,\"" +var_name +"\",0,false,false,\"\",' !license_civ_" +var_name +" && playerSide isEqualTo civilian '];");   
	    bw.newLine();
	    bw.newLine();
	    bw.newLine();
	    
	    bw.close();
	    
		} catch (Exception e) {
	        JOptionPane.showMessageDialog( null, "Achte darauf das alle Felder richtig ausgefüllt sind!");
	    }
	}
}
