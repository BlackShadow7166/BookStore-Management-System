/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstore_management_system;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author usama
 */
public class Books extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
        displayBooks();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        isbnTF = new javax.swing.JTextField();
        logoutLBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titleTF = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        authorTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        delButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTBL = new javax.swing.JTable();
        categoryComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1046, 588));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_management_system/icons8-cancel-32.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" BookStore Software");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Price");

        logoutLBL.setForeground(new java.awt.Color(0, 0, 153));
        logoutLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_management_system/icons8-go-back-30.png"))); // NOI18N
        logoutLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLBLMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Users");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        printButton.setBackground(new java.awt.Color(204, 204, 204));
        printButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        printButton.setForeground(new java.awt.Color(0, 0, 153));
        printButton.setText("Print");
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_management_system/icons8-user-32.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Books Stock");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Books");

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_management_system/icons8-books-32.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(55, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 0, 153));
        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ISBN");

        editButton.setBackground(new java.awt.Color(204, 204, 204));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        editButton.setForeground(new java.awt.Color(0, 0, 153));
        editButton.setText("Edit");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Title");

        delButton.setBackground(new java.awt.Color(204, 204, 204));
        delButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        delButton.setForeground(new java.awt.Color(0, 0, 153));
        delButton.setText("Delete");
        delButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButtonMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Author");

        resetButton.setBackground(new java.awt.Color(204, 204, 204));
        resetButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        resetButton.setForeground(new java.awt.Color(0, 0, 153));
        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Categories");

        booksTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author", "Categories", "Quantity", "Price"
            }
        ));
        booksTBL.setRowHeight(25);
        booksTBL.setSelectionBackground(new java.awt.Color(0, 0, 0));
        booksTBL.setSelectionForeground(new java.awt.Color(255, 255, 255));
        booksTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booksTBL);

        categoryComboBox.setForeground(new java.awt.Color(0, 0, 153));
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programming", "Chemistry", "Physics", "Biology", "Geography", "AutoBiography", "Novels", "Comics", "Urdu", "Istlamiat" }));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutLBL)
                        .addGap(442, 442, 442)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(323, 323, 323))))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isbnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isbnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(editButton)
                    .addComponent(delButton)
                    .addComponent(resetButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutLBL, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    Statement statement = null;
    ResultSet resultSet = null;
    private void displayBooks(){
        try{
            
            statement = ConClass.connectDB().createStatement();
            resultSet = statement.executeQuery("select * from admin1.BOOKSTBL");
            booksTBL.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        }
        catch(SQLException e){
              System.out.print(e);
        }
    }
    private void resetTextFields(){
        isbnTF.setText("");
        titleTF.setText("");
        authorTF.setText("");
        categoryComboBox.setSelectedIndex(0);
        quantityTF.setText("");
        priceTF.setText("");
        
    }
    private boolean isInteger(String value) {
    try {
        Integer.parseInt(value);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        if (isbnTF.getText().isEmpty() || titleTF.getText().isEmpty() || authorTF.getText().isEmpty() || categoryComboBox.getSelectedIndex() == -1 || quantityTF.getText().isEmpty() || priceTF.getText().isEmpty()) {
            
           JOptionPane.showMessageDialog(this, "Kindly enter the values in all fields!", "Input Error", JOptionPane.INFORMATION_MESSAGE);

        }else if (!isInteger(quantityTF.getText()) || !isInteger(priceTF.getText())) {
        JOptionPane.showMessageDialog(this, "Quantity and price should be valid integers.", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Integer.parseInt(quantityTF.getText()) <= 0 || Integer.parseInt(priceTF.getText()) <= 0 ){
            JOptionPane.showMessageDialog(this, "Kindly enter correct values", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            
            try{
                
               
                PreparedStatement checkISBN = ConClass.connectDB().prepareStatement("SELECT * FROM BooksTBL WHERE ISBN = ?");
                checkISBN.setString(1, isbnTF.getText());
                resultSet = checkISBN.executeQuery();

                 if (resultSet.next()) {
                // Book with the same ISBN already exists
                 JOptionPane.showMessageDialog(this, "A book with the same ISBN already exists. Click 'Edit' to edit the existing book.", "Duplicate ISBN", JOptionPane.DEFAULT_OPTION);
                      
                }
                 else{
                
                PreparedStatement add = ConClass.connectDB().prepareStatement("insert into BooksTBL values(?,?,?,?,?,?)");
                add.setString(1,isbnTF.getText());
                add.setString(2,titleTF.getText().toLowerCase() );
                add.setString(3, authorTF.getText());
                add.setString(4, categoryComboBox.getSelectedItem().toString());
                add.setInt(5, Integer.parseInt( quantityTF.getText()));
                add.setInt(6, Integer.parseInt(priceTF.getText()));
                
                int row = add.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Book Added Successfully", "Save", JOptionPane.INFORMATION_MESSAGE);
                displayBooks();
                resetTextFields();
                
                }
                               
            }
            catch(HeadlessException | NumberFormatException | SQLException e){
                     System.out.print(e);
            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        resetTextFields();
    }//GEN-LAST:event_resetButtonMouseClicked

    private void delButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButtonMouseClicked
        if (isbnTF.getText().isEmpty()) {
            
           JOptionPane.showMessageDialog(this, "Missing Information!", "Input Error", JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            try{
                
                String bookIsbn = isbnTF.getText();
                String query = "DELETE FROM admin1.BOOKSTBL WHERE isbn = ?";
                
                PreparedStatement delete = ConClass.connectDB().prepareStatement(query);
                delete.setString(1, bookIsbn);
                int rowsAffected = delete.executeUpdate();
                
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Book Deleted Successfully", "Deletion", JOptionPane.INFORMATION_MESSAGE);
                    displayBooks();
                    resetTextFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Book with ISBN " + bookIsbn + " not found", "Deletion", JOptionPane.WARNING_MESSAGE);
                    resetTextFields();
                } 
            }
            catch(HeadlessException | NumberFormatException | SQLException e){
                     System.out.print(e);
            }
        }
    }//GEN-LAST:event_delButtonMouseClicked

    private void booksTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTBLMouseClicked
        DefaultTableModel model = (DefaultTableModel)booksTBL.getModel();
        int myIndex = booksTBL.getSelectedRow();
        isbnTF.setText(model.getValueAt(myIndex, 0).toString());
        titleTF.setText(model.getValueAt(myIndex, 1).toString());
        authorTF.setText(model.getValueAt(myIndex, 2).toString());
        categoryComboBox.setSelectedItem(model.getValueAt(myIndex, 3));
        quantityTF.setText(model.getValueAt(myIndex, 4).toString());
        priceTF.setText(model.getValueAt(myIndex, 5).toString());
        
  
    }//GEN-LAST:event_booksTBLMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
       if (isbnTF.getText().isEmpty() || titleTF.getText().isEmpty() || authorTF.getText().isEmpty() || categoryComboBox.getSelectedIndex() == -1 || quantityTF.getText().isEmpty() || priceTF.getText().isEmpty()) {
            
           JOptionPane.showMessageDialog(this, "Missing Information!", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        }else if (!isInteger(quantityTF.getText()) || !isInteger(priceTF.getText())) {
        JOptionPane.showMessageDialog(this, "Quantity and price should be valid integers.", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Integer.parseInt(quantityTF.getText()) <= 0 || Integer.parseInt(priceTF.getText()) <= 0 ){
            JOptionPane.showMessageDialog(this, "Kindly enter correct values", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try{
                
                String updatedIsbn = isbnTF.getText();
                String updatedTitle = titleTF.getText();
                String updatedAuthor = authorTF.getText();
                String updatedCategory = categoryComboBox.getSelectedItem().toString();
                String updatedQuantity = quantityTF.getText();
                String updatedPrice = priceTF.getText();
               
                
                String query = "update admin1.BOOKSTBL set btitle = ?, bauthor = ?, bcategory = ?, bquantity = ?, bprice = ?  where isbn = ?";
                
                try (PreparedStatement update = ConClass.connectDB().prepareStatement(query)) {
                    update.setString(1, updatedTitle);
                    update.setString(2, updatedAuthor);
                    update.setString(3, updatedCategory);
                    update.setInt(4, Integer.parseInt(updatedQuantity));
                    update.setInt(5, Integer.parseInt(updatedPrice));
                    update.setString(6, updatedIsbn);
                    
                     int rowsAffected = update.executeUpdate(); 
                     
                      if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Book Updated Successfully", "Deletion", JOptionPane.INFORMATION_MESSAGE);
                    displayBooks();
                    resetTextFields();
                    } else {
                      JOptionPane.showMessageDialog(this, "Book with ISBN " + updatedIsbn + " not found", "Deletion", JOptionPane.WARNING_MESSAGE);
                      resetTextFields();
                } 
               } 
            }
            catch(HeadlessException | NumberFormatException | SQLException e){
                     System.out.print(e);
            }
        }
    }//GEN-LAST:event_editButtonMouseClicked

    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
        try{
            booksTBL.print();
        }
        catch(PrinterException e){
            
        }
    }//GEN-LAST:event_printButtonMouseClicked

    private void logoutLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLBLMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutLBLMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Users().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorTF;
    private javax.swing.JTable booksTBL;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField isbnTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLBL;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titleTF;
    // End of variables declaration//GEN-END:variables
}
