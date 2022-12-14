
package amoremio;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author CHS - PAULO
 */
public class Quiz_Form extends javax.swing.JFrame {
     
    String[] questions = {"Qual a data do pedido de namoro?","Qual a data que nos conhecemos?","Data que voltamos a nos falar?","Qual o nome da minha mae?","Qual o nome do meu primeiro cachorro?"};    
    String[][] options = {{"21 de Abril","17 de Outubro","17 de Dezembro","31 de Julho","17 de Dezembro" },{"31 de Julho","21 de Abril","17 de Dezembro","17 de Outubro","21 de Abril"},{"17 de Dezembro","17 de Outubro","31 de Julho","21 de Abril","17 de Outubro"},{"Lili","Maria","Parto","Hilda","Maria"},{"Banze","Paulito","Branquinho","Negao","Negao"}};
      int index = 0, correct = 0;    
      
      ButtonGroup bg = new ButtonGroup();
    
   
public Quiz_Form() {
        initComponents();   
        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);
        
   jButton_Next_QActionPerformed(null);            
    
}
public void getSelectedOption(JRadioButton rbtn){    
    System.out.println(rbtn.getText());
    System.out.println(options[index][4]);
  
    if(rbtn.getText().equals(options[index][4])){                 
        
        correct++;
        if(correct == 1){
            jPanel_Q_Container.setBackground(Color.red); 
            Lbl_Question.setText("Dica 1: Onde nossas memorias nunca ficarão.");
            
        }
        else if(correct == 2){
            jPanel_Q_Container.setBackground(Color.blue); 
            Lbl_Question.setText("Dica 2: Onde esconde-se os piores segredos.");
        }
        else if(correct == 3){
            jPanel_Q_Container.setBackground(Color.yellow);  
            Lbl_Question.setText("Dica 3: Onde vai parar tudo que não queremos.");
        }
        else if(correct == 4){
            jPanel_Q_Container.setBackground(Color.orange); 
            Lbl_Question.setText("Dica 4:Onde nossos filhos anteriores ficaram");
        }
        else if(correct == 5){
            jPanel_Q_Container.setBackground(Color.green); 
            Lbl_Question.setText("Dica 5: A LIXEIRA PELO AMOR DE DEUS");
        }
    
   }
    index++;
    enableRbuttons(false);
}
 
public void enableRbuttons(boolean yes_or_no){
    jRadioButton1_.setEnabled(yes_or_no);
     jRadioButton2_.setEnabled(yes_or_no);
      jRadioButton3_.setEnabled(yes_or_no);
       jRadioButton4_.setEnabled(yes_or_no);
       
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Q_Container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jButton_Next_Q = new javax.swing.JButton();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Amor Mio - Rafhaela Helena");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel_Q_Container.setBackground(new java.awt.Color(204, 204, 204));

        Lbl_Question.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lbl_Question.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Primeira pergunta");

        javax.swing.GroupLayout jPanel_Q_ContainerLayout = new javax.swing.GroupLayout(jPanel_Q_Container);
        jPanel_Q_Container.setLayout(jPanel_Q_ContainerLayout);
        jPanel_Q_ContainerLayout.setHorizontalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl_Question, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        jPanel_Q_ContainerLayout.setVerticalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Q_ContainerLayout.createSequentialGroup()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_Next_Q.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Next_Q.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Next_Q.setText("Proxima Pergunta");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        jRadioButton1_.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1_.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1_.setText("jRadioButton1");
        jRadioButton1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ActionPerformed(evt);
            }
        });

        jRadioButton2_.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2_.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2_.setText("jRadioButton1");
        jRadioButton2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_ActionPerformed(evt);
            }
        });

        jRadioButton3_.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton3_.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3_.setText("jRadioButton1");
        jRadioButton3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_ActionPerformed(evt);
            }
        });

        jRadioButton4_.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton4_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4_.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4_.setText("jRadioButton1");
        jRadioButton4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jRadioButton1_)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2_)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3_)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed
          
       
        
        if(jButton_Next_Q.getText() == "Reinicie o Quiz"){
            jButton_Next_Q.setText("Proximo");
            jPanel_Q_Container.setBackground(new java.awt.Color(204,204,204));
            index = 0;
            correct = 0;           
                    
        }
        
        if(index == questions.length){
            Lbl_Question.setText("Resultado:" + correct + "/" +questions.length);
            if(correct ==(float)questions.length)
            {
                jPanel_Q_Container.setBackground(Color.green);  
                
            }
            else{
                jPanel_Q_Container.setBackground(Color.red);
            }
            jButton_Next_Q.setText("Reinicie o Quiz");
        }
        
        else{
            enableRbuttons(true);
        
        Lbl_Question.setText(questions[index]);
        jRadioButton1_.setText(options[index][0]);
        jRadioButton2_.setText(options[index][1]);
        jRadioButton3_.setText(options[index][2]);
        jRadioButton4_.setText(options[index][3]);
        
        if(index == questions.length-1){
           jButton_Next_Q.setText("Finalize e veja o resultado");
        }
        }
        
        
        bg.clearSelection();
        
    }//GEN-LAST:event_jButton_Next_QActionPerformed

    private void jRadioButton1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ActionPerformed
      getSelectedOption(jRadioButton1_);
    }//GEN-LAST:event_jRadioButton1_ActionPerformed

    private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_ActionPerformed
        getSelectedOption(jRadioButton2_);
    }//GEN-LAST:event_jRadioButton2_ActionPerformed

    private void jRadioButton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_ActionPerformed
        getSelectedOption(jRadioButton3_);
    }//GEN-LAST:event_jRadioButton3_ActionPerformed

    private void jRadioButton4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_ActionPerformed
        getSelectedOption(jRadioButton4_);
    }//GEN-LAST:event_jRadioButton4_ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Q_Container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}
