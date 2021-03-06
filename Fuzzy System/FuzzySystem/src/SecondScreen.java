
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kivancenes
 */
public class SecondScreen extends javax.swing.JFrame {

    //Aggregation işleminde 4 rule'un minimumları gerekiceği için static tanımladık bi sonraki ekranda da rahat kullanmak için.

    static Double FirstRuleMembership = -1.0;//first rule'un outputu
    static Double SecondRuleMembership = -1.0;//second rule'un outputu
    static Double ThirdRuleMembership = -1.0;//third rule'un outputu
    static Double FourthRuleMembership = -1.0;//fourth rule'un outputu

    /**
     * Creates new form SecondScreen
     */
    public SecondScreen() {
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

        jLabel1 = new javax.swing.JLabel();
        StopImp_Button = new javax.swing.JButton();
        SlowImp_Button = new javax.swing.JButton();
        KeepImp_Button = new javax.swing.JButton();
        SpeedUpImp_Button = new javax.swing.JButton();
        Next_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Select Graph :");

        StopImp_Button.setText("STOP Implications");
        StopImp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopImp_ButtonActionPerformed(evt);
            }
        });

        SlowImp_Button.setText("SLOW-DOWN Implications");
        SlowImp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlowImp_ButtonActionPerformed(evt);
            }
        });

        KeepImp_Button.setText("KEEP-PACE Implications");
        KeepImp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeepImp_ButtonActionPerformed(evt);
            }
        });

        SpeedUpImp_Button.setText("SPEED-UP Implications");
        SpeedUpImp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeedUpImp_ButtonActionPerformed(evt);
            }
        });

        Next_Button.setText("Next");
        Next_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KeepImp_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StopImp_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SlowImp_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpeedUpImp_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Next_Button)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StopImp_Button)
                    .addComponent(SlowImp_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(KeepImp_Button)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SpeedUpImp_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Next_Button))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StopImp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopImp_ButtonActionPerformed
        // TODO add your handling code here:
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries FirstRule = new XYSeries("First Rule");
        double notVerySlow = 0.0;

        if (MainScreen.speed1.equals("Slow")) {
            if (MainScreen.speed >= 40 && MainScreen.speed <= 70) {
                notVerySlow = (double) (MainScreen.speed - 40) / (70 - 40);//triangular formülü çıkarken 70 olsa 30/30 1 tepede olurdu.
            } else if (MainScreen.speed > 70 && MainScreen.speed <= 90) {
                notVerySlow = (double) (90 - MainScreen.speed) / (90 - 70);//triangular formülü inerken 70 olsa 20/20 1 tepede olurdu.
            }
        } else if (MainScreen.speed1.equals("Medium")) {
            if (MainScreen.speed >= 50 && MainScreen.speed <= 100) {
                notVerySlow = (double) (MainScreen.speed - 50) / (100 - 50);//triangular formülü çıkarken 100 olsa 50/50 1 tepede olurdu.
            } else if (MainScreen.speed > 100 && MainScreen.speed <= 130) {
                notVerySlow = (double) (130 - MainScreen.speed) / (130 - 100);//triangular formülü inerken 100 olsa 30/30 1 tepede olurdu.
            }
        } else if (MainScreen.speed1.equals("Fast")) {
            if (MainScreen.speed >= 110 && MainScreen.speed <= 140) {
                notVerySlow = (double) (MainScreen.speed - 110) / (140 - 110);//triangular formülü çıkarken 140 olsa 30/30 1 tepede olurdu.
            } else if (MainScreen.speed > 140 && MainScreen.speed <= 170) {
                notVerySlow = (double) (170 - MainScreen.speed) / (170 - 140);//triangular formülü inerken 140 olsa 30/30 1 tepede olurdu.
            }
        } else if (MainScreen.speed1.equals("Very Fast")) {
            if (MainScreen.speed >= 120 && MainScreen.speed <= 160) {
                notVerySlow = (double) (MainScreen.speed - 120) / (160 - 120);//triangular formülü çıkarken 160 olsa 40/40 1 tepede olurdu.
            } else if (MainScreen.speed > 160) {
                notVerySlow = 1.0; // 160 ve yukarısının membershipi 1.
            }
        }
        //distance için tek very close koşulu oldugu için.
        Double veryClose = 0.0;
        if (MainScreen.distance <= 20) {
            veryClose = 1.0;
        } else if (MainScreen.distance >= 20 && MainScreen.distance <= 40) {
            veryClose = (double) (40 - MainScreen.distance) / (40 - 20);
        }
        //en son firstrulemembershipe atama yapıyoruz küçün olanı minimumu yani
        if (veryClose < notVerySlow) {
            FirstRuleMembership = veryClose;
        } else {
            FirstRuleMembership = notVerySlow;
        }
        FirstRule.add(0, FirstRuleMembership);//
        FirstRule.add(((1 - FirstRuleMembership) * 2 + 2), FirstRuleMembership);//formül y değerinin x'ini bulmak için gerekiyor.
        FirstRule.add(4, 0);//  
        dataset.addSeries(FirstRule);

        JFreeChart chart = ChartFactory.createXYLineChart("First Rule Graph", "Motor Speed(Stop)", "Membership", dataset);
        ChartFrame frame = new ChartFrame("First Rule", chart);
        frame.setVisible(true);
        frame.setSize(500, 300);
    }//GEN-LAST:event_StopImp_ButtonActionPerformed

    private void SlowImp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlowImp_ButtonActionPerformed
        // TODO add your handling code here:
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries SecondRule = new XYSeries("Second Rule");

        if (MainScreen.distance2.equals("Close")) {
            Double notVerySlow = 0.0;
            if (MainScreen.speed1.equals("Slow")) {
                if (MainScreen.speed >= 40 && MainScreen.speed <= 70) {
                    notVerySlow = (double) (MainScreen.speed - 40) / (70 - 40);//triangular formülü çıkarken 70 olsa 30/30 1 tepede olurdu.
                } else if (MainScreen.speed > 70 && MainScreen.speed <= 90) {
                    notVerySlow = (double) (90 - MainScreen.speed) / (90 - 70);//triangular formülü inerken 70 olsa 20/20 1 tepede olurdu.
                }
            } else if (MainScreen.speed1.equals("Medium")) {
                if (MainScreen.speed >= 50 && MainScreen.speed <= 100) {
                    notVerySlow = (double) (MainScreen.speed - 50) / (100 - 50);//triangular formülü çıkarken 100 olsa 50/50 1 tepede olurdu.
                } else if (MainScreen.speed > 100 && MainScreen.speed <= 130) {
                    notVerySlow = (double) (130 - MainScreen.speed) / (130 - 100);//triangular formülü inerken 100 olsa 30/30 1 tepede olurdu.
                }
            } else if (MainScreen.speed1.equals("Fast")) {
                if (MainScreen.speed >= 110 && MainScreen.speed <= 140) {
                    notVerySlow = (double) (MainScreen.speed - 110) / (140 - 110);//triangular formülü çıkarken 140 olsa 30/30 1 tepede olurdu.
                } else if (MainScreen.speed > 140 && MainScreen.speed <= 170) {
                    notVerySlow = (double) (170 - MainScreen.speed) / (170 - 140);//triangular formülü inerken 140 olsa 30/30 1 tepede olurdu.
                }
            } else if (MainScreen.speed1.equals("Very Fast")) {
                if (MainScreen.speed >= 120 && MainScreen.speed <= 160) {
                    notVerySlow = (double) (MainScreen.speed - 120) / (160 - 120);//triangular formülü çıkarken 160 olsa 40/40 1 tepede olurdu.
                } else if (MainScreen.speed > 160) {
                    notVerySlow = 1.0; // 160 ve yukarısının membershipi 1.
                }
            }
            Double Close = 0.0;
            if (MainScreen.distance >= 20 && MainScreen.distance <= 40) {
                Close = (double) (MainScreen.distance - 20) / (40 - 20);
            } else if (MainScreen.distance > 40 && MainScreen.distance <= 60) {
                Close = (double) (60 - MainScreen.distance) / (60 - 40);
            }

            if (Close < notVerySlow) {
                SecondRuleMembership = Close;
            } else {
                SecondRuleMembership = notVerySlow;
            }

            SecondRule.add(2, 0);
            SecondRule.add((SecondRuleMembership * 2 + 2), SecondRuleMembership);//formül y değerinin x'ini bulmak için gerekiyor.yukarı çıkan
            SecondRule.add(((1 - SecondRuleMembership) * 2) + 4, SecondRuleMembership);//aşagı inen
            SecondRule.add(6, 0);//
            dataset.addSeries(SecondRule);

            JFreeChart chart = ChartFactory.createXYLineChart("Second Rule Graph", "Motor Speed(Slow-Down)", "Membership", dataset);
            ChartFrame frame = new ChartFrame("Second Rule", chart);
            frame.setVisible(true);
            frame.setSize(500, 300);

        } else if (MainScreen.distance2.equals("Normal")) {
            Double veryFast = 0.0;
            if (MainScreen.speed >= 120 && MainScreen.speed <= 160) {
                veryFast = (double) (MainScreen.speed - 120) / (160 - 120); //triangular formülü çıkarken 160 olsa 40/40 1 tepede olurdu.
            } else if (MainScreen.speed > 160) {
                veryFast = 1.0; // 160 ve yukarısının membershipi 1.
            }
            Double Normal = 0.0;
            if (MainScreen.distance >= 40 && MainScreen.distance <= 60) {
                Normal = (double) (MainScreen.distance - 40) / (60 - 40);
            } else if (MainScreen.distance > 60 && MainScreen.distance <= 80) {
                Normal = (double) (80 - MainScreen.distance) / (80 - 60);
            }
            //en son secondrulemembershipe atama yapıyoruz küçün olanı minimumu yani
            if (Normal < veryFast) {
                SecondRuleMembership = Normal;
            } else {
                SecondRuleMembership = veryFast;
            }

            SecondRule.add(2, 0);//
            SecondRule.add((SecondRuleMembership * 2 + 2), SecondRuleMembership);//formül y değerinin x'ini bulmak için gerekiyor.
            SecondRule.add(((1 - SecondRuleMembership) * 2) + 4, SecondRuleMembership);//
            SecondRule.add(6, 0);//
            dataset.addSeries(SecondRule);

            JFreeChart chart = ChartFactory.createXYLineChart("Second Rule Graph", "Motor Speed(Slow-Down)", "Membership", dataset);
            ChartFrame frame = new ChartFrame("Second Rule", chart);
            frame.setVisible(true);
            frame.setSize(500, 300);
        }
    }//GEN-LAST:event_SlowImp_ButtonActionPerformed

    private void KeepImp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeepImp_ButtonActionPerformed
        // TODO add your handling code here:
        //3.kuralda keep pace için 2 durum var speed'e bakarak fast mi very slow mu if e alıyoruz.
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries ThirdRule = new XYSeries("Third Rule");
        if (MainScreen.speed3.equals("Fast")) {
            Double Fast = 0.0;
            if (MainScreen.speed >= 110 && MainScreen.speed <= 140) {
                Fast = (double) (MainScreen.speed - 110) / (140 - 110); //triangular formülü çıkarken 140 olsa 30/30 1 tepede olurdu.
            } else if (MainScreen.speed > 140 && MainScreen.speed <= 170) {
                Fast = (double) (170 - MainScreen.speed) / (170 - 140); // 140 ve yukarısının membershipi 1.
            }
            Double Normal = 0.0;
            if (MainScreen.distance >= 40 && MainScreen.distance <= 60) {
                Normal = (double) (MainScreen.distance - 40) / (60 - 40);
            } else if (MainScreen.distance > 60 && MainScreen.distance <= 80) {
                Normal = (double) (80 - MainScreen.distance) / (80 - 60);
            }
            
            if (Normal < Fast) {
                ThirdRuleMembership = Normal;
            } else {
                ThirdRuleMembership = Fast;
            }

            ThirdRule.add(4, 0);//
            ThirdRule.add((ThirdRuleMembership * 2 + 4), ThirdRuleMembership);//formül y değerinin x'ini bulmak için gerekiyor.
            ThirdRule.add(((1 - ThirdRuleMembership) * 2) + 6, ThirdRuleMembership);//
            ThirdRule.add(8, 0);//
            dataset.addSeries(ThirdRule);

            JFreeChart chart = ChartFactory.createXYLineChart("Third Rule Graph", "Motor Speed(Keep-Pace)", "Membership", dataset);
            ChartFrame frame = new ChartFrame("Third Rule", chart);
            frame.setVisible(true);
            frame.setSize(500, 300);
        } else if (MainScreen.speed3.equals("Very Slow")) {
            Double VerySlow = 0.0;
            if (MainScreen.speed >= 0 && MainScreen.speed <= 40) {
                VerySlow = 1.0; 
            } else if (MainScreen.speed > 40 && MainScreen.speed <= 70) {
                VerySlow = (double) (70 - MainScreen.speed) / (70 - 40); 
            }
            Double closeVeryClose = 0.0;
            if (MainScreen.distance3.equals("Very Close")) {
                if (MainScreen.distance >= 40 && MainScreen.distance <= 60) {
                    closeVeryClose = (double) (MainScreen.distance - 40) / (60 - 40);
                } else if (MainScreen.distance > 60 && MainScreen.distance <= 80) {
                    closeVeryClose = (double) (80 - MainScreen.distance) / (80 - 60);
                }
            } else if (MainScreen.distance3.equals("Close")) {
                if (MainScreen.distance >= 20 && MainScreen.distance <= 40) {
                    closeVeryClose = (double) (MainScreen.distance - 20) / (40 - 20);
                } else if (MainScreen.distance > 40 && MainScreen.distance <= 60) {
                    closeVeryClose = (double) (60 - MainScreen.distance) / (60 - 40);
                }
            }
            //en son thirdrulemembershipe atama yapıyoruz küçün olanı minimumu yani
            if (closeVeryClose < VerySlow) {
                ThirdRuleMembership = closeVeryClose;
            } else {
                ThirdRuleMembership = VerySlow;
            }

            ThirdRule.add(4, 0);//
            ThirdRule.add((ThirdRuleMembership * 2 + 4), ThirdRuleMembership);//formül y değerinin x'ini bulmak için gerekiyor.
            ThirdRule.add(((1 - ThirdRuleMembership) * 2) + 6, ThirdRuleMembership);//
            ThirdRule.add(8, 0);//
            dataset.addSeries(ThirdRule);

            JFreeChart chart = ChartFactory.createXYLineChart("Third Rule Graph", "Motor Speed(Keep-Pace)", "Membership", dataset);
            ChartFrame frame = new ChartFrame("Third Rule", chart);
            frame.setVisible(true);
            frame.setSize(500, 300);
        }

    }//GEN-LAST:event_KeepImp_ButtonActionPerformed

    private void SpeedUpImp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeedUpImp_ButtonActionPerformed
        // TODO add your handling code here:
        
        
        //SPEED NOT MEDIUM DİSTANCE AWAY OR NORMAL.

        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries FourthRule = new XYSeries("Fourth Rule");
        double notMedium = 0.0;

        if (MainScreen.speed4.equals("Slow")) {
            if (MainScreen.speed >= 40 && MainScreen.speed <= 70) {
                notMedium = (double) (MainScreen.speed - 40) / (70 - 40);//triangular formülü çıkarken 70 olsa 30/30 1 tepede olurdu.
            } else if (MainScreen.speed >= 70 && MainScreen.speed <= 90) {
                notMedium = (double) (90 - MainScreen.speed) / (90 - 70);//triangular formülü inerken 70 olsa 20/20 1 tepede olurdu.
            }
        } else if (MainScreen.speed4.equals("Very Slow")) {
            if (MainScreen.speed >= 0 && MainScreen.speed <= 40) {
                notMedium = 1.0;//0-40 arası y hep 1.
            } else if (MainScreen.speed > 40 && MainScreen.speed <= 70) {
                notMedium = (double) (70 - MainScreen.speed) / (70 - 40);//triangular formülü inerken 100 olsa 30/30 1 tepede olurdu.
            }
        } else if (MainScreen.speed4.equals("Fast")) {
            if (MainScreen.speed >= 110 && MainScreen.speed <= 140) {
                notMedium = (double) (MainScreen.speed - 110) / (140 - 110);//triangular formülü çıkarken 140 olsa 30/30 1 tepede olurdu.
            } else if (MainScreen.speed > 140 && MainScreen.speed <= 170) {
                notMedium = (double) (170 - MainScreen.speed) / (170 - 140);//triangular formülü inerken 140 olsa 30/30 1 tepede olurdu.
            }
        } else if (MainScreen.speed4.equals("Very Fast")) {
            if (MainScreen.speed > 120 && MainScreen.speed <= 160) {
                notMedium = (double) (MainScreen.speed - 120) / (160 - 120);//triangular formülü çıkarken 160 olsa 40/40 1 tepede olurdu.
            } else if (MainScreen.speed >= 160) {
                notMedium = 1.0; // 160 ve yukarısının membershipi 1.
            }
        }

        Double NormalAway = 0.0;
        if (MainScreen.distance4.equals("Away")) {
            if (MainScreen.distance >= 60 && MainScreen.distance <= 80) {
                NormalAway = (double) (MainScreen.distance - 60) / (80 - 60);
            } else if (MainScreen.distance > 80) {
                NormalAway = 1.0;
            }
        } else if (MainScreen.distance4.equals("Normal")) {
            if (MainScreen.distance >= 40 && MainScreen.distance <= 60) {
                NormalAway = (double) (MainScreen.distance - 40) / (60 - 40);
            } else if (MainScreen.distance > 60 && MainScreen.distance <= 80) {
                NormalAway = (double) (80 - MainScreen.distance) / (80 - 60);
            }
        }
        
        //en son fourthrulemembershipe atama yapıyoruz küçün olanı minimumu yani
        if (NormalAway < notMedium) {
            FourthRuleMembership = NormalAway;
        } else {
            FourthRuleMembership = notMedium;
        }
        FourthRule.add(6, 0);//
        FourthRule.add((FourthRuleMembership * 2 + 6), FourthRuleMembership);//formül y değerinin x'ini bulmak için gerekiyor.
        FourthRule.add(10, FourthRuleMembership);//  
        dataset.addSeries(FourthRule);

        JFreeChart chart = ChartFactory.createXYLineChart("Fourth Rule Graph", "Motor Speed(Speed-Up)", "Membership", dataset);
        ChartFrame frame = new ChartFrame("Fourth Rule", chart);
        frame.setVisible(true);
        frame.setSize(500, 300);
    }//GEN-LAST:event_SpeedUpImp_ButtonActionPerformed

    private void Next_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_ButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (FirstRuleMembership >= 0.0 && SecondRuleMembership >= 0.0 && ThirdRuleMembership >= 0.0 && FourthRuleMembership >= 0.0) {
                this.setVisible(false);
                ThirdScreen frame3 = new ThirdScreen();
                frame3.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Select All Rules");
        }
    }//GEN-LAST:event_Next_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KeepImp_Button;
    private javax.swing.JButton Next_Button;
    private javax.swing.JButton SlowImp_Button;
    private javax.swing.JButton SpeedUpImp_Button;
    private javax.swing.JButton StopImp_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
