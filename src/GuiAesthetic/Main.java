/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GuiAesthetic;

/**
 *
 * @author Daniel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CRUDFrame = new javax.swing.JFrame();
        PanelCrud = new javax.swing.JPanel();
        CrearLaptop = new javax.swing.JTabbedPane();
        CrearTp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ip = new javax.swing.JTextField();
        mascara = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        host = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pantalla = new javax.swing.JTextField();
        targetagrafica = new javax.swing.JCheckBox();
        CreandoLaptop = new javax.swing.JButton();
        ListarTP = new javax.swing.JPanel();
        EliminarTP = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MenuPanelPrincipal = new javax.swing.JPanel();
        MenuTextito = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CRUD = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        PanelCrud.setBackground(new java.awt.Color(0, 37, 125));
        PanelCrud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CrearLaptop.setBackground(new java.awt.Color(0, 0, 102));

        CrearTp.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Ingrese la mascara");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Ingrese la IP");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ingrese el host");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ingrese la marca");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Ingrese la def. pantalla");

        targetagrafica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        targetagrafica.setText("Targeta Grafica");
        targetagrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetagraficaActionPerformed(evt);
            }
        });

        CreandoLaptop.setText("Crear");
        CreandoLaptop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreandoLaptopMouseClicked(evt);
            }
        });
        CreandoLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreandoLaptopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearTpLayout = new javax.swing.GroupLayout(CrearTp);
        CrearTp.setLayout(CrearTpLayout);
        CrearTpLayout.setHorizontalGroup(
            CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearTpLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mascara, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ip, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetagrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreandoLaptop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        CrearTpLayout.setVerticalGroup(
            CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearTpLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mascara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetagrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrearTpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CrearTpLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CreandoLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        CrearLaptop.addTab("Crear Laptop", CrearTp);

        ListarTP.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout ListarTPLayout = new javax.swing.GroupLayout(ListarTP);
        ListarTP.setLayout(ListarTPLayout);
        ListarTPLayout.setHorizontalGroup(
            ListarTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        ListarTPLayout.setVerticalGroup(
            ListarTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        CrearLaptop.addTab("Listar", ListarTP);

        EliminarTP.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout EliminarTPLayout = new javax.swing.GroupLayout(EliminarTP);
        EliminarTP.setLayout(EliminarTPLayout);
        EliminarTPLayout.setHorizontalGroup(
            EliminarTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        EliminarTPLayout.setVerticalGroup(
            EliminarTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        CrearLaptop.addTab("Eliminar", EliminarTP);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        CrearLaptop.addTab("Crear  PC Escritorio", jPanel1);

        PanelCrud.add(CrearLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 460, 380));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("CRUD");
        PanelCrud.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        javax.swing.GroupLayout CRUDFrameLayout = new javax.swing.GroupLayout(CRUDFrame.getContentPane());
        CRUDFrame.getContentPane().setLayout(CRUDFrameLayout);
        CRUDFrameLayout.setHorizontalGroup(
            CRUDFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCrud, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        CRUDFrameLayout.setVerticalGroup(
            CRUDFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCrud, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuPanelPrincipal.setBackground(new java.awt.Color(40, 131, 137));
        MenuPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuTextito.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        MenuTextito.setForeground(new java.awt.Color(255, 255, 255));
        MenuTextito.setText("Menu");
        MenuPanelPrincipal.add(MenuTextito, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 28, -1, 40));

        jButton1.setBackground(new java.awt.Color(0, 91, 73));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("Ingresar");
        MenuPanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 154, 53));

        CRUD.setBackground(new java.awt.Color(0, 91, 73));
        CRUD.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CRUD.setText("CRUD");
        CRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CRUDMouseClicked(evt);
            }
        });
        CRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRUDActionPerformed(evt);
            }
        });
        MenuPanelPrincipal.add(CRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 154, 53));

        jSeparator1.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 87, 89));
        MenuPanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 310, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRUDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRUDActionPerformed

    private void CRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRUDMouseClicked
        //BOTON DEL CRUD
        CRUDFrame.setVisible(true);
        CRUDFrame.pack();
    }//GEN-LAST:event_CRUDMouseClicked

    private void targetagraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetagraficaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetagraficaActionPerformed

    private void CreandoLaptopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreandoLaptopMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreandoLaptopMouseClicked

    private void CreandoLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreandoLaptopActionPerformed
        
    }//GEN-LAST:event_CreandoLaptopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CRUD;
    private javax.swing.JFrame CRUDFrame;
    private javax.swing.JButton CreandoLaptop;
    private javax.swing.JTabbedPane CrearLaptop;
    private javax.swing.JPanel CrearTp;
    private javax.swing.JPanel EliminarTP;
    private javax.swing.JTextField Ip;
    private javax.swing.JPanel ListarTP;
    private javax.swing.JPanel MenuPanelPrincipal;
    private javax.swing.JLabel MenuTextito;
    private javax.swing.JPanel PanelCrud;
    private javax.swing.JTextField host;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField mascara;
    private javax.swing.JTextField pantalla;
    private javax.swing.JCheckBox targetagrafica;
    // End of variables declaration//GEN-END:variables
}
