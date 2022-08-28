package UI;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
//控制卡片布局管理器的事件监听器类，他加在控制面板cardControl上的button上
public class CardListener implements ActionListener{

	private JPanel card = null;
	private JButton lianjie = null;
	private JButton peizhi = null;
	private JButton gongju = null;
	private JButton guobiaoxieyi = null;
	private JButton hangbiaoxieyi = null;
	private JButton epcxieyi = null;
	private JButton llrpxieyi = null;
	private JButton hunhexieyi = null;
	public CardListener(JPanel card, JButton lianjie, JButton peizhi, JButton gongju, JButton guobiaoxieyi,
			JButton hangbiaoxieyi, JButton epcxieyi, JButton llrpxieyi, JButton hunhexieyi) {
		this.card = card;
		this.lianjie = lianjie;
		this.peizhi = peizhi;
		this.gongju = gongju;
		this.guobiaoxieyi = guobiaoxieyi;
		this.hangbiaoxieyi = hangbiaoxieyi;
		this.epcxieyi = epcxieyi;
		this.llrpxieyi = hangbiaoxieyi;
		this.hunhexieyi = hunhexieyi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout layout = (CardLayout)card.getLayout();
		if((JButton)e.getSource() == lianjie){
			layout.show(card, "lianjie");
		}
		if((JButton)e.getSource() == peizhi){
			layout.show(card, "gongju");
		}
		if((JButton)e.getSource() == gongju){
			layout.show(card, "peizhi");
		}
		if((JButton)e.getSource() == guobiaoxieyi){
			layout.show(card, "guobiaoxieyi");
		}
		if((JButton)e.getSource() == hangbiaoxieyi){
			layout.show(card, "hangbiaoxieyi");
		}
		if((JButton)e.getSource() == epcxieyi){
			layout.show(card, "epcxieyi");
		}
		if((JButton)e.getSource() == llrpxieyi){
			layout.show(card, "llrpxieyi");
		}
		if((JButton)e.getSource() == hunhexieyi){
			layout.show(card, "hunhexieyi");
		}
	}

}

