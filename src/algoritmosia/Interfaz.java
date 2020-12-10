package algoritmosia;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ricardo
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    private final BusquedaAvara busquedaAvara = new BusquedaAvara();

    private String colonia1 = "";

    private int getPosString(String[] colonias) {
        int pos = 0;
        for (int k = 0; k < colonias.length; k += 1) {
            if (colonias[k].equals(colonia1)) {
                pos = k;
                break;
            }
        }
        return pos;
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        String[] colonias = busquedaAvara.getColoniasNombres();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JComboBox<String> comboDestino = new JComboBox<String>();
        JComboBox<String> comboPartida = new JComboBox<String>();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTextArea rutaCostoTextArea = new JTextArea();
        JLabel jLabel5 = new JLabel();
        JButton calcularBtn = new JButton();
        calcularBtn.addActionListener(x -> {
            busquedaAvara.distanciaCumulada = 0.0f;
            rutaCostoTextArea.setText("");
            rutaCostoTextArea.setText(colonia1 + "->" + busquedaAvara.calcularDistancia(getPosString(colonias), 2) + " "
                    + "\nDistancia = " + busquedaAvara.getDistanciaCumulada(getPosString(colonias)) + "Km"); });
        JLabel jLabel6 = new JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 198, 222));
        jPanel1.setBackground(new java.awt.Color(2, 198, 222));
        jPanel1.setForeground(new java.awt.Color(2, 198, 222));
        jLabel3.setFont(new java.awt.Font("URW Gothic L", Font.BOLD | Font.ITALIC, 18)); // NOI18N
        jLabel3.setText("RUTAS MÁS CORTAS EL LA CIUDAD DE MÉRIDA");
        jLabel3.setName(""); // NOI18N
        jLabel4.setText("Seleccione punto de partida y destino:");
        comboDestino.addItem("Centro");
        comboDestino.setEnabled(false);
        comboPartida.setModel(new DefaultComboBoxModel(colonias));
        comboPartida.addItemListener(e -> colonia1 = e.getItem().toString());
        jLabel2.setText("A");
        jLabel1.setText("De");
        rutaCostoTextArea.setColumns(20);
        rutaCostoTextArea.setRows(5);
        jScrollPane1.setViewportView(rutaCostoTextArea);
        jLabel5.setText("Ruta y costo:");
        calcularBtn.setText("Calcular");
        jLabel6.setIcon(Imagen.getImage()); // NOI18N
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(19, 19, 19).addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18).addComponent(calcularBtn)))).addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup().addGap(60, 60, 60)
                        .addComponent(jLabel6)).addGroup(jPanel1Layout.createSequentialGroup().addGap(104, 104, 104).addComponent(jLabel3)))
                .addContainerGap(80, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2).addComponent(calcularBtn)).addGap(3, 3, 3).addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Interfaz().setVisible(true));
    }

}
