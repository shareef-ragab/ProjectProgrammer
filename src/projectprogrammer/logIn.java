package projectprogrammer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class logIn extends javax.swing.JFrame {

    public logIn() {
        initComponents();
    }
    private static logIn form;
    int x = 0;
    private String passwored(char[] password) {
        //<editor-fold defaultstate="collapsed" desc="statment">
        String p1 = "";
        char[] pass = password;
        p1 = Arrays.toString(pass).replace("[", "").trim().replace("]", "").trim().replace(",", "").replace(" ", "").trim();
        return p1;
//</editor-fold>
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        thUser = new javax.swing.JTextField();
        laUser = new javax.swing.JLabel();
        laPssword = new javax.swing.JLabel();
        botLogin = new javax.swing.JButton();
        thPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        thUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laUser.setText("المستخدم");

        laPssword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laPssword.setText("كلمة المرور");

        botLogin.setText("دخول");
        botLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLoginActionPerformed(evt);
            }
        });

        thPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thUser)
                            .addComponent(thPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(laUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laPssword, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laPssword)
                    .addComponent(thPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLoginActionPerformed
        String username = "shareef";
        String password = "shareef";
       
        
        Scanner pass=new Scanner(passwored(thPassword.getPassword()));
        Scanner user=new Scanner(passwored(thPassword.getPassword()));
        
        do {
             String enPassword = pass.next();
        String enUserName = user.next();
            if (password.equals(enPassword) && username.equals(enUserName)) {
                JOptionPane.showMessageDialog(null, "hi hallo", "massege", JOptionPane.INFORMATION_MESSAGE);
                AccountFrame.main(null);
                form.setVisible(false);
                break;
            } else{
                x++;
                switch (x) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "the password error or user name try agen", "massege", JOptionPane.ERROR_MESSAGE);
                        thPassword.setText(null);
                        thUser.setText(null);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "the password error or user name try agen this try 2", "massege", JOptionPane.ERROR_MESSAGE);
                        thPassword.setText(null);
                        thUser.setText(null);
                        break ;
                    default:
                        JOptionPane.showMessageDialog(null, "the password error or user name try agen this try 3", "massege", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                        break;
                }
            }
        } while (x < 3&&pass.hasNext());

    }//GEN-LAST:event_botLoginActionPerformed

    public static void main(String args[]) {
        form = new logIn();
        form.setVisible(true);
    }
    //<editor-fold defaultstate="collapsed" desc="varible">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botLogin;
    private javax.swing.JLabel laPssword;
    private javax.swing.JLabel laUser;
    private javax.swing.JPasswordField thPassword;
    private javax.swing.JTextField thUser;
    // End of variables declaration//GEN-END:variables

//</editor-fold>
}
