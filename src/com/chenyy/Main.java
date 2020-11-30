package com.chenyy;

import com.chenyy.ocp.BlueSubject;
import com.chenyy.ocp.RedSubject;
import com.chenyy.ocp.Windows;

public class Main {

    public static void main(String[] args) {
        BlueSubject rs = new BlueSubject();
        Windows w = new Windows(rs);
        w.display();
    }
}
