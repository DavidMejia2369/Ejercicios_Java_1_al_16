
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
/**
 *
 * @author Angela
 */
public class FrmG08 extends javax.swing.JFrame {

    /**
     * Creates new form FrmG08
     */
    public FrmG08() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1308322.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EJERCICIO 08 JAVA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 380, 50);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VERIFICAR FECHA ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 40, 250, 50);

        txtNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero1KeyPressTxtNumber1(evt);
            }
        });
        getContentPane().add(txtNumero1);
        txtNumero1.setBounds(40, 110, 420, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESAR FECHA EN FORMATO AAAAMMDD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 80, 426, 26);

        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 0, 0));
        lblResultado.setText("0");
        lblResultado.setOpaque(true);
        getContentPane().add(lblResultado);
        lblResultado.setBounds(40, 160, 420, 30);

        btnCalcular.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(180, 220, 130, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9d73d089a72a0f2dc893c2f63561d779.gif"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -80, 520, 430);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    public boolean isNumber(String numero) {
        try {
            int Number = Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(this,
                    "El texto " + numero + " no es un numero valido",
                    "Numero Invalido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void calcularFecha() {
        if (isNumber(txtNumero1.getText())) {

            String fecha = String.valueOf(txtNumero1.getText());
            if (fecha.length() != 8) {
                JOptionPane.showMessageDialog(this, "La fecha debe tener 8 dígitos.");
                return;
            }
            int año = 0;
            int mes = 0;
            int dia = 0;
            
            año = Integer.parseInt(fecha.substring(0, 4));
            mes = Integer.parseInt(fecha.substring(4, 6));
            dia = Integer.parseInt(fecha.substring(6, 8));
            if (año > 0 && mes > 0 && dia > 0) {
                 
            if (año < 1000 || año > 2023) {
                JOptionPane.showMessageDialog(this, "El año esta fuera de rango.");
                return;
            }
            if (mes < 1 || mes > 12) {
                JOptionPane.showMessageDialog(this, "El mes debe ser un número entre 1 y 12.");
                return;
            }
            if (dia < 1 || dia > 31) {
                JOptionPane.showMessageDialog(this, "El día debe ser un número entre 1 y 31.");
                return;
            }
            if (mes == 2) {
       
                    if (dia > 28) {
                        JOptionPane.showMessageDialog(this, "Febrero solo tiene 28 días en años bisiestos.");
                        return;
                    }     
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 30) {
                    JOptionPane.showMessageDialog(this, "Son meses de 30 dias solamente");
                }
            }
            lblResultado.setText("Día: " + " " + dia + "  " + "Mes: " + mes + "   " + "Año:" + " " + año);

            lblResultado.setVisible(true);   
            }
            else {
                JOptionPane.showMessageDialog(this,"la fecha esta fuera del rango");
            }
            
        } 
            
    }
    private void txtNumero1KeyPressTxtNumber1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyPressTxtNumber1
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcularFecha();
        }
    }//GEN-LAST:event_txtNumero1KeyPressTxtNumber1

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        calcularFecha();
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(FrmG08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmG08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmG08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmG08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmG08().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField txtNumero1;
    // End of variables declaration//GEN-END:variables

}
