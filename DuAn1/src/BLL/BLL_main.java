/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.awt.Component;
import javax.swing.JTabbedPane;

/**
 *
 * @author Huy Nhan
 */
public class BLL_main {
    public static void themtab(String tentab,JTabbedPane tbn,Component TenFormHienThi){
        int tongtab = tbn.getTabCount();
        tbn.add(tentab,TenFormHienThi);
        tbn.setTabComponentAt(tongtab,
                 new ButtonTabComponent(tbn));
    }
}
