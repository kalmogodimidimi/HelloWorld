package informatique;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class InterfaceMaintenance {

    private JFrame frame;
    private JTextField typeMachineField;
    private JTextField panneField;
    private JTextField intervenantField;
    private JTextField localisationField;
    private JTextField descriptionField;
    private JTextField dateField;
    private JTextField timeField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceMaintenance window = new InterfaceMaintenance();
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
    public InterfaceMaintenance() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        // Left panel with buttons
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(6, 1));

        JButton btnGestionClients = new JButton("Gestion clients");
        JButton btnGestionMaintenance = new JButton("Gestion maintenance");
        JButton btnGestionOperateur = new JButton("Gestion Operateur");
        JButton btnGestionTickets = new JButton("Gestion ticket");
        JButton btnReporting = new JButton("Reporting");

        leftPanel.add(btnGestionClients);
        leftPanel.add(btnGestionMaintenance);
        leftPanel.add(btnGestionOperateur);
        leftPanel.add(btnGestionTickets);
        leftPanel.add(btnReporting);

        frame.getContentPane().add(leftPanel, BorderLayout.WEST);

        // Right panel with form fields
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);

        JLabel lblTitle = new JLabel("demande de maintenance");
        lblTitle.setBounds(50, 20, 200, 25);
        rightPanel.add(lblTitle);

        JLabel lblTypeMachine = new JLabel("Type de machine:");
        lblTypeMachine.setBounds(50, 60, 150, 25);
        rightPanel.add(lblTypeMachine);

        typeMachineField = new JTextField();
        typeMachineField.setBounds(200, 60, 200, 25);
        rightPanel.add(typeMachineField);

        JLabel lblPanne = new JLabel("Panne:");
        lblPanne.setBounds(50, 100, 150, 25);
        rightPanel.add(lblPanne);

        panneField = new JTextField();
        panneField.setBounds(200, 100, 200, 25);
        rightPanel.add(panneField);

        JLabel lblIntervenant = new JLabel("Intervenant:");
        lblIntervenant.setBounds(50, 140, 150, 25);
        rightPanel.add(lblIntervenant);

        intervenantField = new JTextField();
        intervenantField.setBounds(200, 140, 200, 25);
        rightPanel.add(intervenantField);

        JLabel lblClassification = new JLabel("Classification:");
        lblClassification.setBounds(50, 180, 150, 25);
        rightPanel.add(lblClassification);

        String[] classifications = {"Corrective", "Preventive"};
        JComboBox<String> classificationBox = new JComboBox<>(classifications);
        classificationBox.setBounds(200, 180, 200, 25);
        rightPanel.add(classificationBox);

        JLabel lblLocalisation = new JLabel("Localisation:");
        lblLocalisation.setBounds(50, 220, 150, 25);
        rightPanel.add(lblLocalisation);

        localisationField = new JTextField();
        localisationField.setBounds(200, 220, 200, 25);
        rightPanel.add(localisationField);

        JLabel lblDescription = new JLabel("Description:");
        lblDescription.setBounds(50, 260, 150, 25);
        rightPanel.add(lblDescription);

        descriptionField = new JTextField();
        descriptionField.setBounds(200, 260, 200, 25);
        rightPanel.add(descriptionField);

        JLabel lblEtat = new JLabel("Etat:");
        lblEtat.setBounds(50, 300, 150, 25);
        rightPanel.add(lblEtat);

        String[] etats = {"actif", "inactif"};
        JComboBox<String> etatBox = new JComboBox<>(etats);
        etatBox.setBounds(200, 300, 200, 25);
        rightPanel.add(etatBox);

        JLabel lblDate = new JLabel("Date:");
        lblDate.setBounds(450, 60, 50, 25);
        rightPanel.add(lblDate);

        dateField = new JTextField();
        dateField.setBounds(500, 60, 100, 25);
        rightPanel.add(dateField);

        JLabel lblTime = new JLabel("Time:");
        lblTime.setBounds(450, 100, 50, 25);
        rightPanel.add(lblTime);

        timeField = new JTextField();
        timeField.setBounds(500, 100, 100, 25);
        rightPanel.add(timeField);

        JButton btnEnregistrer = new JButton("Enregistrer");
        btnEnregistrer.setBounds(500, 300, 100, 25);
        rightPanel.add(btnEnregistrer);

        JButton btnRetour = new JButton("Retour");
        btnRetour.setBounds(50, 340, 100, 25);
        rightPanel.add(btnRetour);

        frame.getContentPane().add(rightPanel, BorderLayout.CENTER);
    }
}
