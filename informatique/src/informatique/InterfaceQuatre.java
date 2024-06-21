package informatique;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InterfaceQuatre {

    private JFrame frame;
    private JTextField textFieldTypeMachine;
    private JTextField textFieldPanne;
    private JTextField textFieldIntervenant;
    private JTextField textFieldDate;
    private JTextField textFieldTime;
    private JTextField textFieldLocalisation;
    private JTextField textFieldDescription;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceQuatre window = new InterfaceQuatre();
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
    public InterfaceQuatre() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblGestionMaintenance = new JLabel("Gestion maintenance");
        lblGestionMaintenance.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblGestionMaintenance.setBounds(10, 11, 564, 22);
        frame.getContentPane().add(lblGestionMaintenance);

        JPanel panel = new JPanel();
        panel.setBounds(10, 44, 564, 306);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblTypeDeMachine = new JLabel("Type de machine");
        lblTypeDeMachine.setBounds(10, 11, 100, 14);
        panel.add(lblTypeDeMachine);

        textFieldTypeMachine = new JTextField();
        textFieldTypeMachine.setBounds(120, 8, 150, 20);
        panel.add(textFieldTypeMachine);
        textFieldTypeMachine.setColumns(10);

        JLabel lblPanne = new JLabel("Panne");
        lblPanne.setBounds(10, 42, 100, 14);
        panel.add(lblPanne);

        textFieldPanne = new JTextField();
        textFieldPanne.setColumns(10);
        textFieldPanne.setBounds(120, 39, 150, 20);
        panel.add(textFieldPanne);

        JLabel lblIntervenant = new JLabel("Intervenant");
        lblIntervenant.setBounds(10, 73, 100, 14);
        panel.add(lblIntervenant);

        textFieldIntervenant = new JTextField();
        textFieldIntervenant.setColumns(10);
        textFieldIntervenant.setBounds(120, 70, 150, 20);
        panel.add(textFieldIntervenant);

        JLabel lblClassification = new JLabel("Classification");
        lblClassification.setBounds(10, 104, 100, 14);
        panel.add(lblClassification);

        JComboBox<String> comboBoxClassification = new JComboBox<>();
        comboBoxClassification.setBounds(120, 101, 150, 22);
        comboBoxClassification.addItem("Corrective");
        comboBoxClassification.addItem("Preventive");
        panel.add(comboBoxClassification);

        JLabel lblLocalisation = new JLabel("Localisation");
        lblLocalisation.setBounds(10, 135, 100, 14);
        panel.add(lblLocalisation);

        textFieldLocalisation = new JTextField();
        textFieldLocalisation.setColumns(10);
        textFieldLocalisation.setBounds(120, 132, 150, 20);
        panel.add(textFieldLocalisation);

        JLabel lblDescription = new JLabel("Description");
        lblDescription.setBounds(10, 166, 100, 14);
        panel.add(lblDescription);

        textFieldDescription = new JTextField();
        textFieldDescription.setColumns(10);
        textFieldDescription.setBounds(120, 163, 150, 20);
        panel.add(textFieldDescription);

        JLabel lblEtat = new JLabel("Etat");
        lblEtat.setBounds(10, 197, 100, 14);
        panel.add(lblEtat);

        JComboBox<String> comboBoxEtat = new JComboBox<>();
        comboBoxEtat.setBounds(120, 194, 150, 22);
        comboBoxEtat.addItem("actif");
        comboBoxEtat.addItem("inactif");
        panel.add(comboBoxEtat);

        JLabel lblDate = new JLabel("Date:");
        lblDate.setBounds(300, 11, 50, 14);
        panel.add(lblDate);

        textFieldDate = new JTextField();
        textFieldDate.setBounds(350, 8, 100, 20);
        panel.add(textFieldDate);
        textFieldDate.setColumns(10);

        JLabel lblTime = new JLabel("Time:");
        lblTime.setBounds(300, 42, 50, 14);
        panel.add(lblTime);

        textFieldTime = new JTextField();
        textFieldTime.setColumns(10);
        textFieldTime.setBounds(350, 39, 100, 20);
        panel.add(textFieldTime);

        JButton btnRetour = new JButton("Retour");
        btnRetour.setBounds(120, 227, 89, 23);
        panel.add(btnRetour);

        JButton btnEnregistrer = new JButton("Enregistrer");
        btnEnregistrer.setBounds(219, 227, 89, 23);
        panel.add(btnEnregistrer);
    }
}
