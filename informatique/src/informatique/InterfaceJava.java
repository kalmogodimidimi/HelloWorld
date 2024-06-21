package informatique;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class InterfaceJava {

    private JFrame frame;
    private JTextField societeField;
    private JTextField ifuField;
    private JTextField rccmField;
    private JTextField addressField;
    private JTextField apeCodeField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceJava window = new InterfaceJava();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public InterfaceJava() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        // Left panel with buttons
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 1));

        JButton btnGestionClient = new JButton("Gestion client");
        JButton btnGestionMaintenance = new JButton("Gestion maintenance");
        JButton btnGestionOperateur = new JButton("Gestion opérateur");
        JButton btnGestionTickets = new JButton("Gestion tickets");
        JButton btnReporting = new JButton("Reporting");

        leftPanel.add(btnGestionClient);
        leftPanel.add(btnGestionMaintenance);
        leftPanel.add(btnGestionOperateur);
        leftPanel.add(btnGestionTickets);
        leftPanel.add(btnReporting);

        frame.getContentPane().add(leftPanel, BorderLayout.WEST);

        // Right panel with form
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);

        JLabel lblSociete = new JLabel("Société");
        lblSociete.setBounds(50, 50, 100, 25);
        rightPanel.add(lblSociete);

        societeField = new JTextField();
        societeField.setBounds(160, 50, 200, 25);
        rightPanel.add(societeField);

        JLabel lblIFU = new JLabel("IFU");
        lblIFU.setBounds(50, 90, 100, 25);
        rightPanel.add(lblIFU);

        ifuField = new JTextField();
        ifuField.setBounds(160, 90, 200, 25);
        rightPanel.add(ifuField);

        JLabel lblRCCM = new JLabel("RCCM");
        lblRCCM.setBounds(50, 130, 100, 25);
        rightPanel.add(lblRCCM);

        rccmField = new JTextField();
        rccmField.setBounds(160, 130, 200, 25);
        rightPanel.add(rccmField);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(50, 170, 100, 25);
        rightPanel.add(lblAddress);

        addressField = new JTextField();
        addressField.setBounds(160, 170, 200, 25);
        rightPanel.add(addressField);

        JLabel lblApeCode = new JLabel("APE Code");
        lblApeCode.setBounds(50, 210, 100, 25);
        rightPanel.add(lblApeCode);

        apeCodeField = new JTextField();
        apeCodeField.setBounds(160, 210, 200, 25);
        rightPanel.add(apeCodeField);

        JButton btnEnregistrer = new JButton("Enregistrer");
        btnEnregistrer.setBounds(160, 250, 100, 25);
        rightPanel.add(btnEnregistrer);

        JButton btnRetour = new JButton("Retour");
        btnRetour.setBounds(270, 250, 100, 25);
        rightPanel.add(btnRetour);

        frame.getContentPane().add(rightPanel, BorderLayout.CENTER);
    }
}
