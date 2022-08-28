package UI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.JCheckBox;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JEditorPane;

public class FunctionUI<E> extends JFrame{
	private JPanel contentPane;
	private JPanel card = new JPanel(new CardLayout());
	public JButton lianjie_button = new JButton("   \u94FE\u63A5   ");
	public JButton peizhi_button = new JButton("   \u914D\u7F6E   ");
	public JButton gongju_button = new JButton("   \u5DE5\u5177   ");
	public JButton guobiaoxieyi_button = new JButton("   \u56FD\u6807\u534F\u8BAE   ");
	public JButton hangbiaoxieyi_button = new JButton("   \u884C\u6807\u534F\u8BAE   ");
	public JButton epcxieyi_button = new JButton("   EPC\u534F\u8BAE   ");
	public JButton llrpxieyi_button = new JButton("   LLRP\u534F\u8BAE   ");
	public JButton hunhexieyi_button = new JButton("   \u6DF7\u5408\u534F\u8BAE   ");
	private CardListener cardListener = new CardListener(card, lianjie_button, gongju_button, peizhi_button,
			guobiaoxieyi_button, hangbiaoxieyi_button, epcxieyi_button, llrpxieyi_button, hunhexieyi_button);
	private final JPanel xiugaiIP2 = new JPanel();
	private final JPanel lianjieduankai = new JPanel();
	private final JPanel xiugaiIP1 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("IP\u5730\u5740\uFF1A");
	private final JTextField textField = new JTextField();
	private final JButton btnNewButton = new JButton("\u8FDE\u63A5");
	private final JButton btnNewButton_1 = new JButton("\u65AD\u5F00");
	private final JLabel lblNewLabel_1 = new JLabel("IP\u5730\u5740\uFF1A");
	private final JLabel lblNewLabel_2 = new JLabel("\u5B50\u7F51\u63A9\u7801\uFF1A");
	private final JLabel lblNewLabel_3 = new JLabel("\u7F51\u5173\uFF1A");
	private final JButton btnNewButton_2 = new JButton("\u8BFB\u53D6");
	private final JButton btnNewButton_3 = new JButton("\u8BBE\u7F6E");
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JLabel lblNewLabel_4 = new JLabel("MAC\u5730\u5740\uFF1A");
	private final JButton btnNewButton_4 = new JButton("\u8BFB\u53D6");
	private final JButton btnNewButton_5 = new JButton("\u8BBE\u7F6E");
	private final JTextField textField_4 = new JTextField();
	private final JPanel panel_yewu = new JPanel();
	private final JPanel panel_llrp = new JPanel();
	private final JPanel panel_anquan = new JPanel();
	private final JPanel panel_hangbiao = new JPanel();
	private final JPanel panel_epc = new JPanel();
	private final JPanel panel_guobiao = new JPanel();
	private final JPanel panel_tianxian = new JPanel();
	private final JLabel lblNewLabel_5 = new JLabel("\u529F\u7387\uFF1A");
	private final JSpinner spinner = new JSpinner();
	private final JLabel lblNewLabel_6 = new JLabel("\u9891\u7387\uFF1A");
	final String def[] =
        { "天线1", "天线2", "天线3", "天线4", "天线5" };        
    JComboBox<Object> comboBox = new JComboBox<Object>(def);
    private final JComboBox comboBox_1 = new JComboBox();
    private final JLabel lblNewLabel_7 = new JLabel("\u6700\u5C0F\u9891\u70B9\uFF1A");
    private final JSpinner spinner_1 = new JSpinner();
    private final JLabel lblNewLabel_8 = new JLabel("\u6700\u5927\u9891\u70B9\uFF1A");
    private final JSpinner spinner_2 = new JSpinner();
    private final JCheckBox chckbxNewCheckBox = new JCheckBox("\u8DF3\u9891");
    private final JLabel label = new JLabel("\u7269\u7406\u5C42\u53C2\u6570");
    private final JLabel label_1 = new JLabel("\u7F16\u7801\u65B9\u5F0F\uFF1A");
    private final JComboBox comboBox_2 = new JComboBox();
    private final JLabel label_2 = new JLabel("\u524D\u5411\u901F\u7387\uFF1A");
    private final JComboBox comboBox_3 = new JComboBox();
    private final JLabel label_3 = new JLabel("\u53CD\u5411\u901F\u7387\uFF1A");
    private final JComboBox comboBox_4 = new JComboBox();
    private final JLabel label_4 = new JLabel("                                                                          ");
    private final JCheckBox checkBox = new JCheckBox("\u8FC7\u6EE4\u53C2\u6570");
    private final JLabel lblMembank = new JLabel("membank\uFF1A");
    private final JComboBox comboBox_5 = new JComboBox();
    private final JLabel label_5 = new JLabel("\u8D77\u59CB\u5730\u5740\uFF1A");
    private final JSpinner spinner_3 = new JSpinner();
    private final JLabel label_6 = new JLabel("\u63A9\u7801\u4F4D\u957F\u5EA6\uFF1A");
    private final JSpinner spinner_4 = new JSpinner();
    private final JLabel label_7 = new JLabel("\u63A9\u7801\u5185\u5BB9\uFF1A");
    private final JTextField textField_5 = new JTextField();
    private final JLabel label_8 = new JLabel("                 ");
    private final JPanel panel_ip = new JPanel();
    private final JPanel panel_yingjian = new JPanel();
    private final JPanel panel_zhubobi = new JPanel();
    private final JPanel panel_chongqi = new JPanel();
    private final JPanel panel_banben = new JPanel();
    private final JLabel label_9 = new JLabel("\u5929\u7EBF1\uFF1A");
    private final JLabel label_10 = new JLabel("\u5929\u7EBF2\uFF1A");
    private final JLabel label_11 = new JLabel("\u5929\u7EBF3\uFF1A");
    private final JLabel label_12 = new JLabel("\u5929\u7EBF4\uFF1A");
    private final JTextField textField_6 = new JTextField();
    private final JTextField textField_7 = new JTextField();
    private final JTextField textField_8 = new JTextField();
    private final JTextField textField_9 = new JTextField();
    private final JButton button = new JButton("\u8BA1\u7B97\u9A7B\u6CE2\u6BD4");
    private final JPanel panel = new JPanel();
    private final JPanel panel_1 = new JPanel();
    private final JPanel panel_2 = new JPanel();
    private final JLabel lblMembank_1 = new JLabel("membank");
    private final JComboBox comboBox_6 = new JComboBox();
    private final JLabel lblNewLabel_9 = new JLabel("\u8D77\u59CB\u5730\u5740\uFF1A");
    private final JSpinner spinner_5 = new JSpinner();
    private final JLabel label_13 = new JLabel("\u957F\u5EA6\uFF1A");
    private final JSpinner spinner_6 = new JSpinner();
    private final JLabel label_14 = new JLabel("                 ");
    private final JLabel label_15 = new JLabel("                                                       ");
    private final JLabel lblNewLabel_10 = new JLabel("                                          ");
    private final JLabel label_16 = new JLabel("                                        ");
    private final JLabel lblNewLabel_11 = new JLabel("\u5468\u671F\u8BFB\u6700\u5927\u6B21\u6570\uFF1A");
    private final JSpinner spinner_7 = new JSpinner();
    private final JButton btnNewButton_6 = new JButton("\u5355\u6B21\u8BFB");
    private final JButton btnNewButton_7 = new JButton("\u5468\u671F\u8BFB");
    private final JButton btnNewButton_8 = new JButton("\u505C\u6B62");
    private final JEditorPane editorPane = new JEditorPane();
	//private SuperMarket server = null;
	
	
	public FunctionUI() {
		textField_9.setColumns(10);
		textField_8.setColumns(10);
		textField_7.setColumns(10);
		textField_6.setColumns(10);
		textField_5.setColumns(10);
		textField_4.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_3.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_3.setColumns(5);
		textField_2.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_2.setColumns(5);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_1.setColumns(5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 45, 1920, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		lianjie_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(lianjie_button);
		lianjie_button.addActionListener(cardListener);
		
		peizhi_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(peizhi_button);
		peizhi_button.addActionListener(cardListener);
		
		gongju_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(gongju_button);
		gongju_button.addActionListener(cardListener);
		
		guobiaoxieyi_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(guobiaoxieyi_button);
		guobiaoxieyi_button.addActionListener(cardListener);
		
		hangbiaoxieyi_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(hangbiaoxieyi_button);
		hangbiaoxieyi_button.addActionListener(cardListener);
		
		llrpxieyi_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(llrpxieyi_button);
		llrpxieyi_button.addActionListener(cardListener);
		
		epcxieyi_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(epcxieyi_button);
		hangbiaoxieyi_button.addActionListener(cardListener);
		
		hunhexieyi_button.setFont(new Font("黑体", Font.BOLD, 16));
		toolBar.add(hunhexieyi_button);
		hunhexieyi_button.addActionListener(cardListener);
		
		
		contentPane.add(card, BorderLayout.CENTER);

		
		
		JPanel lianjie = new JPanel();
		card.add(lianjie, "lianjie");
		lianjie.setLayout(new GridLayout(3, 0, 0, 0));
		
		lianjie.add(lianjieduankai);
		lianjieduankai.setBorder(BorderFactory.createTitledBorder("链接"));
		
		
		lianjieduankai.setLayout(new MigLayout("", "[64px][166px][65px][65px][][][][][]", "[27px][][][][]"));
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		
		lianjieduankai.add(lblNewLabel, "cell 1 4,alignx right,aligny center");
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setText("222.255.255.253");
		textField.setColumns(30);
		
		lianjieduankai.add(textField, "cell 2 4 3 1,alignx left,aligny center");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 16));
		
		lianjieduankai.add(btnNewButton, "cell 6 4,alignx left,aligny top");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		lianjieduankai.add(btnNewButton_1, "cell 8 4,alignx left,aligny top");
		
		lianjie.add(xiugaiIP1);
		xiugaiIP1.setBorder(BorderFactory.createTitledBorder("修改IP"));
		xiugaiIP1.setLayout(new MigLayout("", "[][][][][][grow][][grow][][grow][][][][]", "[][][][][][]"));
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(lblNewLabel_1, "cell 4 2,alignx trailing");
		
		xiugaiIP1.add(textField_1, "cell 5 2,growx");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(lblNewLabel_2, "cell 6 2,alignx trailing");
		
		xiugaiIP1.add(textField_2, "cell 7 2,growx");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(lblNewLabel_3, "cell 8 2,alignx trailing");
		
		xiugaiIP1.add(textField_3, "cell 9 2,growx");
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(btnNewButton_2, "cell 11 2");
		btnNewButton_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(btnNewButton_3, "cell 13 2");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(lblNewLabel_4, "cell 4 5,alignx trailing");
		
		xiugaiIP1.add(textField_4, "cell 5 5 3 1,growx");
		btnNewButton_4.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(btnNewButton_4, "cell 11 5");
		btnNewButton_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		xiugaiIP1.add(btnNewButton_5, "cell 13 5");
		
		lianjie.add(xiugaiIP2);
		
		JPanel peizhi = new JPanel();
		card.add(peizhi, "peizhi");
		peizhi.setLayout(new GridLayout(7, 0, 0, 0));
		panel_tianxian.setToolTipText("\u5929\u7EBF\u914D\u7F6E");
		
		peizhi.add(panel_tianxian);
		panel_tianxian.setBorder(BorderFactory.createTitledBorder("天线配置"));
		panel_tianxian.setLayout(new MigLayout("", "[grow][grow][][grow][][][][]", "[][grow]"));
		comboBox.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_tianxian.add(comboBox, "cell 0 0,growx");
		chckbxNewCheckBox.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_tianxian.add(chckbxNewCheckBox, "cell 4 0");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		
		panel_tianxian.add(lblNewLabel_5, "cell 0 1,alignx right");
		spinner.setFont(new Font("宋体", Font.PLAIN, 16));
		spinner.setModel(new SpinnerNumberModel(14, 14, 34, 1));
		
		panel_tianxian.add(spinner, "cell 1 1");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_tianxian.add(lblNewLabel_6, "cell 2 1,alignx trailing");
		comboBox_1.setFont(new Font("宋体", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0: 920125", "1: 920375", "2: 920625", "3: 920875", "4: 921125", "5: 921375", "6: 921625", "7: 921875", "8: 922125", "9: 922375", "10: 922625", "11: 922875", "12: 923125", "13: 923375", "14: 923625", "15: 923875", "16: 924125", "17: 924375", "18: 924625", "19: 924875"}));
		
		panel_tianxian.add(comboBox_1, "cell 3 1,alignx left,aligny center");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_tianxian.add(lblNewLabel_7, "cell 4 1");
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 19, 1));
		spinner_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_tianxian.add(spinner_1, "cell 5 1");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_tianxian.add(lblNewLabel_8, "cell 6 1");
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 19, 1));
		spinner_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_tianxian.add(spinner_2, "cell 7 1");
		

		panel_guobiao.setToolTipText("\u56FD\u6807\u534F\u8BAE\u914D\u7F6E");
		
		peizhi.add(panel_guobiao);
		panel_guobiao.setBorder(BorderFactory.createTitledBorder("国标协议配置"));
		panel_guobiao.setLayout(new MigLayout("", "[1px][1422px][grow][][grow][][grow][][][][][grow][][][][][]", "[1px][96px][]"));
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		panel_guobiao.add(label, "cell 0 0,grow");
		
		panel_guobiao.add(checkBox, "cell 8 0");
		panel_guobiao.add(label_1, "cell 1 1,alignx trailing,growy");
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"FMO", "Miller2", "Miller4", "Miller8"}));
		
		panel_guobiao.add(comboBox_2, "cell 2 1,growx");
		
		panel_guobiao.add(label_2, "cell 3 1,alignx trailing");
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"40", "80"}));
		
		panel_guobiao.add(comboBox_3, "cell 4 1,growx");
		
		panel_guobiao.add(label_3, "cell 5 1,alignx trailing");
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"64", "137", "174", "320", "128", "274", "349", "640"}));
		
		panel_guobiao.add(comboBox_4, "cell 6 1,growx");
		
		panel_guobiao.add(label_4, "cell 7 1");
		
		panel_guobiao.add(lblMembank, "cell 9 1");
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"\u4FE1\u606F\u533A", "\u7F16\u7801\u533A", "\u5B89\u5168\u533A", "\u7528\u6237\u533A"}));
		
		panel_guobiao.add(comboBox_5, "flowx,cell 11 1,growx");
		
		panel_guobiao.add(label_5, "cell 12 1");
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 99, 1));
		
		panel_guobiao.add(spinner_3, "cell 13 1");
		
		panel_guobiao.add(label_6, "cell 14 1");
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 99, 1));
		
		panel_guobiao.add(spinner_4, "cell 15 1");
		
		panel_guobiao.add(label_8, "cell 16 1");
		
		panel_guobiao.add(label_7, "cell 9 2");
		
		panel_guobiao.add(textField_5, "cell 11 2 3 1,growx");
		
		
		panel_epc.setToolTipText("EPC\u534F\u8BAE\u914D\u7F6E");
		
		peizhi.add(panel_epc);
		panel_epc.setBorder(BorderFactory.createTitledBorder("EPC协议配置"));
		panel_hangbiao.setToolTipText("\u884C\u6807\u534F\u8BAE\u914D\u7F6E");
		
		peizhi.add(panel_hangbiao);
		panel_hangbiao.setBorder(BorderFactory.createTitledBorder("行标协议配置"));
		panel_anquan.setToolTipText("\u5B89\u5168\u6A21\u5757\u914D\u7F6E");
		
		peizhi.add(panel_anquan);
		panel_anquan.setBorder(BorderFactory.createTitledBorder("安全模块配置"));
		panel_llrp.setToolTipText("LLRP\u901A\u4FE1\u914D\u7F6E");
		
		peizhi.add(panel_llrp);
		panel_llrp.setBorder(BorderFactory.createTitledBorder("LLRP通信配置"));
		panel_yewu.setToolTipText("\u4E1A\u52A1\u914D\u7F6E");
		
		peizhi.add(panel_yewu);
		panel_yewu.setBorder(BorderFactory.createTitledBorder("业务配置"));
		
		JPanel gongju = new JPanel();
		card.add(gongju, "gongju");
		gongju.setLayout(new GridLayout(5, 0, 0, 0));
		
		gongju.add(panel_yingjian);
		panel_yingjian.setBorder(BorderFactory.createTitledBorder("硬件调试"));
		
		gongju.add(panel_zhubobi);
		panel_zhubobi.setBorder(BorderFactory.createTitledBorder("驻波比查询"));
		panel_zhubobi.setLayout(new MigLayout("", "[][][grow][][][grow][][][grow][][][grow]", "[][][][]"));
		
		panel_zhubobi.add(label_9, "cell 1 1,alignx trailing");
		
		panel_zhubobi.add(textField_6, "cell 2 1,growx");
		
		panel_zhubobi.add(label_10, "cell 4 1,alignx trailing");
		
		panel_zhubobi.add(textField_7, "cell 5 1,growx");
		
		panel_zhubobi.add(label_11, "cell 7 1,alignx trailing");
		
		panel_zhubobi.add(textField_8, "cell 8 1,growx");
		
		panel_zhubobi.add(label_12, "cell 10 1,alignx trailing");
		
		panel_zhubobi.add(textField_9, "cell 11 1,growx");
		
		panel_zhubobi.add(button, "cell 6 3");
		
		gongju.add(panel_chongqi);
		panel_chongqi.setBorder(BorderFactory.createTitledBorder("设备重启"));
		
		gongju.add(panel_banben);
		panel_banben.setBorder(BorderFactory.createTitledBorder("版本下载"));
		
		gongju.add(panel_ip);
		panel_ip.setBorder(BorderFactory.createTitledBorder("IP搜索"));
		
		JPanel guobiaoxieyi = new JPanel();
		card.add(guobiaoxieyi, "guobiaoxieyi");
		guobiaoxieyi.setLayout(new GridLayout(3, 0, 0, 0));
		
		guobiaoxieyi.add(panel_1);
		panel_1.setBorder(BorderFactory.createTitledBorder("参数"));
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		panel_1.add(label_16, "2, 4");
		lblMembank_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(lblMembank_1, "4, 4");
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"\u4FE1\u606F\u533A", "\u7F16\u7801\u533A", "\u5B89\u5168\u533A", "\u7528\u6237\u533A"}));
		comboBox_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(comboBox_6, "8, 4, fill, default");
		
		panel_1.add(label_14, "10, 4");
		lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(lblNewLabel_9, "12, 4");
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 99, 1));
		spinner_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(spinner_5, "14, 4");
		
		panel_1.add(label_15, "16, 4");
		label_13.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(label_13, "18, 4");
		spinner_6.setModel(new SpinnerNumberModel(0, 0, 99, 1));
		spinner_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(spinner_6, "20, 4");
		
		panel_1.add(lblNewLabel_10, "22, 4");
		lblNewLabel_11.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(lblNewLabel_11, "8, 12");
		spinner_7.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_7.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_1.add(spinner_7, "12, 12");
		
		guobiaoxieyi.add(panel_2);
		panel_2.setBorder(BorderFactory.createTitledBorder("读"));
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		btnNewButton_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_2.add(btnNewButton_6, "16, 8");
		btnNewButton_7.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_2.add(btnNewButton_7, "30, 8");
		btnNewButton_8.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel_2.add(btnNewButton_8, "44, 8");
		
		guobiaoxieyi.add(panel);
		panel.setBorder(BorderFactory.createTitledBorder("结果输出"));
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		editorPane.setFont(new Font("宋体", Font.PLAIN, 16));
		
		panel.add(editorPane, "2, 2, fill, fill");
		
		JPanel hangbiaoxieyi = new JPanel();
		card.add(hangbiaoxieyi, "hangbiaoxieyi");
		hangbiaoxieyi.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel epcxieyi = new JPanel();
		card.add(epcxieyi, "epcxieyi");
		epcxieyi.setLayout(new GridLayout(10, 0, 0, 0));
		
		JPanel llrpxieyi = new JPanel();
		card.add(llrpxieyi, "llrpxieyi");
		llrpxieyi.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel hunhexieyi = new JPanel();
		card.add(hunhexieyi, "hunhexieyi");
		hunhexieyi.setLayout(new GridLayout(2, 0, 0, 0));
		
		
		

	}
		

}
