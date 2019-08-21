package projectprogrammer;

import javax.swing.JOptionPane;

public class AccountFrame extends javax.swing.JFrame {

    

    public AccountFrame() {
        initComponents();
    }

    
    private static AccountFrame form;
    private static InfoAccountUser[] user;
    private static int numUser;

    public void clear(){
        thAddrissing.setText(null);
        thDataBirth.setDate(null);
        thFatherName.setText(null);
        thFirstName.setText(null);
        thID.setText(null);
        thIDdeposit.setText(null);
        thIDwithdrew.setText(null);
        thLastName.setText(null);
        thPhone.setText(null);
        thTo.setText(null);
        thTransfar.setText(null);
        thdeposit.setText(null);
        thfrom.setText(null);
        thnumberBoy.setText(null);
        thwithdrew.setText(null);
        coAmountTypedeposit.setSelectedIndex(0);
        coAmountTypewithdrew.setSelectedIndex(0);
        coCommnunty.setSelectedIndex(0);
    }
    
    /**
     * @return the form
     */
    public static AccountFrame getForm() {
        return form;
    }

    /**
     * @return the user
     */
    public static InfoAccountUser[] getUser() {
        return user;
    }
    /**
     * @return the numUser
     */
    public static int getNumUser() {
        return numUser;
    }

    /**
     * @param aNumUser the numUser to set
     */
    public static void setNumUser(int aNumUser) {
        numUser = aNumUser;
    }

    /**
     * @param aUser the user to set
     */
    public static void setUser(InfoAccountUser[] aUser) {
        user = aUser;
    }

    /**
     * @param aForm the form to set
     */
    public static void setForm(AccountFrame aForm) {
        form = aForm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paInfoUser = new javax.swing.JPanel();
        laFirstName = new javax.swing.JLabel();
        thFirstName = new javax.swing.JTextField();
        laFatherName = new javax.swing.JLabel();
        thFatherName = new javax.swing.JTextField();
        laFamilyname = new javax.swing.JLabel();
        thLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        thAddrissing = new javax.swing.JTextArea();
        laAddressing = new javax.swing.JLabel();
        laPhone = new javax.swing.JLabel();
        thPhone = new javax.swing.JTextField();
        thnumberBoy = new javax.swing.JTextField();
        laNumBoy = new javax.swing.JLabel();
        laID = new javax.swing.JLabel();
        thID = new javax.swing.JTextField();
        coCommnunty = new javax.swing.JComboBox<>();
        laStateCommnunty = new javax.swing.JLabel();
        laDataBirth = new javax.swing.JLabel();
        thDataBirth = new com.toedter.calendar.JDateChooser();
        botAddUser = new javax.swing.JButton();
        botSerch = new javax.swing.JButton();
        thSerch = new javax.swing.JTextField();
        paAccount = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botTransmtion = new javax.swing.JButton();
        laIn = new javax.swing.JLabel();
        thfrom = new javax.swing.JTextField();
        laOn = new javax.swing.JLabel();
        thTo = new javax.swing.JTextField();
        laIDto = new javax.swing.JLabel();
        thTransfar = new javax.swing.JTextField();
        latransfar = new javax.swing.JLabel();
        paWithdro = new javax.swing.JPanel();
        ladeposit = new javax.swing.JLabel();
        thdeposit = new javax.swing.JTextField();
        laAmountType = new javax.swing.JLabel();
        coAmountTypedeposit = new javax.swing.JComboBox<>();
        botdeposit = new javax.swing.JButton();
        thIDdeposit = new javax.swing.JTextField();
        laID1 = new javax.swing.JLabel();
        paWithdro1 = new javax.swing.JPanel();
        lawithdrew = new javax.swing.JLabel();
        thwithdrew = new javax.swing.JTextField();
        laAmountType1 = new javax.swing.JLabel();
        coAmountTypewithdrew = new javax.swing.JComboBox<>();
        botwithdrew = new javax.swing.JButton();
        thIDwithdrew = new javax.swing.JTextField();
        laID2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paInfoUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        laFirstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laFirstName.setText("الإسم الأول");

        thFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laFatherName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laFatherName.setText("الإسم الأب");

        thFatherName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laFamilyname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laFamilyname.setText("الإسم العائلة");

        thLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        thAddrissing.setColumns(20);
        thAddrissing.setRows(5);
        jScrollPane1.setViewportView(thAddrissing);

        laAddressing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laAddressing.setText("العنوان");

        laPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laPhone.setText("رقم الهاتف");

        thPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        thnumberBoy.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laNumBoy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laNumBoy.setText("عدد الأولاد");

        laID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laID.setText("رقم العميل");

        thID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        coCommnunty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الأعزب/ة", "متزوج/ة", "مطلق/ة", "أرمل/ة" }));

        laStateCommnunty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laStateCommnunty.setText("الحالة الإجتماعية");

        laDataBirth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laDataBirth.setText("تاريخ الميلاد");

        botAddUser.setText("إضافة  حساب");
        botAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAddUserActionPerformed(evt);
            }
        });

        botSerch.setText("بحث");
        botSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSerchActionPerformed(evt);
            }
        });

        thSerch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout paInfoUserLayout = new javax.swing.GroupLayout(paInfoUser);
        paInfoUser.setLayout(paInfoUserLayout);
        paInfoUserLayout.setHorizontalGroup(
            paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paInfoUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laAddressing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addGroup(paInfoUserLayout.createSequentialGroup()
                        .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(coCommnunty, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thnumberBoy, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thFatherName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thPhone)
                            .addComponent(thID)
                            .addComponent(thDataBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laFatherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laFamilyname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laNumBoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laStateCommnunty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laDataBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(paInfoUserLayout.createSequentialGroup()
                        .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botSerch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(thSerch, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botAddUser)))
                .addContainerGap())
        );
        paInfoUserLayout.setVerticalGroup(
            paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paInfoUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laID)
                    .addComponent(thID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laFirstName)
                    .addComponent(thFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laFatherName)
                    .addComponent(thFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laFamilyname)
                    .addComponent(thLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laPhone)
                    .addComponent(thPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thnumberBoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laNumBoy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(laStateCommnunty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coCommnunty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thDataBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laDataBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laAddressing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paInfoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botAddUser)
                    .addComponent(thSerch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botSerch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botTransmtion.setText("تحويل");
        botTransmtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botTransmtionActionPerformed(evt);
            }
        });

        laIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laIn.setText("من");

        thfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laOn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laOn.setText("إلى");

        thTo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laIDto.setText("رقم العميل");

        thTransfar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        latransfar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        latransfar.setText("المبلغ المراد تحويله");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botTransmtion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(laOn, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(thTo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(thfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(laIDto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(laIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(thTransfar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(latransfar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laIn)
                    .addComponent(laOn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laIDto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thTransfar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latransfar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botTransmtion)
                .addContainerGap())
        );

        paWithdro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ladeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ladeposit.setText("المبلغ المضاف");

        thdeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laAmountType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laAmountType.setText("نوع العملة");

        coAmountTypedeposit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الدولار", "دينار", "شيكل" }));

        botdeposit.setText("الإضافة");
        botdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botdepositActionPerformed(evt);
            }
        });

        thIDdeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laID1.setText("رقم العميل");

        javax.swing.GroupLayout paWithdroLayout = new javax.swing.GroupLayout(paWithdro);
        paWithdro.setLayout(paWithdroLayout);
        paWithdroLayout.setHorizontalGroup(
            paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paWithdroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paWithdroLayout.createSequentialGroup()
                        .addGroup(paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thdeposit)
                            .addGroup(paWithdroLayout.createSequentialGroup()
                                .addComponent(coAmountTypedeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(thIDdeposit, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laAmountType, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ladeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laID1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                    .addComponent(botdeposit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paWithdroLayout.setVerticalGroup(
            paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paWithdroLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thIDdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ladeposit)
                    .addComponent(thdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paWithdroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laAmountType, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coAmountTypedeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botdeposit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paWithdro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lawithdrew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lawithdrew.setText("المبلغ المسحوب");

        thwithdrew.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laAmountType1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laAmountType1.setText("نوع العملة");

        coAmountTypewithdrew.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الدولار", "دينار", "شيكل" }));

        botwithdrew.setText("سحب");
        botwithdrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botwithdrewActionPerformed(evt);
            }
        });

        thIDwithdrew.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        laID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laID2.setText("رقم العميل");

        javax.swing.GroupLayout paWithdro1Layout = new javax.swing.GroupLayout(paWithdro1);
        paWithdro1.setLayout(paWithdro1Layout);
        paWithdro1Layout.setHorizontalGroup(
            paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paWithdro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botwithdrew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paWithdro1Layout.createSequentialGroup()
                        .addGroup(paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(thIDwithdrew, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thwithdrew, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paWithdro1Layout.createSequentialGroup()
                                .addComponent(coAmountTypewithdrew, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laAmountType1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lawithdrew, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))))
                .addContainerGap())
        );
        paWithdro1Layout.setVerticalGroup(
            paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paWithdro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thIDwithdrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laID2))
                .addGap(8, 8, 8)
                .addGroup(paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lawithdrew)
                    .addComponent(thwithdrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paWithdro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laAmountType1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coAmountTypewithdrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(botwithdrew)
                .addContainerGap())
        );

        javax.swing.GroupLayout paAccountLayout = new javax.swing.GroupLayout(paAccount);
        paAccount.setLayout(paAccountLayout);
        paAccountLayout.setHorizontalGroup(
            paAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paWithdro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paWithdro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paAccountLayout.setVerticalGroup(
            paAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paWithdro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paWithdro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paInfoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paInfoUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAddUserActionPerformed
        setNumUser(Integer.parseInt(thID.getText()));
        user[getNumUser()]=new InfoAccountUser(Integer.parseInt(thID.getText()),thFirstName.getText(),thFatherName.getText(),thLastName.getText(),thAddrissing.getText(),thPhone.getText());
        user[getNumUser()].setNumboy(Integer.parseInt(thnumberBoy.getText()));
        user[getNumUser()].setStateCommnuity(coCommnunty.getItemAt(coCommnunty.getSelectedIndex()));
        user[getNumUser()].setDatePirth(thDataBirth.getDate());
        JOptionPane.showMessageDialog(null, " the complate info user -->  "+user[getNumUser()].showData(), "رسالة",JOptionPane.INFORMATION_MESSAGE);
        clear();
    }//GEN-LAST:event_botAddUserActionPerformed
    private void botSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSerchActionPerformed
        JOptionPane.showMessageDialog(null, " th serch info user -->  "+user[Integer.parseInt(thSerch.getText())].showData(), "رسالة",JOptionPane.INFORMATION_MESSAGE);
        clear();
    }//GEN-LAST:event_botSerchActionPerformed
    private void botdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botdepositActionPerformed
        try {
            user[Integer.parseInt(thIDdeposit.getText())].deposit(Float.parseFloat(thdeposit.getText()),coAmountTypedeposit);
            JOptionPane.showMessageDialog(null, " th  info after deposit user -->  "+user[Integer.parseInt(thIDdeposit.getText())].showData(), "رسالة",JOptionPane.INFORMATION_MESSAGE);
            clear();
        } catch (AccountException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "رسالة",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botdepositActionPerformed
    private void botwithdrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botwithdrewActionPerformed
       try {
            user[Integer.parseInt(thIDwithdrew.getText())].withdrew(Float.parseFloat(thwithdrew.getText()),coAmountTypewithdrew);
            JOptionPane.showMessageDialog(null, " th  info after withdrew user -->  "+user[Integer.parseInt(thIDwithdrew.getText())].showData(), "رسالة",JOptionPane.INFORMATION_MESSAGE);
            clear();
        } catch (AccountException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "رسالة",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botwithdrewActionPerformed
    private void botTransmtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botTransmtionActionPerformed
        try {
          if(user[Integer.parseInt(thfrom.getText())].Transfer(user[Integer.parseInt(thTo.getText())], Integer.parseInt(thTransfar.getText()))){
              JOptionPane.showMessageDialog(null, " th  info after Transfar user from -->  "+user[Integer.parseInt(thfrom.getText())].showData()+" , to ----> "+user[Integer.parseInt(thTo.getText())].showData(), "رسالة",JOptionPane.INFORMATION_MESSAGE);
              clear();
          }
        } catch (AccountException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "رسالة",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botTransmtionActionPerformed
 
    public static void main(String args) {
        setNumUser(124);
        setForm(new AccountFrame());
        getForm().setVisible(true);
        setUser(new InfoAccountUser[getNumUser()]);
       
    }
//<editor-fold defaultstate="collapsed" desc="virble">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAddUser;
    private javax.swing.JButton botSerch;
    private javax.swing.JButton botTransmtion;
    private javax.swing.JButton botdeposit;
    private javax.swing.JButton botwithdrew;
    private javax.swing.JComboBox<String> coAmountTypedeposit;
    private javax.swing.JComboBox<String> coAmountTypewithdrew;
    private javax.swing.JComboBox<String> coCommnunty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laAddressing;
    private javax.swing.JLabel laAmountType;
    private javax.swing.JLabel laAmountType1;
    private javax.swing.JLabel laDataBirth;
    private javax.swing.JLabel laFamilyname;
    private javax.swing.JLabel laFatherName;
    private javax.swing.JLabel laFirstName;
    private javax.swing.JLabel laID;
    private javax.swing.JLabel laID1;
    private javax.swing.JLabel laID2;
    private javax.swing.JLabel laIDto;
    private javax.swing.JLabel laIn;
    private javax.swing.JLabel laNumBoy;
    private javax.swing.JLabel laOn;
    private javax.swing.JLabel laPhone;
    private javax.swing.JLabel laStateCommnunty;
    private javax.swing.JLabel ladeposit;
    private javax.swing.JLabel latransfar;
    private javax.swing.JLabel lawithdrew;
    private javax.swing.JPanel paAccount;
    private javax.swing.JPanel paInfoUser;
    private javax.swing.JPanel paWithdro;
    private javax.swing.JPanel paWithdro1;
    private javax.swing.JTextArea thAddrissing;
    private com.toedter.calendar.JDateChooser thDataBirth;
    private javax.swing.JTextField thFatherName;
    private javax.swing.JTextField thFirstName;
    private javax.swing.JTextField thID;
    private javax.swing.JTextField thIDdeposit;
    private javax.swing.JTextField thIDwithdrew;
    private javax.swing.JTextField thLastName;
    private javax.swing.JTextField thPhone;
    private javax.swing.JTextField thSerch;
    private javax.swing.JTextField thTo;
    private javax.swing.JTextField thTransfar;
    private javax.swing.JTextField thdeposit;
    private javax.swing.JTextField thfrom;
    private javax.swing.JTextField thnumberBoy;
    private javax.swing.JTextField thwithdrew;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
