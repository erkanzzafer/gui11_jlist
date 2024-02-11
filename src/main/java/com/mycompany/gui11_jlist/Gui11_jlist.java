/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui11_jlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author PC
 */
public class Gui11_jlist {

    public static void main(String[] args) {
        JFrame frame = new JFrame("List Örneği");

        DefaultListModel<String> list1 = new DefaultListModel<>();
        list1.addElement("C++");
        list1.addElement("Javascript");
        list1.addElement("Java");
        list1.addElement("PHP");

        JList<String> list = new JList<>(list1);
        list.setBounds(100, 100, 75, 75);

        DefaultListModel<String> list2 = new DefaultListModel<>();
        list2.addElement("Swing");
        list2.addElement("Laravel");
        list2.addElement("Vue.JS");
        list2.addElement("Bootstrap");

        JList<String> listt = new JList<>(list2);
        listt.setBounds(100, 200, 75, 75);

        JButton btn = new JButton("Göster");
        btn.setBounds(200, 150, 80, 30);

        btn.addActionListener(new ActionListener() {
            String txt = "";

            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() != -1) {
                    txt = "Seçilen programlama dili: " + list.getSelectedValue();
                }

                if (listt.getSelectedIndex() != -1) {
                    txt += "Seçilen Framework: ";
                    for (Object item : listt.getSelectedValuesList()) {
                        txt += item + " ";
                    }
                }
                System.out.println(txt);
            }
        });

        frame.add(btn);
        frame.add(list);
        frame.add(listt);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
