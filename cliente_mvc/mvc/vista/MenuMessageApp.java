package mvc.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuMessageApp extends JFrame {
	private static final long serialVersionUID = 1L;
	// Panel's
	private JPanel mainManuMessageApp;
	private JPanel pLogin = new JPanel();
	private JPanel pRegister = new JPanel();
	// JLabel's 
	private JLabel lblNameLogin;
	private JLabel lblPasswordLogin;
	private JLabel lblLogoLogin;
	private JLabel lblNameRegister;
	private JLabel lblPasswordRegister;
	private JLabel lblPasswordRegister_1;
	private JLabel lblLogoRegister;
	// JTextField's
	private JTextField textNameLogin;
	private JTextField textNameRegister;
	// JPasswordField's
	private JPasswordField passwordFieldLogin;
	private JPasswordField passwordFieldRegister;
	private JPasswordField passwordFieldRegister_1;
	// JButton's
	private JButton btnRegister;
	private JButton btnLogin;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMessageApp frame = new MenuMessageApp();
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
	public MenuMessageApp() {
		setIconImage(new ImageIcon(getClass().getResource("/utils/caixa-de-dialogo.png")).getImage());
		setBackground(Color.WHITE);
		setTitle("Mansage App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 360);
		setResizable(false);
		mainManuMessageApp = new JPanel();
		mainManuMessageApp.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainManuMessageApp);
		mainManuMessageApp.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedMenuMessageApp = new JTabbedPane(JTabbedPane.TOP);
		mainManuMessageApp.add(tabbedMenuMessageApp, BorderLayout.CENTER);
		
		pLogin.setBackground(new Color(107, 142, 35));
		tabbedMenuMessageApp.addTab("Entrar", null, pLogin, null);
		
		lblNameLogin = new JLabel("Nome:");
		lblNameLogin.setForeground(SystemColor.info);
		
		lblPasswordLogin = new JLabel("Senha:");
		lblPasswordLogin.setForeground(SystemColor.info);
		
		textNameLogin = new JTextField();
		textNameLogin.setDocument(new maxChar(25)); 
		textNameLogin.setColumns(10);
		
		btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new openApp());
		btnLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		passwordFieldLogin = new JPasswordField(8);
		PlainDocument document = (PlainDocument) passwordFieldLogin.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;

                if (string.length() <= 8) {
                    super.replace(fb, offset, length, text, attrs); //To change body of generated methods, choose Tools | Templates.
                }
            }

        });		
		
		lblLogoLogin = new JLabel("");
		lblLogoLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLogoLogin.setIcon(new ImageIcon(MenuMessageApp.class.getResource("/utils/caixa-de-dialogo.png")));
		GroupLayout gl_pLogin = new GroupLayout(pLogin);
		gl_pLogin.setHorizontalGroup(
			gl_pLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pLogin.createSequentialGroup()
					.addGap(149)
					.addGroup(gl_pLogin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pLogin.createSequentialGroup()
							.addComponent(lblNameLogin)
							.addContainerGap())
						.addGroup(gl_pLogin.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_pLogin.createSequentialGroup()
								.addComponent(lblPasswordLogin)
								.addContainerGap())
							.addGroup(gl_pLogin.createSequentialGroup()
								.addGroup(gl_pLogin.createParallelGroup(Alignment.TRAILING)
									.addComponent(textNameLogin, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
									.addGroup(gl_pLogin.createSequentialGroup()
										.addGap(73)
										.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
										.addGap(58))
									.addComponent(passwordFieldLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
								.addGap(160)))))
				.addGroup(gl_pLogin.createSequentialGroup()
					.addGap(233)
					.addComponent(lblLogoLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(232))
		);
		gl_pLogin.setVerticalGroup(
			gl_pLogin.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pLogin.createSequentialGroup()
					.addContainerGap(40, Short.MAX_VALUE)
					.addComponent(lblLogoLogin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNameLogin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textNameLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPasswordLogin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLogin)
					.addGap(53))
		);
		pLogin.setLayout(gl_pLogin);
		
		pRegister.setBackground(new Color(107, 142, 35));
		tabbedMenuMessageApp.addTab("Cadastrar", null, pRegister, null);
		
		lblNameRegister = new JLabel("Nome:");
		lblNameRegister.setForeground(new Color(255, 255, 255));
		
		lblPasswordRegister = new JLabel("Senha:");
		lblPasswordRegister.setForeground(new Color(255, 255, 255));
		
		btnRegister = new JButton("Cadastrar");
		btnRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		lblPasswordRegister_1 = new JLabel("Confirmar senha:");
		lblPasswordRegister_1.setForeground(new Color(255, 255, 255));
		
		passwordFieldRegister = new JPasswordField();
		document = (PlainDocument) passwordFieldRegister.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;

                if (string.length() <= 8) {
                    super.replace(fb, offset, length, text, attrs); //To change body of generated methods, choose Tools | Templates.
                }
            }

        });
		
		passwordFieldRegister_1 = new JPasswordField();
		document = (PlainDocument) passwordFieldRegister_1.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;

                if (string.length() <= 8) {
                    super.replace(fb, offset, length, text, attrs); //To change body of generated methods, choose Tools | Templates.
                }
            }

        });
		
		textNameRegister = new JTextField();
		textNameRegister.setDocument(new maxChar(25));
		textNameRegister.setColumns(10);
		
		lblLogoRegister = new JLabel("");
		lblLogoRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLogoRegister.setIcon(new ImageIcon(MenuMessageApp.class.getResource("/utils/caixa-de-dialogo.png")));
		GroupLayout gl_pRegister = new GroupLayout(pRegister);
		gl_pRegister.setHorizontalGroup(
			gl_pRegister.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pRegister.createSequentialGroup()
					.addGap(157)
					.addGroup(gl_pRegister.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPasswordRegister)
						.addComponent(lblNameRegister)
						.addComponent(lblPasswordRegister_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pRegister.createSequentialGroup()
							.addGap(64)
							.addComponent(btnRegister, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
							.addGap(64))
						.addComponent(passwordFieldRegister, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
						.addComponent(textNameRegister, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
						.addComponent(passwordFieldRegister_1, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
					.addGap(150))
				.addGroup(Alignment.LEADING, gl_pRegister.createSequentialGroup()
					.addGap(229)
					.addComponent(lblLogoRegister, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(236))
		);
		gl_pRegister.setVerticalGroup(
			gl_pRegister.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pRegister.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(lblLogoRegister)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNameRegister)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textNameRegister, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(lblPasswordRegister)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordFieldRegister, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPasswordRegister_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordFieldRegister_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRegister)
					.addGap(33))
		);
		pRegister.setLayout(gl_pRegister);
	}

	public class maxChar extends PlainDocument {
		private static final long serialVersionUID = 1L;
		private int maxChar;

	    public maxChar(int maxlen) {
	        super();
	        maxChar = maxlen;
	    }

	    @Override
	    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		    if (maxChar <= 0) {
		        super.insertString(offset, str, attr);
		        return;
		    }
		
		    int ilen = (getLength() + str.length());
		    if (ilen <= maxChar)
		        super.insertString(offset, str, attr);
        }
	}
	
	class openApp implements ActionListener {
		public void actionPerformed(ActionEvent aev) {
			if ((passwordFieldLogin != null && passwordFieldLogin.getPassword().length > 0 && passwordFieldLogin.getPassword().length == 8) &&
				(textNameLogin != null && textNameLogin.getText().length() > 0)) {
				new MainMessageApp().openMessageApp();
				dispose();
			}
		}	
	}
}


