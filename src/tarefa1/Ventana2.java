/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class Ventana2 extends javax.swing.JFrame {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("\\Users\\David\\Desktop\\basedatos.odb");
    EntityManager em = emf.createEntityManager();
    EntityManagerFactory emfcarga = Persistence.createEntityManagerFactory("\\Users\\David\\Desktop\\basedatos.odb");
    EntityManager emcarga = emf.createEntityManager();


    DefaultTableModel modelo = new DefaultTableModel();

    public Ventana2() {
        initComponents();
        columsnasTabla();
        listaClientes = new ArrayList<>();
        this.tabla.setModel(modelo);

        this.setLocationRelativeTo(null);
     cargarDatos();
    }

    private void columsnasTabla() {

        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DEUDA");

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDeuda = new javax.swing.JTextField();
        txtComentario = new javax.swing.JTextField();
        botonIngresar = new javax.swing.JButton();
        botonMostarDatos = new javax.swing.JButton();
        botonModificarDeu = new javax.swing.JButton();
        BotonBorrarCliente = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonSalirf = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

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
        setTitle("Base de Datos de Clientes Morosos");

        jLabel1.setText("D.N.I.");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        jLabel5.setText("Deuda");

        jLabel6.setText("Comentarios");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        botonIngresar.setText("Ingresar Cliente");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonMostarDatos.setText("Mostrar datos clientes");
        botonMostarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostarDatosActionPerformed(evt);
            }
        });

        botonModificarDeu.setText("Modificar deuda");
        botonModificarDeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDeuActionPerformed(evt);
            }
        });

        BotonBorrarCliente.setText("Borrar cliente");
        BotonBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarClienteActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonSalirf.setText("Salir");
        botonSalirf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirfActionPerformed(evt);
            }
        });

        tabla.setModel(modelo);
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(botonSalirf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtDni)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDeuda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMostarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(botonModificarDeu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresar)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMostarDatos)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarDeu)
                        .addGap(29, 29, 29)
                        .addComponent(BotonBorrarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(botonSalirf)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    
    private  void cargarDatos(){
        
         emcarga.getTransaction().begin();
        
        TypedQuery<Clientes> pregunta = emcarga.createQuery("SELECT p FROM Clientes p", Clientes.class);
        List<Clientes> listaResultado = pregunta.getResultList();
       
        for(Clientes p : listaResultado){
            
         fila[0] =   p.getNif();
         fila[1] =    p.getNome();
         fila[2] =   p.getDireccion();
         fila[3] =    p.getTelefono();
           fila[4] =  p.getDebeda();
           
           
             String nif =p.getNif();
            String nome =  p.getNome();
            String direccion = p.getDireccion();
           int telef =  p.getTelefono();
           int d = p.getDebeda();
            
            Clientes aux;
           
            aux = new Clientes(nif, nome, direccion, telef, d);
           listaClientes.add(aux);
            modelo.addRow(fila);     
            
        }
        
         emcarga.close();
        emfcarga.close();
     
    }
    
    
    
    
    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed

        try {

            //--- almaceno los datos de los cuadros de texto en un array
            fila[0] = txtDni.getText();
            fila[1] = txtNombre.getText();
            fila[2] = txtDireccion.getText();
            fila[3] = txtTelefono.getText();
            fila[4] = txtDeuda.getText();
            
            
            //almaceno los datos de textos de los cuadros en variables

            String nif = this.txtDni.getText();
            String nome = this.txtNombre.getText();
            String direccion = this.txtDireccion.getText();
            String telef = this.txtTelefono.getText();
            // int telefono = Integer.parseInt(telef);
            String d = this.txtDeuda.getText();
            // int debeda = Integer.parseInt(d);
            
            //creo un cliente nuevo
            Clientes aux;

            boolean b = false;

            Metodos.validarDNI(nif);
            int telefono = Metodos.combertidorTelefon(telef);
            int debeda = Metodos.combertidorDeu(d);
            Metodos.comprobarNumeroTelf(telef);
            
            //cpmpruebo si en  el arrayList existe el dni

            for (Clientes p : listaClientes) {

                if (p.getNif().equals(nif)) {

                    b = true;
                }

            }
            
            //si existe no lo almaceno

            if (b) {

                this.txtComentario.setText("El DNI ya existe");
                
                
                //guardo al cliente nuevo

            } else {
                
                
                //------------------------------------------ enciendo conexion objectdb
               em.getTransaction().begin();
                
                //almaceno en la variable cliente, el nuevo cliente
                aux = new Clientes(nif, nome, direccion, telefono, debeda);
                
                //almaceno el cliente en el arrayList
                listaClientes.add(aux);
                
                //almaceno el cliente en la tabla modelo
                modelo.addRow(fila);

                //-----------------------------------
                em.persist(aux);

                txtDni.setText("");
                txtNombre.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtDeuda.setText("");

                this.txtComentario.setText("Cliente añadido");

                LimpiarDatos();
               // System.out.println(listaClientes);
            }

        } catch (DNIException | NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        //-----------------------------------------
        em.getTransaction().commit();

     

    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed

        this.txtComentario.setText("");
        this.txtDeuda.setText("");
        this.txtDireccion.setText("");
        this.txtDni.setText("");
        this.txtNombre.setText("");
        this.txtTelefono.setText("");


    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonSalirfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirfActionPerformed

        System.exit(0);
        
        em.close();
        emf.close();

    }//GEN-LAST:event_botonSalirfActionPerformed

    private void botonMostarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostarDatosActionPerformed

        String nif = this.txtDni.getText();
        boolean b = false;

        //------------------------- serviria si no cargaramos los datos en el arraylist listaClientes
       // TypedQuery<Clientes> createQuery = em.createQuery("SELECT a FROM Clientes a where a.nif='" + nif + "'", Clientes.class);
      // List<Clientes> resultList = createQuery.getResultList();
    //  for (Clientes a : resultList) {

       //     System.out.println("hola"+a.getNif() + a.getNome() + a.getDireccion() + a.getTelefono() + a.getDebeda());

    //   }
        //-----------------------------------

        Clientes cli_buscado = null;

        for (Clientes p : listaClientes) {

            if (p.getNif().equals(nif)) {

                b = true;

                cli_buscado = p;
            }

        }

        if (b) {

            this.txtNombre.setText(cli_buscado.getNome());
            int ai = cli_buscado.getDebeda();
            String as = String.valueOf(ai);
            this.txtDeuda.setText(as);
            this.txtDireccion.setText(cli_buscado.getDireccion());
            this.txtDni.setText(cli_buscado.getNif());
            ai = cli_buscado.getTelefono();
            as = String.valueOf(ai);
            this.txtTelefono.setText(as);
            this.txtComentario.setText("Cliente localizado");
        } else {

            this.txtComentario.setText("El DNI no existe");

        }
      

      
    }//GEN-LAST:event_botonMostarDatosActionPerformed

    private void botonModificarDeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDeuActionPerformed

        String nif = txtDni.getText();
        int posicion = -1;
        int valor = 0;

        for (Clientes p : listaClientes) {
            posicion++;
            if (p.getNif().equals(nif)) {
                //----------------------------------------
                em.getTransaction().begin();
                
              int deve=Integer.parseInt(txtDeuda.getText());
                Query createQuery = em.createQuery("UPDATE Clientes SET debeda ="+deve+" where nif='"+nif+"'");
                createQuery.executeUpdate();
                em.getTransaction().commit();

                //--------------------------------------------
                p.setDebeda(Integer.parseInt(txtDeuda.getText()));
                valor = posicion;
                int fila = valor;
                int columna = 4;
                modelo.setValueAt(txtDeuda.getText(), fila, columna);

                txtComentario.setText("Debeda Modificada, ok");

            }

        }
      


    }//GEN-LAST:event_botonModificarDeuActionPerformed

    private void BotonBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarClienteActionPerformed

        String nif = txtDni.getText();
        int posicion = -1;
        int valor = 0;
        try {
            for (Clientes p : listaClientes) {
                posicion++;

                if (p.getNif().equals(nif)) {

                    //--------------------
                    em.getTransaction().begin();

                    Query createQuery = em.createQuery("DELETE  from  Clientes where nif='"+nif+"'");
                    createQuery.executeUpdate();
                    em.getTransaction().commit();

                    //------------------------------*/
                    valor = posicion;

                    txtDireccion.setText("");
                    txtDeuda.setText("");

                    txtNombre.setText("");
                    txtTelefono.setText("");

                    listaClientes.remove(p);
                    modelo.removeRow(valor);

                    //int a = tabla.getSelectedRow();
                    txtComentario.setText("Cliente borrado");
                    txtDni.setText("");

                } else {

                    txtComentario.setText("Cliente NO existe");

                }

            }

        } catch (Exception es) {

            txtComentario.setText("Cliente borrado");

        }
        
        
       


    }//GEN-LAST:event_BotonBorrarClienteActionPerformed

   
    
    public void LimpiarDatos() {

        //  this.txtComentario.setText("");
        this.txtDeuda.setText("");
        this.txtDireccion.setText("");
        this.txtDni.setText("");
        this.txtNombre.setText("");
        this.txtTelefono.setText("");
        
       
        
        
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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana2().setVisible(true);

            }

        });
    }

    private ArrayList<Clientes> listaClientes;
    Object[] fila = new Object[5];


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrarCliente;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificarDeu;
    private javax.swing.JButton botonMostarDatos;
    private javax.swing.JButton botonSalirf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JTextField txtDeuda;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    
    
    
    
}
