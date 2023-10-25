package corejavaI.C6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code6_1_7 {//接口与回调
    //回调是一种设计模式，可以指定某个特定时间发生以后时应该采取的动作
    static class P implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        Timer timer=new Timer(1000,new P());
        timer.start();
        JOptionPane.showMessageDialog(null,"quit");
        System.exit(0);
    }
}
