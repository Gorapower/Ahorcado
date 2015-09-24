package ahorcado.pkg2.pkg0;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.Cursor;
/**
 *
 * @author Alexis
 */
public class Ahorcado20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         new main2 () .show();
    }
    //Clase para el inicio del programa, el menu
    public static class main2 extends javax.swing.JFrame {

    //ventana main
    public main2() {
        initComponents();
        abrir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confi.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    //iniciar componentes                   
    private void initComponents() {

        dif = new javax.swing.JTextField();
        abrir = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        confi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dogecado");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        dif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dif.setText("1-4");
        getContentPane().add(dif);
        dif.setBounds(270, 210, 60, 20);

        abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirMouseClicked(evt);
            }
        });
        getContentPane().add(abrir);
        abrir.setBounds(240, 230, 120, 30);

        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(cerrar);
        cerrar.setBounds(240, 300, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("By: Alfredo Alexis Gonzalez R.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 370, 370, 30);

        confi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confiMouseClicked(evt);
            }
        });
        getContentPane().add(confi);
        confi.setBounds(190, 270, 210, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/pkg2/pkg0/television-bart.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 419);

        setSize(new java.awt.Dimension(618, 457));
        setLocationRelativeTo(null);
    }

    private void abrirMouseClicked(java.awt.event.MouseEvent evt) {                                   
        new juego () .show();
        this.setVisible(false);
    }                                  

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {                                    
        System.exit(0);
    }                                   

    private void confiMouseClicked(java.awt.event.MouseEvent evt) {                                   
      new configuracion () .show();
      this.setVisible(false);
      JOptionPane.showMessageDialog(null, "Todos los cambio que realize se guardaran al regresar al menu");
    }  
      
    public static void main2 (String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main2().setVisible(true);
            }
        });
    }
    // Declarar variables                    
    private javax.swing.JLabel abrir;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel confi;
    public static javax.swing.JTextField dif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // fin de la declaracion                   
}
    //Clase para el juego
    public static class juego extends javax.swing.JFrame {

  //inicia el juego
    public juego() {
        
        initComponents();
        lvl.setText(main2.dif.getText());
        lvl2.setText(lvl.getText());
        archivo();
        elegida();
    }

    //inicializar componentes                        
    private void initComponents() {

        lvl = new javax.swing.JTextField();
        ahor = new javax.swing.JLabel();
        Pav = new javax.swing.JLabel();
        La = new javax.swing.JLabel();
        Lb = new javax.swing.JLabel();
        Lc = new javax.swing.JLabel();
        Ld = new javax.swing.JLabel();
        Le = new javax.swing.JLabel();
        Lf = new javax.swing.JLabel();
        Lg = new javax.swing.JLabel();
        Lh = new javax.swing.JLabel();
        Li = new javax.swing.JLabel();
        Lj = new javax.swing.JLabel();
        Lk = new javax.swing.JLabel();
        Ll = new javax.swing.JLabel();
        Lm = new javax.swing.JLabel();
        Lz = new javax.swing.JLabel();
        Lx = new javax.swing.JLabel();
        Ly = new javax.swing.JLabel();
        Lv = new javax.swing.JLabel();
        Lw = new javax.swing.JLabel();
        Lt = new javax.swing.JLabel();
        Lu = new javax.swing.JLabel();
        Ls = new javax.swing.JLabel();
        Lp = new javax.swing.JLabel();
        Lo = new javax.swing.JLabel();
        Ln = new javax.swing.JLabel();
        Lr = new javax.swing.JLabel();
        Lq = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        letra = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lvl2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Aciertos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jlabel1 = new javax.swing.JLabel();
        PISTA = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fallos = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lvl.setText("1");
        getContentPane().add(lvl);
        lvl.setBounds(439, 290, 70, 20);

        ahor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/pkg2/pkg0/a0.jpg")));
        getContentPane().add(ahor);
        ahor.setBounds(170, 40, 150, 207);

        Pav.setFont(new java.awt.Font("Arial", 0, 40));
        Pav.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Pav);
        Pav.setBounds(20, 260, 410, 43);

        La.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        La.setText("A");
        getContentPane().add(La);
        La.setBounds(25, 321, 20, 28);

        Lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb.setText("B");
        getContentPane().add(Lb);
        Lb.setBounds(55, 321, 20, 28);

        Lc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lc.setText("C");
        getContentPane().add(Lc);
        Lc.setBounds(85, 321, 20, 28);

        Ld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ld.setText("D");
        getContentPane().add(Ld);
        Ld.setBounds(115, 321, 20, 28);

        Le.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Le.setText("E");
        getContentPane().add(Le);
        Le.setBounds(145, 321, 20, 28);

        Lf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lf.setText("F");
        getContentPane().add(Lf);
        Lf.setBounds(175, 321, 20, 28);

        Lg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lg.setText("G");
        getContentPane().add(Lg);
        Lg.setBounds(205, 321, 20, 28);

        Lh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lh.setText("H");
        getContentPane().add(Lh);
        Lh.setBounds(235, 321, 20, 28);

        Li.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Li.setText("I");
        getContentPane().add(Li);
        Li.setBounds(265, 321, 20, 28);

        Lj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lj.setText("J");
        getContentPane().add(Lj);
        Lj.setBounds(295, 321, 20, 28);

        Lk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lk.setText("K");
        getContentPane().add(Lk);
        Lk.setBounds(325, 321, 20, 28);

        Ll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ll.setText("L");
        getContentPane().add(Ll);
        Ll.setBounds(355, 321, 20, 28);

        Lm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lm.setText("M");
        getContentPane().add(Lm);
        Lm.setBounds(385, 321, 20, 28);

        Lz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lz.setText("Z");
        getContentPane().add(Lz);
        Lz.setBounds(385, 360, 20, 28);

        Lx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lx.setText("X");
        getContentPane().add(Lx);
        Lx.setBounds(325, 360, 20, 28);

        Ly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ly.setText("Y");
        getContentPane().add(Ly);
        Ly.setBounds(355, 360, 20, 28);

        Lv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lv.setText("V");
        getContentPane().add(Lv);
        Lv.setBounds(265, 360, 20, 28);

        Lw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lw.setText("W");
        getContentPane().add(Lw);
        Lw.setBounds(295, 360, 20, 28);

        Lt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lt.setText("T");
        getContentPane().add(Lt);
        Lt.setBounds(205, 360, 20, 28);

        Lu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lu.setText("U");
        getContentPane().add(Lu);
        Lu.setBounds(235, 360, 20, 28);

        Ls.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ls.setText("S");
        getContentPane().add(Ls);
        Ls.setBounds(175, 360, 20, 28);

        Lp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lp.setText("P");
        getContentPane().add(Lp);
        Lp.setBounds(85, 360, 20, 28);

        Lo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lo.setText("O");
        getContentPane().add(Lo);
        Lo.setBounds(55, 360, 20, 28);

        Ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ln.setText("N");
        getContentPane().add(Ln);
        Ln.setBounds(25, 360, 20, 28);

        Lr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lr.setText("R");
        getContentPane().add(Lr);
        Lr.setBounds(145, 360, 20, 28);

        Lq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lq.setText("Q");
        getContentPane().add(Lq);
        Lq.setBounds(115, 360, 20, 28);

        jButton1.setText("Sumit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 380, 70, 23);
        getContentPane().add(letra);
        letra.setBounds(439, 350, 70, 20);

        jButton2.setText("cambiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 320, 90, 23);

        lvl2.setFont(new java.awt.Font("Tahoma", 1, 12));
        lvl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvl2.setText("1");
        getContentPane().add(lvl2);
        lvl2.setBounds(430, 130, 50, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fallos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 160, 50, 30);

        Aciertos.setFont(new java.awt.Font("Tahoma", 1, 12));
        Aciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aciertos.setText("0");
        getContentPane().add(Aciertos);
        Aciertos.setBounds(430, 70, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Dificultad");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 250, 70, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setText("Dificultad");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 100, 70, 30);

        Jlabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        Jlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlabel1.setText("Pista");
        getContentPane().add(Jlabel1);
        Jlabel1.setBounds(40, 160, 50, 20);

        PISTA.setFont(new java.awt.Font("Tahoma", 0, 10));
        getContentPane().add(PISTA);
        PISTA.setBounds(20, 190, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Aciertos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 40, 50, 30);

        Fallos.setFont(new java.awt.Font("Tahoma", 1, 12));
        Fallos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fallos.setText("0");
        getContentPane().add(Fallos);
        Fallos.setBounds(430, 200, 50, 30);

        jButton3.setText("terminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(433, 410, 80, 23);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/pkg2/pkg0/pizarron.jpg")));
        getContentPane().add(back);
        back.setBounds(0, -10, 540, 460);

        setSize(new java.awt.Dimension(553, 493));
        setLocationRelativeTo(null);
    }                 
    //llama el metodo sumit
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        sumit();
    }                                        
    //llama el metodo cambiar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        cambiar();
    }                                        
    //termina el juego y cierra la ventana
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JOptionPane.showMessageDialog(null, "El juego ha termiando tuviste "+ Aciertos.getText()+" Aciertos y "+Fallos.getText()+" Fallos");
        this.setVisible(false);
        new main2 () .show();
        DatosJ.cantidad=0;
        DatosJ.error=0;
        DatosJ.faltan=0;
        DatosJ.letras.clear();
        DatosJ.longitud=0;
        DatosJ.palabra="";
        DatosJ.palabras.clear();
        DatosJ.pistas.clear();
        DatosJ.uso.clear();
    }                                        

    //main de juego
    public static void main (String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }
    // declaracion de variables                   
    private javax.swing.JLabel Aciertos;
    private javax.swing.JLabel Fallos;
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JLabel La;
    private javax.swing.JLabel Lb;
    private javax.swing.JLabel Lc;
    private javax.swing.JLabel Ld;
    private javax.swing.JLabel Le;
    private javax.swing.JLabel Lf;
    private javax.swing.JLabel Lg;
    private javax.swing.JLabel Lh;
    private javax.swing.JLabel Li;
    private javax.swing.JLabel Lj;
    private javax.swing.JLabel Lk;
    private javax.swing.JLabel Ll;
    private javax.swing.JLabel Lm;
    private javax.swing.JLabel Ln;
    private javax.swing.JLabel Lo;
    private javax.swing.JLabel Lp;
    private javax.swing.JLabel Lq;
    private javax.swing.JLabel Lr;
    private javax.swing.JLabel Ls;
    private javax.swing.JLabel Lt;
    private javax.swing.JLabel Lu;
    private javax.swing.JLabel Lv;
    private javax.swing.JLabel Lw;
    private javax.swing.JLabel Lx;
    private javax.swing.JLabel Ly;
    private javax.swing.JLabel Lz;
    private javax.swing.JLabel PISTA;
    private javax.swing.JLabel Pav;
    private javax.swing.JLabel ahor;
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField letra;
    public static javax.swing.JTextField lvl;
    private javax.swing.JLabel lvl2;
    
/** lee el archivo, para obtener la las pistas y palabras del nivel seleccionado */
    public final void archivo() {
        int nivel = Integer.parseInt(lvl2.getText());
        int x=0;
        try
	{
            InputStream palabras =getClass().getResourceAsStream("/ahorcado/pkg2/pkg0/Palabras.txt");
            Scanner in = new Scanner(palabras);
            while(in.hasNextLine())
            {
                if(nivel==4)
                {
                    in.nextLine();
                    DatosJ.pistas.add(in.nextLine());
                    DatosJ.palabras.add(in.nextLine());
                }
                else
                {
                    x=Integer.parseInt(in.nextLine());
                    if(x==nivel)
                    {
                        DatosJ.pistas.add(in.nextLine());
                        DatosJ.palabras.add(in.nextLine());
                    }
                    else
                    {
                        in.nextLine();
                        in.nextLine();
                    }
                }
             }
        }
	catch (Exception e){}
        int total = DatosJ.pistas.size();
        for(int i=0;i<total;i++)
        {
            DatosJ.uso.add(0);
        }
    }
/** revisa las palabras y pistas, genera un numero al azar, revisa que no se repita 
 * y si ese no es el caso, selecciona esa palabra y pista para imprimirlas en los labels */
    public final void elegida(){
        boolean encontrar=false;
        int esta=0;
        int total = DatosJ.pistas.size();
        while(encontrar==false)
        {
            esta = (int) Math.round((Math.random()*(total-1)));
            
            if(DatosJ.uso.get(esta)!=1)
            {
                DatosJ.uso.set(esta, 1);
                encontrar=true;
            }
        }
        DatosJ.palabra = DatosJ.palabras.get(esta);
        PISTA.setText(DatosJ.pistas.get(esta));
        StringBuilder guion = new StringBuilder();
        DatosJ.longitud = DatosJ.palabra.length();
        for(int i=0;i<DatosJ.longitud;i++)
        {
            guion.append("-");
        }
        Pav.setText(guion.toString());
        DatosJ.faltan = DatosJ.longitud;
        
    }
/** En caso de que una letra sea correcta,buscara esa letra en los labels que
 * se pueden observar en el juego y lo pintara de verde.
 * @param y vector de byes
 */
    private void correcto(byte[] y) {
        int a = y[0]-96;
        if (a==1)
        {
            La.setOpaque(true);
            La.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==2)
        {
            Lb.setOpaque(true);
            Lb.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==3)
        {
            Lc.setOpaque(true);
            Lc.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==4)
        {
            Ld.setOpaque(true);
            Ld.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==5)
        {
            Le.setOpaque(true);
            Le.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==6)
        {
            Lf.setOpaque(true);
            Lf.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==7)
        {
            Lg.setOpaque(true);
            Lg.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==8)
        {
            Lh.setOpaque(true);
            Lh.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==9)
        {
            Li.setOpaque(true);
            Li.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==10)
        {
            Lj.setOpaque(true);
            Lj.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==11)
        {
            Lk.setOpaque(true);
            Lk.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==12)
        {
            Ll.setOpaque(true);
            Ll.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==13)
        {
            Lm.setOpaque(true);
            Lm.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==14)
        {
            Ln.setOpaque(true);
            Ln.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==15)
        {
            Lo.setOpaque(true);
            Lo.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==16)
        {
            Lp.setOpaque(true);
            Lp.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==17)
        {
            Lq.setOpaque(true);
            Lq.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==18)
        {
            Lr.setOpaque(true);
            Lr.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==19)
        {
            Ls.setOpaque(true);
            Ls.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==20)
        {
            Lt.setOpaque(true);
            Lt.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==21)
        {
            Lu.setOpaque(true);
            Lu.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==22)
        {
            Lv.setOpaque(true);
            Lv.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==23)
        {
            Lw.setOpaque(true);
            Lw.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==24)
        {
            Lx.setOpaque(true);
            Lx.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==25)
        {
            Ly.setOpaque(true);
            Ly.setBackground(new java.awt.Color(0, 255, 0));
        }
        if (a==26)
        {
            Lz.setOpaque(true);
            Lz.setBackground(new java.awt.Color(0, 255, 0));
        }
    }
/** En caso de que una letra sea incorrecta,buscara esa letra en los labels que
 * se pueden observar en el juego y lo pintara de rojo.
 *  @param y vector de byes
 */
    private void incorrecto(byte[] y) {
        int a = y[0]-96;
        if (a==1)
        {
            La.setOpaque(true);
            La.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==2)
        {
            Lb.setOpaque(true);
            Lb.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==3)
        {
            Lc.setOpaque(true);
            Lc.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==4)
        {
            Ld.setOpaque(true);
            Ld.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==5)
        {
            Le.setOpaque(true);
            Le.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==6)
        {
            Lf.setOpaque(true);
            Lf.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==7)
        {
            Lg.setOpaque(true);
            Lg.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==8)
        {
            Lh.setOpaque(true);
            Lh.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==9)
        {
            Li.setOpaque(true);
            Li.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==10)
        {
            Lj.setOpaque(true);
            Lj.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==11)
        {
            Lk.setOpaque(true);
            Lk.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==12)
        {
            Ll.setOpaque(true);
            Ll.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==13)
        {
            Lm.setOpaque(true);
            Lm.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==14)
        {
            Ln.setOpaque(true);
            Ln.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==15)
        {
            Lo.setOpaque(true);
            Lo.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==16)
        {
            Lp.setOpaque(true);
            Lp.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==17)
        {
            Lq.setOpaque(true);
            Lq.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==18)
        {
            Lr.setOpaque(true);
            Lr.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==19)
        {
            Ls.setOpaque(true);
            Ls.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==20)
        {
            Lt.setOpaque(true);
            Lt.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==21)
        {
            Lu.setOpaque(true);
            Lu.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==22)
        {
            Lv.setOpaque(true);
            Lv.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==23)
        {
            Lw.setOpaque(true);
            Lw.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==24)
        {
            Lx.setOpaque(true);
            Lx.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==25)
        {
            Ly.setOpaque(true);
            Ly.setBackground(new java.awt.Color(255, 0, 0));
        }
        if (a==26)
        {
            Lz.setOpaque(true);
            Lz.setBackground(new java.awt.Color(255, 0, 0));
        }
    }
/** Cada vez que la persona se equivoque se llama a este metodo para cambiar la imagen
 * que se tiene
 * @param error int
 */
    private void ahorcado(int error) {
        String[] ahorcado = {"a0.jpg","a1.jpg","a2.jpg","a3.jpg","a4.jpg","a5.jpg"};
        ahor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/pkg2/pkg0/"+ahorcado[error])));
    }
/** este metodo se llama cada vez que se le da click al boton sumit, este se encarga
 * de llamar a los demas metodos, dependiendo el caso*/
    private void sumit() {
        String ingreso = letra.getText();
        Boolean valido = true,correcto = false;
        char  respuesta = ingreso.charAt(0);
        byte[] PalabraNum = DatosJ.palabra.getBytes();
        byte[] LetraNum = ingreso.getBytes();
        int aciertos = Integer.parseInt(Aciertos.getText());
        int fallos = Integer.parseInt(Fallos.getText());
        if(LetraNum[0]<97)
            LetraNum[0]+=32;
        if(DatosJ.cantidad==0)
        {
            DatosJ.letras.add(ingreso);
        }
        else
        {
            for(int i=0;i<DatosJ.cantidad;i++)
            {
                if(DatosJ.letras.get(i).equals(ingreso))
                {
                    JOptionPane.showMessageDialog(null,"esa letra ya la pusiste");
                    valido=false;
                    break;
                }
            }
        }
        DatosJ.cantidad++;
        if(valido)
        {
            DatosJ.letras.add(ingreso);
            for(int i=0;i<DatosJ.longitud;i++)
            {
                if(LetraNum[0]==PalabraNum[i])
                {
                    StringBuilder guion = new StringBuilder(20);
                    guion.append(Pav.getText());
                    guion.setCharAt(i,respuesta);
                    Pav.setText(guion.toString());
                    DatosJ.faltan--;
                    correcto = true;
                }
            }
            if(correcto)
            {
                correcto(LetraNum);
            }
            else
            {
                incorrecto(LetraNum);
                DatosJ.error++;
                ahorcado(DatosJ.error);
            }
            if(DatosJ.faltan==0)
            {
                aciertos++;
                Aciertos.setText(Integer.toString(aciertos));
                if((aciertos+fallos)< (DatosJ.palabras.size()))
                {
                    sleep();
                    elegida();
                    labelcolor();
                    DatosJ.error=0;
                    ahorcado(DatosJ.error);
                    DatosJ.letras.clear();
                    DatosJ.cantidad =0;
                } 
            }
            if(DatosJ.error==5)
            {
                JOptionPane.showMessageDialog(null, "Lastima, acabas de perder tu ultima vida, la palabra era "+ DatosJ.palabra);
                fallos++;
                Fallos.setText(Integer.toString(fallos));
                if((fallos+aciertos)<(DatosJ.palabras.size()))
                {
                    sleep();
                    elegida();
                    labelcolor();
                    DatosJ.error=0;
                    ahorcado(DatosJ.error);
                    DatosJ.letras.clear();
                    DatosJ.cantidad =0;
                }
            }
            if((fallos+aciertos)==(DatosJ.palabras.size()))
            {
                JOptionPane.showMessageDialog(null, "El juego ha termiando tuviste "+ Aciertos.getText()+" Aciertos y "+Fallos.getText()+" Fallos");
                this.setVisible(false);
                new main2 () .show();
            }
        }
        letra.setText("");
        
        
    }
/** Cada vez que cambiamos de palabra se llama a este metodo para reiniciar el 
 * color de los labels, ya esten en verde o rojo, pasarlos a blanco*/
    private void labelcolor() {
            La.setOpaque(true);
            La.setBackground(new java.awt.Color(240,240,240));
            Lb.setOpaque(true);
            Lb.setBackground(new java.awt.Color(240,240,240));
            Lc.setOpaque(true);
            Lc.setBackground(new java.awt.Color(240,240,240));
            Ld.setOpaque(true);
            Ld.setBackground(new java.awt.Color(240,240,240));
            Le.setOpaque(true);
            Le.setBackground(new java.awt.Color(240,240,240));
            Lf.setOpaque(true);
            Lf.setBackground(new java.awt.Color(240,240,240));
            Lg.setOpaque(true);
            Lg.setBackground(new java.awt.Color(240,240,240));
            Lh.setOpaque(true);
            Lh.setBackground(new java.awt.Color(240,240,240));
            Li.setOpaque(true);
            Li.setBackground(new java.awt.Color(240,240,240));
            Lj.setOpaque(true);
            Lj.setBackground(new java.awt.Color(240,240,240));
            Lk.setOpaque(true);
            Lk.setBackground(new java.awt.Color(240,240,240));
            Ll.setOpaque(true);
            Ll.setBackground(new java.awt.Color(240,240,240));
            Lm.setOpaque(true);
            Lm.setBackground(new java.awt.Color(240,240,240));
            Ln.setOpaque(true);
            Ln.setBackground(new java.awt.Color(240,240,240));
            Lo.setOpaque(true);
            Lo.setBackground(new java.awt.Color(240,240,240));
            Lp.setOpaque(true);
            Lp.setBackground(new java.awt.Color(240,240,240));
            Lq.setOpaque(true);
            Lq.setBackground(new java.awt.Color(240,240,240));
            Lr.setOpaque(true);
            Lr.setBackground(new java.awt.Color(240,240,240));
            Ls.setOpaque(true);
            Ls.setBackground(new java.awt.Color(240,240,240));
            Lt.setOpaque(true);
            Lt.setBackground(new java.awt.Color(240,240,240));
            Lu.setOpaque(true);
            Lu.setBackground(new java.awt.Color(240,240,240));
            Lv.setOpaque(true);
            Lv.setBackground(new java.awt.Color(240,240,240));
            Lw.setOpaque(true);
            Lw.setBackground(new java.awt.Color(240,240,240));
            Lx.setOpaque(true);
            Lx.setBackground(new java.awt.Color(240,240,240));
            Ly.setOpaque(true);
            Ly.setBackground(new java.awt.Color(240,240,240));
            Lz.setOpaque(true);
            Lz.setBackground(new java.awt.Color(240,240,240));
    }
/** en caso de hacer click en el boton cambiar, se llama a este metodo y se reinician
 * todos los valores de todas las variables y objetos del juego para iniciar nueva
 * mente con el nuevo nivel*/
    private void cambiar() {
        int YN = JOptionPane.YES_NO_OPTION;
        int pregunta = JOptionPane.showConfirmDialog (null, "Si continuas se perdera tu progreso","Advertencia",YN);
        if(pregunta == JOptionPane.YES_OPTION)
        {
            lvl2.setText(lvl.getText());
            labelcolor();
            DatosJ.error=0;
            ahorcado(DatosJ.error);
            DatosJ.letras.clear();
            DatosJ.palabras.clear();
            DatosJ.pistas.clear();
            Aciertos.setText("0");
            Fallos.setText("0");
            DatosJ.uso.clear();
            archivo();
            elegida();
        }
    }
/** para para un poco los procesos y no todo sea tan rapido */
    private void sleep() {
        try {
    Thread.sleep(100);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
    }
    }
}
    //Clase para el menu de configuracion
    public static class configuracion extends javax.swing.JFrame {
    //main de configuracion
    public configuracion() {
        initComponents();
        CargarPalabras();
    }
    // iniciar los objetos
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Palabras2 = new javax.swing.JComboBox();
        lvl2 = new javax.swing.JTextField();
        Cpalabras1 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        palabra1 = new javax.swing.JTextField();
        pista = new javax.swing.JTextField();
        nivel1 = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        oldlvl = new javax.swing.JTextField();
        Cpalabras2 = new javax.swing.JButton();
        palabras3 = new javax.swing.JComboBox();
        cambiar = new javax.swing.JButton();
        newlvl = new javax.swing.JTextField();
        regresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 429));
        jPanel1.setLayout(null);
        
        Palabras2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "palabras" }));
        jPanel1.add(Palabras2);
        Palabras2.setBounds(310, 210, 80, 20);

        jPanel1.add(lvl2);
        lvl2.setBounds(200, 210, 30, 20);

        Cpalabras1.setText("Ok");
        Cpalabras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cpalabras1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cpalabras1);
        Cpalabras1.setBounds(240, 210, 45, 20);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar);
        eliminar.setBounds(410, 210, 69, 23);
        jPanel1.add(palabra1);
        palabra1.setBounds(170, 100, 80, 20);
        jPanel1.add(pista);
        pista.setBounds(280, 100, 50, 20);
        jPanel1.add(nivel1);
        nivel1.setBounds(90, 100, 30, 20);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar);
        agregar.setBounds(360, 100, 71, 23);
        jPanel1.add(oldlvl);
        oldlvl.setBounds(230, 320, 30, 20);

        Cpalabras2.setText("Ok");
        Cpalabras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cpalabras2ActionPerformed(evt);
            }
        });
        jPanel1.add(Cpalabras2);
        Cpalabras2.setBounds(270, 320, 50, 20);

        palabras3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "palabras" }));
        jPanel1.add(palabras3);
        palabras3.setBounds(330, 320, 90, 20);

        cambiar.setText("Cambiar");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        jPanel1.add(cambiar);
        cambiar.setBounds(490, 320, 71, 23);
        jPanel1.add(newlvl);
        newlvl.setBounds(450, 320, 30, 20);

        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });
        jPanel1.add(regresar);
        regresar.setBounds(380, 380, 180, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/pkg2/pkg0/3er pizarron.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 430);

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
    }                                                       
    //cerrar y regresar
    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {                                      
        ModificarArchivo();
        new main2 () .show();
        this.setVisible(false);
    }                                     
    //agregar palabra
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Boolean a = true;
        int lvl=0;
        try {
           lvl = Integer.parseInt(nivel1.getText());
    } catch (NumberFormatException e) {
    a=false;}
        
        if(a)
        {
            if (lvl<1 || lvl>3)
            {
                a=false;
            }
        }
        if(a)
        {
            Datos.nivel.add(Integer.parseInt(nivel1.getText()));
            Datos.palabras.add(palabra1.getText());
            Datos.pistas.add(pista.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El nivel no es valido");
        }
        nivel1.setText("");
        palabra1.setText("");
        pista.setText("");
    }                                       
    //sacar palabras
    private void Cpalabras1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Boolean a = true;
        int lvl=0;
        try {
           lvl = Integer.parseInt(lvl2.getText());
    } catch (NumberFormatException e) {
    a=false;}
        
        if(a)
        {
            if (lvl<1 || lvl>3)
            {
                a=false;
            }
        }
        if(a)
        {
            int total = Datos.nivel.size();
            ArrayList<String> model = new ArrayList<>();
            for(int i =0;i<total;i++)
            {
                if(Datos.nivel.get(i)==lvl)
                {
                    model.add(Datos.palabras.get(i));
                }
            }
            String[] model2 = model.toArray(new String[model.size()]);
            Palabras2.setModel(new DefaultComboBoxModel( model2 ));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El nivel no es valido");
        }
        lvl2.setText("");
    }                                          
    //sacar palabras para cambiar nivel
    private void Cpalabras2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       Boolean a = true;
        int lvl=0;
        try {
           lvl = Integer.parseInt(oldlvl.getText());
    } catch (NumberFormatException e) {
    a=false;}
        
        if(a)
        {
            if (lvl<1 || lvl>3)
            {
                a=false;
            }
        }
        if(a)
        {
            int total = Datos.nivel.size();
            ArrayList<String> model = new ArrayList<>();
            for(int i =0;i<total;i++)
            {
                if(Datos.nivel.get(i)==lvl)
                {
                    model.add(Datos.palabras.get(i));
                }
            }
            String[] model2 = model.toArray(new String[model.size()]);
            palabras3.setModel(new DefaultComboBoxModel( model2 ));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El nivel no es valido");
        }
        oldlvl.setText("");
    }                                          
    //eliminar palabra
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String borrar = Palabras2.getSelectedItem().toString();
        int total = Datos.nivel.size();
        for(int i =0;i<=total;i++)
        {
            if(Datos.palabras.get(i).equals(borrar))
            {
                Datos.nivel.remove(i);
                Datos.palabras.remove(i);
                Datos.pistas.remove(i);
                break;
            }
        }
        String[] model2 = {"palabras"};
        Palabras2.setModel(new DefaultComboBoxModel(model2));
    }                                        
    //cambiar nivel
    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {                                        
     Boolean a = true;
        int lvl=2;
        try {
           lvl = Integer.parseInt(newlvl.getText());
           
    } catch (NumberFormatException e) {
    a=false;
    }
        if(a)
        {
            if(lvl<1 || lvl>3)
            {
                a=false;
            }
        }
        if(a)
        {
            String palabra = palabras3.getSelectedItem().toString();
            int total2 = Datos.nivel.size();
            System.out.println(Datos.palabras.size());
            for(int i=0;i<=total2;i++)
            {
                System.out.print(i);
                if(Datos.palabras.get(i).equals(palabra))
                {
                    Datos.nivel.set(i, lvl);
                    break;
                }
            }
        }
        else
        {
             JOptionPane.showMessageDialog(null, "El nivel no es valido");
        }
        String[] model2 = {"palabras"};
        palabras3.setModel(new DefaultComboBoxModel(model2));
        newlvl.setText("");
       
    }                                       
    // main, diseño de la ventana
    public void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuracion().setVisible(true);
            }
        });
    }
    // declaracion de variables                    
    private javax.swing.JButton Cpalabras1;
    private javax.swing.JButton Cpalabras2;
    private javax.swing.JComboBox Palabras2;
    private javax.swing.JButton agregar;
    private javax.swing.JButton cambiar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lvl2;
    private javax.swing.JTextField newlvl;
    private javax.swing.JTextField nivel1;
    private javax.swing.JTextField oldlvl;
    private javax.swing.JTextField palabra1;
    private javax.swing.JComboBox palabras3;
    private javax.swing.JTextField pista;
    private javax.swing.JLabel regresar;                
    //Cargar palabras en Datos
    private void CargarPalabras() {
        try
	{
            InputStream palabras =getClass().getResourceAsStream("/ahorcado/pkg2/pkg0/Palabras.txt");
            Scanner in = new Scanner(palabras);
            while(in.hasNextLine()){
                    Datos.nivel.add(Integer.parseInt(in.nextLine()));
                    Datos.pistas.add(in.nextLine());
                    Datos.palabras.add(in.nextLine());
            }
        }
	catch (Exception e){}
        
    }
    //Modificar el archivo con la informacion de Datos
    private void ModificarArchivo() {
        int nivel=0;
        String pista="";
        String palabra="";
        int total = Datos.nivel.size();
        try (PrintWriter in = new PrintWriter(new File("C:\\Users\\Alexis\\Documents\\NetBeansProjects\\ahorcado\\src\\ahorcado\\Palabras.txt"))) {
            for(int i=0;i<total;i++)
            {
                nivel = Datos.nivel.get(i);
                in.println(nivel);
                pista = Datos.pistas.get(i);
                in.println(pista);
                palabra = Datos.palabras.get(i);
                in.println(palabra);
                
            }
        }
        catch(IOException e){
            System.out.println("hay un error");
        }
        Datos.nivel.clear();
        Datos.palabras.clear();
        Datos.pistas.clear();
    }
}
    //Clase datos
    public static class Datos {
        public static ArrayList<String> palabras = new ArrayList<>();
        public static ArrayList<String> pistas = new ArrayList<>();
        public static ArrayList<Integer> nivel = new ArrayList<>();
    }
    
    public static class DatosJ{
        public static ArrayList<String> palabras = new ArrayList<>();
        public static ArrayList<String> pistas = new ArrayList<>();
        public static ArrayList<Integer> uso = new ArrayList<>();
        public static String palabra = "";
        public static int longitud=0;
        public static int faltan=0;
        public static ArrayList<String> letras = new ArrayList<>();
        public static int cantidad =0;
        public static int error =0;
    }
}