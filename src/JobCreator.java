import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class JobCreator {
	
	//JFrame
	private JFrame frmItemcreatorVBy;
	
	//JPanel
	private JPanel panel_7;
	private JPanel panel_8;
	
	//JLabel
	private JLabel lbl_variable_name;
	private JLabel lbl_gather_amount;
	private JLabel lbl_gather_zone;
	private JLabel lbl_gather_zone_size;
	private JLabel lbl_gather_item;
	private JLabel lbl_license_name;
	private JLabel lbl_license_price;
	private JLabel lbl_license_illegal;
	private JLabel lbl_license_side;
	private JLabel lbl_amount_before_processed;
	private JLabel lbl_amount_after_processed;
	private JLabel lbl_process_text;
	private JLabel lbl_license_cost;
	private JLabel lbl_item_name;
	private JLabel lbl_item_mass;
	private JLabel lbl_item_buy_price;
	private JLabel lbl_item_sell_price;
	private JLabel lbl_item_illegal;
	private JLabel lbl_item_edible;
	private JLabel lbl_item_icon_path;
	private JLabel lbl_Item_unprocessed;
	private JLabel lbl_Item_processed;
	private JLabel lbl_license_settings;
	private JLabel lbl_Gather_settings;
	private JLabel lbl_Item_settings;
	private JLabel lbl_process_settings;
	private JLabel lbl_path_to_mission;
	
	//JTextField
	private JTextField tf_variable_name;
	private JTextField tf_gather_amount;
	private JTextField tf_gather_zone;
	private JTextField tf_gather_zone_range;
	private JTextField tf_gather_item;
	private JTextField tf_license_name;
	private JTextField tf_license_price;
	private JTextField tf_amount_before_processed;
	private JTextField tf_amount_after_processed;
	private JTextField tf_license_cost;
	private JTextField tf_process_text;
	private JTextField tf_unprocessed_mass;
	private JTextField tf_unprocessed_buy_price;
	private JTextField tf_unprocessed_sell_price;
	private JTextField tf_unprocessed_icon_path;
	private JTextField tf_unprocessed_name;
	private JTextField tf_processed_mass;
	private JTextField tf_processed_buy_price;
	private JTextField tf_processed_sell_price;
	private JTextField tf_processed_icon_path;
	private JTextField tf_processed_name;
	private JTextField tf_unprocessed_edible;
	private JTextField tf_processed_edible;
	private JTextField tf_path_to_mission;
	
	//JButton
	private JButton btn_englisch;
	private JButton btn_german;
	private JButton btn_generate;
	
	//JCheckbox
	private JCheckBox chb_item_standart;
	private JCheckBox cb_processed_illegal;
	private JCheckBox chb_method;
	private JCheckBox cb_unprocessed_illegal;
	
	//Variablen
	private boolean is_illegal, is_illegal_item, is_illegal_item2, german=true, oldWay;
	private String side = "civ", var_name, zone, abbau_item, license_name, prozess_name, icon,  icon2, item_up, item_p, path_to_mission;
	private int amount, zone_range, liz_price, anzahl_up, anzahl_p, no_lic_cost, sellPrice, buyPrice, weight, edible, edible2, sellPrice2, buyPrice2, weight2;

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
		frmItemcreatorVBy.setForeground(Color.WHITE);
		frmItemcreatorVBy.setBackground(Color.WHITE);
		frmItemcreatorVBy.setTitle("Job creator V2 by TaktischerSpeck (asyetuntitled.de)");
		frmItemcreatorVBy.getContentPane().setForeground(Color.BLACK);
		frmItemcreatorVBy.getContentPane().setFont(new Font("Arial", Font.BOLD, 13));
		frmItemcreatorVBy.setBounds(100, 100, 875, 551);
		frmItemcreatorVBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmItemcreatorVBy.getContentPane().setLayout(null);
		
		tf_variable_name = new JTextField();
		tf_variable_name.setBounds(525, 435, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_variable_name);
		tf_variable_name.setColumns(10);
		
		lbl_variable_name = new JLabel("Variabel Name");
		lbl_variable_name.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_variable_name.setBounds(405, 436, 95, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_variable_name);
		
		lbl_gather_amount = new JLabel("Anzahl");
		lbl_gather_amount.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_amount.setBounds(62, 65, 85, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_amount);
		
		tf_gather_amount = new JTextField();
		tf_gather_amount.setBounds(167, 63, 142, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_amount);
		tf_gather_amount.setColumns(10);
		
		lbl_gather_zone = new JLabel("Abbauzone");
		lbl_gather_zone.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_zone.setBounds(62, 100, 85, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_zone);
		
		tf_gather_zone = new JTextField();
		tf_gather_zone.setBounds(167, 98, 142, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_zone);
		tf_gather_zone.setColumns(10);
		
		lbl_gather_zone_size = new JLabel("Zonen Gr\u00F6\u00DFe");
		lbl_gather_zone_size.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_zone_size.setBounds(62, 135, 85, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_zone_size);
		
		tf_gather_zone_range = new JTextField();
		tf_gather_zone_range.setBounds(167, 133, 142, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_zone_range);
		tf_gather_zone_range.setColumns(10);
		
		tf_gather_item = new JTextField();
		tf_gather_item.setText("pickaxe");
		tf_gather_item.setBounds(167, 166, 142, 22);
		frmItemcreatorVBy.getContentPane().add(tf_gather_item);
		tf_gather_item.setColumns(10);
		
		lbl_gather_item = new JLabel("Abbau Item");
		lbl_gather_item.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_gather_item.setBounds(62, 170, 85, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_gather_item);
		
		btn_generate = new JButton("Erstellen");
		btn_generate.setFont(new Font("Arial", Font.BOLD, 16));
		btn_generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				get_var();
				
				if (oldWay) {	
					try {
						old_way();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}else {
					edit_vitems();
				    edit_licens();
					edit_process();
					edit_gather();
					edit_stringtable();
					init_map();
				}
			}
		});
		btn_generate.setBounds(685, 251, 150, 50);
		frmItemcreatorVBy.getContentPane().add(btn_generate);
		
		chb_item_standart = new JCheckBox("Standart Abbau Item");
		chb_item_standart.setSelected(true);
		chb_item_standart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chb_item_standart.isSelected()) {
					tf_gather_item.setText("pickaxe");
			    } else {
			    	tf_gather_item.setText("");
			    }
			}
		});
		chb_item_standart.setFont(new Font("Arial", Font.BOLD, 13));
		chb_item_standart.setBounds(59, 35, 225, 25);
		frmItemcreatorVBy.getContentPane().add(chb_item_standart);
		
		tf_license_name = new JTextField();
		tf_license_name.setBounds(486, 246, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_license_name);
		tf_license_name.setColumns(10);
		
		lbl_license_name = new JLabel("Lizenz Name");
		lbl_license_name.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_name.setBounds(379, 248, 97, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_name);
		
		tf_license_price = new JTextField();
		tf_license_price.setBounds(486, 279, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_license_price);
		tf_license_price.setColumns(10);
		
		lbl_license_price = new JLabel("Lizenz Preis");
		lbl_license_price.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_price.setBounds(379, 281, 97, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_price);
		
		JCheckBox chckbx_license_illegal = new JCheckBox("Illegal");
		chckbx_license_illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbx_license_illegal.isSelected()) {
					is_illegal = true;
				} else {
					is_illegal = false;
				}
			}
		});
		chckbx_license_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		chckbx_license_illegal.setBounds(469, 317, 113, 25);
		frmItemcreatorVBy.getContentPane().add(chckbx_license_illegal);
		
		lbl_license_illegal = new JLabel("Illegal");
		lbl_license_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_illegal.setBounds(379, 321, 56, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_illegal);
		
		JComboBox<Object> cobo_license_side = new JComboBox<Object>();
		cobo_license_side.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cobo_license_side.getSelectedItem() == "civ") {
					side = "civ";
				}
				
				if (cobo_license_side.getSelectedItem() == "cop") {
					side = "cop";
				}
				
				if (cobo_license_side.getSelectedItem() == "med") {
					side = "med";
				}
				
				if (cobo_license_side.getSelectedItem() == "adac") {
					side = "adac";
				}
			}
		});
		cobo_license_side.setModel(new DefaultComboBoxModel<Object>(new String[] {"civ", "cop", "med", "adac"}));
		cobo_license_side.setFont(new Font("Arial", Font.BOLD, 13));
		cobo_license_side.setBounds(469, 349, 116, 22);
		frmItemcreatorVBy.getContentPane().add(cobo_license_side);
		
		lbl_license_side = new JLabel("Fraktion");
		lbl_license_side.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_side.setBounds(379, 352, 56, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_side);
		
		tf_amount_before_processed = new JTextField();
		tf_amount_before_processed.setBounds(537, 63, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_amount_before_processed);
		tf_amount_before_processed.setColumns(10);
		
		tf_amount_after_processed = new JTextField();
		tf_amount_after_processed.setBounds(537, 98, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_amount_after_processed);
		tf_amount_after_processed.setColumns(10);
		
		lbl_amount_before_processed = new JLabel("Anzahl unverarbeitet");
		lbl_amount_before_processed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_amount_before_processed.setBounds(385, 65, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_amount_before_processed);
		
		lbl_amount_after_processed = new JLabel("Anzahl verarbeitet");
		lbl_amount_after_processed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_amount_after_processed.setBounds(385, 100, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_amount_after_processed);
		
		lbl_process_text = new JLabel("Ladebalken Schrift");
		lbl_process_text.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_process_text.setBounds(385, 135, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_process_text);
		
		lbl_license_cost = new JLabel("Keine Lizenz kosten");
		lbl_license_cost.setToolTipText("LOOOOLLL");
		lbl_license_cost.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_license_cost.setBounds(385, 168, 142, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_license_cost);
		
		tf_license_cost = new JTextField();
		tf_license_cost.setBounds(537, 166, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_license_cost);
		tf_license_cost.setColumns(10);
		
		tf_process_text = new JTextField();
		tf_process_text.setBounds(537, 133, 116, 22);
		frmItemcreatorVBy.getContentPane().add(tf_process_text);
		tf_process_text.setColumns(10);
		
		tf_unprocessed_mass = new JTextField();
		tf_unprocessed_mass.setBounds(120, 308, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_mass);
		tf_unprocessed_mass.setColumns(10);
		
		tf_unprocessed_buy_price = new JTextField();
		tf_unprocessed_buy_price.setBounds(120, 341, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_buy_price);
		tf_unprocessed_buy_price.setColumns(10);
		
		tf_unprocessed_sell_price = new JTextField();
		tf_unprocessed_sell_price.setBounds(120, 374, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_sell_price);
		tf_unprocessed_sell_price.setColumns(10);
		
		tf_unprocessed_icon_path = new JTextField();
		tf_unprocessed_icon_path.setBounds(120, 468, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_icon_path);
		tf_unprocessed_icon_path.setColumns(10);
		
		cb_unprocessed_illegal = new JCheckBox("Illegal");
		cb_unprocessed_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		cb_unprocessed_illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb_unprocessed_illegal.isSelected()) {
					is_illegal_item = true;
				} else {
					is_illegal_item = false;
				}
			}
		});
		cb_unprocessed_illegal.setBounds(120, 403, 100, 25);
		frmItemcreatorVBy.getContentPane().add(cb_unprocessed_illegal);
		
		tf_unprocessed_name = new JTextField();
		tf_unprocessed_name.setBounds(120, 275, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_name);
		tf_unprocessed_name.setColumns(10);
		
		tf_processed_mass = new JTextField();
		tf_processed_mass.setColumns(10);
		tf_processed_mass.setBounds(249, 308, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_mass);
		
		tf_processed_buy_price = new JTextField();
		tf_processed_buy_price.setColumns(10);
		tf_processed_buy_price.setBounds(249, 341, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_buy_price);
		
		tf_processed_sell_price = new JTextField();
		tf_processed_sell_price.setColumns(10);
		tf_processed_sell_price.setBounds(249, 374, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_sell_price);
		
		tf_processed_icon_path = new JTextField();
		tf_processed_icon_path.setColumns(10);
		tf_processed_icon_path.setBounds(249, 468, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_icon_path);
		
		cb_processed_illegal = new JCheckBox("Illegal");
		cb_processed_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		cb_processed_illegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb_processed_illegal.isSelected()) {
					is_illegal_item2 = true;
				} else {
					is_illegal_item2 = false;
				}
			}
		});
		cb_processed_illegal.setBounds(249, 403, 100, 25);
		frmItemcreatorVBy.getContentPane().add(cb_processed_illegal);
		
		tf_processed_name = new JTextField();
		tf_processed_name.setColumns(10);
		tf_processed_name.setBounds(249, 275, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_name);
		
		lbl_item_name = new JLabel("Item Name");
		lbl_item_name.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_name.setBounds(15, 277, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_name);
		
		lbl_item_mass = new JLabel("Gewicht");
		lbl_item_mass.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_mass.setBounds(15, 310, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_mass);
		
		lbl_item_buy_price = new JLabel("Kaufpreis");
		lbl_item_buy_price.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_buy_price.setBounds(15, 343, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_buy_price);
		
		lbl_item_sell_price = new JLabel("Verkaufspreis");
		lbl_item_sell_price.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_sell_price.setBounds(15, 376, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_sell_price);
		
		lbl_item_illegal = new JLabel("Illegal");
		lbl_item_illegal.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_illegal.setBounds(15, 407, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_illegal);
		
		lbl_item_edible = new JLabel("Essbar");
		lbl_item_edible.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_edible.setBounds(15, 437, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_edible);
		
		lbl_item_icon_path = new JLabel("Icon Pfad");
		lbl_item_icon_path.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_item_icon_path.setBounds(15, 470, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_item_icon_path);
		
		lbl_Item_unprocessed = new JLabel("Item (UP)");
		lbl_Item_unprocessed.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Item_unprocessed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_Item_unprocessed.setBounds(120, 248, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_Item_unprocessed);
		
		lbl_Item_processed = new JLabel("Item (P)");
		lbl_Item_processed.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Item_processed.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_Item_processed.setBounds(249, 248, 100, 16);
		frmItemcreatorVBy.getContentPane().add(lbl_Item_processed);
		
		lbl_license_settings = new JLabel("Lizenz Einstellungen");
		lbl_license_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_license_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_license_settings.setBounds(379, 218, 223, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_license_settings);
		
		lbl_Gather_settings = new JLabel("Gather Einstellungen");
		lbl_Gather_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Gather_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_Gather_settings.setBounds(59, 15, 223, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_Gather_settings);
		
		lbl_Item_settings = new JLabel("Item Einstellungen");
		lbl_Item_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Item_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_Item_settings.setBounds(15, 218, 371, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_Item_settings);
		
		lbl_process_settings = new JLabel("Verarbeiter Einstellungen");
		lbl_process_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_process_settings.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_process_settings.setBounds(385, 15, 270, 19);
		frmItemcreatorVBy.getContentPane().add(lbl_process_settings);
		
		tf_unprocessed_edible = new JTextField();
		tf_unprocessed_edible.setBounds(120, 435, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_unprocessed_edible);
		tf_unprocessed_edible.setColumns(10);
		
		tf_processed_edible = new JTextField();
		tf_processed_edible.setText("");
		tf_processed_edible.setBounds(249, 435, 100, 22);
		frmItemcreatorVBy.getContentPane().add(tf_processed_edible);
		tf_processed_edible.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 10, 512);
		frmItemcreatorVBy.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 502, 859, 10);
		frmItemcreatorVBy.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 0, 859, 10);
		frmItemcreatorVBy.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(849, 0, 10, 512);
		frmItemcreatorVBy.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(0, 197, 675, 10);
		frmItemcreatorVBy.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(359, 0, 10, 207);
		frmItemcreatorVBy.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(665, 0, 10, 512);
		frmItemcreatorVBy.getContentPane().add(panel_6);
		
		panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setBounds(359, 204, 10, 308);
		frmItemcreatorVBy.getContentPane().add(panel_7);
		
		panel_8 = new JPanel();
		panel_8.setBackground(Color.BLACK);
		panel_8.setBounds(359, 382, 316, 10);
		frmItemcreatorVBy.getContentPane().add(panel_8);
		
		btn_german = new JButton("Deutsch");
		btn_german.setEnabled(false);
		btn_german.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l_german();
			}
		});
		btn_german.setFont(new Font("Arial", Font.BOLD, 16));
		btn_german.setBounds(685, 21, 150, 50);
		frmItemcreatorVBy.getContentPane().add(btn_german);
		
		btn_englisch = new JButton("English");
		btn_englisch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				l_english();			
			}
		});
		btn_englisch.setFont(new Font("Arial", Font.BOLD, 16));
		btn_englisch.setBounds(685, 82, 150, 50);
		frmItemcreatorVBy.getContentPane().add(btn_englisch);
		
		chb_method = new JCheckBox("Alte Methode");
		chb_method.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chb_method.isSelected()) {
					oldWay = true;
				} else {
					oldWay = false;
				}
			}
		});
		chb_method.setFont(new Font("Arial", Font.BOLD, 13));
		chb_method.setToolTipText("Erstellt Job Datei (Wie in V1-1.5)");
		chb_method.setBounds(685, 139, 150, 23);
		frmItemcreatorVBy.getContentPane().add(chb_method);
		
		tf_path_to_mission = new JTextField();
		tf_path_to_mission.setBounds(685, 219, 150, 20);
		frmItemcreatorVBy.getContentPane().add(tf_path_to_mission);
		tf_path_to_mission.setColumns(10);
		
		lbl_path_to_mission = new JLabel("Pfad der Mission:");
		lbl_path_to_mission.setToolTipText("C:\\A3Server\\Life\\mpmissions\\MeinServer.Altis");
		lbl_path_to_mission.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_path_to_mission.setBounds(685, 193, 150, 14);
		frmItemcreatorVBy.getContentPane().add(lbl_path_to_mission);
	}
	
	void get_var(){

		amount = Integer.parseInt(tf_gather_amount.getText());
		zone_range = Integer.parseInt(tf_gather_zone_range.getText());
		liz_price = Integer.parseInt(tf_license_price.getText());
		prozess_name = tf_process_text.getText();
		anzahl_up = Integer.parseInt(tf_amount_before_processed.getText());
		anzahl_p = Integer.parseInt(tf_amount_after_processed.getText());
		no_lic_cost = Integer.parseInt(tf_license_cost.getText());
		weight = Integer.parseInt(tf_unprocessed_mass.getText());
		buyPrice = Integer.parseInt(tf_unprocessed_buy_price.getText());
		sellPrice = Integer.parseInt(tf_unprocessed_sell_price.getText());
		weight2 = Integer.parseInt(tf_processed_mass.getText());
		buyPrice2 = Integer.parseInt(tf_processed_buy_price.getText());
		sellPrice2 = Integer.parseInt(tf_processed_sell_price.getText());
		edible = Integer.parseInt(tf_unprocessed_edible.getText());
		edible2 = Integer.parseInt(tf_processed_edible.getText());
		
		path_to_mission = tf_path_to_mission.getText();
		icon2 = tf_processed_icon_path.getText();
		icon = tf_unprocessed_icon_path.getText();
		item_up = tf_unprocessed_name.getText();
		item_p = tf_processed_name.getText();
		abbau_item = tf_gather_item.getText();
		zone = tf_gather_zone.getText();
		license_name = tf_license_name.getText();
		var_name = tf_variable_name.getText();
	}
	
	void init_map() {
		try {
			FileWriter fw = new FileWriter("" +var_name +"_init_for_map.hpp");
		    BufferedWriter bw = new BufferedWriter(fw);
		    
		    bw.newLine();
		    bw.newLine();
		    bw.write("//////// NPC Init \\\\\\\\");
		    bw.newLine();
		    bw.newLine();
		    
		    bw.write("this allowDamage false; this enableSimulation false;");
		    bw.write("this addAction[localize\"STR_Process_" +var_name +"\",life_fnc_processAction,\"" + var_name +"\",0,false,false,\"\",' life_inv_" +var_name +"_unprocessed > 0 && !life_is_processing && !life_action_inUse'];");
		    bw.write("this addAction[format [\"%1 ($%2)\",localize (getText(missionConfigFile >> \"Licenses\" >> \"" +var_name +"\" >> \"displayName\")), [(getNumber(missionConfigFile >> \"Licenses\" >> \"" +var_name +"\" >> \"price\"))] call life_fnc_numberText],life_fnc_buyLicense,\"" +var_name +"\",0,false,false,\"\",' !license_civ_" +var_name +" && playerSide isEqualTo civilian '];");
		    
		    bw.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "An error contact TaktischerSpeck!");
		}
	}
	
	void edit_vitems() {
		try {
		    replaceSelected(
		    		
			    		"    };\n" + 
			    		"};"
			    		/////////////
			    		, 
			    		/////////////
			    		"    };\n\n"
			    		+"	class " +var_name +"_unprocessed {"
			    		+"\n"
			            +"		variable = \"" +var_name +"_unprocessed\""
			    		+"\n"
			            +"		displayName = \"STR_Item_" +var_name +"_unprocessed\""
			    		+"\n"
			            +"		weight = " +weight +";"
			    		+"\n"
			            +"		buyPrice = " +buyPrice +";"
			    		+"\n"
			            +"		sellPrice = " +sellPrice +";"
			    		+"\n"
			            +"		illegal = " +is_illegal_item +";"
			    		+"\n"
			            +"		edible = " +edible +";"
			    		+"\n"
			            +"		icon = \"" +icon +"\";"
			    		+"\n"
			    		+"    };\n"
			    		+"\n"
			    		
						+"	class " +var_name +"_processed {"
						+"\n"
						+"		variable = \"" +var_name +"_processed\""
						+"\n"
						+"		displayName = \"STR_Item_" +var_name +"_processed\""
						+"\n"
						+"		weight = " +weight +";"
						+"\n"
						+"		buyPrice = " +buyPrice +";"
						+"\n"
						+"		sellPrice = " +sellPrice +";"
						+"\n"
						+"		illegal = " +is_illegal_item +";"
						+"\n"
						+"		edible = " +edible +";"
						+"\n"
						+"		icon = \"" +icon +"\";"
						+"\n"
						+"    };\n"
			    		+"};"
			    		/////////////
			    		,
			    		/////////////
			    		path_to_mission +"\\config\\Config_vItems.hpp"
		    		);
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "An error contact TaktischerSpeck!");
		}
	}
	
	void edit_process() {
		try {
		    replaceSelected(
		    		
			    		"	};\n" + 
			    		"};"
			    		/////////////
			    		, 
			    		/////////////
			    		"	};\n\n"
			    		+"	class " +var_name  +" {"
			    		+ "\n"
			    		+"		MaterialsReq[] = {{ \"" +var_name +"_unprocessed\"," +anzahl_up +"}};"
			    		+"\n"
			            +"		MaterialsGive[] = {{ \"" +var_name +"_processed\"," +anzahl_p +"}};"
			    		+"\n"
			            +"		Text = \"STR_Process_" +var_name +"\";"
			    		+"\n"
			            +"		NoLicenseCost = " +no_lic_cost +";"
			    		+"\n"
			    		+"	};\n"
			    		+"};"
			    		/////////////
			    		,
			    		/////////////
			    		path_to_mission +"\\config\\Config_Process.hpp"
		    		);
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "An error contact TaktischerSpeck!");
		}
	}

	void edit_licens(){
		try {
		    replaceSelected(
		    		
			    		"    };\n" 
			    		+"};"
			    		/////////////
			    		, 
			    		/////////////
			    		"    };\n\n"
			    		+"	class " +var_name  +" {"
			    		+ "\n"
			    		+"		variable = \"" +var_name +"\";"
			    		+"\n"
			    		+"		displayName = \"" +var_name +"\";"
			    		+"\n"
			    		+"		price = " +liz_price +";"
			    		+"\n"
			    		+"		illegal = " +is_illegal +";"
			    		+"\n"
			    		+"		side = \"" +side +"\";"
			    		+"\n"
			    		+"    };\n"
			    		+"};"
			    		/////////////
			    		,
			    		/////////////
			    		path_to_mission +"\\config\\Config_Licenses.hpp"
		    		);
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "An error contact TaktischerSpeck!");
		}
	}
	
	void edit_gather(){
		try {
		    replaceSelected(
		    		
			    		"    };\n"
			    		+ "};"
			    		/////////////
			    		, 
			    		/////////////
			    		"\n"
			    		+"		class " +var_name +" {"
			    		+ "\n"
			    		+"			amount = " +amount +";"
			    		+"\n"
			    		+"			zones[] = { \"" +zone +"\" };"
			    		+"\n"
			    		+"			item = \"" +abbau_item +"\";"
			    		+"\n"
			    		+"			mined[] = { \"" +var_name +"_unprocessed\" };"
			    		+"\n"
			    		+"			zoneSize = " +zone_range +";"
			    		+"\n"
			    		+"		};"
			    		+"\n"
			    		+"    };\n"
			    		+"};"
			    		/////////////
			    		,
			    		/////////////
			    		path_to_mission +"\\config\\Config_Gather.hpp"
		    		);
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "An error contact TaktischerSpeck!");
		}
	}
	
	void edit_stringtable() {
		try {
		    replaceSelected(
		    		
			    		"</Project>", 
			    		/////////////
			    		"	<Package name=\"" +var_name +"\">"
			    		+ "\n"
			    		+ "		<Key ID=\"STR_License_" +var_name +"\">"
			    		+ "\n"
			    		+ "			<Original>" +license_name +"</Original>"
			    		+ "\n"
			    		+ "		</Key>\n"
			    		+ "		<Key ID=\"STR_Process_" +var_name +"\">"
			    		+ "\n"
			    		+ "			<Original>" +prozess_name +"</Original>"
			    		+ "\n"
			    		+ "		</Key>\n"
			    		+ "		<Key ID=\"STR_Item_" +var_name +"_unprocessed\">"
			    		+ "\n"
			    		+ "			<Original>" +item_up +"</Original>"
			    		+ "\n"
			    		+ "		</Key>\n"
			    		+ "		<Key ID=\"STR_Item_" +var_name +"_processed\">"
			    		+ "\n"
			    		+ "			<Original>" +item_p +"</Original>"
			    		+ "\n"
			    		+ "		</Key>"
			    		+ "\n"
			    		+ "	</Package>"
			    		+"\n"
			    		+"</Project>",
			    		/////////////
			    		path_to_mission +"\\stringtable.xml"
		    		);
		} catch (Exception e) {
				JOptionPane.showMessageDialog( null, "An error contact TaktischerSpeck!");
		}
	}
	
	void old_way() throws IOException {
		try {
		
		FileWriter fw = new FileWriter("" +var_name +".hpp");
	    BufferedWriter bw = new BufferedWriter(fw);
	    
	    /* |||||||||||||||||||||||||STRING|||||||||||||||||||||||||||||||*/
	    
	    bw.write("//////// stringtable.xml \\\\\\\\\\\\\\\\");
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
	    bw.write("//////// Config_Gather.hpp \\\\\\\\\\\\\\\\");
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
	    bw.write("//////// Config_Licenses.hpp \\\\\\\\\\\\\\\\");
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
	    bw.write("//////// Config_Process.hpp \\\\\\\\\\\\\\\\");
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
	    bw.write("//////// Config_vItems.hpp \\\\\\\\\\\\\\\\");
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
	    bw.write("//////// NPC Init \\\\\\\\");
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
			if (german) {
				 JOptionPane.showMessageDialog( null, "Achte darauf das alle Felder richtig ausgefüllt sind!");
			}
			if (!german) {
				JOptionPane.showMessageDialog( null, "Check all fields, one is not correct!");
			}
	    }
	}
		
	void l_english() {
		btn_englisch.setEnabled(false);
		btn_german.setEnabled(true);
		lbl_variable_name.setText("Variabel name");
		lbl_gather_amount.setText("Amount");
		lbl_gather_zone.setText("Gather zone");
		lbl_gather_zone_size.setText("Zone Radius");
		lbl_gather_item.setText("Gather Item");
		lbl_license_name.setText("License name");
		lbl_license_price.setText("License price");
		lbl_license_illegal.setText("Illegal");
		lbl_license_side.setText("fraction");
		lbl_amount_before_processed.setText("Amount unprocessed");
		lbl_amount_after_processed.setText("Amount processed");
		lbl_process_text.setText("loading bar content");
		lbl_license_cost.setText("License cost");
		lbl_item_name.setText("Item name");
		lbl_item_mass.setText("Mass");
		lbl_item_buy_price.setText("Buy price");
		lbl_item_sell_price.setText("Sell price");
		lbl_item_illegal.setText("Illegal");
		lbl_item_edible.setText("Edible");
		lbl_item_icon_path.setText("Icon path");
		lbl_Item_unprocessed.setText("Item (UP)");
		lbl_Item_processed.setText("Item (P)");
		lbl_license_settings.setText("License settings");
		lbl_Gather_settings.setText("Gather settings");
		lbl_Item_settings.setText("Item settings");
		lbl_process_settings.setText("Processe settings");
		lbl_path_to_mission.setText("Path of the mission:");
		
		lbl_path_to_mission.setToolTipText("Path to the main directory of the mission. | "
				 + "Ae. C:\\A3Server\\Life\\mpmissions\\MyServer.Altis");		
		
		chb_method.setText("Old method");
		chb_method.setToolTipText("Creates job file (as in V1-1.5)");
		chb_item_standart.setText("Standart Gather Item");
		
		btn_generate.setText("Generate");
		
		german=false;
	}
	
	void l_german () {
		btn_german.setEnabled(false);
		btn_englisch.setEnabled(true);
		lbl_variable_name.setText("Variabel Name");
		lbl_gather_amount.setText("Anzahl");
		lbl_gather_zone.setText("Abbauzone");
		lbl_gather_zone_size.setText("Zonen Gr\u00F6\u00DFe");
		lbl_gather_item.setText("Abbau Item");
		lbl_license_name.setText("Lizenz Name");
		lbl_license_price.setText("Lizenz Preis");
		lbl_license_illegal.setText("Illegal");
		lbl_license_side.setText("Fraktion");
		lbl_amount_before_processed.setText("Anzahl unverarbeitet");
		lbl_amount_after_processed.setText("Anzahl verarbeitet");
		lbl_process_text.setText("Ladebalken Schrift");
		lbl_license_cost.setText("Lizenz kosten");
		lbl_item_name.setText("Item Name");
		lbl_item_mass.setText("Gewicht");
		lbl_item_buy_price.setText("Kaufpreis");
		lbl_item_sell_price.setText("Verkaufspreis");
		lbl_item_illegal.setText("Illegal");
		lbl_item_edible.setText("Essbar");
		lbl_item_icon_path.setText("Icon Pfad");
		lbl_Item_unprocessed.setText("Item (UP)");
		lbl_Item_processed.setText("Item (P)");
		lbl_license_settings.setText("Lizenz Einstellungen");
		lbl_Gather_settings.setText("Gather Einstellungen");
		lbl_Item_settings.setText("Item Einstellungen");
		lbl_path_to_mission.setText("Pfad der Mission:");
		
		lbl_path_to_mission.setToolTipText("Pfad zum Hauptverzeichnis der Mission. | "
										 + "Zb. C:\\A3Server\\Life\\mpmissions\\MeinServer.Altis");		
		
		chb_method.setText("Alte Methode");
		chb_method.setToolTipText("Erstellt Job Datei (Wie in V1-1.5)");
		chb_item_standart.setText("Standart Abbau Item");
		
		btn_generate.setText("Erstellen");
		
		german=true;
	}
	
	public static void replaceSelected(String replace, String With, String InFile) {
	    try {
	        BufferedReader file = new BufferedReader(new FileReader(InFile));
	        String line;
	        StringBuffer inputBuffer = new StringBuffer();

	        while ((line = file.readLine()) != null) {
	            inputBuffer.append(line);
	            inputBuffer.append('\n');
	        }
	        
	        String inputStr = inputBuffer.toString();

	        file.close();
	        
	        inputStr = inputStr.replace(replace, With); 
	        
	        FileOutputStream fileOut = new FileOutputStream(InFile);
	        fileOut.write(inputStr.getBytes());
	        fileOut.close();

	    } catch (Exception e) {
	        System.out.println("Problem reading file.");
	    }
	}
}
