
package vista;

import controlador.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class frmAgregar extends javax.swing.JFrame {
    frmModificar fm=new frmModificar();
    ClienteDAO objC=new ClienteDAO();
    EmpleadoDAO objE=new EmpleadoDAO();
    MarcaDAO objM=new MarcaDAO();
    ProductoDAO objP=new ProductoDAO();
    TipoDAO objT=new TipoDAO();
    CargoDAO objCa=new CargoDAO();
    
    public frmAgregar() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        llenaComboCargo();
        llenaComboMarca();
        llenaComboTipo();
        //validaciones para que solo se digiten numeros
        num(txtDNIcliente);
        num(txtCELULARcliente);
        num(txtDNIempleado);
        num(txtCELULARempleado);
        num2(txtPRECIOproducto);
        
    }
    //listado cliente
    void listadoC(){
        DefaultTableModel dt=(DefaultTableModel)frmModificar.listaCliente.getModel();
        dt.setRowCount(0);
        for (Cliente x : objC.listadoC()) {
            Object v[]={x.getDni(),x.getNombre(),x.getApellido(),x.getCelular(),x.getCorreo(),x.getDirección()};
            dt.addRow(v);
        }
    }
    //listado empleado
    void listadoE(){
        DefaultTableModel dt=(DefaultTableModel)frmModificar.listaEMPLEADO.getModel();
        dt.setRowCount(0);
        for (Empleado x : objE.listadoEp()) {
            Object v[]={x.getCode(),x.getNombre(),x.getApellido(),x.getDni(),x.getCelular(),x.getCodc(),x.getCorreo(),x.getUsuario(),x.getContraseña()};
            dt.addRow(v);
        }
    }
    //listado marca
    void listadoM(){
        DefaultTableModel dt=(DefaultTableModel)frmModificar.listaMARCA.getModel();
        dt.setRowCount(0);
        for (Marca x : objM.listadoM()) {
            Object v[]={x.getCodm(),x.getMarca()};
            dt.addRow(v);
        }
    }
    //lsitado producto
    void listadoP(){
        DefaultTableModel dt=(DefaultTableModel)frmModificar.listaPRODUCTO.getModel();
        dt.setRowCount(0);
        for (Producto x : objP.listadoP()) {
            Object v[]={x.getCodp(),x.getCodm(),x.getCodt(),x.getDescripcion(),x.getPrecio(),x.getStock()};
            dt.addRow(v);
        }
    }
    
    void llenaComboCargo(){
        cbCARGO.removeAllItems();
        cbCARGO.addItem("Elegir");
        for (Cargo x : objCa.listadoCa()) {
            cbCARGO.addItem(x.getCodc()+" - "+x.getCargo());
        }
    }
    
    void llenaComboMarca(){
        cbMARCAproducto.removeAllItems();
        cbMARCAproducto.addItem("Elegir");
        for (Marca x : objM.listadoM()) {
            cbMARCAproducto.addItem(x.getCodm()+" - "+x.getMarca());
        }
    }
    
    void llenaComboTipo(){
        cbTIPOproducto.removeAllItems();
        cbTIPOproducto.addItem("Elegir");
        for (Tipo x : objT.listadoT()) {
            cbTIPOproducto.addItem(x.getCodt()+" - "+x.getTipo());
        }
    }
    
    //validar que solo se digite número
    private void num(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
    }
    
    //validar para que solo se digite número y un '.' en el precio
    private void num2(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c) && c!='.'){
                    e.consume();
                }
                if(c=='.' && txtPRECIOproducto.getText().contains(".")){
                    e.consume();
                }
            }
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDNIcliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNOMcliente = new javax.swing.JTextField();
        txtAPEcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDIRECCIONcliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCELULARcliente = new javax.swing.JTextField();
        txtCORREOcliente = new javax.swing.JTextField();
        btnAGREGARcliente = new javax.swing.JButton();
        btnNUEVOcliente = new javax.swing.JButton();
        lbDNIcliente = new javax.swing.JLabel();
        lbAPEcliente = new javax.swing.JLabel();
        lbNOMcliente = new javax.swing.JLabel();
        lbCELcliente = new javax.swing.JLabel();
        lbDIRcliente = new javax.swing.JLabel();
        lbCORREOcliente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCODmarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMARCA = new javax.swing.JTextField();
        btnNUEVOmarca = new javax.swing.JButton();
        btnAGREGARmarca = new javax.swing.JButton();
        lbMARCA = new javax.swing.JLabel();
        lbCODmarca = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtCODproducto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbTIPOproducto = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbMARCAproducto = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtDESCRIPproducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPRECIOproducto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtSTOCKproducto = new javax.swing.JTextField();
        btnAGREGARproducto = new javax.swing.JButton();
        btnNUEVOproducto = new javax.swing.JButton();
        lbCODprodu = new javax.swing.JLabel();
        lbDESpro = new javax.swing.JLabel();
        lbSTOCKpro = new javax.swing.JLabel();
        lbPRECIOpro = new javax.swing.JLabel();
        lbTIPO = new javax.swing.JLabel();
        lbMARCApro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCODempleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDNIempleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNOMBREempleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAPELLIDOempleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUSUARIOempleado = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtCELULARempleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCORREOempleado = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtCONTRAempleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAGREGARempleado = new javax.swing.JButton();
        btnNUEVOempleado = new javax.swing.JButton();
        cbCARGO = new javax.swing.JComboBox<>();
        lbCORREOemp = new javax.swing.JLabel();
        lbCONemp = new javax.swing.JLabel();
        lbCODemp = new javax.swing.JLabel();
        lbUSUemp = new javax.swing.JLabel();
        lbCELemp = new javax.swing.JLabel();
        lbDNIemp = new javax.swing.JLabel();
        lbNOMemp = new javax.swing.JLabel();
        lbAPEemp = new javax.swing.JLabel();
        lbCARGO = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI");

        txtDNIcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIclienteKeyTyped(evt);
            }
        });

        jLabel2.setText("NOMBRES");

        txtNOMcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNOMclienteKeyTyped(evt);
            }
        });

        txtAPEcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAPEclienteKeyTyped(evt);
            }
        });

        jLabel3.setText("APELLIDOS");

        jLabel4.setText("DIRECCIÓN");

        txtDIRECCIONcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDIRECCIONclienteKeyTyped(evt);
            }
        });

        jLabel5.setText("CORREO");

        jLabel6.setText("CELULAR");

        txtCELULARcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCELULARclienteKeyTyped(evt);
            }
        });

        txtCORREOcliente.setEditable(false);

        btnAGREGARcliente.setText("AGREGAR");
        btnAGREGARcliente.setEnabled(false);
        btnAGREGARcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARclienteActionPerformed(evt);
            }
        });

        btnNUEVOcliente.setText("NUEVO");
        btnNUEVOcliente.setEnabled(false);
        btnNUEVOcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUEVOclienteActionPerformed(evt);
            }
        });

        lbDNIcliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbDNIcliente.setForeground(new java.awt.Color(255, 0, 0));

        lbAPEcliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbAPEcliente.setForeground(new java.awt.Color(255, 0, 0));

        lbNOMcliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbNOMcliente.setForeground(new java.awt.Color(255, 0, 0));

        lbCELcliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCELcliente.setForeground(new java.awt.Color(255, 0, 0));

        lbDIRcliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbDIRcliente.setForeground(new java.awt.Color(255, 0, 0));

        lbCORREOcliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCORREOcliente.setForeground(new java.awt.Color(255, 0, 0));
        lbCORREOcliente.setText("*Se genera automáticamente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(200, 200, 200))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtDNIcliente)
                                        .addGap(24, 24, 24)))
                                .addComponent(lbDNIcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNUEVOcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAGREGARcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCELULARcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCELcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(78, 78, 78))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNOMcliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtAPEcliente, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNOMcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbAPEcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                                .addComponent(lbCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDIRECCIONcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbDIRcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDNIcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtDNIcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNUEVOcliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnAGREGARcliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNOMcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNOMcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAPEcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAPEcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDIRECCIONcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDIRcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCELULARcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCELcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Cliente", jPanel1);

        jLabel14.setText("CODIGO");

        txtCODmarca.setEditable(false);

        jLabel15.setText("MARCA");

        txtMARCA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMARCAKeyTyped(evt);
            }
        });

        btnNUEVOmarca.setText("NUEVO");
        btnNUEVOmarca.setEnabled(false);
        btnNUEVOmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUEVOmarcaActionPerformed(evt);
            }
        });

        btnAGREGARmarca.setText("AGREGAR");
        btnAGREGARmarca.setEnabled(false);
        btnAGREGARmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARmarcaActionPerformed(evt);
            }
        });

        lbMARCA.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbMARCA.setForeground(new java.awt.Color(255, 0, 0));

        lbCODmarca.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCODmarca.setForeground(new java.awt.Color(255, 0, 0));
        lbCODmarca.setText("*Se genera automáticamente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMARCA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCODmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(lbCODmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAGREGARmarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNUEVOmarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(696, 696, 696))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCODmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCODmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAGREGARmarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMARCA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnNUEVOmarca))
                .addContainerGap(578, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Marca", jPanel4);

        jLabel16.setText("CODIGO");

        txtCODproducto.setEditable(false);

        jLabel17.setText("TIPO");

        cbTIPOproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTIPOproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTIPOproductoActionPerformed(evt);
            }
        });

        jLabel18.setText("MARCA");

        cbMARCAproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMARCAproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMARCAproductoActionPerformed(evt);
            }
        });

        jLabel20.setText("DESCRIPCIÓN");

        txtDESCRIPproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDESCRIPproductoKeyTyped(evt);
            }
        });

        jLabel21.setText("PRECIO");

        txtPRECIOproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPRECIOproductoKeyTyped(evt);
            }
        });

        jLabel22.setText("STOCK");

        txtSTOCKproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSTOCKproductoKeyTyped(evt);
            }
        });

        btnAGREGARproducto.setText("AGREGAR");
        btnAGREGARproducto.setEnabled(false);
        btnAGREGARproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARproductoActionPerformed(evt);
            }
        });

        btnNUEVOproducto.setText("NUEVO");
        btnNUEVOproducto.setEnabled(false);
        btnNUEVOproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUEVOproductoActionPerformed(evt);
            }
        });

        lbCODprodu.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCODprodu.setForeground(new java.awt.Color(255, 0, 0));
        lbCODprodu.setText("*Se genera automáticamente");

        lbDESpro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbDESpro.setForeground(new java.awt.Color(255, 0, 0));

        lbSTOCKpro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbSTOCKpro.setForeground(new java.awt.Color(255, 0, 0));

        lbPRECIOpro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbPRECIOpro.setForeground(new java.awt.Color(255, 0, 0));

        lbTIPO.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbTIPO.setForeground(new java.awt.Color(255, 0, 0));

        lbMARCApro.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbMARCApro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(cbMARCAproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAGREGARproducto))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtPRECIOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(lbPRECIOpro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(cbTIPOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbMARCApro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(lbTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNUEVOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtSTOCKproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbSTOCKpro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCODproducto)
                                .addGap(49, 49, 49)
                                .addComponent(lbCODprodu, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtDESCRIPproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbDESpro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 172, Short.MAX_VALUE)))
                        .addGap(75, 75, 75))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCODproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCODprodu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTIPOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnNUEVOproducto)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(btnAGREGARproducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMARCAproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMARCApro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDESCRIPproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDESpro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPRECIOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPRECIOpro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSTOCKproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSTOCKpro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Producto", jPanel3);

        jLabel7.setText("CODIGO");

        txtCODempleado.setEditable(false);

        jLabel8.setText("DNI");

        txtDNIempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIempleadoKeyTyped(evt);
            }
        });

        jLabel9.setText("NOMBRES");

        txtNOMBREempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNOMBREempleadoKeyTyped(evt);
            }
        });

        jLabel10.setText("APELLIDOS");

        txtAPELLIDOempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAPELLIDOempleadoKeyTyped(evt);
            }
        });

        jLabel11.setText("USUARIO");

        txtUSUARIOempleado.setEditable(false);

        jLabel50.setText("CELULAR");

        txtCELULARempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCELULARempleadoKeyTyped(evt);
            }
        });

        jLabel12.setText("CARGO");

        txtCORREOempleado.setEditable(false);

        jLabel49.setText("CORREO");

        txtCONTRAempleado.setEditable(false);

        jLabel13.setText("CONTRASEÑA");

        btnAGREGARempleado.setText("AGREGAR");
        btnAGREGARempleado.setEnabled(false);
        btnAGREGARempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARempleadoActionPerformed(evt);
            }
        });

        btnNUEVOempleado.setText("NUEVO");
        btnNUEVOempleado.setEnabled(false);
        btnNUEVOempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUEVOempleadoActionPerformed(evt);
            }
        });

        cbCARGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCARGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCARGOActionPerformed(evt);
            }
        });

        lbCORREOemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCORREOemp.setForeground(new java.awt.Color(255, 0, 0));
        lbCORREOemp.setText("*Se genera automáticamente");

        lbCONemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCONemp.setForeground(new java.awt.Color(255, 0, 0));
        lbCONemp.setText("*Se genera automáticamente");

        lbCODemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCODemp.setForeground(new java.awt.Color(255, 0, 0));
        lbCODemp.setText("*Se genera automáticamente");

        lbUSUemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbUSUemp.setForeground(new java.awt.Color(255, 0, 0));
        lbUSUemp.setText("*Se genera automáticamente");

        lbCELemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCELemp.setForeground(new java.awt.Color(255, 0, 0));

        lbDNIemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbDNIemp.setForeground(new java.awt.Color(255, 0, 0));

        lbNOMemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbNOMemp.setForeground(new java.awt.Color(255, 0, 0));

        lbAPEemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbAPEemp.setForeground(new java.awt.Color(255, 0, 0));

        lbCARGO.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCARGO.setForeground(new java.awt.Color(255, 0, 0));

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCONTRAempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(237, 237, 237)
                                    .addComponent(lbCONemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(txtUSUARIOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCORREOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNOMBREempleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCODempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCELULARempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDNIempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAPELLIDOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNOMemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDNIemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCELemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCODemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCORREOemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUSUemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAPEemp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNUEVOempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAGREGARempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCODempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCODemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNOMBREempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNOMemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnAGREGARempleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnNUEVOempleado)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAPELLIDOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAPEemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNIempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDNIemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel50)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCELULARempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCELemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCORREOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCORREOemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUSUARIOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUSUemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCONTRAempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCONemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Empleado", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);//se utiliza para cellar la ventana
        frmSeleccionar s=new frmSeleccionar();
        s.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAGREGARclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARclienteActionPerformed
        Cliente x=new Cliente();
        x.setDni(Integer.parseInt(txtDNIcliente.getText()));
        x.setNombre(txtNOMcliente.getText());
        x.setApellido(txtAPEcliente.getText());//apellido
        x.setDirección(txtDIRECCIONcliente.getText());//direccion
        //x.setCorreo(txtCORREOcliente.getText());//correo
        x.setCorreo(generarCorreo(txtNOMcliente.getText(), txtAPEcliente.getText()));
        x.setCelular(Integer.parseInt(txtCELULARcliente.getText()));//celular
        objC.adicionaC(x);
        listadoC();
        JOptionPane.showMessageDialog(null, "Se agregó el CLIENTE");
        btnAGREGARcliente.setEnabled(false);
        btnNUEVOcliente.setEnabled(true);
    }//GEN-LAST:event_btnAGREGARclienteActionPerformed

    private void btnAGREGARmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARmarcaActionPerformed
        Marca x=new Marca();
        x.setMarca(txtMARCA.getText());
        objM.adicionaM(x);
        listadoM();
        JOptionPane.showMessageDialog(null, "Se agregó la MARCA");
        btnAGREGARmarca.setEnabled(false);
        btnNUEVOmarca.setEnabled(true);
    }//GEN-LAST:event_btnAGREGARmarcaActionPerformed

    private void btnAGREGARproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARproductoActionPerformed
        Producto x=new Producto();
        x.setCodm(cbMARCAproducto.getSelectedItem().toString().substring(0, 4));
        x.setCodt(cbTIPOproducto.getSelectedItem().toString().substring(0, 4));
        x.setDescripcion(txtDESCRIPproducto.getText());
        x.setPrecio(Double.parseDouble(txtPRECIOproducto.getText()));
        x.setStock(Integer.parseInt(txtSTOCKproducto.getText()));
        objP.adicionaP(x);
        listadoP();
        JOptionPane.showMessageDialog(null, "Se agregó el PRODUCTO");
        btnAGREGARproducto.setEnabled(false);
        btnNUEVOproducto.setEnabled(true);
    }//GEN-LAST:event_btnAGREGARproductoActionPerformed

    private void btnNUEVOclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOclienteActionPerformed
        txtDNIcliente.setText("");
        txtNOMcliente.setText("");
        txtAPEcliente.setText("");
        txtDIRECCIONcliente.setText("");
        txtCORREOcliente.setText("");
        txtCELULARcliente.setText("");
        //btnAGREGARcliente.setEnabled(true);
        btnNUEVOcliente.setEnabled(false);
    }//GEN-LAST:event_btnNUEVOclienteActionPerformed

    private void btnNUEVOmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOmarcaActionPerformed
        txtCODmarca.setText("");
        txtMARCA.setText("");
        //btnAGREGARmarca.setEnabled(true);
        btnNUEVOmarca.setEnabled(false);
    }//GEN-LAST:event_btnNUEVOmarcaActionPerformed

    private void btnNUEVOproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOproductoActionPerformed
        txtCODproducto.setText("");
        cbMARCAproducto.setSelectedIndex(0);
        cbTIPOproducto.setSelectedIndex(0);
        txtDESCRIPproducto.setText("");
        txtPRECIOproducto.setText("");
        txtSTOCKproducto.setText("");
        //btnAGREGARproducto.setEnabled(true);
        btnNUEVOproducto.setEnabled(false);
    }//GEN-LAST:event_btnNUEVOproductoActionPerformed

    private void btnNUEVOempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOempleadoActionPerformed
        txtCODempleado.setText("");
        txtNOMBREempleado.setText("");
        txtAPELLIDOempleado.setText("");
        txtDNIempleado.setText("");
        txtCELULARempleado.setText("");
        txtCORREOempleado.setText("");
        cbCARGO.setSelectedIndex(0);
        txtUSUARIOempleado.setText("");
        txtCONTRAempleado.setText("");
        //btnAGREGARempleado.setEnabled(true);
        btnNUEVOempleado.setEnabled(false);
    }//GEN-LAST:event_btnNUEVOempleadoActionPerformed

    private void btnAGREGARempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARempleadoActionPerformed
        Empleado x=new Empleado();
        x.setDni(Integer.parseInt(txtDNIempleado.getText()));
        x.setNombre(txtNOMBREempleado.getText());
        x.setApellido(txtAPELLIDOempleado.getText());
        //x.setUsuario(txtUSUARIOempleado.getText());
        x.setUsuario(generarUsuario(txtNOMBREempleado.getText(), txtAPELLIDOempleado.getText()));
        //x.setContraseña(txtCONTRAempleado.getText());
        x.setContraseña(txtDNIempleado.getText());
        x.setCelular(Integer.parseInt(txtCELULARempleado.getText()));
        //x.setCorreo(txtCORREOempleado.getText());
        x.setCorreo(generarCorreo(txtNOMBREempleado.getText(), txtAPELLIDOempleado.getText()));
        x.setCodc(cbCARGO.getSelectedItem().toString().substring(0, 4));
        objE.adicionaEp(x);
        listadoE();
        JOptionPane.showMessageDialog(null, "Se agregó el EMPLEADO");
        btnAGREGARempleado.setEnabled(false);
        btnNUEVOempleado.setEnabled(true);
    }//GEN-LAST:event_btnAGREGARempleadoActionPerformed

    private void txtDNIclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIclienteKeyTyped
        //validar que solo se digiten máximo 8 dígitos
        if(txtDNIcliente.getText().length()>=8){
            evt.consume();   
        }
        //validar campo vacio
        if(txtDNIcliente.getText().isEmpty()){
            lbDNIcliente.setText("*Campo Requerido");
        }else{
            lbDNIcliente.setText("");
        }
        validar();
    }//GEN-LAST:event_txtDNIclienteKeyTyped

    private void txtCELULARclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCELULARclienteKeyTyped
        //validar que solo se digiten máximo 9 dígitos
        if(txtCELULARcliente.getText().length()>=9){
            evt.consume();   
        }
        //validar campo vacio
        if(txtCELULARcliente.getText().isEmpty()){
            lbCELcliente.setText("*Campo Requerido");
        }else{
            lbCELcliente.setText("");
        }
        validar();
    }//GEN-LAST:event_txtCELULARclienteKeyTyped

    private void txtDNIempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIempleadoKeyTyped
        //validar que solo se digiten máximo 8 dígitos
        if(txtDNIempleado.getText().length()>=8){
            evt.consume();   
        }
        //validar campo vacio
        if(txtDNIempleado.getText().isEmpty()){
            lbDNIemp.setText("*Campo Requerido");
        }else{
            lbDNIemp.setText("");
        }
        validar();
    }//GEN-LAST:event_txtDNIempleadoKeyTyped

    private void txtCELULARempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCELULARempleadoKeyTyped
        //validar que solo se digiten máximo 9 dígitos
        if(txtCELULARempleado.getText().length()>=9){
            evt.consume();   
        }
        //validar campo vacio
        if(txtCELULARempleado.getText().isEmpty()){
            lbCELemp.setText("*Campo Requerido");
        }else{
            lbCELemp.setText("");
        }
        validar();
    }//GEN-LAST:event_txtCELULARempleadoKeyTyped

    private void txtPRECIOproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPRECIOproductoKeyTyped
        //validar campo vacio
        if(txtPRECIOproducto.getText().isEmpty()){
            lbPRECIOpro.setText("*Campo Requerido");
        }else{
            lbPRECIOpro.setText("");
        }
        validar();
    }//GEN-LAST:event_txtPRECIOproductoKeyTyped

    private void txtSTOCKproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSTOCKproductoKeyTyped
        //validar que solo se digiten números
        char c=evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        //validar campo vacio
        if(txtSTOCKproducto.getText().isEmpty()){
            lbSTOCKpro.setText("*Campo Requerido");
        }else{
            lbSTOCKpro.setText("");
        }
        validar();
    }//GEN-LAST:event_txtSTOCKproductoKeyTyped

    private void txtNOMBREempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNOMBREempleadoKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
        //validar campo vacio
        if(txtNOMBREempleado.getText().isEmpty()){
            lbNOMemp.setText("*Campo Requerido");
        }else{
            lbNOMemp.setText("");
        }
        validar();
    }//GEN-LAST:event_txtNOMBREempleadoKeyTyped

    private void txtAPELLIDOempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPELLIDOempleadoKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
        //validar campo vacio
        if(txtAPELLIDOempleado.getText().isEmpty()){
            lbAPEemp.setText("*Campo Requerido");
        }else{
            lbAPEemp.setText("");
        }
        validar();
    }//GEN-LAST:event_txtAPELLIDOempleadoKeyTyped

    private void txtNOMclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNOMclienteKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
        //validar campo vacio
        if(txtNOMcliente.getText().isEmpty()){
            lbNOMcliente.setText("*Campo Requerido");
        }else{
            lbNOMcliente.setText("");
        }
        validar();
    }//GEN-LAST:event_txtNOMclienteKeyTyped

    private void txtAPEclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPEclienteKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
        //validar campo vacio
        if(txtAPEcliente.getText().isEmpty()){
            lbAPEcliente.setText("*Campo Requerido");
        }else{
            lbAPEcliente.setText("");
        }
        validar();
    }//GEN-LAST:event_txtAPEclienteKeyTyped

    private void txtMARCAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMARCAKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
        
        //validar campo vacio
        if(txtMARCA.getText().isEmpty()){
            lbMARCA.setText("*Campo Requerido");
            btnAGREGARmarca.setEnabled(false);
        }else{
            lbMARCA.setText("");
            btnAGREGARmarca.setEnabled(true);
        }
        
    }//GEN-LAST:event_txtMARCAKeyTyped

    private void txtDIRECCIONclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDIRECCIONclienteKeyTyped
        //validar campo vacio
        if(txtDIRECCIONcliente.getText().isEmpty()){
            lbDIRcliente.setText("*Campo Requerido");
        }else{
            lbDIRcliente.setText("");
        }
        validar();
    }//GEN-LAST:event_txtDIRECCIONclienteKeyTyped

    private void txtDESCRIPproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDESCRIPproductoKeyTyped
        //validar campo vacio
        if(txtDESCRIPproducto.getText().isEmpty()){
            lbDESpro.setText("*Campo Requerido");
        }else{
            lbDESpro.setText("");
        }
        validar();
    }//GEN-LAST:event_txtDESCRIPproductoKeyTyped

    private void cbCARGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCARGOActionPerformed
        if(cbCARGO.getSelectedIndex() == 0){
            lbCARGO.setText("*Elegir campo");
        }else{
            lbCARGO.setText("");
        }
        validar();
    }//GEN-LAST:event_cbCARGOActionPerformed

    private void cbTIPOproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTIPOproductoActionPerformed
        if(cbTIPOproducto.getSelectedIndex() == 0){
            lbTIPO.setText("*Elegir campo");
        }else{
            lbTIPO.setText("");
        }
        validar();
    }//GEN-LAST:event_cbTIPOproductoActionPerformed

    private void cbMARCAproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMARCAproductoActionPerformed
        if(txtDESCRIPproducto.getText().isEmpty() || txtPRECIOproducto.getText().isEmpty() || txtSTOCKproducto.getText().isEmpty() || cbMARCAproducto.getSelectedIndex() == 0){
            btnAGREGARproducto.setEnabled(false);
        }else{
            btnAGREGARproducto.setEnabled(true);
        }
        if(cbMARCAproducto.getSelectedIndex() == 0){
            lbMARCApro.setText("*Elegir campo");
        }else{
            lbMARCApro.setText("");
        }
        validar();       
    }//GEN-LAST:event_cbMARCAproductoActionPerformed

    public void validar(){
        if(txtNOMcliente.getText().isEmpty() || txtAPEcliente.getText(). isEmpty() || txtDIRECCIONcliente.getText().isEmpty() || txtCELULARcliente.getText().isEmpty()){
            btnAGREGARcliente.setEnabled(false);
        }else{
            btnAGREGARcliente.setEnabled(true);
        }
        
        if(txtDESCRIPproducto.getText().isEmpty() || txtPRECIOproducto.getText().isEmpty() || txtSTOCKproducto.getText().isEmpty()){
            btnAGREGARproducto.setEnabled(false);
        }else{
            btnAGREGARproducto.setEnabled(true);
        }
        
        if(txtNOMBREempleado.getText().isEmpty() || txtAPELLIDOempleado.getText().isEmpty() || txtDNIempleado.getText().isEmpty() || txtCELULARempleado.getText().isEmpty()){
            btnAGREGARempleado.setEnabled(false);
        }else{
            btnAGREGARempleado.setEnabled(true);
        }
    }
    
    String generarUsuario(String nombre, String apellido){
        String a=nombre.substring(0, 1).toLowerCase();
        String b=apellido.toLowerCase();
        return a+b;
    }
    
    String generarCorreo(String nombre, String apellido){
        String a=nombre.substring(0, 1).toLowerCase();
        String b=apellido.toLowerCase();
        return a+b+"@gmail.com";
    }

    
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
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAGREGARcliente;
    private javax.swing.JButton btnAGREGARempleado;
    private javax.swing.JButton btnAGREGARmarca;
    private javax.swing.JButton btnAGREGARproducto;
    private javax.swing.JButton btnNUEVOcliente;
    private javax.swing.JButton btnNUEVOempleado;
    private javax.swing.JButton btnNUEVOmarca;
    private javax.swing.JButton btnNUEVOproducto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbCARGO;
    private javax.swing.JComboBox<String> cbMARCAproducto;
    private javax.swing.JComboBox<String> cbTIPOproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbAPEcliente;
    private javax.swing.JLabel lbAPEemp;
    private javax.swing.JLabel lbCARGO;
    private javax.swing.JLabel lbCELcliente;
    private javax.swing.JLabel lbCELemp;
    private javax.swing.JLabel lbCODemp;
    private javax.swing.JLabel lbCODmarca;
    private javax.swing.JLabel lbCODprodu;
    private javax.swing.JLabel lbCONemp;
    private javax.swing.JLabel lbCORREOcliente;
    private javax.swing.JLabel lbCORREOemp;
    private javax.swing.JLabel lbDESpro;
    private javax.swing.JLabel lbDIRcliente;
    private javax.swing.JLabel lbDNIcliente;
    private javax.swing.JLabel lbDNIemp;
    private javax.swing.JLabel lbMARCA;
    private javax.swing.JLabel lbMARCApro;
    private javax.swing.JLabel lbNOMcliente;
    private javax.swing.JLabel lbNOMemp;
    private javax.swing.JLabel lbPRECIOpro;
    private javax.swing.JLabel lbSTOCKpro;
    private javax.swing.JLabel lbTIPO;
    private javax.swing.JLabel lbUSUemp;
    private javax.swing.JTextField txtAPELLIDOempleado;
    private javax.swing.JTextField txtAPEcliente;
    private javax.swing.JTextField txtCELULARcliente;
    private javax.swing.JTextField txtCELULARempleado;
    private javax.swing.JTextField txtCODempleado;
    private javax.swing.JTextField txtCODmarca;
    private javax.swing.JTextField txtCODproducto;
    private javax.swing.JTextField txtCONTRAempleado;
    private javax.swing.JTextField txtCORREOcliente;
    private javax.swing.JTextField txtCORREOempleado;
    private javax.swing.JTextField txtDESCRIPproducto;
    private javax.swing.JTextField txtDIRECCIONcliente;
    private javax.swing.JTextField txtDNIcliente;
    private javax.swing.JTextField txtDNIempleado;
    private javax.swing.JTextField txtMARCA;
    private javax.swing.JTextField txtNOMBREempleado;
    private javax.swing.JTextField txtNOMcliente;
    private javax.swing.JTextField txtPRECIOproducto;
    private javax.swing.JTextField txtSTOCKproducto;
    private javax.swing.JTextField txtUSUARIOempleado;
    // End of variables declaration//GEN-END:variables
}
