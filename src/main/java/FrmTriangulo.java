
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe da Janela da Aplicação.
 *
 * @author Osmar de Oliveira Braz Junior
 * @created 14 de Abril de 2007
 */
@SuppressWarnings("serial")
public class FrmTriangulo extends JFrame {

    private JPanel contentPane;
    private JLabel JLBase;
    private JTextField jTBase;
    private JLabel jLAltura;
    private JTextField jTAltura;
    private JLabel jLArea;
    private JButton jBCalcular;
    private JButton jBLimpar;
    private JButton jBFechar;

    /**
     * Construtor para o objeto FrmTriangulo.
     */
    public FrmTriangulo() {
        inicializar();
    }

    /**
     * Inicializa a janela e seus componentes. 
     */
    private void inicializar() {
        contentPane = (JPanel) this.getContentPane();
        JLBase = new JLabel();
        jTBase = new JTextField();
        jLAltura = new JLabel();
        jTAltura = new JTextField();
        jLArea = new JLabel();
        jBCalcular = new JButton();
        jBLimpar = new JButton();
        jBFechar = new JButton();

        contentPane.setLayout(null);
        this.setSize(new Dimension(209, 180));
        this.setTitle("Calculo Area Triangulo");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        JLBase.setBounds(new Rectangle(11, 11, 41, 17));
        JLBase.setText("Base");
        jTBase.setBounds(new Rectangle(11, 28, 63, 21));

        jLAltura.setBounds(new Rectangle(11, 60, 41, 17));
        jLAltura.setText("Altura");
        jTAltura.setBounds(new Rectangle(11, 75, 63, 21));

        jLArea.setBounds(new Rectangle(10, 104, 94, 17));
        jLArea.setText("Area :");

        jBCalcular.setBounds(new Rectangle(111, 9, 90, 27));
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBCalcular_actionPerformed(e);
            }
        });

        jBLimpar.setBounds(new Rectangle(111, 39, 90, 27));
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBLimpar_actionPerformed(e);
            }
        });

        jBFechar.setBounds(new Rectangle(111, 69, 90, 27));
        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBFechar_actionPerformed(e);
            }
        });

        contentPane.add(jTBase, null);
        contentPane.add(JLBase, null);
        contentPane.add(jTAltura, null);
        contentPane.add(jLAltura, null);
        contentPane.add(jLArea, null);
        contentPane.add(jBCalcular, null);
        contentPane.add(jBLimpar, null);
        contentPane.add(jBFechar, null);

    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBCalcular_actionPerformed(ActionEvent e) {
        EntTriangulo triangulo = new EntTriangulo();
        triangulo.setBase(Double.parseDouble(jTBase.getText()));
        triangulo.setAltura(Double.parseDouble(jTAltura.getText()));
        double area = triangulo.getArea();
        jLArea.setText("Area :" + area);
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBLimpar_actionPerformed(ActionEvent e) {
        jTBase.setText("");
        jTAltura.setText("");
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBFechar_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }

}
