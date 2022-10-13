
package vista;

import controlador.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class frmModificar extends javax.swing.JFrame {
    ClienteDAO objC=new ClienteDAO();
    EmpleadoDAO objE=new EmpleadoDAO();
    MarcaDAO objM=new MarcaDAO();
    ProductoDAO objP=new ProductoDAO();
    TipoDAO objT=new TipoDAO();
    CargoDAO objCa=new CargoDAO();

    public frmModificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        listadoC();
        listadoE();
        listadoM();
        listadoP();
        llenaComboCargo();
        llenaComboMarca();
        llenaComboTipo();
        //validaciones para que solo se digiten numeros
        num(txtCELULARcliente);
        num(txtCELULARempleado);
        num2(txtPRECIOproducto);
    }
    //listado cliente
    void listadoC(){
        DefaultTableModel dt=(DefaultTableModel)listaCliente.getModel();
        dt.setRowCount(0);
        for (Cliente x : objC.listadoC()) {
            Object v[]={x.getDni(),x.getNombre(),x.getApellido(),x.getCelular(),x.getCorreo(),x.getDirección()};
            dt.addRow(v);
        }
    }
    //listado empleado
    void listadoE(){
        DefaultTableModel dt=(DefaultTableModel)listaEMPLEADO.getModel();
        dt.setRowCount(0);
        for (Empleado x : objE.listadoEp()) {
            Object v[]={x.getCode(),x.getNombre(),x.getApellido(),x.getDni(),x.getCelular(),x.getCorreo(),x.getCodc(),x.getUsuario(),x.getContraseña()};
            dt.addRow(v);
        }
    }
    //listado marca
    void listadoM(){
        DefaultTableModel dt=(DefaultTableModel)listaMARCA.getModel();
        dt.setRowCount(0);
        for (Marca x : objM.listadoM()) {
            Object v[]={x.getCodm(),x.getMarca()};
            dt.addRow(v);
        }
    }
    //listado producto
    void listadoP(){
        DefaultTableModel dt=(DefaultTableModel)listaPRODUCTO.getModel();
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
            cbCARGO.addItem(x.getCodc());
        }
    }
    
    void llenaComboMarca(){
        cbMARCAproducto.removeAllItems();
        cbMARCAproducto.addItem("Elegir");
        for (Marca x : objM.listadoM()) {
            cbMARCAproducto.addItem(x.getCodm());
        }
    }
    
    void llenaComboTipo(){
        cbTIPOproducto.removeAllItems();
        cbTIPOproducto.addItem("Elegir");
        for (Tipo x : objT.listadoT()) {
            cbTIPOproducto.addItem(x.getCodt());
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

        lista = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDNIcliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNOMcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAPEcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDIRECCIONcliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCORREOcliente = new javax.swing.JTextField();
        txtCELULARcliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnMODcliente = new javax.swing.JButton();
        btnBORRARcliente = new javax.swing.JButton();
        lbCORREOcliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEMPLEADO = new javax.swing.JTable();
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
        jLabel13 = new javax.swing.JLabel();
        txtCONTRAempleado = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtCELULARempleado = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtCORREOempleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbCARGO = new javax.swing.JComboBox<>();
        btnBORRARempleado = new javax.swing.JButton();
        btnMODempleado = new javax.swing.JButton();
        lbCORREOemp = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaMARCA = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtCODmarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMARCA = new javax.swing.JTextField();
        btnMODmarca = new javax.swing.JButton();
        btnBORRARmarca = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPRODUCTO = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtCODproducto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbTIPOproducto = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtDESCRIPproducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPRECIOproducto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtSTOCKproducto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbMARCAproducto = new javax.swing.JComboBox<>();
        btnMODproducto = new javax.swing.JButton();
        btnBORRARproducto = new javax.swing.JButton();
        btnVOLVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "CELULAR", "CORREO", "DIRECCIÓN"
            }
        ));
        listaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaCliente);

        jLabel1.setText("DNI");

        txtDNIcliente.setEditable(false);

        jLabel2.setText("NOMBRES");

        txtNOMcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNOMclienteKeyTyped(evt);
            }
        });

        jLabel3.setText("APELLIDOS");

        txtAPEcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAPEclienteKeyTyped(evt);
            }
        });

        jLabel4.setText("DIRECCIÓN");

        jLabel5.setText("CORREO");

        txtCORREOcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCORREOclienteKeyTyped(evt);
            }
        });

        txtCELULARcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCELULARclienteKeyTyped(evt);
            }
        });

        jLabel6.setText("CELULAR");

        btnMODcliente.setText("MODIFICAR");
        btnMODcliente.setEnabled(false);
        btnMODcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODclienteActionPerformed(evt);
            }
        });

        btnBORRARcliente.setText("BORRAR");
        btnBORRARcliente.setEnabled(false);
        btnBORRARcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBORRARclienteActionPerformed(evt);
            }
        });

        lbCORREOcliente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCORREOcliente.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnBORRARcliente)
                            .addComponent(jLabel5)
                            .addComponent(txtDIRECCIONcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMODcliente)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtDNIcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNOMcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAPEcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCELULARcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(172, 172, 172))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDNIcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnMODcliente)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOMcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPEcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDIRECCIONcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCELULARcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCORREOcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBORRARcliente)
                .addContainerGap())
        );

        lista.addTab("Modificar Cliente", jPanel1);

        listaEMPLEADO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COD", "NOMBRE", "APELLIDO", "DNI", "CELULAR", "CORREO", "CARGO", "USUARIO", "CONTRASEÑA"
            }
        ));
        listaEMPLEADO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEMPLEADOMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaEMPLEADO);

        jLabel7.setText("CODIGO");

        txtCODempleado.setEditable(false);

        jLabel8.setText("DNI");

        txtDNIempleado.setEditable(false);

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

        jLabel13.setText("CONTRASEÑA");

        jLabel50.setText("CELULAR");

        txtCELULARempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCELULARempleadoKeyTyped(evt);
            }
        });

        jLabel49.setText("CORREO");

        txtCORREOempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCORREOempleadoKeyTyped(evt);
            }
        });

        jLabel12.setText("CARGO");

        cbCARGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBORRARempleado.setText("BORRAR");
        btnBORRARempleado.setEnabled(false);
        btnBORRARempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBORRARempleadoActionPerformed(evt);
            }
        });

        btnMODempleado.setText("MODIFICAR");
        btnMODempleado.setEnabled(false);
        btnMODempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODempleadoActionPerformed(evt);
            }
        });

        lbCORREOemp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbCORREOemp.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBORRARempleado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNOMBREempleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCODempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11)
                                .addComponent(txtUSUARIOempleado)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCELULARempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(cbCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDNIempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMODempleado)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtAPELLIDOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(txtCONTRAempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCORREOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbCORREOemp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNIempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCODempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMODempleado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOMBREempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPELLIDOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUSUARIOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCONTRAempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCORREOempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCELULARempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(15, 15, 15)
                        .addComponent(cbCARGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBORRARempleado)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCORREOemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        lista.addTab("Modificar Empleado", jPanel2);

        listaMARCA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CÓDIGO", "MARCA"
            }
        ));
        listaMARCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMARCAMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listaMARCA);

        jLabel14.setText("CODIGO");

        txtCODmarca.setEditable(false);

        jLabel15.setText("MARCA");

        txtMARCA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMARCAKeyTyped(evt);
            }
        });

        btnMODmarca.setText("MODIFICAR");
        btnMODmarca.setEnabled(false);
        btnMODmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODmarcaActionPerformed(evt);
            }
        });

        btnBORRARmarca.setText("BORRAR");
        btnBORRARmarca.setEnabled(false);
        btnBORRARmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBORRARmarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMARCA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCODmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMODmarca)
                        .addGap(17, 17, 17))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBORRARmarca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCODmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnMODmarca)))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnBORRARmarca)
                .addGap(18, 18, 18))
        );

        lista.addTab("Modificar Marca", jPanel4);

        listaPRODUCTO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD", "MARCA", "TIPO", "DESCRIPCIÓN", "PRECIO", "STOCK"
            }
        ));
        listaPRODUCTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPRODUCTOMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaPRODUCTO);

        jLabel16.setText("CODIGO");

        txtCODproducto.setEditable(false);

        jLabel17.setText("TIPO");

        cbTIPOproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setText("DESCRIPCIÓN");

        jLabel21.setText("PRECIO");

        jLabel22.setText("STOCK");

        txtSTOCKproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSTOCKproductoKeyTyped(evt);
            }
        });

        jLabel18.setText("MARCA");

        cbMARCAproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnMODproducto.setText("MODIFICAR");
        btnMODproducto.setEnabled(false);
        btnMODproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODproductoActionPerformed(evt);
            }
        });

        btnBORRARproducto.setText("BORRAR");
        btnBORRARproducto.setEnabled(false);
        btnBORRARproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBORRARproductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBORRARproducto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCODproducto)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(132, 132, 132)))
                        .addGap(162, 162, 162)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbMARCAproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                                .addComponent(btnMODproducto)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17)
                                    .addComponent(txtDESCRIPproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTIPOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPRECIOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(txtSTOCKproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCODproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMARCAproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMODproducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTIPOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPRECIOproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDESCRIPproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSTOCKproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnBORRARproducto)
                .addGap(26, 26, 26))
        );

        lista.addTab("Modificar Producto", jPanel3);

        btnVOLVER.setText("VOLVER");
        btnVOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVOLVERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVOLVER)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lista)
                .addGap(18, 18, 18)
                .addComponent(btnVOLVER)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVOLVERActionPerformed
        this.setVisible(false);//se utiliza para cellar la ventana
        frmSeleccionar s=new frmSeleccionar();
        s.setVisible(true);
    }//GEN-LAST:event_btnVOLVERActionPerformed

    private void listaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClienteMouseClicked
        int f=listaCliente.getSelectedRow();
        txtDNIcliente.setText(listaCliente.getValueAt(f, 0).toString());
        txtNOMcliente.setText(listaCliente.getValueAt(f, 1).toString());
        txtAPEcliente.setText(listaCliente.getValueAt(f, 2).toString());
        txtCELULARcliente.setText(listaCliente.getValueAt(f, 3).toString());
        txtCORREOcliente.setText(listaCliente.getValueAt(f, 4).toString());
        txtDIRECCIONcliente.setText(listaCliente.getValueAt(f, 5).toString());
        btnMODcliente.setEnabled(true);
        btnBORRARcliente.setEnabled(true);
    }//GEN-LAST:event_listaClienteMouseClicked

    private void listaEMPLEADOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEMPLEADOMouseClicked
        int f=listaEMPLEADO.getSelectedRow();
        txtCODempleado.setText(listaEMPLEADO.getValueAt(f, 0).toString());
        txtNOMBREempleado.setText(listaEMPLEADO.getValueAt(f, 1).toString());
        txtAPELLIDOempleado.setText(listaEMPLEADO.getValueAt(f, 2).toString());
        txtDNIempleado.setText(listaEMPLEADO.getValueAt(f, 3).toString());
        txtCELULARempleado.setText(listaEMPLEADO.getValueAt(f, 4).toString());
        txtCORREOempleado.setText(listaEMPLEADO.getValueAt(f, 5).toString());
        cbCARGO.setSelectedItem(listaEMPLEADO.getValueAt(f, 6).toString());
        txtUSUARIOempleado.setText(listaEMPLEADO.getValueAt(f, 7).toString());
        txtCONTRAempleado.setText(listaEMPLEADO.getValueAt(f, 8).toString());
        btnMODempleado.setEnabled(true);
        btnBORRARempleado.setEnabled(true);
    }//GEN-LAST:event_listaEMPLEADOMouseClicked

    private void listaMARCAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMARCAMouseClicked
        int f=listaMARCA.getSelectedRow();
        txtCODmarca.setText(listaMARCA.getValueAt(f, 0).toString());
        txtMARCA.setText(listaMARCA.getValueAt(f, 1).toString());
        btnMODmarca.setEnabled(true);
        btnBORRARmarca.setEnabled(true);
    }//GEN-LAST:event_listaMARCAMouseClicked

    private void listaPRODUCTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPRODUCTOMouseClicked
        int f=listaPRODUCTO.getSelectedRow();
        txtCODproducto.setText(listaPRODUCTO.getValueAt(f, 0).toString());
        cbMARCAproducto.setSelectedItem(listaPRODUCTO.getValueAt(f, 1).toString());
        cbTIPOproducto.setSelectedItem(listaPRODUCTO.getValueAt(f, 2).toString());
        txtDESCRIPproducto.setText(listaPRODUCTO.getValueAt(f, 3).toString());
        txtPRECIOproducto.setText(listaPRODUCTO.getValueAt(f, 4).toString());
        txtSTOCKproducto.setText(listaPRODUCTO.getValueAt(f, 5).toString());
        btnMODproducto.setEnabled(true);
        btnBORRARproducto.setEnabled(true);
    }//GEN-LAST:event_listaPRODUCTOMouseClicked

    private void btnMODclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODclienteActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea modificar el CLIENTE?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
            Cliente x=new Cliente();
            x.setDni(Integer.parseInt(txtDNIcliente.getText()));
            x.setNombre(txtNOMcliente.getText());
            x.setApellido(txtAPEcliente.getText());
            x.setCelular(Integer.parseInt(txtCELULARcliente.getText()));
            x.setCorreo(txtCORREOcliente.getText());
            x.setDirección(txtDIRECCIONcliente.getText());
            objC.modificaC(x);
            listadoC();
            JOptionPane.showMessageDialog(null, "Se modificó el CLIENTE");
            btnMODcliente.setEnabled(false);
            btnBORRARcliente.setEnabled(false);
        }
    }//GEN-LAST:event_btnMODclienteActionPerformed

    private void btnMODempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODempleadoActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea modificar el EMPLEADO?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
            Empleado x=new Empleado();
            x.setCode(txtCODempleado.getText());
            x.setNombre(txtNOMBREempleado.getText());
            x.setApellido(txtAPELLIDOempleado.getText());
            x.setDni(Integer.parseInt(txtDNIempleado.getText()));
            x.setCelular(Integer.parseInt(txtCELULARempleado.getText()));
            x.setCorreo(txtCORREOempleado.getText());
            x.setCodc(cbCARGO.getSelectedItem().toString());
            x.setUsuario(txtUSUARIOempleado.getText());
            x.setContraseña(txtCONTRAempleado.getText());
            objE.modificaEp(x);
            listadoE();
            JOptionPane.showMessageDialog(null, "Se modificó el EMPLEADO");
            btnMODempleado.setEnabled(false);
            btnBORRARempleado.setEnabled(false);
        }
    }//GEN-LAST:event_btnMODempleadoActionPerformed

    private void btnMODmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODmarcaActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea modificar la MARCA?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
            Marca x=new Marca();
            x.setCodm(txtCODmarca.getText());
            x.setMarca(txtMARCA.getText());
            objM.modificaM(x);
            listadoM();
            JOptionPane.showMessageDialog(null, "Se modificó la MARCA");
            btnMODmarca.setEnabled(false);
            btnBORRARmarca.setEnabled(false);
        }
    }//GEN-LAST:event_btnMODmarcaActionPerformed

    private void btnMODproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODproductoActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea modificar el PRODUCTO?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
            Producto x=new Producto();
            x.setCodp(txtCODproducto.getText());
            x.setCodm(cbMARCAproducto.getSelectedItem().toString());
            x.setCodt(cbTIPOproducto.getSelectedItem().toString());
            x.setDescripcion(txtDESCRIPproducto.getText());
            x.setPrecio(Double.parseDouble(txtPRECIOproducto.getText()));
            x.setStock(Integer.parseInt(txtSTOCKproducto.getText()));
            objP.modificaP(x);
            listadoP();
            JOptionPane.showMessageDialog(null, "Se modificó el PRODUCTO");
            btnMODproducto.setEnabled(false);
            btnBORRARproducto.setEnabled(false);
        }
    }//GEN-LAST:event_btnMODproductoActionPerformed

    private void btnBORRARclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBORRARclienteActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar el CLIENTE?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
            int cod=Integer.parseInt(txtDNIcliente.getText());
            objC.borraC(cod);
            listadoC();
            JOptionPane.showMessageDialog(null, "Se eliminó el CLIENTE");
            btnMODcliente.setEnabled(false);
            btnBORRARcliente.setEnabled(false);
        }
    }//GEN-LAST:event_btnBORRARclienteActionPerformed

    private void btnBORRARempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBORRARempleadoActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar el EMPLEADO?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
        String cod=txtCODempleado.getText();
        objE.borraEp(cod);
        listadoE();
        JOptionPane.showMessageDialog(null, "Se eliminó el EMPLEADO");
        btnMODempleado.setEnabled(false);
        btnBORRARempleado.setEnabled(false);
        }
    }//GEN-LAST:event_btnBORRARempleadoActionPerformed

    private void btnBORRARmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBORRARmarcaActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar la MARCA?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
            String cod=txtCODmarca.getText();
            objM.borraM(cod);
            listadoM();
            JOptionPane.showMessageDialog(null, "Se eliminó la MARCA");
            btnMODmarca.setEnabled(false);
            btnBORRARmarca.setEnabled(false);
        }
    }//GEN-LAST:event_btnBORRARmarcaActionPerformed

    private void btnBORRARproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBORRARproductoActionPerformed
        int msj=JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar el PRODUCTO?","ELEGIR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(msj==JOptionPane.YES_OPTION){
            String cod=txtCODproducto.getText();
            objP.borraP(cod);
            listadoP();
            JOptionPane.showMessageDialog(null, "Se eliminó el PRODUCTO");
            btnMODproducto.setEnabled(false);
            btnBORRARproducto.setEnabled(false);
        }
    }//GEN-LAST:event_btnBORRARproductoActionPerformed

    private void txtNOMclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNOMclienteKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_txtNOMclienteKeyTyped

    private void txtAPEclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPEclienteKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_txtAPEclienteKeyTyped

    private void txtCORREOclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCORREOclienteKeyTyped
        if(!txtCORREOcliente.getText().contains("@") || !txtCORREOcliente.getText().contains(".")){
            lbCORREOcliente.setText("*Correo Inválido");
        }else{
            lbCORREOcliente.setText("");
        }
    }//GEN-LAST:event_txtCORREOclienteKeyTyped

    private void txtCELULARclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCELULARclienteKeyTyped
        if(txtCELULARcliente.getText().length()>=9){
            evt.consume();   
        }
    }//GEN-LAST:event_txtCELULARclienteKeyTyped

    private void txtNOMBREempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNOMBREempleadoKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_txtNOMBREempleadoKeyTyped

    private void txtAPELLIDOempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPELLIDOempleadoKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_txtAPELLIDOempleadoKeyTyped

    private void txtCELULARempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCELULARempleadoKeyTyped
        //validar que solo se digiten máximo 9 dígitos
        if(txtCELULARempleado.getText().length()>=9){
            evt.consume();   
        }
    }//GEN-LAST:event_txtCELULARempleadoKeyTyped

    private void txtCORREOempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCORREOempleadoKeyTyped
        if(!txtCORREOempleado.getText().contains("@") || !txtCORREOempleado.getText().contains(".")){
            lbCORREOemp.setText("*Correo Inválido");
        }else{
            lbCORREOemp.setText("");
        }
    }//GEN-LAST:event_txtCORREOempleadoKeyTyped

    private void txtMARCAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMARCAKeyTyped
        //validar que solo se digiten letras
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_txtMARCAKeyTyped

    private void txtSTOCKproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSTOCKproductoKeyTyped
        //validar que solo se digiten numeros
        char c=evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtSTOCKproductoKeyTyped

    //para las advertencias de celdas vacias
    public void validar(){
        if(!txtCORREOcliente.getText().contains("@") || !txtCORREOcliente.getText().contains(".")){
            lbCORREOcliente.setText("*Correo Inválido");
        }else{
            lbCORREOcliente.setText("");
        }
        if(!txtCORREOempleado.getText().contains("@") || !txtCORREOempleado.getText().contains(".")){
            lbCORREOemp.setText("*Correo Inválido");
        }else{
            lbCORREOemp.setText("");
        }
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
            java.util.logging.Logger.getLogger(frmModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBORRARcliente;
    private javax.swing.JButton btnBORRARempleado;
    private javax.swing.JButton btnBORRARmarca;
    private javax.swing.JButton btnBORRARproducto;
    private javax.swing.JButton btnMODcliente;
    private javax.swing.JButton btnMODempleado;
    private javax.swing.JButton btnMODmarca;
    private javax.swing.JButton btnMODproducto;
    private javax.swing.JButton btnVOLVER;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbCORREOcliente;
    private javax.swing.JLabel lbCORREOemp;
    private javax.swing.JTabbedPane lista;
    public static javax.swing.JTable listaCliente;
    public static javax.swing.JTable listaEMPLEADO;
    public static javax.swing.JTable listaMARCA;
    public static javax.swing.JTable listaPRODUCTO;
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
