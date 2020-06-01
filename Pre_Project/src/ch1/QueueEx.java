package ch1;

public class QueueEx {
	//화면 1. 메인

	import java.awt.GridLayout;

	import java.awt.event.ActionEvent;

	import java.awt.event.ActionListener;

	import java.util.Calendar;

	import java.util.LinkedList;



	import javax.swing.JButton;

	import javax.swing.JFrame;

	import javax.swing.JLabel;

	import javax.swing.JPanel;



	public class QueueEx extends JFrame implements ActionListener{

		JPanel leftPane = new JPanel(new GridLayout(4, 1));

			JButton createBtn = new JButton("번호표 뽑기");

			JLabel createNum = new JLabel();

		JLabel viewNum = new JLabel("대기인수 : 0명", JLabel.CENTER);

		JPanel rigthPane = new JPanel(new GridLayout(6, 1));

			JButton sawon1 = new JButton("은행원 1");

			JButton sawon2 = new JButton("은행원 2");

			JButton sawon3 = new JButton("은행원 3");

			JLabel msg1 = new JLabel();

			JLabel msg2 = new JLabel();

			JLabel msg3 = new JLabel();

			

		int n = 0;

		LinkedList<GuestInfo> queue = new LinkedList<GuestInfo>();

			

		public QueueEx() {

			setLayout(new GridLayout(1, 3));

			

			leftPane.add(new JLabel());

			leftPane.add(createBtn);

			leftPane.add(createNum);

			add(leftPane);

					

			add(viewNum);

			

			rigthPane.add(sawon1);

			rigthPane.add(msg1);

			rigthPane.add(sawon2);

			rigthPane.add(msg2);

			rigthPane.add(sawon3);

			rigthPane.add(msg3);

			add(rigthPane);

			

			setSize(500, 300);

			setVisible(true);

			

			createBtn.addActionListener(this);

			sawon1.addActionListener(this);

			sawon2.addActionListener(this);

			sawon3.addActionListener(this);

		}

		public void actionPerformed(ActionEvent ae) {		

			Object eventobj = ae.getSource();

			if(eventobj == createBtn){

				numberProcess();

			}else if(eventobj == sawon1){

				sawonProcess(msg1);

			}else if(eventobj == sawon2){

				sawonProcess(msg2);

			}else if(eventobj == sawon3){

				sawonProcess(msg3);

			}

		}

		public void sawonProcess(JLabel msgLbl){

			if(queue.size()<=0){

				msgLbl.setText("대기자가 없습니다.");

			}else{

				GuestInfo guest = queue.poll();

				msgLbl.setText(createMsg(guest.getNum(), guest.getCal()));

			}

			viewNum.setText("대기인수 : "+queue.size()+"명");

		}

		public void numberProcess(){

			n++;

			Calendar cal = Calendar.getInstance();

			GuestInfo info = new GuestInfo();

			info.setNum(n);

			info.setCal(cal);

			

			queue.offer(info);

			

			viewNum.setText("대기인수 : "+queue.size()+"명");

			createNum.setText(createMsg(n, cal));

			

		}

		public String createMsg(int n, Calendar cal){

			String msg = "번호 : "+n+" (";

			msg += cal.get(Calendar.YEAR)+"/"+(cal.get(Calendar.MONTH)+1)+"/";

			msg += cal.get(Calendar.DATE)+" "+cal.get(Calendar.HOUR)+":";

			msg += cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND)+")";

			return msg;

		}

		public static void main(String[] args) {

			new QueueEx();



		}





		



	}



	출처: https://blog.bycho.kr/89 [Story of Hyun]
}
