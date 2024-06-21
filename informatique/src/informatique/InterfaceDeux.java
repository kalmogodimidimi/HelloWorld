package informatique;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;

public class InterfaceDeux {

    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceDeux window = new InterfaceDeux();
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
    public InterfaceDeux() {
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
        leftPanel.setLayout(new GridLayout(5, 1));

        JButton btnGestionClient = new JButton("Gestion clients");
        JButton btnGestionMaintenance = new JButton("Gestion maintenance");
        JButton btnGestionOperateur = new JButton("Gestion Operateur");
        JButton btnGestionTickets = new JButton("Gestion ticket");
        JButton btnReporting = new JButton("rapport");

        leftPanel.add(btnGestionClient);
        leftPanel.add(btnGestionMaintenance);
        leftPanel.add(btnGestionOperateur);
        leftPanel.add(btnGestionTickets);
        leftPanel.add(btnReporting);

        frame.getContentPane().add(leftPanel, BorderLayout.WEST);

        // Right panel with table and buttons
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);

        JLabel lblTitle = new JLabel("Liste des clients");
        lblTitle.setBounds(50, 20, 200, 25);
        rightPanel.add(lblTitle);

        JButton btnAjouter = new JButton("Ajouter");
        btnAjouter.setBounds(300, 20, 90, 25);
        rightPanel.add(btnAjouter);

        JButton btnModifier = new JButton("Modifier");
        btnModifier.setBounds(400, 20, 90, 25);
        rightPanel.add(btnModifier);

        JButton btnSupprimer = new JButton("Supprimer");
        btnSupprimer.setBounds(500, 20, 90, 25);
        rightPanel.add(btnSupprimer);

        // Table setup
        String[] columnNames = {"ID", "Nom & Prenom"};
        Object[][] data = {
            {"1", "clientA"},
            {"2", "clientB"}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 60, 600, 400);
        rightPanel.add(scrollPane);

        JButton btnRetour = new JButton("Retour");
        btnRetour.setBounds(50, 480, 100, 25);
        rightPanel.add(btnRetour);

        frame.getContentPane().add(rightPanel, BorderLayout.CENTER);
    }
}
