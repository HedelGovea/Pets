package juego;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Tablero extends JFrame implements ActionListener {
    JLabel arreglo[] = new JLabel[32];
    JButton PosCarta[] = new JButton[4];
    JPanel LuckyP;
    JPanel Tramp;
    JLabel c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, cFin;
    JLabel J1, J2, J3;
    JLabel fondoo,fp;
    JButton salir, dado;
    JButton l1, l2, l3, l4; JButton Br1,Br2,Br3,Br4;
    JButton GH1, GH2, GH3;
    ImageIcon dadoo;
    ImageIcon ini = new ImageIcon("INICIO.png");
    ImageIcon fin = new ImageIcon("FIN.png");
    ImageIcon fondo = new ImageIcon("f.png");
    ImageIcon fpp = new ImageIcon("panel.png");
    ImageIcon s = new ImageIcon("s.png");
    ImageIcon bad = new ImageIcon("bad.png");
    ImageIcon good = new ImageIcon("good.png");
    ImageIcon bunny = new ImageIcon("bunny.png");
    ImageIcon map = new ImageIcon("map.png");
    ImageIcon rana = new ImageIcon("frog.png");
    ImageIcon carta = new ImageIcon("carta.png");
    ImageIcon salirr = new ImageIcon("salir.png");
    JPanel g;
    JLabel ganador;
    ImageIcon g1 = new ImageIcon("g1.png");
    ImageIcon g2 = new ImageIcon("g2.png");
    ImageIcon g3 = new ImageIcon("g3.png");
    String n1, n2, n3;
    int movimientos, jugador1, jugador2, jugador3;
    int ex = 0;
    Color casilla0, casilla1, casilla2, casilla3, casilla4, lucky, especial;
    int x=0, cantidad = 4, rango =4;
    int arre[]= new int [cantidad];
    public Tablero() {
        this.setTitle("Lucky Tab");
        this.setSize(1300, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objetos();
    }

    public void objetos() {
        casilla0 = new Color(87, 197, 252);
        casilla1 = new Color(87, 252, 222);
        casilla2 = new Color(252, 87, 242);
        casilla3 = new Color(220, 87, 252);
        casilla4 = new Color(174, 87, 252);
        lucky = new Color(170, 255, 85);
        especial = new Color(254, 251, 84);
       
        ImageIcon icono = new ImageIcon("icono.png");
        this.setIconImage(icono.getImage());
        
        jugadores();
        
        J1 = new JLabel();
        J1.setBounds(10, 10, 80, 80);
        J1.setOpaque(true);
        J1.setBackground(casilla0);
        J1.setIcon(bunny);
        this.add(J1);

        J2 = new JLabel();
        J2.setBounds(10, 10, 80, 80);
        J2.setOpaque(true);
        J2.setBackground(casilla0);
        J2.setIcon(map);
        this.add(J2);

        J3 = new JLabel();
        J3.setBounds(10, 10, 80, 80);
        J3.setOpaque(true);
        J3.setBackground(casilla0);
        J3.setIcon(rana);
        this.add(J3);

        c0 = new JLabel();
        c0.setBounds(10, 10, 80, 80);
        c0.setOpaque(true);
        c0.setBackground(casilla0);
        c0.setIcon(ini);
        this.add(c0);
        arreglo[0] = c0;

        c1 = new JLabel();
        c1.setBounds(100, 10, 80, 80);
        c1.setOpaque(true);
        c1.setBackground(casilla1);
        this.add(c1);
        arreglo[1] = c1;

        c2 = new JLabel();
        c2.setBounds(190, 10, 80, 80);
        c2.setOpaque(true);
        c2.setBackground(casilla2);
        this.add(c2);
        arreglo[2] = c2;

        c3 = new JLabel();
        c3.setBounds(280, 10, 80, 80);
        c3.setOpaque(true);
        c3.setBackground(casilla3);
        this.add(c3);
        arreglo[3] = c3;

        c4 = new JLabel();
        c4.setBounds(370, 10, 80, 80);
        c4.setOpaque(true);
        c4.setBackground(casilla4);
        this.add(c4);
        arreglo[4] = c4;

        c5 = new JLabel();
        c5.setBounds(460, 10, 80, 80);
        c5.setOpaque(true);
        c5.setBackground(especial);
        c5.setIcon(good);
        this.add(c5);
        arreglo[5] = c5;

        c6 = new JLabel();
        c6.setBounds(550, 10, 80, 80);
        c6.setOpaque(true);
        c6.setBackground(casilla1);
        this.add(c6);
        arreglo[6] = c6;

        c7 = new JLabel();
        c7.setBounds(640, 10, 80, 80);
        c7.setOpaque(true);
        c7.setBackground(casilla2);
        this.add(c7);
        arreglo[7] = c7;

        c8 = new JLabel();
        c8.setBounds(730, 10, 80, 80);
        c8.setOpaque(true);
        c8.setBackground(casilla3);
        this.add(c8);
        arreglo[8] = c8;

        c9 = new JLabel();
        c9.setBounds(820, 10, 80, 80);
        c9.setOpaque(true);
        c9.setBackground(especial);
        c9.setIcon(bad);
        this.add(c9);
        arreglo[9] = c9;

        c10 = new JLabel();
        c10.setBounds(910, 10, 80, 80);
        c10.setOpaque(true);
        c10.setBackground(casilla4);
        this.add(c10);
        arreglo[10] = c10;

        c11 = new JLabel();
        c11.setBounds(1000, 10, 80, 80);
        c11.setOpaque(true);
        c11.setBackground(casilla1);
        this.add(c11);
        arreglo[11] = c11;

        c12 = new JLabel();
        c12.setBounds(1090, 10, 80, 80);
        c12.setOpaque(true);
        c12.setBackground(casilla2);
        this.add(c12);
        arreglo[12] = c12;

        c13 = new JLabel();
        c13.setBounds(1180, 10, 80, 80);
        c13.setOpaque(true);
        c13.setBackground(lucky);
        c13.setIcon(s);
        this.add(c13);
        arreglo[13] = c13;

        c14 = new JLabel();
        c14.setBounds(1180, 100, 80, 80);
        c14.setOpaque(true);
        c14.setBackground(casilla3);
        this.add(c14);
        arreglo[14] = c14;

        c15 = new JLabel();
        c15.setBounds(1180, 190, 80, 80);
        c15.setOpaque(true);
        c15.setBackground(casilla4);
        this.add(c15);
        arreglo[15] = c15;

        c16 = new JLabel();
        c16.setBounds(1180, 280, 80, 80);
        c16.setOpaque(true);
        c16.setBackground(especial);
        c16.setIcon(good);
        this.add(c16);
        arreglo[16] = c16;

        c17 = new JLabel();
        c17.setBounds(1180, 370, 80, 80);
        c17.setOpaque(true);
        c17.setBackground(casilla1);
        this.add(c17);
        arreglo[17] = c17;

        c18 = new JLabel();
        c18.setBounds(1180, 460, 80, 80);
        c18.setOpaque(true);
        c18.setBackground(lucky);
        c18.setIcon(s);
        this.add(c18);
        arreglo[18] = c18;

        c19 = new JLabel();
        c19.setBounds(1090, 460, 80, 80);
        c19.setOpaque(true);
        c19.setBackground(casilla2);
        this.add(c19);
        arreglo[19] = c19;

        c20 = new JLabel();
        c20.setBounds(1000, 460, 80, 80);
        c20.setOpaque(true);
        c20.setBackground(especial);
        c20.setIcon(bad);
        this.add(c20);
        arreglo[20] = c20;

        c21 = new JLabel();
        c21.setBounds(910, 460, 80, 80);
        c21.setOpaque(true);
        c21.setBackground(casilla3);
        this.add(c21);
        arreglo[21] = c21;

        c22 = new JLabel();
        c22.setBounds(820, 460, 80, 80);
        c22.setOpaque(true);
        c22.setBackground(casilla4);
        this.add(c22);
        arreglo[22] = c22;

        c23 = new JLabel();
        c23.setBounds(730, 460, 80, 80);
        c23.setOpaque(true);
        c23.setBackground(casilla1);
        this.add(c23);
        arreglo[23] = c23;

        c24 = new JLabel();
        c24.setBounds(640, 460, 80, 80);
        c24.setOpaque(true);
        c24.setBackground(especial);
        c24.setIcon(good);
        this.add(c24);
        arreglo[24] = c24;

        c25 = new JLabel();
        c25.setBounds(550, 460, 80, 80);
        c25.setOpaque(true);
        c25.setBackground(casilla2);
        this.add(c25);
        arreglo[25] = c25;

        c26 = new JLabel();
        c26.setBounds(460, 460, 80, 80);
        c26.setOpaque(true);
        c26.setBackground(casilla3);
        this.add(c26);
        arreglo[26] = c26;

        c27 = new JLabel();
        c27.setBounds(370, 460, 80, 80);
        c27.setOpaque(true);
        c27.setBackground(casilla4);
        this.add(c27);
        arreglo[27] = c27;

        c28 = new JLabel();
        c28.setBounds(280, 460, 80, 80);
        c28.setOpaque(true);
        c28.setBackground(especial);
        c28.setIcon(bad);
        this.add(c28);
        arreglo[28] = c28;

        c29 = new JLabel();
        c29.setBounds(190, 460, 80, 80);
        c29.setOpaque(true);
        c29.setBackground(casilla1);
        this.add(c29);
        arreglo[29] = c29;

        c30 = new JLabel();
        c30.setBounds(100, 460, 80, 80);
        c30.setOpaque(true);
        c30.setBackground(lucky);
        c30.setIcon(s);
        this.add(c30);
        arreglo[30] = c30;

        cFin = new JLabel();
        cFin.setBounds(10, 460, 80, 80);
        cFin.setOpaque(true);
        cFin.setBackground(casilla0);
        cFin.setIcon(fin);
        this.add(cFin);
        arreglo[31] = cFin;

        dado = new JButton();
        dado.setBounds(1090, 300, 80, 80);
        dadoo = new ImageIcon("cara1.png");
        dado.setIcon(dadoo);
        dado.addActionListener(this);
        this.add(dado);

        salir = new JButton();
        salir.setBounds(1090, 400, 80, 40);
        salir.setIcon(salirr);
        salir.addActionListener(this);
        this.add(salir);

        LuckyP = new JPanel();
        LuckyP.setBounds(300, 120, 600, 300);
        LuckyP.setLayout(null);
        this.add(LuckyP);
        LuckyP.setVisible(false);

        l1 = new JButton();
        l1.setBounds(100, 90, 90, 120);
        l1.setIcon(carta);
        l1.addActionListener(this);
        LuckyP.add(l1);

        l2 = new JButton();
        l2.setBounds(210, 90, 90, 120);
        l2.setIcon(carta);
        l2.addActionListener(this);
        LuckyP.add(l2);

        l3 = new JButton();
        l3.setBounds(320, 90, 90, 120);
        l3.setIcon(carta);
        l3.addActionListener(this);
        LuckyP.add(l3);

        l4 = new JButton();
        l4.setBounds(430, 90, 90, 120);
        l4.setIcon(carta);
        l4.addActionListener(this);
        LuckyP.add(l4);

        fp = new JLabel();
        fp.setBounds(0, 0, 600, 300);
        fp.setIcon(fpp);
        LuckyP.add(fp);
                
        
        Tramp = new JPanel();
        Tramp.setBounds(300, 120, 600, 300);
        Tramp.setLayout(null);
        this.add(Tramp);
        Tramp.setVisible(false);

        GH1 = new JButton();
        GH1.setBounds(100, 90, 120, 120);
        GH1.addActionListener(this);
        GH1.setBackground(lucky);
        GH1.setOpaque(true);
        GH1.setIcon(bunny);
        GH1.setBorder(null);
        Tramp.add(GH1);

        GH2 = new JButton();
        GH2.setBounds(240, 90, 120, 120);
        GH2.addActionListener(this);
        GH2.setBackground(lucky);
        GH2.setOpaque(true);
        GH2.setIcon(map);
        GH2.setBorder(null);
        Tramp.add(GH2);

        GH3 = new JButton();
        GH3.setBounds(380, 90, 120, 120);
        GH3.addActionListener(this);
        GH3.setBackground(lucky);
        GH3.setOpaque(true);
        GH3.setIcon(rana);
        GH3.setBorder(null);
        Tramp.add(GH3);
        
        fp = new JLabel();
        fp.setBounds(0, 0, 600, 300);
        fp.setIcon(fpp);
        Tramp.add(fp);
        
        g = new JPanel();
        g.setBounds(300, 120, 600, 300);
        g.setLayout(null);
        this.add(g);
        g.setVisible(false);
        
        ganador = new JLabel();
        ganador.setBounds(0, 0, 600, 300);
        g.add(ganador);

        fondoo = new JLabel();
        fondoo.setBounds(0, 0, 1300, 600);
        fondoo.setIcon(fondo);
        this.add(fondoo);
        
      
        
    }

   public void revolver(){
        arre[x]= (int)(Math.random()*rango);
        for (int i = 1; i < cantidad; i++) {
            arre[i]= (int)(Math.random()*rango);
            for (int j = 0; j < i; j++) {
                if (arre[i]==arre[j]) {
                    i--;
                }
 
            }
        }
        for (int k = 0; k <cantidad; k++) {
            System.out.println(k+" = "+arre[k]);
        }       
        Br1 = new JButton();
        Br1.setBounds(100, 90, 90, 120);
        PosCarta[arre[0]]=Br1;

        Br2 = new JButton();
        Br2.setBounds(210, 90, 90, 120);
        PosCarta[arre[1]]=Br2;

        Br3 = new JButton();
        Br3.setBounds(320, 90, 90, 120);
        PosCarta[arre[2]]=Br3;

        Br4 = new JButton();
        Br4.setBounds(430, 90, 90, 120);
        PosCarta[arre[3]]=Br4;
        
        l1.setBounds(PosCarta[0].getBounds());
        l2.setBounds(PosCarta[1].getBounds());
        l3.setBounds(PosCarta[2].getBounds());
        l4.setBounds(PosCarta[3].getBounds());
   }
    
    public void DADO() {
        if (movimientos == 1) {
            dadoo = new ImageIcon("cara1.png");
            dado.setIcon(dadoo);
        } else if (movimientos == 2) {
            dadoo = new ImageIcon("cara2.png");
            dado.setIcon(dadoo);
        } else if (movimientos == 3) {
            dadoo = new ImageIcon("cara3.png");
            dado.setIcon(dadoo);
        } else if (movimientos == 4) {
            dadoo = new ImageIcon("cara4.png");
            dado.setIcon(dadoo);
        } else if (movimientos == 5) {
            dadoo = new ImageIcon("cara5.png");
            dado.setIcon(dadoo);
        } else if (movimientos == 6) {
            dadoo = new ImageIcon("cara6.png");
            dado.setIcon(dadoo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (ex) {
            case 0:// caso jugador 1
                ex = 1;
                revolver();
                if (e.getSource() == dado) {
                    movimientos = (int) (((Math.random()) * 60) / 10) + 1;
                    DADO();
                    JOptionPane.showMessageDialog(null, movimientos, "Turno Jugador 1", JOptionPane.DEFAULT_OPTION, bunny);
                    jugador1 = jugador1 + movimientos;
                    if (jugador1 > 31) {
                        jugador1 = 31;
                    }
                    switch (jugador1) {
                        case 0:
                            J1.setBackground(c0.getBackground());
                            J1.setBounds(c0.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 1:
                            J1.setBackground(c1.getBackground());
                            J1.setBounds(c1.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 2:
                            J1.setBackground(c2.getBackground());
                            J1.setBounds(c2.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 3:
                            J1.setBackground(c3.getBackground());
                            J1.setBounds(c3.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 4:
                            J1.setBackground(c4.getBackground());
                            J1.setBounds(c4.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 5:
                            J1.setBackground(c5.getBackground());
                            J1.setBounds(c5.getBounds());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J1.setBackground(c8.getBackground());
                            J1.setBounds(c8.getBounds());
                            jugador1 = jugador1+3;
                            break;
                        case 6:
                            J1.setBackground(c6.getBackground());
                            J1.setBounds(c6.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 7:
                            J1.setBounds(c7.getBounds());
                            J1.setBackground(c7.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 8:
                            J1.setBounds(c8.getBounds());
                            J1.setBackground(c8.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 9:
                            J1.setBounds(c9.getBounds());
                            J1.setBackground(c9.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J1.setBounds(c6.getBounds());
                            J1.setBackground(c6.getBackground());
                            jugador1 = jugador1 - 3;
                            break;
                        case 10:
                            J1.setBounds(c10.getBounds());
                            J1.setBackground(c10.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 11:
                            J1.setBounds(c11.getBounds());
                            J1.setBackground(c11.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 12:
                            J1.setBounds(c12.getBounds());
                            J1.setBackground(c12.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 13:
                            J1.setBounds(c13.getBounds());
                            J1.setBackground(c13.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 14:
                            J1.setBounds(c14.getBounds());
                            J1.setBackground(c14.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 15:
                            J1.setBounds(c15.getBounds());
                            J1.setBackground(c15.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 16:
                            J1.setBounds(c16.getBounds());
                            J1.setBackground(c16.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J1.setBounds(c19.getBounds());
                            J1.setBackground(c19.getBackground());
                            jugador1 = jugador1 + 3;
                            break;
                        case 17:
                            J1.setBounds(c17.getBounds());
                            J1.setBackground(c17.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 18:
                            J1.setBounds(c18.getBounds());
                            J1.setBackground(c18.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 19:
                            J1.setBounds(c19.getBounds());
                            J1.setBackground(c19.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 20:
                            J1.setBounds(c20.getBounds());
                            J1.setBackground(c20.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J1.setBounds(c17.getBounds());
                            J1.setBackground(c17.getBackground());
                            jugador1 = jugador1 - 3;
                            break;
                        case 21:
                            J1.setBounds(c21.getBounds());
                            J1.setBackground(c21.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 22:
                            J1.setBounds(c22.getBounds());
                            J1.setBackground(c22.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 23:
                            J1.setBounds(c23.getBounds());
                            J1.setBackground(c23.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 24:
                            J1.setBounds(c24.getBounds());
                            J1.setBackground(c24.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J1.setBounds(c27.getBounds());
                            J1.setBackground(c27.getBackground());
                            jugador1 = jugador1 + 3;
                            break;
                        case 25:
                            J1.setBounds(c25.getBounds());
                            J1.setBackground(c25.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 26:
                            J1.setBounds(c26.getBounds());
                            J1.setBackground(c26.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 27:
                            J1.setBounds(c27.getBounds());
                            J1.setBackground(c27.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 28:
                            J1.setBounds(c28.getBounds());
                            J1.setBackground(c28.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J1.setBounds(c25.getBounds());
                            J1.setBackground(c25.getBackground());
                            jugador1 = jugador1 - 3;
                            break;
                        case 29:
                            J1.setBounds(c29.getBounds());
                            J1.setBackground(c29.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 30:
                            J1.setBounds(c30.getBounds());
                            J1.setBackground(c30.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 31:
                            LuckyP.setVisible(false);
                            J1.setBounds(cFin.getBounds());
                            J1.setBackground(cFin.getBackground());
                            dado.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "FELICIDADES " + n1 + " :D\nGANASTE!!", "GANADOR", JOptionPane.DEFAULT_OPTION, bunny);
                            ganador.setIcon(g1);
                            g.setVisible(true);
                            break;
                    }
                } else {
                    ex = 0;
                }
                break;//fin caso jugador 1
            case 1:// inicio caso jugardor 2
                ex = 2;
                revolver();
                if (e.getSource() == dado) {
                    movimientos = (int) (((Math.random()) * 60) / 10) + 1;
                    DADO();
                    JOptionPane.showMessageDialog(null, movimientos, "Turno Jugador 2", JOptionPane.DEFAULT_OPTION, map);
                    jugador2 = jugador2 + movimientos;
                    if (jugador2 > 31) {
                        jugador2 = 31;
                    }
                    switch (jugador2) {
                        case 0:
                            J2.setBackground(c0.getBackground());
                            J2.setBounds(c0.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 1:
                            J2.setBackground(c1.getBackground());
                            J2.setBounds(c1.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 2:
                            J2.setBackground(c2.getBackground());
                            J2.setBounds(c2.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 3:
                            J2.setBounds(c3.getBounds());
                            J2.setBackground(c3.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 4:
                            J2.setBackground(c4.getBackground());
                            J2.setBounds(c4.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 5:
                            J2.setBackground(c5.getBackground());
                            J2.setBounds(c5.getBounds());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J2.setBackground(c8.getBackground());
                            J2.setBounds(c8.getBounds());
                            jugador2 = jugador2+3;
                            break;
                        case 6:
                            J2.setBackground(c6.getBackground());
                            J2.setBounds(c6.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 7:
                            J2.setBounds(c7.getBounds());
                            J2.setBackground(c7.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 8:
                            J2.setBounds(c8.getBounds());
                            J2.setBackground(c8.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 9:
                            J2.setBounds(c9.getBounds());
                            J2.setBackground(c9.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J2.setBounds(c6.getBounds());
                            J2.setBackground(c6.getBackground());
                            jugador2 = jugador2 - 3;
                            break;
                        case 10:
                            J2.setBounds(c10.getBounds());
                            J2.setBackground(c10.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 11:
                            J2.setBounds(c11.getBounds());
                            J2.setBackground(c11.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 12:
                            J2.setBounds(c12.getBounds());
                            J2.setBackground(c12.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 13:
                            J2.setBounds(c13.getBounds());
                            J2.setBackground(c13.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 14:
                            J2.setBounds(c14.getBounds());
                            J2.setBackground(c14.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 15:
                            J2.setBounds(c15.getBounds());
                            J2.setBackground(c15.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 16:
                            J2.setBounds(c16.getBounds());
                            J2.setBackground(c16.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J2.setBounds(c19.getBounds());
                            J2.setBackground(c19.getBackground());
                            jugador2 = jugador2 + 3;
                            break;
                        case 17:
                            J2.setBounds(c17.getBounds());
                            J2.setBackground(c17.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 18:
                            J2.setBounds(c18.getBounds());
                            J2.setBackground(c18.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 19:
                            J2.setBounds(c19.getBounds());
                            J2.setBackground(c19.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 20:
                            J2.setBounds(c20.getBounds());
                            J2.setBackground(c20.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J2.setBounds(c17.getBounds());
                            J2.setBackground(c17.getBackground());
                            jugador2 = jugador2 - 3;
                            break;
                        case 21:
                            J2.setBounds(c21.getBounds());
                            J2.setBackground(c21.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 22:
                            J2.setBounds(c22.getBounds());
                            J2.setBackground(c22.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 23:
                            J2.setBounds(c23.getBounds());
                            J2.setBackground(c23.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 24:
                            J2.setBounds(c24.getBounds());
                            J2.setBackground(c24.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J2.setBounds(c27.getBounds());
                            J2.setBackground(c27.getBackground());
                            jugador2 = jugador2 + 3;
                            break;
                        case 25:
                            J2.setBounds(c25.getBounds());
                            J2.setBackground(c25.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 26:
                            J2.setBounds(c26.getBounds());
                            J2.setBackground(c26.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 27:
                            J2.setBounds(c27.getBounds());
                            J2.setBackground(c27.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 28:
                            J2.setBounds(c28.getBounds());
                            J2.setBackground(c28.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J2.setBounds(c25.getBounds());
                            J2.setBackground(c25.getBackground());
                            jugador2 = jugador2 - 3;
                            break;
                        case 29:
                            J2.setBounds(c29.getBounds());
                            J2.setBackground(c29.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 30:
                            J2.setBounds(c30.getBounds());
                            J2.setBackground(c30.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 31:
                            LuckyP.setVisible(false);
                            J2.setBounds(cFin.getBounds());
                            J2.setBackground(cFin.getBackground());
                            dado.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "FELICIDADES " + n2 + " :D\nGANASTE!!", "GANADOR", JOptionPane.DEFAULT_OPTION, map);
                            ganador.setIcon(g2);
                            g.setVisible(true);
                            break;
                    }
                } else {
                    ex = 1;
                }

                break;// fin caso jugador 2
            case 2://inicio caso juagdor 3
                ex = 0;
                revolver();
                if (e.getSource() == dado) {
                    movimientos = (int) (((Math.random()) * 60) / 10) + 1;
                    DADO();
                    JOptionPane.showMessageDialog(null, movimientos, "Turno Jugador 3", JOptionPane.DEFAULT_OPTION, rana);
                    jugador3 = jugador3 + movimientos;
                    if (jugador3 > 31) {
                        jugador3 = 31;
                    }
                    switch (jugador3) {
                        case 0:
                            J3.setBackground(c0.getBackground());
                            J3.setBounds(c0.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 1:
                            J3.setBackground(c1.getBackground());
                            J3.setBounds(c1.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 2:
                            J3.setBackground(c2.getBackground());
                            J3.setBounds(c2.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 3:
                            J3.setBackground(c3.getBackground());
                            J3.setBounds(c3.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 4:
                            J3.setBackground(c4.getBackground());
                            J3.setBounds(c4.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 5:
                            J3.setBackground(c5.getBackground());
                            J3.setBounds(c5.getBounds());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J3.setBackground(c8.getBackground());
                            J3.setBounds(c8.getBounds());
                            jugador3 = jugador3+3;
                            break;
                        case 6:
                            J3.setBackground(c6.getBackground());
                            J3.setBounds(c6.getBounds());
                            LuckyP.setVisible(false);
                            break;
                        case 7:
                            J3.setBounds(c7.getBounds());
                            J3.setBackground(c7.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 8:
                            J3.setBounds(c8.getBounds());
                            J3.setBackground(c8.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 9:
                            J3.setBounds(c9.getBounds());
                            J3.setBackground(c9.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J3.setBounds(c6.getBounds());
                            J3.setBackground(c6.getBackground());
                            jugador3 = jugador3 - 3;
                            break;
                        case 10:
                            J3.setBounds(c10.getBounds());
                            J3.setBackground(c10.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 11:
                            J3.setBounds(c11.getBounds());
                            J3.setBackground(c11.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 12:
                            J3.setBounds(c12.getBounds());
                            J3.setBackground(c12.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 13:
                            J3.setBounds(c13.getBounds());
                            J3.setBackground(c13.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 14:
                            J3.setBounds(c14.getBounds());
                            J3.setBackground(c14.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 15:
                            J3.setBounds(c15.getBounds());
                            J3.setBackground(c15.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 16:
                            J3.setBounds(c16.getBounds());
                            J3.setBackground(c16.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J3.setBounds(c19.getBounds());
                            J3.setBackground(c19.getBackground());
                            jugador3 = jugador3 + 3;
                            break;
                        case 17:
                            J3.setBounds(c17.getBounds());
                            J3.setBackground(c17.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 18:
                            J3.setBounds(c18.getBounds());
                            J3.setBackground(c18.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 19:
                            J3.setBounds(c19.getBounds());
                            J3.setBackground(c19.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 20:
                            J3.setBounds(c20.getBounds());
                            J3.setBackground(c20.getBackground());                            
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J3.setBounds(c17.getBounds());
                            J3.setBackground(c17.getBackground());
                            jugador3 = jugador3 - 3;
                            break;
                        case 21:
                            J3.setBounds(c21.getBounds());
                            J3.setBackground(c21.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 22:
                            J3.setBounds(c22.getBounds());
                            J3.setBackground(c22.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 23:
                            J3.setBounds(c23.getBounds());
                            J3.setBackground(c23.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 24:
                            J3.setBounds(c24.getBounds());
                            J3.setBackground(c24.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "AVANZAS 3 CASILLAS", "GOOD LUCKY", JOptionPane.DEFAULT_OPTION, good);
                            J3.setBounds(c27.getBounds());
                            J3.setBackground(c27.getBackground());
                            jugador3 = jugador3 + 3;
                            break;
                        case 25:
                            J3.setBounds(c25.getBounds());
                            J3.setBackground(c25.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 26:
                            J3.setBounds(c26.getBounds());
                            J3.setBackground(c26.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 27:
                            J3.setBounds(c27.getBounds());
                            J3.setBackground(c27.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 28:
                            J3.setBounds(c28.getBounds());
                            J3.setBackground(c28.getBackground());
                            LuckyP.setVisible(false);
                            JOptionPane.showMessageDialog(null, "RETROCEDES 3 CASILLAS", "BAD LUCKY", JOptionPane.DEFAULT_OPTION, bad);
                            J3.setBounds(c25.getBounds());
                            J3.setBackground(c25.getBackground());
                            jugador3 = jugador3 - 3;
                            break;
                        case 29:
                            J3.setBounds(c29.getBounds());
                            J3.setBackground(c29.getBackground());
                            LuckyP.setVisible(false);
                            break;
                        case 30:
                            J3.setBounds(c30.getBounds());
                            J3.setBackground(c30.getBackground());
                            LuckyP.setVisible(true);
                            break;
                        case 31:
                            LuckyP.setVisible(false);
                            J3.setBounds(cFin.getBounds());
                            J3.setBackground(cFin.getBackground());
                            dado.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "FELICIDADES " + n3 + " :D\nGANASTE!!", "GANADOR", JOptionPane.DEFAULT_OPTION, rana);
                            ganador.setIcon(g3);
                            g.setVisible(true);
                            break;
                    }
                } else {
                    ex = 2;
                }
                break;// fin caso jugador 3         
            }
        if (e.getSource() == l1) {
            if (jugador1 == 13 || jugador1 == 18 || jugador1 == 30) {
                jugador1 = 31;
                J1.setBounds(cFin.getBounds());
                J1.setBackground(casilla0);
                dado.setEnabled(false);
                JOptionPane.showMessageDialog(null, "FELICIDADES " + n1 + " :D\nGANASTE!!", "GANADOR", JOptionPane.DEFAULT_OPTION, bunny);
                ganador.setIcon(g1);
                g.setVisible(true);
            }
            if (jugador2 == 13 || jugador2 == 18 || jugador2 == 30) {
                jugador2 = 31;
                J2.setBounds(cFin.getBounds());
                J2.setBackground(casilla0);
                dado.setEnabled(false);
                JOptionPane.showMessageDialog(null, "FELICIDADES " + n2 + " :D\nGANASTE!!", "GANADOR", JOptionPane.DEFAULT_OPTION, map);
                ganador.setIcon(g2);
                g.setVisible(true);
            }
            if (jugador3 == 13 || jugador3 == 18 || jugador3 == 30) {
                jugador3 = 31;
                J3.setBounds(cFin.getBounds());
                J3.setBackground(casilla0);
                dado.setEnabled(false);
                JOptionPane.showMessageDialog(null, "FELICIDADES " + n3 + " :D\nGANASTE!!", "GANADOR", JOptionPane.DEFAULT_OPTION, rana);
                ganador.setIcon(g3);
                g.setVisible(true);
            }
            LuckyP.setVisible(false);

        }
        if (e.getSource() == l2) {
            JOptionPane.showMessageDialog(null, "REGRESAS AL INICIO", "SUERTE", JOptionPane.DEFAULT_OPTION, s);
            if (jugador1 == 13 || jugador1 == 18 || jugador1 == 30 ) {
                jugador1 = 0;
                J1.setBounds(c0.getBounds());
                J1.setBackground(casilla0);

            }
            if (jugador2 == 13 || jugador2 == 18 || jugador2 == 30 ) {
                jugador2 = 0;
                J2.setBounds(c0.getBounds());
                J2.setBackground(casilla0);

            }
            if (jugador3 == 13 || jugador3 == 18 || jugador3 == 30 ) {
                jugador3 = 0;
                J3.setBounds(c0.getBounds());
                J3.setBackground(casilla0);

            }
            LuckyP.setVisible(false);

        }
        if (e.getSource() == l3) {
            JOptionPane.showMessageDialog(null, "ESCOGE A QUE JUGADOR MANDAR AL INICIO", "SUERTE", JOptionPane.DEFAULT_OPTION, s);
            LuckyP.setVisible(false);

            if (jugador1 == 13 || jugador1 == 18 || jugador1 == 30 ) {
                Tramp.setVisible(true);

            }
            if (jugador2 == 13 || jugador2 == 18 || jugador2 == 30 ) {
                Tramp.setVisible(true);

            }
            if (jugador3 == 13 || jugador3 == 18 || jugador3 == 30 ) {

                Tramp.setVisible(true);

            }
            //l2.setEnabled(false);

        }

        if (e.getSource() == l4) {
            JOptionPane.showMessageDialog(null, "RETROCEDES 10 CASILLAS", "SUERTE", JOptionPane.DEFAULT_OPTION, s);
            if (jugador1 == 13 || jugador1 == 18 || jugador1 == 30 ) {
                if (jugador1 <= 10) {
                    jugador1 = 0;
                    J1.setBounds(c0.getBounds());
                    J1.setBackground(casilla0);
                } else {
                    System.out.println(jugador1);
                    jugador1 = jugador1 - 10;
                    System.out.println(jugador1);

                    J1.setBounds(arreglo[jugador1].getBounds());
                    J1.setBackground(arreglo[jugador1].getBackground());

                }
            }
            if (jugador2 == 13 || jugador2 == 18 || jugador2 == 30 ) {
                if (jugador2 <= 10) {
                    jugador2 = 0;
                    J2.setBounds(c0.getBounds());
                    J2.setBackground(casilla0);
                } else {
                    System.out.println(jugador2);
                    jugador2 = jugador2 - 10;
                    System.out.println(jugador2);

                    J2.setBounds(arreglo[jugador2].getBounds());
                    J2.setBackground(arreglo[jugador2].getBackground());

                }

            }
            if (jugador3 == 13 || jugador3 == 18 || jugador3 == 30 ) {
                if (jugador3 <= 10) {
                    jugador3 = 0;
                    J3.setBounds(c0.getBounds());
                    J3.setBackground(casilla0);
                } else {
                    System.out.println(jugador1);
                    jugador3 = jugador3 - 10;
                    System.out.println(jugador3);

                    J3.setBounds(arreglo[jugador3].getBounds());
                    J3.setBackground(arreglo[jugador3].getBackground());

                }

            }
            LuckyP.setVisible(false);
        }

        if (e.getSource() == GH1) {
            jugador1 = 0;
            J1.setBounds(c0.getBounds());
            J1.setBackground(casilla0);
            Tramp.setVisible(false);
        }

        if (e.getSource() == GH2) {
            jugador2 = 0;
            J2.setBounds(c0.getBounds());
            J2.setBackground(casilla0);
            Tramp.setVisible(false);
        }
        if (e.getSource() == GH3) {
            jugador3 = 0;
            J3.setBounds(c0.getBounds());
            J3.setBackground(casilla0);
            Tramp.setVisible(false);
        }
        if (e.getSource() == salir) {
            Menu ventana = new Menu();
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }
    public void jugadores(){
        JOptionPane.showMessageDialog(null, "INGRESA LOS NOMBRES DE LOS 3 JUGADORES :D");        
        n1 = JOptionPane.showInputDialog(null, "Ingresa nombre del jugador 1", "JUGADORES", -1);
        JOptionPane.showMessageDialog(null, n1, "PERSONAJE", -1, bunny);
        n2 = JOptionPane.showInputDialog(null, "Ingresa nombre del jugador 2", "JUGADORES", -1);
        JOptionPane.showMessageDialog(null, n2, "PERSONAJE", -1, map);
        n3 = JOptionPane.showInputDialog(null, "Ingresa nombre del jugador 3", "JUGADORES", -1);         
        JOptionPane.showMessageDialog(null, n3, "PERSONAJE", -1, rana);
    }
}
