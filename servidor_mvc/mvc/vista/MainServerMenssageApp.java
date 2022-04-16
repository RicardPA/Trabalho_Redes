package mvc.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MainServerMenssageApp extends JFrame {

	private JPanel contentServer;
	private JTextField textSearchUser;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainServerMenssageApp frame = new MainServerMenssageApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainServerMenssageApp() {
		setTitle("Message App - Server");
		setIconImage(new ImageIcon(getClass().getResource("/utils/caixa-de-dialogo.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 500);
		contentServer = new JPanel();
		contentServer.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentServer.setLayout(new BorderLayout(0, 0));
		setContentPane(contentServer);
		
		JPanel pServer = new JPanel();
		contentServer.add(pServer, BorderLayout.CENTER);
		
		JPanel pViewUsers = new JPanel();
		
		JPanel pDataUser = new JPanel();
		GroupLayout gl_pServer = new GroupLayout(pServer);
		gl_pServer.setHorizontalGroup(
			gl_pServer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pServer.createSequentialGroup()
					.addComponent(pViewUsers, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pDataUser, GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
		);
		gl_pServer.setVerticalGroup(
			gl_pServer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pServer.createSequentialGroup()
					.addGroup(gl_pServer.createParallelGroup(Alignment.LEADING)
						.addComponent(pViewUsers, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
						.addComponent(pDataUser, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblNewLabel_1 = new JLabel("Tamanho de arquivo do Usu\u00E1rio:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantidade de Contatos:");
		
		JLabel lblNewLabel_1_2 = new JLabel("Chave p\u00FAblica:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u00DAltimo IP utilizado:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Localiza\u00E7\u00E3o do arquivo do Usu\u00E1rio:");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GroupLayout gl_pDataUser = new GroupLayout(pDataUser);
		gl_pDataUser.setHorizontalGroup(
			gl_pDataUser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pDataUser.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pDataUser.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
						.addComponent(textField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_pDataUser.createSequentialGroup()
							.addGroup(gl_pDataUser.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
							.addGroup(gl_pDataUser.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, gl_pDataUser.createSequentialGroup()
							.addGroup(gl_pDataUser.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
							.addGroup(gl_pDataUser.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1_3_1, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDescrio, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_pDataUser.setVerticalGroup(
			gl_pDataUser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pDataUser.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDescrio)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pDataUser.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pDataUser.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pDataUser.createSequentialGroup()
							.addComponent(lblNewLabel_1_1)
							.addGap(6)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pDataUser.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_2)
						.addComponent(lblNewLabel_1_3))
					.addGap(6)
					.addGroup(gl_pDataUser.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_3_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		pDataUser.setLayout(gl_pDataUser);
		
		JPanel pViewUserList = new JPanel();
		
		textSearchUser = new JTextField();
		textSearchUser.setColumns(10);
		
		JButton btnSearchUsers = new JButton("");
		btnSearchUsers.setIcon(new ImageIcon(MainServerMenssageApp.class.getResource("/utils/lupa.png")));
		GroupLayout gl_pViewUsers = new GroupLayout(pViewUsers);
		gl_pViewUsers.setHorizontalGroup(
			gl_pViewUsers.createParallelGroup(Alignment.LEADING)
				.addComponent(pViewUserList, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
				.addGroup(gl_pViewUsers.createSequentialGroup()
					.addContainerGap()
					.addComponent(textSearchUser, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSearchUsers, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pViewUsers.setVerticalGroup(
			gl_pViewUsers.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pViewUsers.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pViewUsers.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnSearchUsers, 0, 0, Short.MAX_VALUE)
						.addComponent(textSearchUser))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pViewUserList, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
		);
		pViewUserList.setLayout(new BorderLayout(0, 0));
		
		JList listUser = new JList();
		pViewUserList.add(listUser, BorderLayout.CENTER);
		pViewUsers.setLayout(gl_pViewUsers);
		pServer.setLayout(gl_pServer);
	}
}
