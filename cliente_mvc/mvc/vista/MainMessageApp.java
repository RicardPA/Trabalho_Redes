package mvc.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JList;

public class MainMessageApp extends JFrame {
	
	private static final long serialVersionUID = 1L;
	// Panel's
	private JPanel contentPane = new JPanel();
	private JPanel message = new JPanel();
	private JPanel pMyMessage = new JPanel();
	private JPanel pAllMessage = new JPanel();
	private JPanel pContacts = new JPanel();
	private JPanel pSend = new JPanel();
	private JPanel request = new JPanel();
	private JPanel pSearchUser = new JPanel();
	private JPanel pRequestsMade = new JPanel();
	private JPanel pRequisitionsReceived = new JPanel();
	private JPanel pViewRequisitionsReceived = new JPanel();
	private JPanel profile = new JPanel();
	private JPanel pViewRequestsMade = new JPanel();
	private JPanel pUserView = new JPanel();
	// JTextField's
	private JTextField textNameUser = new JTextField();
	private JTextField textMyName = new JTextField();
	// JTextArea's
	private JTextArea textMyMessage = new JTextArea();
	private JTextArea textAllMessage = new JTextArea();
	private JTextArea textDescription = new JTextArea();
	// JScrollPane's
	private JScrollPane scrollMyMessage;
	private JScrollPane scrollAllMessage;
	private JScrollPane scrollContacts;
	// JButton's
	private JButton btnSend;
	private JButton btnSearch;
	private JButton btnDelete;
	// JLabel's 
	private JLabel lblRequisitionsReceived;
	private JLabel lblRequestsMade;
	private JLabel lblName;
	private JLabel lblDescription;
	// JTabbedPane
	private JTabbedPane Application; 
	private JTextField textNameContact;
	private final JList listRequestMade = new JList();
	private final JButton btnAcceptRequest = new JButton("Aceitar");
	private final JList listUsers = new JList();
	private final JList list_1 = new JList();
	
	/**
	 * Launch the application.
	 */
	public void openMessageApp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMessageApp frame = new MainMessageApp();
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
	public MainMessageApp() {
		setTitle("Mansage App");
		textMyMessage.setLineWrap(true);
		textAllMessage.setLineWrap(true);
		textDescription.setLineWrap(true);
		
		setIconImage(new ImageIcon(getClass().getResource("/utils/caixa-de-dialogo.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 440);
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Application = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(Application, BorderLayout.CENTER);
		
		Application.addTab("Mensagem", null, message, null);
		
		JPanel pNameContact = new JPanel();

		GroupLayout gl_message = new GroupLayout(message);
		gl_message.setHorizontalGroup(
			gl_message.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_message.createSequentialGroup()
					.addComponent(pContacts, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_message.createParallelGroup(Alignment.LEADING)
						.addComponent(pNameContact, GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_message.createSequentialGroup()
							.addComponent(pMyMessage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pSend, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addComponent(pAllMessage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);
		gl_message.setVerticalGroup(
			gl_message.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_message.createSequentialGroup()
					.addComponent(pNameContact, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(pAllMessage, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_message.createParallelGroup(Alignment.TRAILING)
						.addComponent(pSend, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pMyMessage, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
				.addComponent(pContacts, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
		);
		pNameContact.setLayout(new BoxLayout(pNameContact, BoxLayout.X_AXIS));
		
		textNameContact = new JTextField();
		textNameContact.setHorizontalAlignment(SwingConstants.CENTER);
		pNameContact.add(textNameContact);
		textNameContact.setColumns(10);
		pMyMessage.setLayout(new GridLayout(1, 0, 0, 0));
		
		pMyMessage.add(textMyMessage);
		
		scrollMyMessage = new JScrollPane(textMyMessage);
		pMyMessage.add(scrollMyMessage);
		pAllMessage.setLayout(new GridLayout(1, 0, 0, 0));
		
		textAllMessage.setEditable(false);
		pAllMessage.add(textAllMessage);
		
		scrollAllMessage = new JScrollPane(textAllMessage);
		pAllMessage.add(scrollAllMessage);
		pContacts.setLayout(new BorderLayout(0, 0));
		
		scrollContacts = new JScrollPane();
		pContacts.add(scrollContacts);
		
		JList list = new JList();
		scrollContacts.setViewportView(list);
		pSend.setLayout(new BorderLayout(0, 0));
		
		btnSend = new JButton("");
		btnSend.addActionListener(new sendMessage());
		pSend.add(btnSend, BorderLayout.CENTER);
		btnSend.setIcon(new ImageIcon(MainMessageApp.class.getResource("/utils/enviar-correio.png")));
		message.setLayout(gl_message);
		
		Application.addTab("Requisição", null, request, null);
		
		JButton btnRequest = new JButton("Fazer Requisi\u00E7\u00E3o");
		
		JButton btnRefuseRequisition = new JButton("Recusar");
		
		GroupLayout gl_request = new GroupLayout(request);
		gl_request.setHorizontalGroup(
			gl_request.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_request.createSequentialGroup()
					.addGroup(gl_request.createParallelGroup(Alignment.LEADING)
						.addComponent(pSearchUser, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_request.createSequentialGroup()
							.addGap(66)
							.addComponent(btnRequest)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pRequestsMade, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_request.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_request.createSequentialGroup()
							.addGap(20)
							.addComponent(btnAcceptRequest, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRefuseRequisition, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_request.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pRequisitionsReceived, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))))
		);
		gl_request.setVerticalGroup(
			gl_request.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_request.createSequentialGroup()
					.addGroup(gl_request.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_request.createSequentialGroup()
							.addComponent(pSearchUser, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRequest)
							.addGap(5))
						.addGroup(gl_request.createSequentialGroup()
							.addComponent(pRequisitionsReceived, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_request.createParallelGroup(Alignment.LEADING)
								.addComponent(btnRefuseRequisition)
								.addComponent(btnAcceptRequest)))
						.addComponent(pRequestsMade, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
					.addContainerGap())
		);
		btnAcceptRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		lblRequisitionsReceived = new JLabel("Requisi\u00E7\u00F5es recebidas");
		lblRequisitionsReceived.setHorizontalAlignment(SwingConstants.CENTER);
		
		GroupLayout gl_pRequisitionsReceived = new GroupLayout(pRequisitionsReceived);
		gl_pRequisitionsReceived.setHorizontalGroup(
			gl_pRequisitionsReceived.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pRequisitionsReceived.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRequisitionsReceived)
					.addGap(74))
				.addComponent(pViewRequisitionsReceived, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
		);
		gl_pRequisitionsReceived.setVerticalGroup(
			gl_pRequisitionsReceived.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pRequisitionsReceived.createSequentialGroup()
					.addGap(6)
					.addComponent(lblRequisitionsReceived, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pViewRequisitionsReceived, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
		);
		pViewRequisitionsReceived.setLayout(new BorderLayout(0, 0));
		
		pViewRequisitionsReceived.add(list_1, BorderLayout.CENTER);
		pRequisitionsReceived.setLayout(gl_pRequisitionsReceived);
		
		lblRequestsMade = new JLabel("Requisi\u00E7\u00F5es feitas");
		lblRequestsMade.setHorizontalAlignment(SwingConstants.CENTER);
		
		GroupLayout gl_pRequestsMade = new GroupLayout(pRequestsMade);
		gl_pRequestsMade.setHorizontalGroup(
			gl_pRequestsMade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pRequestsMade.createSequentialGroup()
					.addGap(62)
					.addComponent(lblRequestsMade, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(pViewRequestsMade, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
		);
		gl_pRequestsMade.setVerticalGroup(
			gl_pRequestsMade.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pRequestsMade.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRequestsMade, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pViewRequestsMade, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE))
		);
		pViewRequestsMade.setLayout(new BorderLayout(0, 0));
		
		pViewRequestsMade.add(listRequestMade, BorderLayout.CENTER);
		pRequestsMade.setLayout(gl_pRequestsMade);
		
		textNameUser.setColumns(10);
		
		btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon(MainMessageApp.class.getResource("/utils/lupa.png")));
		GroupLayout gl_pSearchUser = new GroupLayout(pSearchUser);
		gl_pSearchUser.setHorizontalGroup(
			gl_pSearchUser.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pSearchUser.createSequentialGroup()
					.addContainerGap()
					.addComponent(textNameUser, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addComponent(pUserView, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
		);
		gl_pSearchUser.setVerticalGroup(
			gl_pSearchUser.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pSearchUser.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pSearchUser.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnSearch, 0, 0, Short.MAX_VALUE)
						.addComponent(textNameUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pUserView, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
		);
		pUserView.setLayout(new BorderLayout(0, 0));
		
		pUserView.add(listUsers, BorderLayout.CENTER);
		pSearchUser.setLayout(gl_pSearchUser);
		request.setLayout(gl_request);
		
		Application.addTab("Perfil", null, profile, null);
		
		lblName = new JLabel("Nome:");
		
		textMyName.setColumns(10);
		
		lblDescription = new JLabel("Descri\u00E7\u00E3o:");
		
		btnDelete = new JButton("Remover");
		
		JButton btnUpdate = new JButton("Alterar");
		GroupLayout gl_profile = new GroupLayout(profile);
		gl_profile.setHorizontalGroup(
			gl_profile.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_profile.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_profile.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textMyName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(lblName, Alignment.LEADING)
						.addComponent(lblDescription, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addComponent(textDescription, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 546, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_profile.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_profile.setVerticalGroup(
			gl_profile.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_profile.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_profile.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_profile.createSequentialGroup()
							.addComponent(btnUpdate)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDelete))
						.addGroup(gl_profile.createSequentialGroup()
							.addComponent(lblName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textMyName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblDescription)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textDescription, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
					.addContainerGap())
		);
		profile.setLayout(gl_profile);
	}
	
	class sendMessage implements ActionListener {
		public void actionPerformed(ActionEvent aev) {
			if (textMyMessage != null && textMyMessage.getText().length() > 0) {
				LocalDate dataDeInscricao = LocalDate.now();
				String textAux = "[" + dataDeInscricao + " - você]______________________________________________\n\n";
				textAllMessage.setText(textAllMessage.getText() + textAux + textMyMessage.getText() + "\n\n");
				textMyMessage.setText("");
			}
		}	
	}
}
