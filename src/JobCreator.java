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
	private JTextField tf_variable_name;
	private JTextField tf_gather_amount;
	private JTextField tf_gather_zone;
	private JTextField tf_gather_zone_range;
	private JTextField tf_gather_item;
	private JCheckBox chb_item_standart;
	private JTextField tf_license_name;
	private JTextField tf_license_price;
	private boolean is_illegal, is_illegal_item, is_illegal_item2;
	private String side = "civ";
	private JTextField tf_amount_before_processed;
	private JTextField tf_amount_after_processed;
	private JTextField tf_license_cost;
	private JTextField tf_process_text;
	private JTextField tf_unprocessed_mass;
	private JTextField tf_unprocessed_buy_price;
	private JTextField tf_unprocessed_sell_price;
	private JTextField tf_unprocessed_icon_path;
	private JCheckBox cb_unprocessed_illegal;
	private JTextField tf_unprocessed_name;
	private JTextField tf_processed_mass;
	private JTextField tf_processed_buy_price;
	private JTextField tf_processed_sell_price;
	private JTextField tf_processed_icon_path;
	private JCheckBox cb_processed_illegal;
	private JTextField tf_processed_name;
	private JLabel lbl_item_name;
	private JLabel lbl_item_mass;
	private JLabel lbl_item_buy_price;
	private JLabel lbl_item_sell_price;
	private JLabel lbl_item_illegal;
	private JLabel lbl_item_edible;
	private JLabel lbl_item_icon_path;
	private JLabel lbl_Item_unprocessed;
	private JLabel lbl_Item_processed;
	private JTextField tf_unprocessed_edible;
	private JTextField tf_processed_edible;

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
		
		tf_variable_name = new JTextField();
		tf_variable_name.setBounds(123, 13, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_variable_name);
		tf_variable_name.setColumns(10);
		
		JLabel lbl_variable_name = new JLabel("Variabel Name");
		lbl_variable_name.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_variable_name.setBounds(16, 15, 95, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_variable_name);
		
		JLabel lbl_gather_amount = new JLabel("Anzahl");
		lbl_gather_amount.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_amount.setBounds(16, 132, 95, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_amount);
		
		tf_gather_amount = new JTextField();
		tf_gather_amount.setBounds(123, 129, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_amount);
		tf_gather_amount.setColumns(10);
		
		JLabel lbl_gather_zone = new JLabel("Abbauzone");
		lbl_gather_zone.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_zone.setBounds(16, 161, 95, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_zone);
		
		tf_gather_zone = new JTextField();
		tf_gather_zone.setBounds(123, 158, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_zone);
		tf_gather_zone.setColumns(10);
		
		JLabel lbl_gather_zone_size = new JLabel("Zonen Gr\u00F6\u00DFe");
		lbl_gather_zone_size.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_zone_size.setBounds(16, 190, 95, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_zone_size);
		
		tf_gather_zone_range = new JTextField();
		tf_gather_zone_range.setBounds(123, 187, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_zone_range);
		tf_gather_zone_range.setColumns(10);
		
		tf_gather_item = new JTextField();
		tf_gather_item.setText("pickaxe");
		tf_gather_item.setBounds(123, 221, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_item);
		tf_gather_item.setColumns(10);
		
		JLabel lbl_gather_item = new JLabel("Abbau Item");
		lbl_gather_item.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_item.setBounds(16, 224, 95, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_item);
		
		JButton btn_generate = new JButton("Erstellen");
		btn_generate.setFont(new Font("Arial", Font.BOLD, 16));
		btn_generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					gather();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btn_generate.setBounds(12, 496, 150, 50);
		frmItemcreatorVBy.getContentPane().add(btn_generate);
		
		chb_item_standart = new JCheckBox("Abbau Item standart");
		chb_item_standart.setSelected(true);
		chb_item_standart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chb_item_standart.isSelected()==true) {
					tf_gather_item.setText("pickaxe");
			    }
				
				if (chb_item_standart.isSelected()==false) {
					tf_gather_item.setText("");
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
		
		JLabel lbl_license_name = new JLabel("Lizenz Name");
		lbl_license_name.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_name.setBounds(14, 305, 97, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_name);
		
		tf_license_price = new JTextField();
		tf_license_price.setBounds(121, 337, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_license_price);
		tf_license_price.setColumns(10);
		
		JLabel lbl_license_price = new JLabel("Lizenz Preis");
		lbl_license_price.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_price.setBounds(12, 340, 97, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_price);
		
		JCheckBox chckbx_license_illegal = new JCheckBox("Illegal?");
		chckbx_license_illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbx_license_illegal.isSelected() == true) {
					is_illegal = true;
				}
				
				if (chckbx_license_illegal.isSelected() == false) {
					is_illegal = false;
				}
			}
		});
		chckbx_license_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		chckbx_license_illegal.setBounds(124, 368, 113, 25);
		frmItemcreatorVBy.getContentPane().add(chckbx_license_illegal);
		
		JLabel lbl_license_illegal = new JLabel("Illegal?");
		lbl_license_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_illegal.setBounds(14, 369, 56, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_illegal);
		
		JComboBox cobo_license_side = new JComboBox();
		cobo_license_side.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cobo_license_side.getSelectedItem() == "civ") {
					System.out.println("CIV");
					side = "civ";
				}
				
				if (cobo_license_side.getSelectedItem() == "cop") {
					System.out.println("cop");
					side = "cop";
				}
				
				if (cobo_license_side.getSelectedItem() == "med") {
					System.out.println("med");
					side = "med";
				}
				
				if (cobo_license_side.getSelectedItem() == "adac") {
					System.out.println("adac");
					side = "adac";
				}
			}
		});
		cobo_license_side.setModel(new DefaultComboBoxModel(new String[] {"civ", "cop", "med", "adac"}));
		cobo_license_side.setFont(new Font("Arial", Font.BOLD, 13));
		cobo_license_side.setBounds(121, 402, 116, 22);
		frmItemcreatorVBy.getContentPane().add(cobo_license_side);
		
		JLabel lbl_license_side = new JLabel("Side");
		lbl_license_side.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_side.setBounds(16, 405, 56, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_side);
		
		tf_amount_before_processed = new JTextField();
		tf_amount_before_processed.setBounds(459, 129, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_amount_before_processed);
		tf_amount_before_processed.setColumns(10);
		
		tf_amount_after_processed = new JTextField();
		tf_amount_after_processed.setBounds(459, 158, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_amount_after_processed);
		tf_amount_after_processed.setColumns(10);
		
		JLabel lbl_amount_before_processed = new JLabel("Anzahl unverarbeitet");
		lbl_amount_before_processed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_amount_before_processed.setBounds(305, 129, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_amount_before_processed);
		
		JLabel lbl_amount_after_processed = new JLabel("Anzahl verarbeitet");
		lbl_amount_after_processed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_amount_after_processed.setBounds(305, 158, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_amount_after_processed);
		
		JLabel lbl_process_text = new JLabel("Ladebalken Schrift");
		lbl_process_text.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_process_text.setBounds(305, 187, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_process_text);
		
		JLabel lbl_license_cost = new JLabel("Keine Lizenz kosten");
		lbl_license_cost.setToolTipText("LOOOOLLL");
		lbl_license_cost.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_cost.setBounds(305, 221, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_cost);
		
		tf_license_cost = new JTextField();
		tf_license_cost.setBounds(459, 221, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_license_cost);
		tf_license_cost.setColumns(10);
		
		tf_process_text = new JTextField();
		tf_process_text.setBounds(459, 187, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_process_text);
		tf_process_text.setColumns(10);
		
		tf_unprocessed_mass = new JTextField();
		tf_unprocessed_mass.setBounds(417, 364, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_mass);
		tf_unprocessed_mass.setColumns(10);
		
		tf_unprocessed_buy_price = new JTextField();
		tf_unprocessed_buy_price.setBounds(417, 396, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_buy_price);
		tf_unprocessed_buy_price.setColumns(10);
		
		tf_unprocessed_sell_price = new JTextField();
		tf_unprocessed_sell_price.setBounds(417, 429, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_sell_price);
		tf_unprocessed_sell_price.setColumns(10);
		
		tf_unprocessed_icon_path = new JTextField();
		tf_unprocessed_icon_path.setBounds(417, 524, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_icon_path);
		tf_unprocessed_icon_path.setColumns(10);
		
		cb_unprocessed_illegal = new JCheckBox("Illegal?");
		cb_unprocessed_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		cb_unprocessed_illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb_unprocessed_illegal.isSelected() == true) {
					is_illegal_item = true;
				}
				
				if (cb_unprocessed_illegal.isSelected() == false) {
					is_illegal_item = false;
				}
			}
		});
		cb_unprocessed_illegal.setBounds(417, 460, 113, 25);
		frmItemcreatorVBy.getContentPane().add(cb_unprocessed_illegal);
		
		tf_unprocessed_name = new JTextField();
		tf_unprocessed_name.setBounds(417, 329, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_name);
		tf_unprocessed_name.setColumns(10);
		
		tf_processed_mass = new JTextField();
		tf_processed_mass.setColumns(10);
		tf_processed_mass.setBounds(560, 364, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_mass);
		
		tf_processed_buy_price = new JTextField();
		tf_processed_buy_price.setColumns(10);
		tf_processed_buy_price.setBounds(560, 396, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_buy_price);
		
		tf_processed_sell_price = new JTextField();
		tf_processed_sell_price.setColumns(10);
		tf_processed_sell_price.setBounds(560, 429, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_sell_price);
		
		tf_processed_icon_path = new JTextField();
		tf_processed_icon_path.setColumns(10);
		tf_processed_icon_path.setBounds(560, 524, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_icon_path);
		
		cb_processed_illegal = new JCheckBox("Illegal?");
		cb_processed_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		cb_processed_illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb_processed_illegal.isSelected() == true) {
					is_illegal_item2 = true;
				}
				
				if (cb_processed_illegal.isSelected() == false) {
					is_illegal_item2 = false;
				}
			}
		});
		cb_processed_illegal.setBounds(560, 460, 113, 25);
		frmItemcreatorVBy.getContentPane().add(cb_processed_illegal);
		
		tf_processed_name = new JTextField();
		tf_processed_name.setColumns(10);
		tf_processed_name.setBounds(560, 329, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_name);
		
		lbl_item_name = new JLabel("Item Name");
		lbl_item_name.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_name.setBounds(305, 329, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_name);
		
		lbl_item_mass = new JLabel("Gewicht");
		lbl_item_mass.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_mass.setBounds(305, 364, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_mass);
		
		lbl_item_buy_price = new JLabel("Kaufpreis");
		lbl_item_buy_price.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_buy_price.setBounds(305, 396, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_buy_price);
		
		lbl_item_sell_price = new JLabel("Verkaufspreis");
		lbl_item_sell_price.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_sell_price.setBounds(305, 429, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_sell_price);
		
		lbl_item_illegal = new JLabel("Illegal?");
		lbl_item_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_illegal.setBounds(305, 461, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_illegal);
		
		lbl_item_edible = new JLabel("Essbar?");
		lbl_item_edible.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_edible.setBounds(305, 491, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_edible);
		
		lbl_item_icon_path = new JLabel("Icon Pfad");
		lbl_item_icon_path.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_icon_path.setBounds(305, 524, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_icon_path);
		
		lbl_Item_unprocessed = new JLabel("Item 1 (UP)");
		lbl_Item_unprocessed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_Item_unprocessed.setBounds(417, 300, 116, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_Item_unprocessed);
		
		lbl_Item_processed = new JLabel("Item 1 (P)");
		lbl_Item_processed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_Item_processed.setBounds(560, 300, 116, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_Item_processed);
		
		JLabel lbl_license_settings = new JLabel("Lizenz Einstellungen");
		lbl_license_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_license_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_license_settings.setBounds(14, 273, 223, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_license_settings);
		
		JLabel lbl_Gather_settings = new JLabel("Gather Einstellungen");
		lbl_Gather_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Gather_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_Gather_settings.setBounds(16, 68, 223, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_Gather_settings);
		
		JLabel lbl_Item_settings = new JLabel("Item Einstellungen");
		lbl_Item_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Item_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_Item_settings.setBounds(305, 273, 371, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_Item_settings);
		
		JLabel lbl_process_settings = new JLabel("Verarbeiter Einstellungen");
		lbl_process_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_process_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_process_settings.setBounds(305, 102, 270, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_process_settings);
		
		tf_unprocessed_edible = new JTextField();
		tf_unprocessed_edible.setBounds(417, 489, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_edible);
		tf_unprocessed_edible.setColumns(10);
		
		tf_processed_edible = new JTextField();
		tf_processed_edible.setText("");
		tf_processed_edible.setBounds(560, 489, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_edible);
		tf_processed_edible.setColumns(10);
	}
	
	void gather () throws IOException {
	
		try {
		
		int amount, zone_range, liz_price, anzahl_up, anzahl_p, no_lic_cost, sellPrice, buyPrice, weight, edible, edible2, sellPrice2, buyPrice2, weight2;
		String var_name, zone, abbau_item, license_name, prozess_name, icon,  icon2, item_up, item_p;
	    
	    license_name = tf_license_name.getText();
		var_name = tf_variable_name.getText();
		amount = Integer.parseInt(tf_gather_amount.getText());
		zone = tf_gather_zone.getText();
		zone_range = Integer.parseInt(tf_gather_zone_range.getText());
		abbau_item = tf_gather_item.getText();
		liz_price = Integer.parseInt(tf_license_price.getText());
		prozess_name = tf_process_text.getText();
		anzahl_up = Integer.parseInt(tf_amount_before_processed.getText());
		anzahl_p = Integer.parseInt(tf_amount_after_processed.getText());
		no_lic_cost = Integer.parseInt(tf_license_cost.getText());
		weight = Integer.parseInt(tf_unprocessed_mass.getText());
		buyPrice = Integer.parseInt(tf_unprocessed_buy_price.getText());
		sellPrice = Integer.parseInt(tf_unprocessed_sell_price.getText());
		icon = tf_unprocessed_icon_path.getText();
		item_up = tf_unprocessed_name.getText();
		item_p = tf_processed_name.getText();
		weight2 = Integer.parseInt(tf_processed_mass.getText());
		buyPrice2 = Integer.parseInt(tf_processed_buy_price.getText());
		sellPrice2 = Integer.parseInt(tf_processed_sell_price.getText());
		icon2 = tf_processed_icon_path.getText();
		edible = Integer.parseInt(tf_unprocessed_edible.getText());
		edible2 = Integer.parseInt(tf_processed_edible.getText());
		
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
