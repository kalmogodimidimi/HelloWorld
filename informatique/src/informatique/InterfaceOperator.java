package informatique;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;

public class InterfaceOperator {

    private JFrame frame;
    private JTextField textFieldIDOperateur;
    private JTextField textFieldNom;
    private JTextField textFieldPrenom;
    private JTextField textFieldDateDebutService;
    private JTextField textFieldDateFinService;
    private JTextField textFieldSpecialite;
    private JTextField textFieldTel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceOperator window = new InterfaceOperator();
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
    public InterfaceOperator() {
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

        JLabel lblGestionOperateur = new JLabel("Gestion opérateur");
        lblGestionOperateur.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblGestionOperateur.setBounds(10, 11, 564, 22);
        frame.getContentPane().add(lblGestionOperateur);

        JPanel panel = new JPanel();
        panel.setBounds(10, 44, 564, 306);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblIDOperateur = new JLabel("ID-opérateur");
        lblIDOperateur.setBounds(10, 11, 100, 14);
        panel.add(lblIDOperateur);

        textFieldIDOperateur = new JTextField();
        textFieldIDOperateur.setBounds(120, 8, 150, 20);
        panel.add(textFieldIDOperateur);
        textFieldIDOperateur.setColumns(10);

        JLabel lblNom = new JLabel("Nom:");
        lblNom.setBounds(10, 42, 100, 14);
        panel.add(lblNom);

        textFieldNom = new JTextField();
        textFieldNom.setColumns(10);
        textFieldNom.setBounds(120, 39, 150, 20);
        panel.add(textFieldNom);

        JLabel lblPrenom = new JLabel("Prenom:");
        lblPrenom.setBounds(10, 73, 100, 14);
        panel.add(lblPrenom);

        textFieldPrenom = new JTextField();
        textFieldPrenom.setColumns(10);
        textFieldPrenom.setBounds(120, 70, 150, 20);
        panel.add(textFieldPrenom);

        JLabel lblDateDebutService = new JLabel("Date debut service:");
        lblDateDebutService.setBounds(10, 104, 100, 14);
        panel.add(lblDateDebutService);

        textFieldDateDebutService = new JTextField();
        textFieldDateDebutService.setColumns(10);
        textFieldDateDebutService.setBounds(120, 101, 150, 20);
        panel.add(textFieldDateDebutService);

        JLabel lblDateFinService = new JLabel("Date fin de service:");
        lblDateFinService.setBounds(10, 135, 100, 14);
        panel.add(lblDateFinService);

        textFieldDateFinService = new JTextField();
        textFieldDateFinService.setColumns(10);
        textFieldDateFinService.setBounds(120, 132, 150, 20);
        panel.add(textFieldDateFinService);

        JLabel lblSpecialite = new JLabel("Specialité:");
        lblSpecialite.setBounds(10, 166, 100, 14);
        panel.add(lblSpecialite);

        textFieldSpecialite = new JTextField();
        textFieldSpecialite.setColumns(10);
        textFieldSpecialite.setBounds(120, 163, 150, 20);
        panel.add(textFieldSpecialite);

        JLabel lblTel = new JLabel("Tel:");
        lblTel.setBounds(10, 197, 100, 14);
        panel.add(lblTel);

        textFieldTel = new JTextField();
        textFieldTel.setColumns(10);
        textFieldTel.setBounds(120, 194, 150, 20);
        panel.add(textFieldTel);

        JButton btnRetour = new JButton("Retour");
        btnRetour.setBounds(120, 227, 89, 23);
        panel.add(btnRetour);

        JButton btnEnregistrer = new JButton("Enregistrer");
        btnEnregistrer.setBounds(219, 227, 89, 23);
        panel.add(btnEnregistrer);
    }
}