import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Mon Dec 30 12:36:41 IRST 2019
 */



/**
 * @author sina
 */
public class Swing extends JFrame  {

   public void initial(){
       lId.setText(person.getId());
       lFullName.setText(person.getFullname());
       System.out.println(person.getFullname());
   }

    Person person;
    public Swing(Person person) {
        this.person= person;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - sina
        lId = new JLabel();
        lFullName = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- lId ----
        lId.setText("text");

        //---- lFullName ----
        lFullName.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(lId, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                    .addGap(142, 142, 142)
                    .addComponent(lFullName, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lId, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lFullName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(78, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - sina
    private JLabel lId;
    private JLabel lFullName;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
