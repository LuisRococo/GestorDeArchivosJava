
package FramePrincipal;

import Excepciones.*;
import Operadores.OperadorModeloTabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JOptionPane;
import Operadores.Operaciones;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class FramePrincipal extends javax.swing.JFrame implements ActionListener{

    private File ultimoDirectorioIZQ;
    private File ultimoDirectorioDER;
    private OperadorModeloTabla operadorIZQ;
    private OperadorModeloTabla operadorDER;
    @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
    public FramePrincipal() {
        initComponents();
        inicializarTablas();
        inicializarBotones();
        this.setTitle("GESTOR DE ARCHIVOS");
        this.setLocationRelativeTo(null);
    }

    private void inicializarTablas(){
        operadorIZQ=new OperadorModeloTabla();
        operadorDER=new OperadorModeloTabla();
        jTableIZQ.setModel(operadorIZQ.regresarModelo());
        jTableIZQ.getColumnModel().getColumn(0).setPreferredWidth(170);
        jTableDER.setModel(operadorDER.regresarModelo());
        jTableDER.getColumnModel().getColumn(0).setPreferredWidth(170);
    }
    private void reiniciarColumnas(){
        jTableIZQ.getColumnModel().getColumn(0).setPreferredWidth(170);
        jTableDER.getColumnModel().getColumn(0).setPreferredWidth(170);
    }
    private void inicializarBotones(){
        //IZQUIERDOS
        jButtomIrIZQ.addActionListener(this);
        jButtomBorrarIZQ.addActionListener(this);
        jButtomBorrarIZQ.setBackground(Color.red);
        jButtomCopiarIZQ.addActionListener(this);
        jButtomInfoIZQ.addActionListener(this);
        jButtomMKDirIZQ.addActionListener(this);
        jButtomRenameIZQ.addActionListener(this);
        jButtomVerIZQ.addActionListener(this);
        jButtomRegresarIZQ.addActionListener(this);
        jButtomCreatTxTIZQ.addActionListener(this);
        //DERECHOS
        jButtomRegresarDER.addActionListener(this);
        jButtomIrDER.addActionListener(this);
        jButtomBorrarDER.addActionListener(this);
        jButtomBorrarDER.setBackground(Color.red);
        jButtomCopiarDER.addActionListener(this);
        jButtomInfoDER.addActionListener(this);
        jButtomMKDirDER.addActionListener(this);
        jButtomRenameDER.addActionListener(this);
        jButtomVerDER.addActionListener(this);
        jButtomCreatTxTDER.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIZQ = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDER = new javax.swing.JTable();
        jButtomIrDER = new java.awt.Button();
        jButtomIrIZQ = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jButtomVerIZQ = new java.awt.Button();
        jButtomBorrarIZQ = new java.awt.Button();
        jButtomRenameIZQ = new java.awt.Button();
        jButtomCopiarIZQ = new java.awt.Button();
        jButtomMKDirIZQ = new java.awt.Button();
        jButtomInfoIZQ = new java.awt.Button();
        jButtomCreatTxTIZQ = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jButtomVerDER = new java.awt.Button();
        jButtomBorrarDER = new java.awt.Button();
        jButtomRenameDER = new java.awt.Button();
        jButtomCopiarDER = new java.awt.Button();
        jButtomMKDirDER = new java.awt.Button();
        jButtomInfoDER = new java.awt.Button();
        jButtomCreatTxTDER = new java.awt.Button();
        jTextField1 = new java.awt.TextField();
        jTextField2 = new java.awt.TextField();
        jButtomRegresarIZQ = new java.awt.Button();
        jButtomRegresarDER = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(51, 204, 255));

        jTableIZQ = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jTableIZQ.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableIZQ.setFocusable(false);
        jTableIZQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIZQMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableIZQ);

        jScrollPane2.setBackground(new java.awt.Color(51, 204, 255));
        jScrollPane2.setFocusable(false);
        jScrollPane2.setOpaque(false);

        jTableDER = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jTableDER.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableDER.setFocusable(false);
        jTableDER.setOpaque(false);
        jTableDER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDERMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDER);

        jButtomIrDER.setLabel("Ir");

        jButtomIrIZQ.setLabel("Ir");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButtomVerIZQ.setLabel("VER");

        jButtomBorrarIZQ.setLabel("BORRAR");

        jButtomRenameIZQ.setLabel("RE-NAME");

        jButtomCopiarIZQ.setLabel("COPIAR");

        jButtomMKDirIZQ.setLabel("MKDIR");

        jButtomInfoIZQ.setLabel("INFO");

        jButtomCreatTxTIZQ.setLabel("CREAR TXT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtomInfoIZQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtomVerIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomBorrarIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomRenameIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtomCopiarIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomMKDirIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtomCreatTxTIZQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtomMKDirIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomCopiarIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomRenameIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomBorrarIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomVerIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtomInfoIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomCreatTxTIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButtomVerDER.setLabel("VER");

        jButtomBorrarDER.setLabel("BORRAR");

        jButtomRenameDER.setLabel("RE-NAME");

        jButtomCopiarDER.setLabel("COPIAR");

        jButtomMKDirDER.setLabel("MKDIR");

        jButtomInfoDER.setLabel("INFO");

        jButtomCreatTxTDER.setLabel("CREAR TXT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtomInfoDER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtomVerDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomBorrarDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomRenameDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtomCopiarDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomMKDirDER, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                    .addComponent(jButtomCreatTxTDER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtomMKDirDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomCopiarDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomRenameDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomBorrarDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomVerDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtomInfoDER, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtomCreatTxTDER, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jButtomRegresarIZQ.setLabel("<<");

        jButtomRegresarDER.setLabel("<<");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtomRegresarIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomIrIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtomRegresarDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtomIrDER, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtomIrDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtomIrIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtomRegresarDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtomRegresarIZQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void directorioAnterior(boolean lado){
        File fl;
        fl =(lado)?ultimoDirectorioDER:ultimoDirectorioIZQ;
        if (fl!=null) {
            fl=fl.getParentFile();
            if (fl!=null){
                if (lado) accederDirectorioDER(fl);
                else accederDirectorioIZQ(fl);
            }
        }
    }
    
    private File obtenerUltimoDirectorioDER() throws ExNoHayCarpetaAbierta{
        if (ultimoDirectorioDER==null||!ultimoDirectorioDER.isDirectory()){
            throw new ExNoHayCarpetaAbierta();
        }
        else{
            return ultimoDirectorioDER;
        }
    }
    private File obtenerUltimoDirectorioIZQ() throws ExNoHayCarpetaAbierta{
        if (ultimoDirectorioIZQ==null||!ultimoDirectorioIZQ.isDirectory()){
            throw new ExNoHayCarpetaAbierta();
        }
        else{
            return ultimoDirectorioIZQ;
        }
    }
    
    private void mismosActualizar(boolean lado){
        if (ultimoDirectorioDER!=null&&ultimoDirectorioIZQ!=null){
            if (ultimoDirectorioDER.equals(ultimoDirectorioIZQ)){
                if (lado) accederDirectorioIZQ(ultimoDirectorioIZQ);
                else accederDirectorioDER(ultimoDirectorioDER);
            }
        }
    }
    
    private void accederDirectorioIZQ(File fl){
        if (fl.isDirectory()){
            ultimoDirectorioIZQ=fl;
            jTextField1.setText(fl.getPath());
            operadorIZQ.abrirDirectorio(fl.getPath());
            jTableIZQ.setModel(operadorIZQ.regresarModelo());
            reiniciarColumnas();
        }
        else JOptionPane.showMessageDialog(this, "SE DEBE DE ESCRIBIR UNA RUTA VALIDA\nESTA DEBE CONDUCIR A UN DIRECTORIO EXISTENTE");
    }
    private void accederDirectorioDER(File fl){
        if (fl.isDirectory()){
            ultimoDirectorioDER=fl;
            jTextField2.setText(fl.getPath());
            operadorDER.abrirDirectorio(fl.getPath());
            jTableDER.setModel(operadorDER.regresarModelo());
            reiniciarColumnas();
        }
        else JOptionPane.showMessageDialog(this, "SE DEBE DE ESCRIBIR UNA RUTA VALIDA\nESTA DEBE CONDUCIR A UN DIRECTORIO EXISTENTE");
    }
    
    private File obtenerFileSeleccionadoIZQ() throws ExIndexNoEncontrado{
        return operadorIZQ.regresarFilePorIndex(jTableIZQ.getSelectedRow());
    }
    private File obtenerFileSeleccionadoDER() throws ExIndexNoEncontrado{
        return operadorDER.regresarFilePorIndex(jTableDER.getSelectedRow());
    }
    
    @SuppressWarnings("UseSpecificCatch")
    private void operaciones(int op, boolean lado) {
        String nombre;
        try {
            switch (op) {
                case 0:
                    if (!lado) {
                        if (jTableIZQ.getSelectedRow()==-1) JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        else{
                            if (Operaciones.ejecutarArchivoTexto(obtenerFileSeleccionadoIZQ())) {
                                JOptionPane.showMessageDialog(this, "SE HA ABIERTO EL ARCHIVO");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA PODIDO ABRIR EL ARCHIVO\nNOMAS ES POSIBLE ARBIR ARCHIVOS TXT");
                            }
                        }
                    } else {
                        if (jTableDER.getSelectedRow() == -1) {
                            JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        } else {
                            if (Operaciones.ejecutarArchivoTexto(obtenerFileSeleccionadoDER())) {
                                JOptionPane.showMessageDialog(this, "SE HA ABIERTO EL ARCHIVO");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA PODIDO ABRIR EL ARCHIVO\nNOMAS ES POSIBLE ARBIR ARCHIVOS TXT");
                            }
                        }
                    }
                    break;
                case 1:
                    if (!lado) {
                        if (jTableIZQ.getSelectedRow() == -1) {
                            JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        } else {
                            if (Operaciones.eliminarArchivo(obtenerFileSeleccionadoIZQ())) {
                                accederDirectorioIZQ(ultimoDirectorioIZQ);
                                mismosActualizar(false);
                                JOptionPane.showMessageDialog(this, "SE HA LOGRADO ELIMINAR EL ARCHIVO");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA LOGRADO ELIMINAR EL ARCHIVO\nSI SE TRATA DE UN DIRETORIO ASEGURECE QUE ESTE VACIO");
                            }
                        }
                    } else {
                        if (jTableDER.getSelectedRow()==-1) JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        else{
                            if (Operaciones.eliminarArchivo(obtenerFileSeleccionadoDER())) {
                                accederDirectorioDER(ultimoDirectorioDER);
                                mismosActualizar(true);
                                JOptionPane.showMessageDialog(this, "SE HA LOGRADO ELIMINAR EL ARCHIVO");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA LOGRADO ELIMINAR EL ARCHIVO\nSI SE TRATA DE UN DIRETORIO ASEGURECE QUE ESTE VACIO");
                            }
                        }
                    }
                    break;
                case 2:
                    if (!lado) {
                        if (jTableIZQ.getSelectedRow() == -1) {
                            JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        } else {
                            nombre = JOptionPane.showInputDialog(this, "PONGA EL NUEVO NOMBRE DEL ARCHIVO");
                            if (nombre==null) return;
                            if (Operaciones.renombrarArchivo(obtenerFileSeleccionadoIZQ(), nombre)) {
                                accederDirectorioIZQ(ultimoDirectorioIZQ);
                                mismosActualizar(false);
                                JOptionPane.showMessageDialog(this, "EL ARCHIVO SE HA RENOMBRADO");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA PODIDO RENOMBRAR");
                            }
                        }
                    } else {
                        if (jTableDER.getSelectedRow() == -1) {
                            JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        } else {
                            nombre = JOptionPane.showInputDialog(this, "PONGA EL NUEVO NOMBRE DEL ARCHIVO");
                            if (nombre==null) return;
                            if (Operaciones.renombrarArchivo(obtenerFileSeleccionadoDER(), nombre)) {
                                accederDirectorioDER(ultimoDirectorioDER);
                                mismosActualizar(true);
                                JOptionPane.showMessageDialog(this, "EL ARCHIVO SE HA RENOMBRADO");
                            } else {
                                JOptionPane.showMessageDialog(this, "\nERROR\nNO SE HA PODIDO RENOMBRAR");
                            }
                        }
                    }
                    break;
                case 3:
                    if (!lado) {
                        if (jTableIZQ.getSelectedRow() == -1 || ultimoDirectorioDER == null) {
                            if (jTableIZQ.getSelectedRow() == -1) {
                                JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN ARCHIVO SELECCIONADO");
                            } if(ultimoDirectorioDER == null) {
                                JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN DIRECTORIO ABIERTO");
                            }
                        } else {
                            if (Operaciones.copiarArchivo(obtenerFileSeleccionadoIZQ(), obtenerUltimoDirectorioDER())) {
                                accederDirectorioDER(ultimoDirectorioDER);
                                mismosActualizar(false);
                                JOptionPane.showMessageDialog(this, "SE HA COPIADO CORRECTAMENTE");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA PODIDO COPIAR EL ARCHIVO\nASEGURECE QUE LO QUE TRATA DE COPIAR NO SEA UN DIRECTORIO");
                            }
                        }
                    }else{
                        if (jTableDER.getSelectedRow() == -1 || ultimoDirectorioIZQ == null) {
                            if (jTableDER.getSelectedRow() == -1) {
                                JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN ARCHIVO SELECCIONADO");
                            } if(ultimoDirectorioDER == null) {
                                JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN DIRECTORIO ABIERTO");
                            }
                        }
                        else {
                            if (Operaciones.copiarArchivo(obtenerFileSeleccionadoDER(), obtenerUltimoDirectorioIZQ())) {
                                accederDirectorioIZQ(ultimoDirectorioIZQ);
                                mismosActualizar(true);
                                JOptionPane.showMessageDialog(this, "SE HA COPIADO CORRECTAMENTE");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA PODIDO COPIAR EL ARCHIVO\nASEGURECE QUE LO QUE TRATA DE COPIAR NO SEA UN DIRECTORIO");
                            }
                        }
                    }
                    break;
                case 4:
                    if (!lado) {
                        if (ultimoDirectorioIZQ == null) JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN DIRECTORIO ABIERTO");
                        else{
                            nombre = JOptionPane.showInputDialog(this, "ESCRIBA EL NOMBRE DEL DIRECTORIO");
                            if (nombre == null) {
                                return;
                            }
                            if (Operaciones.crearDirectorio(obtenerUltimoDirectorioIZQ(), nombre)) {
                                accederDirectorioIZQ(ultimoDirectorioIZQ);
                                mismosActualizar(false);
                                JOptionPane.showMessageDialog(this, "SE HA CREADO EL DIRECTORIO");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA PODIDO CREAR EL DIRECTORIO");
                            }
                        }
                    } else {
                        if (ultimoDirectorioDER == null) JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN DIRECTORIO ABIERTO");
                        else {
                            nombre = JOptionPane.showInputDialog(this, "ESCRIBA EL NOMBRE DEL DIRECTORIO");
                            if (nombre == null) {
                                return;
                            }
                            if (Operaciones.crearDirectorio(obtenerUltimoDirectorioDER(), nombre)) {
                                accederDirectorioDER(ultimoDirectorioDER);
                                mismosActualizar(true);
                                JOptionPane.showMessageDialog(this, "SE HA CREADO EL DIRECTORIO");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA PODIDO CREAR EL DIRECTORIO");
                            }
                        }
                    }
                    break;
                case 5:
                    if (!lado) {
                        if (jTableIZQ.getSelectedRow()==-1) JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        else{
                            JOptionPane.showMessageDialog(this, Operaciones.obtenerInfo(obtenerFileSeleccionadoIZQ()));
                        }
                    } 
                    else {
                        if (jTableDER.getSelectedRow()==-1) JOptionPane.showMessageDialog(this, "AVISO\nNO HA SELECCIONADO ALGUN ARCHIVO");
                        else{
                            JOptionPane.showMessageDialog(this, Operaciones.obtenerInfo(obtenerFileSeleccionadoDER()));
                        }
                    }
                    break;
                case 6:
                    if (!lado) {
                        if (ultimoDirectorioIZQ == null) {
                            JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN DIRECTORIO ABIERTO");
                        }
                        else {
                            nombre = JOptionPane.showInputDialog(this, "PONGA EL NOMBRE DEL TXT");
                            if (nombre == null) {
                                return;
                            }
                            if (Operaciones.crearArchivoTXT(ultimoDirectorioIZQ, nombre)) {
                                accederDirectorioIZQ(ultimoDirectorioIZQ);
                                mismosActualizar(false);
                                JOptionPane.showMessageDialog(this, "SE HA LOGRADO CREAR EL TXT");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA LOGRADO CREAR EL TXT");
                            }
                        }
                    }
                    else{
                        if (ultimoDirectorioDER == null) {
                            JOptionPane.showMessageDialog(this, "AVISO\nSE NECESITA TENER UN DIRECTORIO ABIERTO");
                        }
                        else{
                            nombre = JOptionPane.showInputDialog(this, "PONGA EL NOMBRE DEL TXT");
                            if (nombre == null) {
                                return;
                            }
                            if (Operaciones.crearArchivoTXT(ultimoDirectorioDER, nombre)) {
                                accederDirectorioDER(ultimoDirectorioDER);
                                mismosActualizar(true);
                                JOptionPane.showMessageDialog(this, "SE HA LOGRADO CREAR EL TXT");
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR\nNO SE HA LOGRADO CREAR EL TXT");
                            }
                        }
                    }
                    break;
            }
        }
        catch (ExIndexNoEncontrado e) {
            JOptionPane.showMessageDialog(this, "ERROR\nNO HAY SELECCIONADOS");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "ERROR\nERROR A LA HORA DE ABRIR ARCHIVO\nO ALGUNA OTRA ACCION DE MANEJO DE ARCHIVOS");
        } catch (ExFormatoDireccionNoValida2 e) {
            JOptionPane.showMessageDialog(this, "ERROR\nPARA ESTA OPERACION SE NECESITA ESTAR EN UN DIRECTORIO");
        } catch (ExFormatoDireccionNoValida1 e) {
                JOptionPane.showMessageDialog(this, "ERROR\nNO SE PUDO COPIAR EL ARCHIVO\nASEGURESE QUE EL ARCHIVO QUE TRATE DE COPIAR NO SEA UN DIRECTORIO");
        } catch (ExErrorIOCopiarArchivos e) {
            JOptionPane.showMessageDialog(this, "ERROR\nERROR IO AL COPIAR LOS ARCHIVOS");
        } catch (ExNoHayCarpetaAbierta ex) {
            JOptionPane.showMessageDialog(this, "ERROR\nPARA ESTA OPERACION SE NECESITA ESTAR EN UNA CARPETA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR\nERROR GENERAL\nNO HA SELECCIONADO NADA");
        }
    }
    
    
    private void jTableIZQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIZQMouseClicked
        File seleccionado;
        try {
            if (SwingUtilities.isLeftMouseButton(evt)) {
                seleccionado=obtenerFileSeleccionadoIZQ();
                if (seleccionado.isDirectory()) {
                    if (evt.getClickCount() == 2) {
                        accederDirectorioIZQ(seleccionado);
                    }
                }
            }
        }catch (ExIndexNoEncontrado e){
            JOptionPane.showMessageDialog(this, "ERROR\nERROR AL SELECCIONAR FILA");
        }
    }//GEN-LAST:event_jTableIZQMouseClicked

    private void jTableDERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDERMouseClicked
        File seleccionado;
        try {
            if (SwingUtilities.isLeftMouseButton(evt)) {
                seleccionado=obtenerFileSeleccionadoDER();
                if (seleccionado.isDirectory()) {
                    if (evt.getClickCount() == 2) {
                        accederDirectorioDER(seleccionado);
                    }
                }
            }
        }catch (ExIndexNoEncontrado e){
            JOptionPane.showMessageDialog(this, "ERROR\nERROR AL SELECCIONAR FILA");
        }
    }//GEN-LAST:event_jTableDERMouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                accederDirectorioIZQ(new File (jTextField1.getText()));
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accederDirectorioDER(new File(jTextField2.getText()));
        }
    }//GEN-LAST:event_jTextField2KeyPressed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button jButtomBorrarDER;
    private java.awt.Button jButtomBorrarIZQ;
    private java.awt.Button jButtomCopiarDER;
    private java.awt.Button jButtomCopiarIZQ;
    private java.awt.Button jButtomCreatTxTDER;
    private java.awt.Button jButtomCreatTxTIZQ;
    private java.awt.Button jButtomInfoDER;
    private java.awt.Button jButtomInfoIZQ;
    private java.awt.Button jButtomIrDER;
    private java.awt.Button jButtomIrIZQ;
    private java.awt.Button jButtomMKDirDER;
    private java.awt.Button jButtomMKDirIZQ;
    private java.awt.Button jButtomRegresarDER;
    private java.awt.Button jButtomRegresarIZQ;
    private java.awt.Button jButtomRenameDER;
    private java.awt.Button jButtomRenameIZQ;
    private java.awt.Button jButtomVerDER;
    private java.awt.Button jButtomVerIZQ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDER;
    private javax.swing.JTable jTableIZQ;
    private java.awt.TextField jTextField1;
    private java.awt.TextField jTextField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        File fl;
        //BOTONES IZQUIERDOS
        if (e.getSource().equals(jButtomIrIZQ)){
            fl=new File(jTextField1.getText());
            accederDirectorioIZQ(fl);
        }
        else if (e.getSource().equals(jButtomBorrarIZQ)) operaciones(1, false);
        else if (e.getSource().equals(jButtomCopiarIZQ)) operaciones(3, false);
        else if (e.getSource().equals(jButtomInfoIZQ)) operaciones(5, false);
        else if (e.getSource().equals(jButtomMKDirIZQ)) operaciones(4, false);
        else if (e.getSource().equals(jButtomRenameIZQ)) operaciones(2, false);
        else if (e.getSource().equals(jButtomVerIZQ)) operaciones(0, false);
        else if (e.getSource().equals(jButtomRegresarIZQ)) directorioAnterior(false);
        else if (e.getSource().equals(jButtomCreatTxTIZQ)) operaciones(6, false);
        //BOTONES DERECHOS
        if (e.getSource().equals(jButtomIrDER)){
            fl=new File(jTextField2.getText());
            accederDirectorioDER(fl);
        }
        else if (e.getSource().equals(jButtomBorrarDER)) operaciones(1, true);
        else if (e.getSource().equals(jButtomCopiarDER)) operaciones(3, true);
        else if (e.getSource().equals(jButtomInfoDER)) operaciones(5, true);
        else if (e.getSource().equals(jButtomMKDirDER)) operaciones(4, true);
        else if (e.getSource().equals(jButtomRenameDER)) operaciones(2, true);
        else if (e.getSource().equals(jButtomVerDER)) operaciones(0, true);
        else if (e.getSource().equals(jButtomRegresarDER)) directorioAnterior(true);
        else if (e.getSource().equals(jButtomCreatTxTDER)) operaciones(6, true);
    }
}
