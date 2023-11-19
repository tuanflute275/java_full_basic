package controller;

import view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  // interface có sẵn của java

public class CounterListener implements ActionListener {
    private CounterView ctv;
    public CounterListener(CounterView ctv){
        this.ctv = ctv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand(); // lấy tên của nút
        if(src.equals("UP")){
            this.ctv.incresement();
        }else if(src.equals("DOWN")){
            this.ctv.decrement();
        }else if(src.equals("RESET")){
            this.ctv.reset();
        }
    }
}
