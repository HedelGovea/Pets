package juego;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame implements ActionListener{
    JLabel fondo,o,i,ad;
    String j1,j2,j3;
    JButton iniciar,obje ,instruc, acercaDe,salir;
    JButton sI,sA,sO,sig1,sig2,at1,at2;
    JPanel menu, co,co2,co3, a, obj;
    ImageIcon jugar = new ImageIcon("j.png");
    ImageIcon f = new ImageIcon("menu.png");    
    ImageIcon ob = new ImageIcon("objetivo.png"); 
    ImageIcon in = new ImageIcon("como.png"); 
    ImageIcon acd = new ImageIcon("acerca.png"); 
    ImageIcon j = new ImageIcon("j.png");
    ImageIcon objet = new ImageIcon("o.png");
    ImageIcon c = new ImageIcon("c.png");
    ImageIcon c1 = new ImageIcon("c1.png");
    ImageIcon c2 = new ImageIcon("c2.png");
    ImageIcon c3 = new ImageIcon("c3.png");    
    ImageIcon A = new ImageIcon("a.png");
    ImageIcon s = new ImageIcon("sa.png");
    ImageIcon bye = new ImageIcon("bye.png");
    ImageIcon sig = new ImageIcon("sig.png");
    ImageIcon regre = new ImageIcon("regre.png");
    public Menu(){
        super("Lucky Tab");
        this.setSize(850, 530);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false);
        Componentes();
    }
    public void Componentes(){
        menu = new JPanel();
        menu.setLayout(null);
        this.getContentPane().add(menu);
        
        ImageIcon icono = new ImageIcon("icono.png");
        this.setIconImage(icono.getImage());
        
        iniciar = new JButton();
        iniciar.setBounds(325, 150, 210, 50);
        iniciar.setIcon(jugar);
        iniciar.addActionListener(this);
        menu.add(iniciar);
        
        obje = new JButton();
        obje.setBounds(325, 220, 210, 50);
        obje.setIcon(objet);
        obje.addActionListener(this);
        menu.add(obje);
        
        instruc = new JButton();
        instruc.setBounds(325, 290, 210, 50);
        instruc.setIcon(c);
        instruc.addActionListener(this);
        menu.add(instruc);
        
        acercaDe = new JButton();
        acercaDe.setBounds(325, 360, 210, 50);
        acercaDe.addActionListener(this);
        acercaDe.setIcon(A);
        menu.add(acercaDe);
        
        salir = new JButton();
        salir.setBounds(325, 430, 210, 50);
        salir.addActionListener(this);
        salir.setIcon(s);
        menu.add(salir);  
        
        fondo= new JLabel();
        fondo.setBounds(0, 0, 850, 500);
        fondo.setIcon(f);
        menu.add(fondo);
        
        obj = new JPanel();
        obj.setBounds(0, 0, 850, 520);
        obj.setLayout(null);
        obj.setVisible(false);
        
        sO = new JButton();
        sO.setBounds(80, 440, 100, 30);
        sO.setIcon(regre);
        sO.addActionListener(this);
        obj.add(sO);
        
        o= new JLabel();
        o.setBounds(0, 0, 850, 500);
        o.setIcon(ob);
        obj.add(o);
        
        co = new JPanel();
        co.setBounds(0, 0, 850, 520);
        co.setLayout(null);
        co.setVisible(false);               
        
        sI = new JButton();
        sI.setBounds(80, 460, 100, 30);
        sI.setIcon(regre);
        sI.addActionListener(this);
        co.add(sI);
        
        sig1 = new JButton();
        sig1.setBounds(600, 460, 100, 30);
        sig1.setIcon(sig);
        sig1.addActionListener(this);
        co.add(sig1);
        
        i= new JLabel();
        i.setBounds(0, 0, 850, 500);
        i.setIcon(c1);
        co.add(i);
        
        co2 = new JPanel();
        co2.setBounds(0, 0, 850, 520);
        co2.setLayout(null);
        co2.setVisible(false);        
        
        sig2 = new JButton();
        sig2.setBounds(600, 460, 100, 30);
        sig2.setIcon(sig);
        sig2.addActionListener(this);
        co2.add(sig2);
        
        at1 = new JButton();
        at1.setBounds(80, 460, 100, 30);
        at1.setIcon(regre);
        at1.addActionListener(this);
        co2.add(at1);
        
        i= new JLabel();
        i.setBounds(0, 0, 850, 500);
        i.setIcon(c2);
        co2.add(i);
        
        co3 = new JPanel();
        co3.setBounds(0, 0, 850, 520);
        co3.setLayout(null);
        co3.setVisible(false); 
        
        at2 = new JButton();
        at2.setBounds(80, 460, 100, 30);
        at2.setIcon(regre);
        at2.addActionListener(this);
        co3.add(at2);
        
        i= new JLabel();
        i.setBounds(0, 0, 850, 500);
        i.setIcon(c3);
        co3.add(i);                     
        
        a = new JPanel();
        a.setBounds(0, 0, 850, 520);
        a.setLayout(null);
        a.setVisible(false);
        
        sA = new JButton();
        sA.setBounds(80, 440, 100, 40);
        sA.setIcon(regre);
        sA.addActionListener(this);
        a.add(sA);
        
        ad= new JLabel();
        ad.setBounds(0, 0, 850, 500);
        ad.setIcon(acd);
        a.add(ad);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==iniciar) {          
            Tablero ventana = new Tablero();
            ventana.setVisible(true);
            this.setVisible(false);                                     
        }
        if (e.getSource()==obje) {
            menu.setVisible(false);
            obj.setVisible(true);
            this.getContentPane().add(obj);
            obj.setLayout(null);
        }
        if (e.getSource()==sO) {
            menu.setVisible(true);
            obj.setVisible(false);
            this.getContentPane().add(menu);
            menu.setLayout(null);
        }
        if (e.getSource()==instruc) {
            menu.setVisible(false);
            co.setVisible(true);
            this.getContentPane().add(co);
            co.setLayout(null);
        }
        if (e.getSource()==sI) {
            menu.setVisible(true);
            co.setVisible(false);
            this.getContentPane().add(menu);
            menu.setLayout(null);
        }
        if (e.getSource()==sig1) {
            menu.setVisible(false);
            co.setVisible(false);
            co2.setVisible(true);
            this.getContentPane().add(co2);
            co2.setLayout(null);
        }
        if (e.getSource()==at1) {
            menu.setVisible(false);
            co.setVisible(true);
            co2.setVisible(false);
            co3.setVisible(false);
            this.getContentPane().add(co3);
            co3.setLayout(null);
        }
        if (e.getSource()==sig2) {
            menu.setVisible(false);
            co.setVisible(false);
            co2.setVisible(false);
            co3.setVisible(true);
            this.getContentPane().add(co3);
            co3.setLayout(null);
        }
        if (e.getSource()==at2) {
            menu.setVisible(false);
            co.setVisible(false);
            co2.setVisible(true);
            co3.setVisible(false);
            this.getContentPane().add(co3);
            co3.setLayout(null);
        }
        if (e.getSource()==acercaDe) {
            menu.setVisible(false);
            a.setVisible(true);
            this.getContentPane().add(a);
            a.setLayout(null);
        }
        if (e.getSource()==sA) {
            menu.setVisible(true);
            a.setVisible(false);
            this.getContentPane().add(menu);
            menu.setLayout(null);
        }
        if (e.getSource()==salir) {
            JOptionPane.showMessageDialog(null, "¡¡ADIOOS!!", "", JOptionPane.OK_OPTION, bye);
            System.exit(0);
        }
    }
}
