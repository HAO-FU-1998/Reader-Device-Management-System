package UI;

public class Main {


	public static void main(String[] args) {
		//try
	    //{
	        //org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	    //}
	    //catch(Exception e)
	    //{
	        //TODO exception

//			JTextField user;
//			JTextField password;
//			final JFrame jf;
//			
//
//				jf = new JFrame("读写器设备管理系统");
//				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				
//				jf.getContentPane().setLayout(new GridLayout(3, 1));
//				
//				ImageIcon icon = new ImageIcon("background.jpg");
//				
//				JLabel label = new JLabel(icon);
//				
//				label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
//		        jf.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
//		        JPanel j = (JPanel)jf.getContentPane();  
//		        j.setOpaque(false);
//		        
//		        JPanel title = new JPanel();
//		        title.setOpaque(false);
//		        jf.getContentPane().add(title);
//		        
//		        JLabel lblNewLabel = new JLabel("\u8BFB\u5199\u5668\u8BBE\u5907\u7BA1\u7406\u7CFB\u7EDF");
//		        lblNewLabel.setForeground(new Color(148, 0, 211));
//		        lblNewLabel.setFont(new Font("华文新魏", Font.BOLD, 60));
//		        title.add(lblNewLabel);
//		        
//		        JPanel register = new JPanel();
//		        jf.getContentPane().add(register, BorderLayout.CENTER);
//		        register.setLayout(new GridLayout(2, 1, 0, 0));
//		        register.setOpaque(false);
//		        
//		        JPanel userPanel = new JPanel();
//				userPanel.setSize(new Dimension(600, 0));
//				register.add(userPanel);
//				userPanel.setOpaque(false);
//		        
//		        JLabel userLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
//		        userLabel.setForeground(UIManager.getColor("textHighlight"));
//		        userLabel.setFont(new Font("楷体", Font.BOLD, 30));
//		        userPanel.add(userLabel);
//		        
//		        user = new JTextField();
//		        user.setFont(new Font("Times New Roman", Font.PLAIN, 30));
//		        user.setColumns(10);
//		        userPanel.add(user);
//		        
//		        JPanel passwordPanel = new JPanel();
//				passwordPanel.setOpaque(false);
//				register.add(passwordPanel);
//		        
//				JLabel passwordLabel = new JLabel("\u5BC6\u7801\uFF1A  ");
//				passwordLabel.setForeground(UIManager.getColor("textHighlight"));
//				passwordLabel.setFont(new Font("楷体", Font.BOLD, 30));
//				passwordPanel.add(passwordLabel);
//				
//				password = new JTextField();
//				password.setFont(new Font("Times New Roman", Font.PLAIN, 30));
//				password.setColumns(10);
//				passwordPanel.add(password);
//				
//				JPanel buttonPanel = new JPanel();
//				FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
//				flowLayout.setAlignment(FlowLayout.RIGHT);
//				buttonPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//				buttonPanel.setOpaque(false);
//				jf.getContentPane().add(buttonPanel);
//				
//				JButton signin = new JButton("\u786E\u8BA4");
//				signin.setFont(new Font("华文楷体", Font.BOLD, 25));
//				signin.setBackground(UIManager.getColor("text"));
//				signin.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
//				signin.setForeground(Color.BLACK);
//				signin.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						Initalization init = new Initalization();
//
//							init.firstInit();
//
//						jf.dispose();
//						
//					}
//				});
//				
//				JLabel lblNewLabel1 = new JLabel("        ");
//				buttonPanel.add(lblNewLabel1);
//				buttonPanel.add(signin);
//				
//				jf.setVisible(true);
		
		FunctionUI funUI = new FunctionUI();
		funUI.setVisible(true);
	    }

		


}
