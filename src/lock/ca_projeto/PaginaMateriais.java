/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package lock.ca_projeto;

import java.util.Map;
import java.awt.font.TextAttribute;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import lock.DAO.MateriaisDAO;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pivis
 */
public class PaginaMateriais extends javax.swing.JFrame {

    /**
     * Creates new form PaginaAluno
     */
    public PaginaMateriais() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        
        JTable1.getTableHeader().setFont(new Font("Microsoft Yahei UI Light",Font.PLAIN , 14));
        JTable1.getTableHeader().setOpaque(false);
        JTable1.getTableHeader().setBackground(new Color(0,0,0));
        JTable1.getTableHeader().setForeground(new Color(255,255,255));
        JTable1.setForeground(new Color(0,0,0));
        JTable1.setRowHeight(25);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Header = new javax.swing.JPanel();
        header_icon = new javax.swing.JPanel();
        icon_label_maua = new javax.swing.JLabel();
        icone_min_max_close = new javax.swing.JPanel();
        button_min = new javax.swing.JPanel();
        max_panel = new javax.swing.JPanel();
        button_max = new javax.swing.JLabel();
        close_panel = new javax.swing.JPanel();
        button_sair = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable1 = new javax.swing.JTable();
        Panel_Menu_Extendido = new javax.swing.JPanel();
        Panel_button_materiais = new javax.swing.JPanel();
        button_materiais = new javax.swing.JLabel();
        Panel_button_autorizacao = new javax.swing.JPanel();
        button_autorizacao = new javax.swing.JLabel();
        Panel_button_feedbacks = new javax.swing.JPanel();
        button_feedbacks = new javax.swing.JLabel();
        Panel_button_sair = new javax.swing.JPanel();
        button_voltar = new javax.swing.JLabel();
        panel_barra_menu = new javax.swing.JPanel();
        panel_hide_menu = new javax.swing.JPanel();
        button_hide_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 0, 0));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        header_icon.setBackground(new java.awt.Color(0, 0, 0));
        header_icon.setPreferredSize(new java.awt.Dimension(200, 100));
        header_icon.setLayout(new java.awt.BorderLayout());

        icon_label_maua.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        icon_label_maua.setForeground(new java.awt.Color(255, 255, 255));
        icon_label_maua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        icon_label_maua.setText("  LOCKC.A");
        header_icon.add(icon_label_maua, java.awt.BorderLayout.CENTER);

        Header.add(header_icon, java.awt.BorderLayout.LINE_START);

        icone_min_max_close.setBackground(new java.awt.Color(0, 0, 0));
        icone_min_max_close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_min.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout button_minLayout = new javax.swing.GroupLayout(button_min);
        button_min.setLayout(button_minLayout);
        button_minLayout.setHorizontalGroup(
            button_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        button_minLayout.setVerticalGroup(
            button_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        icone_min_max_close.add(button_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        max_panel.setBackground(new java.awt.Color(0, 0, 0));
        max_panel.setPreferredSize(new java.awt.Dimension(50, 50));
        max_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                max_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                max_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                max_panelMouseExited(evt);
            }
        });
        max_panel.setLayout(new java.awt.BorderLayout());

        button_max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/full_screen_32px.png"))); // NOI18N
        max_panel.add(button_max, java.awt.BorderLayout.CENTER);

        icone_min_max_close.add(max_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        close_panel.setBackground(new java.awt.Color(0, 0, 0));
        close_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_panelMouseExited(evt);
            }
        });
        close_panel.setLayout(new java.awt.BorderLayout());

        button_sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_32px.png"))); // NOI18N
        close_panel.add(button_sair, java.awt.BorderLayout.CENTER);

        icone_min_max_close.add(close_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        Header.add(icone_min_max_close, java.awt.BorderLayout.LINE_END);

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        jPanel2.setBackground(new java.awt.Color(73, 128, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);

        JTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTable1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        MateriaisDAO materiaisDAO = new MateriaisDAO();
        Object[][] listMateriais;
        try{
            listMateriais = materiaisDAO.getMateriais();
            JTable1.setModel(new javax.swing.table.DefaultTableModel(
                listMateriais,
                new String [] {
                    "Materiais", "Quantidade", "Status"
                }
            ));
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO: " + exception);
        }
        JTable1.setFocusable(false);
        JTable1.setGridColor(new java.awt.Color(0, 0, 0));
        JTable1.setRowHeight(25);
        JTable1.setSelectionBackground(new java.awt.Color(83, 83, 83));
        JTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTable1.setShowGrid(false);
        JTable1.setShowHorizontalLines(true);
        JTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 540, 320));

        Panel_Menu_Extendido.setBackground(new java.awt.Color(19, 19, 19));
        Panel_Menu_Extendido.setPreferredSize(new java.awt.Dimension(160, 360));

        Panel_button_materiais.setBackground(new java.awt.Color(200, 200, 200));
        Panel_button_materiais.setPreferredSize(new java.awt.Dimension(135, 60));
        Panel_button_materiais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_button_materiaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_button_materiaisMouseExited(evt);
            }
        });

        button_materiais.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        button_materiais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_materiais.setText("Materiais");
        button_materiais.setPreferredSize(new java.awt.Dimension(60, 135));

        javax.swing.GroupLayout Panel_button_materiaisLayout = new javax.swing.GroupLayout(Panel_button_materiais);
        Panel_button_materiais.setLayout(Panel_button_materiaisLayout);
        Panel_button_materiaisLayout.setHorizontalGroup(
            Panel_button_materiaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_materiais, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        Panel_button_materiaisLayout.setVerticalGroup(
            Panel_button_materiaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_materiais, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel_button_autorizacao.setBackground(new java.awt.Color(230, 230, 230));
        Panel_button_autorizacao.setPreferredSize(new java.awt.Dimension(135, 60));
        Panel_button_autorizacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_button_autorizacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_button_autorizacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_button_autorizacaoMouseExited(evt);
            }
        });

        button_autorizacao.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        button_autorizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_autorizacao.setText("Validar");

        javax.swing.GroupLayout Panel_button_autorizacaoLayout = new javax.swing.GroupLayout(Panel_button_autorizacao);
        Panel_button_autorizacao.setLayout(Panel_button_autorizacaoLayout);
        Panel_button_autorizacaoLayout.setHorizontalGroup(
            Panel_button_autorizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_autorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Panel_button_autorizacaoLayout.setVerticalGroup(
            Panel_button_autorizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_autorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Panel_button_feedbacks.setBackground(new java.awt.Color(230, 230, 230));
        Panel_button_feedbacks.setPreferredSize(new java.awt.Dimension(135, 60));
        Panel_button_feedbacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_button_feedbacksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_button_feedbacksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_button_feedbacksMouseExited(evt);
            }
        });

        button_feedbacks.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        button_feedbacks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_feedbacks.setText("Feedback");

        javax.swing.GroupLayout Panel_button_feedbacksLayout = new javax.swing.GroupLayout(Panel_button_feedbacks);
        Panel_button_feedbacks.setLayout(Panel_button_feedbacksLayout);
        Panel_button_feedbacksLayout.setHorizontalGroup(
            Panel_button_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Panel_button_feedbacksLayout.setVerticalGroup(
            Panel_button_feedbacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Panel_Menu_ExtendidoLayout = new javax.swing.GroupLayout(Panel_Menu_Extendido);
        Panel_Menu_Extendido.setLayout(Panel_Menu_ExtendidoLayout);
        Panel_Menu_ExtendidoLayout.setHorizontalGroup(
            Panel_Menu_ExtendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_button_materiais, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Panel_button_autorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Panel_button_feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Panel_Menu_ExtendidoLayout.setVerticalGroup(
            Panel_Menu_ExtendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Menu_ExtendidoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Panel_button_materiais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Panel_button_autorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Panel_button_feedbacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(Panel_Menu_Extendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        Panel_button_sair.setBackground(new java.awt.Color(73, 128, 242));
        Panel_button_sair.setLayout(new java.awt.BorderLayout());

        button_voltar.setBackground(new java.awt.Color(73, 128, 242));
        button_voltar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        button_voltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_voltar.setText("SAIR");
        button_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_voltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_voltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_voltarMouseExited(evt);
            }
        });
        Panel_button_sair.add(button_voltar, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(Panel_button_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 60, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 900, 450));

        panel_barra_menu.setBackground(new java.awt.Color(0, 0, 0));

        panel_hide_menu.setBackground(new java.awt.Color(0, 0, 0));
        panel_hide_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_hide_menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_hide_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_hide_menuMouseExited(evt);
            }
        });
        panel_hide_menu.setLayout(new java.awt.BorderLayout());

        button_hide_menu.setBackground(new java.awt.Color(0, 0, 0));
        button_hide_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left_arrow_icon.png"))); // NOI18N
        panel_hide_menu.add(button_hide_menu, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout panel_barra_menuLayout = new javax.swing.GroupLayout(panel_barra_menu);
        panel_barra_menu.setLayout(panel_barra_menuLayout);
        panel_barra_menuLayout.setHorizontalGroup(
            panel_barra_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barra_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_hide_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panel_barra_menuLayout.setVerticalGroup(
            panel_barra_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barra_menuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel_hide_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        getContentPane().add(panel_barra_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    boolean a = true;
    private void max_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_max_panelMouseClicked
        if (this.getExtendedState() != PaginaMateriais.MAXIMIZED_BOTH) {
            this.setExtendedState(PaginaMateriais.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(PaginaMateriais.NORMAL);
        }
    }//GEN-LAST:event_max_panelMouseClicked
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    public void clickmenu(JPanel h1,int numberbool){
        
    }
    public void hideshow(JPanel menushowhide,boolean dashboard){
      if (dashboard == true){  
         Panel_Menu_Extendido.setPreferredSize(new Dimension(0, Panel_Menu_Extendido.getHeight()));
         //int x , int y , width , height
         jScrollPane1.setBounds(540,320,460,400);
         changeimage(button_hide_menu,"/icons/right_arrow_icon.png");
      }
      else{
         Panel_Menu_Extendido.setPreferredSize(new Dimension(160, Panel_Menu_Extendido.getHeight()));
         changeimage(button_hide_menu,"/icons/left_arrow_icon.png");
      }  jScrollPane1.setBounds(540,320,460,400);
    }
    private void max_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_max_panelMouseEntered
        changecolor(max_panel, new Color(19, 19, 19));
    }//GEN-LAST:event_max_panelMouseEntered

    private void max_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_max_panelMouseExited
        changecolor(max_panel, new Color(0, 0, 0));
    }//GEN-LAST:event_max_panelMouseExited

    private void close_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_panelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_panelMouseClicked

    private void close_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_panelMouseEntered
        changecolor(close_panel, new Color(19, 19, 19));
    }//GEN-LAST:event_close_panelMouseEntered

    private void close_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_panelMouseExited
        changecolor(close_panel, new Color(0, 0, 0));
    }//GEN-LAST:event_close_panelMouseExited

    private void panel_hide_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hide_menuMouseClicked
         clickmenu(panel_hide_menu,1);
         if(a == true){
            hideshow(Panel_Menu_Extendido,a);
            SwingUtilities.updateComponentTreeUI(this);
            a = false;
         }
         else{
             hideshow(Panel_Menu_Extendido,a);
             SwingUtilities.updateComponentTreeUI(this);
             a = true;
         }
    }//GEN-LAST:event_panel_hide_menuMouseClicked

    private void panel_hide_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hide_menuMouseEntered
    
    }//GEN-LAST:event_panel_hide_menuMouseEntered

    private void panel_hide_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hide_menuMouseExited

    }//GEN-LAST:event_panel_hide_menuMouseExited

    private void button_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_voltarMouseEntered
        Font originalFont = button_voltar.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        button_voltar.setFont(originalFont.deriveFont(attributes));
    }//GEN-LAST:event_button_voltarMouseEntered

    private void button_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_voltarMouseExited
        Font originalFont = button_voltar.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE,-1);
        button_voltar.setFont(originalFont.deriveFont(attributes));
    }//GEN-LAST:event_button_voltarMouseExited

    private void button_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_voltarMouseClicked
         PaginaLogin mi = new PaginaLogin();
                mi.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_button_voltarMouseClicked

    private void Panel_button_materiaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_materiaisMouseEntered
        Font originalFont = button_materiais.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        button_materiais.setFont(originalFont.deriveFont(attributes));
    }//GEN-LAST:event_Panel_button_materiaisMouseEntered

    private void Panel_button_materiaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_materiaisMouseExited
        Font originalFont = button_materiais.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE,-1);
        button_materiais.setFont(originalFont.deriveFont(attributes));
    }//GEN-LAST:event_Panel_button_materiaisMouseExited

    private void Panel_button_autorizacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_autorizacaoMouseEntered
        Font originalFont = button_autorizacao.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        button_autorizacao.setFont(originalFont.deriveFont(attributes));
        changecolor(Panel_button_autorizacao, new Color(200,200,200));
    }//GEN-LAST:event_Panel_button_autorizacaoMouseEntered

    private void Panel_button_autorizacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_autorizacaoMouseExited
        Font originalFont = button_autorizacao.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE,-1);
        button_autorizacao.setFont(originalFont.deriveFont(attributes));
        changecolor(Panel_button_autorizacao, new Color(242,242,242));
    }//GEN-LAST:event_Panel_button_autorizacaoMouseExited

    private void Panel_button_autorizacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_autorizacaoMouseClicked
        PaginaValidar PV = new PaginaValidar();
        PV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_button_autorizacaoMouseClicked

    private void Panel_button_feedbacksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_feedbacksMouseEntered
        Font originalFont = button_feedbacks.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        button_feedbacks.setFont(originalFont.deriveFont(attributes));
        changecolor(Panel_button_feedbacks, new Color(200,200,200));
    }//GEN-LAST:event_Panel_button_feedbacksMouseEntered

    private void Panel_button_feedbacksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_feedbacksMouseExited
        Font originalFont = button_feedbacks.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE,-1);
        button_feedbacks.setFont(originalFont.deriveFont(attributes));
        changecolor(Panel_button_feedbacks, new Color(242,242,242));
    }//GEN-LAST:event_Panel_button_feedbacksMouseExited

    private void Panel_button_feedbacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_button_feedbacksMouseClicked
        PaginaFeedback PF = new PaginaFeedback();
        PF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_button_feedbacksMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaMateriais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaMateriais().setVisible(true);
            }
        });
    }
    public void changeimage(JLabel button, String resourcheimg){
       ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
       button.setIcon(aimg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    public javax.swing.JTable JTable1;
    private javax.swing.JPanel Panel_Menu_Extendido;
    private javax.swing.JPanel Panel_button_autorizacao;
    private javax.swing.JPanel Panel_button_feedbacks;
    private javax.swing.JPanel Panel_button_materiais;
    private javax.swing.JPanel Panel_button_sair;
    private javax.swing.JLabel button_autorizacao;
    private javax.swing.JLabel button_feedbacks;
    private javax.swing.JLabel button_hide_menu;
    private javax.swing.JLabel button_materiais;
    private javax.swing.JLabel button_max;
    private javax.swing.JPanel button_min;
    private javax.swing.JLabel button_sair;
    private javax.swing.JLabel button_voltar;
    private javax.swing.JPanel close_panel;
    private javax.swing.JPanel header_icon;
    private javax.swing.JLabel icon_label_maua;
    private javax.swing.JPanel icone_min_max_close;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel max_panel;
    private javax.swing.JPanel panel_barra_menu;
    private javax.swing.JPanel panel_hide_menu;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
