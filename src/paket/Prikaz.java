/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Prikaz.java
 *
 * Created on May 1, 2010, 4:00:53 PM
 */

package paket;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author stevan
 */
public class Prikaz extends javax.swing.JFrame {

    /** Creates new form Prikaz */
    public Prikaz() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cFunkcija = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPoruka = new javax.swing.JTextArea();
        dAutor = new javax.swing.JButton();
        dKodiraj = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tKodiranaPoruka = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hash kodiranje");

        jLabel1.setText("Hash funkcija:");

        cFunkcija.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MD5", "SHA1" }));

        jLabel2.setText("Poruka:");

        tPoruka.setColumns(20);
        tPoruka.setRows(5);
        jScrollPane1.setViewportView(tPoruka);

        dAutor.setText("O autoru");
        dAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAutorActionPerformed(evt);
            }
        });

        dKodiraj.setText("Kodiraj");
        dKodiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dKodirajActionPerformed(evt);
            }
        });

        jLabel3.setText("Kodirana poruka:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cFunkcija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(dKodiraj)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(152, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tKodiranaPoruka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dAutor, dKodiraj});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cFunkcija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tKodiranaPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dAutor)
                    .addComponent(dKodiraj))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dAutor, dKodiraj});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dKodirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dKodirajActionPerformed
        try
        {
            Hash hs = new Hash();
            
            if (cFunkcija.getSelectedItem().equals("MD5"))
            {
                if(!this.tKodiranaPoruka.getText().isEmpty())
                    this.tKodiranaPoruka.setText("");
                this.tKodiranaPoruka.setText(hs.md5(this.tPoruka.getText()));
            }
            else if (cFunkcija.getSelectedItem().equals("SHA1"))
            {
                if(!this.tKodiranaPoruka.getText().isEmpty())
                    this.tKodiranaPoruka.setText("");
                this.tKodiranaPoruka.setText(hs.sha1(this.tPoruka.getText()));
            }
        }
        catch (Exception ex)
        {
            Logger.getLogger(Prikaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dKodirajActionPerformed

    private void dAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAutorActionPerformed
        JOptionPane.showMessageDialog(this, "Stevan Cvetković\ncvetkovic.stevan@gmail.com", "O autoru", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_dAutorActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prikaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cFunkcija;
    private javax.swing.JButton dAutor;
    private javax.swing.JButton dKodiraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tKodiranaPoruka;
    private javax.swing.JTextArea tPoruka;
    // End of variables declaration//GEN-END:variables

}