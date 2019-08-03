/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particion_paginacion;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static particion_paginacion.frmProceso.modelo;


public class frmMemoria extends javax.swing.JFrame {

    public static DefaultListModel modeloLista;
    public static List<Proceso> listaProcesos= new ArrayList<Proceso>();
    public static List<Proceso> procesoEspera= new ArrayList<Proceso>();
    public int memoria=0;
     
   public void llenarMemoria( int memoria){
       
       switch(memoria){
           case 0:
               
               txtMemoria1.setBackground(Color.white);
               txtMemoria2.setBackground(Color.white);
               txtMemoria3.setBackground(Color.white);
               txtMemoria4.setBackground(Color.white);
               txtMemoria5.setBackground(Color.white);
               txtMemoria6.setBackground(Color.white);
               txtMemoria7.setBackground(Color.white);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
                  
               break;
               
           case 1:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.white);
               txtMemoria3.setBackground(Color.white);
               txtMemoria4.setBackground(Color.white);
               txtMemoria5.setBackground(Color.white);
               txtMemoria6.setBackground(Color.white);
               txtMemoria7.setBackground(Color.white);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
              
               break;
           case 2:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.white);
               txtMemoria4.setBackground(Color.white);
               txtMemoria5.setBackground(Color.white);
               txtMemoria6.setBackground(Color.white);
               txtMemoria7.setBackground(Color.white);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
               
               break;
           case 3:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.white);
               txtMemoria5.setBackground(Color.white);
               txtMemoria6.setBackground(Color.white);
               txtMemoria7.setBackground(Color.white);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
            
               break;
           case 4:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.blue);
               txtMemoria5.setBackground(Color.white);
               txtMemoria6.setBackground(Color.white);
               txtMemoria7.setBackground(Color.white);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
               break;
           case 5:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.blue);
               txtMemoria5.setBackground(Color.blue);
               txtMemoria6.setBackground(Color.white);
               txtMemoria7.setBackground(Color.white);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
               break;
           case 6:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.blue);
               txtMemoria5.setBackground(Color.blue);
               txtMemoria6.setBackground(Color.blue);
               txtMemoria7.setBackground(Color.white);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
               break;
           case 7:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.blue);
               txtMemoria5.setBackground(Color.blue);
               txtMemoria6.setBackground(Color.blue);
               txtMemoria7.setBackground(Color.blue);
               txtMemoria8.setBackground(Color.white);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
               break;
           case 8:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.blue);
               txtMemoria5.setBackground(Color.blue);
               txtMemoria6.setBackground(Color.blue);
               txtMemoria7.setBackground(Color.blue);
               txtMemoria8.setBackground(Color.blue);
               txtMemoria9.setBackground(Color.white);
               txtMemoria10.setBackground(Color.white);
               break;
           case 9:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.blue);
               txtMemoria5.setBackground(Color.blue);
               txtMemoria6.setBackground(Color.blue);
               txtMemoria7.setBackground(Color.blue);
               txtMemoria8.setBackground(Color.blue);
               txtMemoria9.setBackground(Color.blue);
               txtMemoria10.setBackground(Color.white);
               break;
           case 10:
               txtMemoria1.setBackground(Color.blue);
               txtMemoria2.setBackground(Color.blue);
               txtMemoria3.setBackground(Color.blue);
               txtMemoria4.setBackground(Color.blue);
               txtMemoria5.setBackground(Color.blue);
               txtMemoria6.setBackground(Color.blue);
               txtMemoria7.setBackground(Color.blue);
               txtMemoria8.setBackground(Color.blue);
               txtMemoria9.setBackground(Color.blue);
               txtMemoria10.setBackground(Color.blue);
               break;       
       }   
   }    
  
   public frmMemoria() {
        initComponents();
        setTitle("Sistemas Operativos - Paginacion Simple");
        setLocationRelativeTo(null);
        Image icon= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagen/icono2.png"));
        this.setIconImage(icon);
         ImageIcon imagenFondo= new ImageIcon(getClass().getResource("/imagen/fondoimg2.jpg"));
        Icon fondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(lblFondo2.getWidth(), lblFondo2.getHeight(), Image.SCALE_DEFAULT));
        lblFondo2.setIcon(fondo);
        this.repaint();
        modeloLista = new DefaultListModel();
        lstEjecucion.setModel(modeloLista);   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGMemoria = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtMemoria1 = new javax.swing.JTextField();
        txtMemoria2 = new javax.swing.JTextField();
        txtMemoria3 = new javax.swing.JTextField();
        txtMemoria4 = new javax.swing.JTextField();
        txtMemoria5 = new javax.swing.JTextField();
        txtMemoria6 = new javax.swing.JTextField();
        txtMemoria7 = new javax.swing.JTextField();
        txtMemoria8 = new javax.swing.JTextField();
        txtMemoria10 = new javax.swing.JTextField();
        txtMemoria9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstEjecucion = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatos2 = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGMemoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblGMemoria.setText("Gestion de memoria");
        getContentPane().add(lblGMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 18, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Paginacion Simple", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        txtMemoria1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria2.setText("               ");
        txtMemoria2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria3.setText("    ");
        txtMemoria3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMemoria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemoria3ActionPerformed(evt);
            }
        });

        txtMemoria4.setText("     ");
        txtMemoria4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria5.setText("   ");
        txtMemoria5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria6.setText("   ");
        txtMemoria6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria7.setText("   ");
        txtMemoria7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria8.setText("   ");
        txtMemoria8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria10.setText("   ");
        txtMemoria10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMemoria9.setText("   ");
        txtMemoria9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  1");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  2");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  3");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  4");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  5");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  6");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  7");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  8");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  9");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" 10");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Memoria: 10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMemoria9)
                            .addComponent(txtMemoria10)
                            .addComponent(txtMemoria8)
                            .addComponent(txtMemoria7)
                            .addComponent(txtMemoria6)
                            .addComponent(txtMemoria5)
                            .addComponent(txtMemoria4)
                            .addComponent(txtMemoria3)
                            .addComponent(txtMemoria2)
                            .addComponent(txtMemoria1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(txtMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel1))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtMemoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel2))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtMemoria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMemoria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMemoria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMemoria6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemoria7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemoria8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemoria9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemoria10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 330));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Consola", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Procesos en Ejecucion y en Espera");

        lstEjecucion.setBackground(new java.awt.Color(255, 255, 255));
        lstEjecucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstEjecucion.setForeground(new java.awt.Color(0, 0, 102));
        jScrollPane5.setViewportView(lstEjecucion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 378, -1, -1));

        jPanel3.setOpaque(false);

        btnFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setForeground(new java.awt.Color(0, 0, 102));
        btnFinalizar.setText("Finalizar Proceso");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setForeground(new java.awt.Color(0, 0, 102));
        btnIngresar.setText("Ingresar Proceso");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 102));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnFinalizar))
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        tblDatos2.setBackground(new java.awt.Color(255, 255, 255));
        tblDatos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblDatos2.setForeground(new java.awt.Color(0, 0, 102));
        tblDatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre del Proceso", "Tamaño Paginas"
            }
        ));
        tblDatos2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblDatos2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 107, 410, 130));

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setForeground(new java.awt.Color(0, 0, 102));
        btnMostrar.setText("Mostrar Procesos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 69, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(0, 0, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 130, -1));
        getContentPane().add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemoria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemoria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemoria3ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        int respuesta=JOptionPane.showConfirmDialog(this
            , "¿Esta seguro de regresar, para crear nuevos procesos ?",
            "Ingrese nuevos Procesos"
        ,JOptionPane.YES_NO_OPTION);

        if (respuesta==JOptionPane.YES_OPTION) {
            listaProcesos.clear();
            procesoEspera.clear();
            frmProceso ventana1 = new frmProceso();
        ventana1.setVisible(true);
        this.setVisible(false);
        
        }     
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        tblDatos2.setModel(frmProceso.modelo);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int filaSelect = tblDatos2.getSelectedRow();
        
        if(filaSelect >= 0){
            
            Proceso proceso = new Proceso(); 
            String nombre = (String)modelo.getValueAt(tblDatos2.getSelectedRow(), 0);
            int tamanio=Integer.parseInt((String)modelo.getValueAt(tblDatos2.getSelectedRow(), 1));
            proceso.setNombre(nombre);
            proceso.setTamanio(tamanio);
        
            if ((proceso.getTamanio()+memoria) <= 10){
                 memoria+= proceso.tamanio;
                 modeloLista.addElement("En Ejecucion (Proceso: "+proceso.getNombre()+" Tamaño: "+proceso.getTamanio()+")");
                proceso.getNombre();
                proceso.getTamanio();
                 listaProcesos.add(proceso);
                llenarMemoria(memoria);
                
            }else if((proceso.getTamanio()+memoria) > 10){
                JOptionPane.showMessageDialog(null, "Excede espacio de Memoria");
                JOptionPane.showMessageDialog(null, "En Espera (Proceso: "+proceso.getNombre()+")");                
                 modeloLista.addElement("En Espera (Proceso: "+proceso.getNombre()+" Tamaño: "+proceso.getTamanio()+")"+"Memoria: "+ memoria);
                 proceso.getNombre();
                 proceso.getTamanio();
                 listaProcesos.add(proceso);
                procesoEspera.add(proceso);
               
                
                for (Proceso e : procesoEspera) {
                    System.out.println("nombre: "+e.nombre);
                    System.out.println("tamaño: "+e.tamanio);
                    
                 }
            }
            else{
            JOptionPane.showMessageDialog(null, "Proceso no Seleccionada");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed
    }
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        int filaSelect = tblDatos2.getSelectedRow();
         
        if(filaSelect >= 0){
            
            System.out.println("fila seleccionada: "+filaSelect);
             
            String nombre= listaProcesos.get(filaSelect).getNombre();
             int tamanio=listaProcesos.get(filaSelect).getTamanio();
             System.out.println("nombre: "+nombre);
             System.out.println("Tamaño: "+tamanio);
             
              memoria-=tamanio;
              llenarMemoria(memoria);
            JOptionPane.showMessageDialog(null, "Se Finalizo (Proceso: "+nombre+")");
            modeloLista.addElement("Se finalizo (Proceso: "+nombre+ " Tamaño: "+ tamanio+")");
           
           
        }else{
            JOptionPane.showMessageDialog(null, "Proceso no Seleccionada");
        }     
        if(!procesoEspera.isEmpty()){
             
                String nombreE= procesoEspera.get(0).getNombre();
                 int tamanioE = procesoEspera.get(0).getTamanio();
                
                if ((memoria+tamanioE)<=10){
                memoria+=tamanioE;
                llenarMemoria(memoria);
                JOptionPane.showMessageDialog(null, "Se ejecuto Proceso en Espera : "+nombreE);
               
                modeloLista.addElement("Se ejecuto (Proceso en Espera : "+nombreE+" Tamaño: "+tamanioE+")");
                procesoEspera.remove(0);
                }else if((memoria+tamanioE) >10) {
                    JOptionPane.showMessageDialog(null,"Sigue en espera (Proceso: "+nombreE );
                modeloLista.addElement( "Sigue en espera (Proceso: "+nombreE+" Tamaño: "+tamanioE+")");
                }
          
            
        } if(!procesoEspera.isEmpty()){
                int i= procesoEspera.size()-1;
                 String nombreE1= procesoEspera.get(i).getNombre();
                 int tamanioE1 = procesoEspera.get(i).getTamanio();
                
                if ((memoria+tamanioE1)<=10){
                memoria+=tamanioE1;
                llenarMemoria(memoria);
                JOptionPane.showMessageDialog(null, "Se ejecuto Proceso en Espera : "+nombreE1);
               
                modeloLista.addElement("Se ejecuto (Proceso en Espera : "+nombreE1+" Tamaño: "+tamanioE1+")");
                procesoEspera.remove(i);
                }else if((memoria+tamanioE1) >10) {
                    JOptionPane.showMessageDialog(null,"Sigue en espera (Proceso: "+nombreE1 );
                modeloLista.addElement( "Sigue en espera (Proceso: "+nombreE1+" Tamaño: "+tamanioE1+")");
                }
            }
        
                                
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
           
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
            java.util.logging.Logger.getLogger(frmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblGMemoria;
    private javax.swing.JList<String> lstEjecucion;
    private javax.swing.JTable tblDatos2;
    private javax.swing.JTextField txtMemoria1;
    private javax.swing.JTextField txtMemoria10;
    private javax.swing.JTextField txtMemoria2;
    private javax.swing.JTextField txtMemoria3;
    private javax.swing.JTextField txtMemoria4;
    private javax.swing.JTextField txtMemoria5;
    private javax.swing.JTextField txtMemoria6;
    private javax.swing.JTextField txtMemoria7;
    private javax.swing.JTextField txtMemoria8;
    private javax.swing.JTextField txtMemoria9;
    // End of variables declaration//GEN-END:variables
}
