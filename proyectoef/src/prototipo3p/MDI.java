/*Creado por RITA MARIA SIPAQUE ZIL
      9959-19-3293
PROGRAMACION 1 */
package prototipo3p;

import modelo.Usuarios;

/**
 *
 */
public class MDI extends javax.swing.JFrame {
private uno uno;
private dos dos;
private tres tres;
private cuatro cuatro;
private cinco cinco;
private seis seis;
private siete siete;
private ocho ocho;
private nueve nueve;
private diez diez;
private once once;
private doce doce;




    Usuarios mod;

    public MDI() {
        initComponents();
    }

    MDI(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        if (mod.getIdTipo() == 1) {
            menuProductos.setVisible(true);
            menuProveedores.setVisible(true);
            salir.setVisible(true);
        } else {
            menuProveedores.setVisible(true);
           menuProductos.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        subMenuAddProducto = new javax.swing.JMenuItem();
        subMenuEditProducto = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        subMenuAddProvedor = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        menuProductos.setForeground(new java.awt.Color(0, 0, 204));
        menuProductos.setText("Procesos");
        menuProductos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        subMenuAddProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subMenuAddProducto.setText("existencia");
        subMenuAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAddProductoActionPerformed(evt);
            }
        });
        menuProductos.add(subMenuAddProducto);

        subMenuEditProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subMenuEditProducto.setText("Marcas");
        subMenuEditProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuEditProductoActionPerformed(evt);
            }
        });
        menuProductos.add(subMenuEditProducto);

        jMenuItem2.setText("lineas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuProductos.add(jMenuItem2);

        jMenuItem4.setText("vendedores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuProductos.add(jMenuItem4);

        jMenuItem5.setText("Proveedores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuProductos.add(jMenuItem5);

        jMenuItem6.setText("Clientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuProductos.add(jMenuItem6);

        jMenuItem8.setText("Productos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuProductos.add(jMenuItem8);

        jMenuItem9.setText("Bodega");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuProductos.add(jMenuItem9);

        jMenuBar1.add(menuProductos);

        menuProveedores.setForeground(new java.awt.Color(0, 153, 153));
        menuProveedores.setText("Asignaciones");
        menuProveedores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        subMenuAddProvedor.setText("Venta de detalle");
        subMenuAddProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAddProvedorActionPerformed(evt);
            }
        });
        menuProveedores.add(subMenuAddProvedor);

        jMenuItem7.setText("jMenuItem7");
        menuProveedores.add(jMenuItem7);

        jMenuBar1.add(menuProveedores);

        salir.setForeground(new java.awt.Color(51, 51, 255));
        salir.setText("Salir ");
        salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuItem1.setText("SALIR DE SISTEMA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        salir.add(jMenuItem1);

        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose ();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void subMenuAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAddProductoActionPerformed
        uno = new uno();   
     jDesktopPane1.add(uno) ;
    }//GEN-LAST:event_subMenuAddProductoActionPerformed

    private void subMenuEditProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuEditProductoActionPerformed
        dos = new dos();   
     jDesktopPane1.add(dos) ;
    }//GEN-LAST:event_subMenuEditProductoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        tres =  new tres();   
     jDesktopPane1.add(tres) ;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        cuatro =  new cuatro();   
     jDesktopPane1.add(cuatro) ;
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        cinco =  new cinco();   
     jDesktopPane1.add(cinco) ;
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        seis =  new seis();   
     jDesktopPane1.add(seis) ;
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        siete =  new siete();   
     jDesktopPane1.add(siete) ;
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       ocho =  new ocho();   
     jDesktopPane1.add(ocho) ;
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void subMenuAddProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAddProvedorActionPerformed
        // TODO add your handling code here:
        nueve =  new nueve();   
     jDesktopPane1.add(nueve); 
    }//GEN-LAST:event_subMenuAddProvedorActionPerformed

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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenu salir;
    private javax.swing.JMenuItem subMenuAddProducto;
    private javax.swing.JMenuItem subMenuAddProvedor;
    private javax.swing.JMenuItem subMenuEditProducto;
    // End of variables declaration//GEN-END:variables
}
