/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.sql.*;

import static devoir.de.recherche.d.java.avance.DbInstance.getConnection;
import static devoir.de.recherche.d.java.avance.DbInstance.releaseConnection;

/**
 *
 * @author Méda BOUKA
 */
public class Connexion extends javax.swing.JFrame {

    /**
     * Creates new form Connexion
     */
    public Connexion() {
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
        getConnection();
        creerLesTables();
        insererUtilisateursParDefaut();

        jPanel1 = new javax.swing.JPanel();
        txtIdentifiant = new javax.swing.JTextField();
        VOTREID = new javax.swing.JLabel();
        txtMotDePass = new javax.swing.JPasswordField();
        MOTDEPASE = new javax.swing.JLabel();
        btnConnecter = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 0, 51));

        txtIdentifiant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentifiantActionPerformed(evt);
            }
        });

        VOTREID.setText("VOTRE IDENTIFIANT");

        txtMotDePass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMotDePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotDePassActionPerformed(evt);
            }
        });

        MOTDEPASE.setText("MOT DE PASSE");

        btnConnecter.setText("SE CONNECTER");
        btnConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnecterActionPerformed(evt);
            }
        });

        btnAnnuler.setText("ANNULER");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        btnQuitter.setText("QUITTER");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ESPACE DE CONNEXION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MOTDEPASE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnConnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VOTREID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMotDePass, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(VOTREID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MOTDEPASE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMotDePass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMotDePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotDePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotDePassActionPerformed

    private void txtIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentifiantActionPerformed

    private void creerLesTables() {
        String enseignants = "CREATE TABLE IF NOT EXISTS enseignants("
                + "Id INTEGER AUTO_INCREMENT, "
                + "nom VARCHAR(255), "
                + "prenom VARCHAR(255), "
                + "date_de_naissance DATE, "
                + "lieu_de_naissance VARCHAR(255), "
                + "sexe VARCHAR(255), "
                + "nationalite VARCHAR(255), "
                + "situation_matrimoniale VARCHAR(255), "
                + "adresse VARCHAR(255), "
                + "quartier VARCHAR(255), "
                + "email VARCHAR(255), "
                + "telephone VARCHAR(255), "
                + "statut VARCHAR(255), "
                + "arrive VARCHAR(255), "
                + "provenance VARCHAR(255), "
                + "cni VARCHAR(255), "
                + "enfants INTEGER, "
                + "PRIMARY KEY(Id))";

        String utilisateurs = "CREATE TABLE IF NOT EXISTS utilisateurs ("
                + "Id INTEGER UNIQUE , "
                + "identifiant VARCHAR(255) , "
                + "mot_de_pass VARCHAR(255));";

        String insert = "INSERT INTO enseignants (nom, prenom, date_de_naissance, lieu_de_naissance, sexe, nationalite) VALUES ();";

        try {
            Statement statement = getConnection().createStatement();
            statement.execute(enseignants);
            statement.execute(utilisateurs);
            System.out.println("Tables créées");
        }
        catch (SQLException e ) {
            System.out.println("Erreur de creation de tables.");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Erreur de creation de tables 1.");
        }
    }

    private void insererUtilisateursParDefaut() {
        String utilisateurs = "INSERT INTO utilisateurs (Id, identifiant, mot_de_pass) "
                + "VALUES (1, 'prince', 'prince')";
        try {
            Statement statement = getConnection().createStatement();
            statement.executeUpdate(utilisateurs);
            System.out.println("Utilisateur insere.");
        }
        catch (SQLException e ) {
            System.out.println("Erreur insertion utilisateur. " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erreur insertion utilisateur.");
        }
    }

    private void login(){
        try{
            PreparedStatement statement = getConnection().prepareStatement("" +
                    "SELECT * FROM utilisateurs where identifiant =? AND mot_de_pass=?");
            statement.setString(1, txtIdentifiant.getText());
            statement.setString(2, txtMotDePass.getText());

            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next() ) {
                JOptionPane.showMessageDialog(null, "Utilisateur non trouvé:");
            } else {
                statement.close();
//                releaseConnection();
                this.setVisible(false);
                this.dispose();
                new GestionTableauDeBord().setVisible(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnecterActionPerformed
        login();
    }//GEN-LAST:event_btnConnecterActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnQuitterActionPerformed

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MOTDEPASE;
    private javax.swing.JLabel VOTREID;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnConnecter;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIdentifiant;
    private javax.swing.JPasswordField txtMotDePass;
    // End of variables declaration//GEN-END:variables
}
