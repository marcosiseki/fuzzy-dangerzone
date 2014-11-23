/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;

/**
 *
 * @author guilherme
 */
public class RegistrarEmpreView extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarEmpreView
     */
    public RegistrarEmpreView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lateral = new javax.swing.JPanel();
        botaoLogin = new javax.swing.JButton();
        botaoConsulta = new javax.swing.JButton();
        botaoSacola = new javax.swing.JButton();
        botaoConfirmaEmprestimo = new javax.swing.JButton();
        frameRealizeConsulta = new javax.swing.JPanel();
        campoPesquisar = new javax.swing.JTextField();
        painelFIltros = new javax.swing.JPanel();
        labelFiltros = new javax.swing.JLabel();
        filtros = new javax.swing.JTabbedPane();
        filtroLivro = new javax.swing.JPanel();
        filtroLivroTitulo = new javax.swing.JCheckBox();
        filtroLivroISBN = new javax.swing.JCheckBox();
        filtroLivroAutor = new javax.swing.JCheckBox();
        FIltroLivroEditora = new javax.swing.JCheckBox();
        filtroDissertacao = new javax.swing.JPanel();
        filtroDissertacaoTitulo = new javax.swing.JCheckBox();
        filtroDissertacaoOrientador = new javax.swing.JCheckBox();
        filtroDissertacaoPalavraChave = new javax.swing.JCheckBox();
        filtroDissertacaoAluno = new javax.swing.JCheckBox();
        filtroDissertacaoAno = new javax.swing.JCheckBox();
        filtroDissertacaoAreaDePesquisa = new javax.swing.JCheckBox();
        filtroReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelBiblioteca = new javax.swing.JLabel();
        labelFaculdade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Biblioteca");
        setBackground(new java.awt.Color(255, 255, 255));

        lateral.setBackground(new java.awt.Color(108, 106, 104));
        lateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/appbar.user.png"))); // NOI18N
        botaoLogin.setText("Login");
        botaoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoLogin.setIconTextGap(-20);
        botaoLogin.setInheritsPopupMenu(true);
        botaoLogin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botaoLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        botaoConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/appbar.magnify.png"))); // NOI18N
        botaoConsulta.setText("Consulta");
        botaoConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConsulta.setIconTextGap(-20);
        botaoConsulta.setInheritsPopupMenu(true);
        botaoConsulta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botaoConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaActionPerformed(evt);
            }
        });

        botaoSacola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/appbar.shopping.png"))); // NOI18N
        botaoSacola.setText("Sacola");
        botaoSacola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSacola.setIconTextGap(-20);
        botaoSacola.setInheritsPopupMenu(true);
        botaoSacola.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botaoSacola.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSacolaActionPerformed(evt);
            }
        });

        botaoConfirmaEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/appbar.check.png"))); // NOI18N
        botaoConfirmaEmprestimo.setText("Confirma");
        botaoConfirmaEmprestimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConfirmaEmprestimo.setIconTextGap(-20);
        botaoConfirmaEmprestimo.setInheritsPopupMenu(true);
        botaoConfirmaEmprestimo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botaoConfirmaEmprestimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoConfirmaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lateralLayout = new javax.swing.GroupLayout(lateral);
        lateral.setLayout(lateralLayout);
        lateralLayout.setHorizontalGroup(
            lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lateralLayout.createSequentialGroup()
                        .addGroup(lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(botaoSacola, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoConfirmaEmprestimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        lateralLayout.setVerticalGroup(
            lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSacola, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoConfirmaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frameRealizeConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de livros e dissertações/teses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        frameRealizeConsulta.setName("Realize uma consulta"); // NOI18N

        campoPesquisar.setText("Pesquisa");
        campoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisarActionPerformed(evt);
            }
        });
        campoPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoPesquisarFocusLost(evt);
            }
        });

        labelFiltros.setText("Filtros ativos");

        filtros.setName(""); // NOI18N

        filtroLivroTitulo.setText("Título");
        filtroLivroTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroLivroTituloActionPerformed(evt);
            }
        });

        filtroLivroISBN.setText("ISBN");

        filtroLivroAutor.setText("Autor");

        FIltroLivroEditora.setText("Editora");

        javax.swing.GroupLayout filtroLivroLayout = new javax.swing.GroupLayout(filtroLivro);
        filtroLivro.setLayout(filtroLivroLayout);
        filtroLivroLayout.setHorizontalGroup(
            filtroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroLivroTitulo)
                    .addComponent(FIltroLivroEditora)
                    .addComponent(filtroLivroISBN)
                    .addComponent(filtroLivroAutor))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        filtroLivroLayout.setVerticalGroup(
            filtroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filtroLivroTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FIltroLivroEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroLivroISBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroLivroAutor)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        filtros.addTab("Livro", filtroLivro);

        filtroDissertacaoTitulo.setText("Título");
        filtroDissertacaoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroDissertacaoTituloActionPerformed(evt);
            }
        });

        filtroDissertacaoOrientador.setText("Orientador");
        filtroDissertacaoOrientador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroDissertacaoOrientadorActionPerformed(evt);
            }
        });

        filtroDissertacaoPalavraChave.setText("Palavra-chave");

        filtroDissertacaoAluno.setText("Aluno");

        filtroDissertacaoAno.setText("Ano");

        filtroDissertacaoAreaDePesquisa.setText("Área de pesquisa");

        javax.swing.GroupLayout filtroDissertacaoLayout = new javax.swing.GroupLayout(filtroDissertacao);
        filtroDissertacao.setLayout(filtroDissertacaoLayout);
        filtroDissertacaoLayout.setHorizontalGroup(
            filtroDissertacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroDissertacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtroDissertacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroDissertacaoTitulo)
                    .addComponent(filtroDissertacaoAluno)
                    .addComponent(filtroDissertacaoOrientador)
                    .addComponent(filtroDissertacaoPalavraChave)
                    .addComponent(filtroDissertacaoAno)
                    .addComponent(filtroDissertacaoAreaDePesquisa))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        filtroDissertacaoLayout.setVerticalGroup(
            filtroDissertacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtroDissertacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filtroDissertacaoTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroDissertacaoAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroDissertacaoOrientador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroDissertacaoPalavraChave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroDissertacaoAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroDissertacaoAreaDePesquisa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filtros.addTab("Dissertação", filtroDissertacao);

        filtroReset.setText("Reset");
        filtroReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFIltrosLayout = new javax.swing.GroupLayout(painelFIltros);
        painelFIltros.setLayout(painelFIltrosLayout);
        painelFIltrosLayout.setHorizontalGroup(
            painelFIltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFIltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFIltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroReset)
                    .addComponent(labelFiltros)
                    .addComponent(filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        painelFIltrosLayout.setVerticalGroup(
            painelFIltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFIltrosLayout.createSequentialGroup()
                .addComponent(labelFiltros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameRealizeConsultaLayout = new javax.swing.GroupLayout(frameRealizeConsulta);
        frameRealizeConsulta.setLayout(frameRealizeConsultaLayout);
        frameRealizeConsultaLayout.setHorizontalGroup(
            frameRealizeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameRealizeConsultaLayout.createSequentialGroup()
                .addComponent(painelFIltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameRealizeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        frameRealizeConsultaLayout.setVerticalGroup(
            frameRealizeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameRealizeConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameRealizeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameRealizeConsultaLayout.createSequentialGroup()
                        .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frameRealizeConsultaLayout.createSequentialGroup()
                        .addComponent(painelFIltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );

        labelBiblioteca.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelBiblioteca.setText("BIBLIOTECA DA FACOM ");

        labelFaculdade.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        labelFaculdade.setText("Faculdade de Computação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFaculdade)
                    .addComponent(labelBiblioteca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBiblioteca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFaculdade)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/grafo_facom.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setText("Bem-vindo, Secretário.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frameRealizeConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameRealizeConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisarActionPerformed
        // TODO add your handling code here:]
        
        String pesquisa = campoPesquisar.getText();
        if(pesquisa.compareToIgnoreCase("Pesquisa") != 0) {
            System.out.println(pesquisa);
        }
    }//GEN-LAST:event_campoPesquisarActionPerformed

    private void filtroLivroTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroLivroTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroLivroTituloActionPerformed

    private void filtroDissertacaoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroDissertacaoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroDissertacaoTituloActionPerformed

    private void filtroDissertacaoOrientadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroDissertacaoOrientadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroDissertacaoOrientadorActionPerformed

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoConsultaActionPerformed

    private void botaoSacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSacolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSacolaActionPerformed

    private void botaoConfirmaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoConfirmaEmprestimoActionPerformed

    private void filtroResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroResetActionPerformed
        // TODO add your handling code here:
        filtroDissertacaoAluno.setSelected(false);
        filtroDissertacaoAno.setSelected(false);
        filtroDissertacaoAreaDePesquisa.setSelected(false);
        filtroDissertacaoOrientador.setSelected(false);
        filtroDissertacaoPalavraChave.setSelected(false);
        filtroDissertacaoTitulo.setSelected(false);
        filtroLivroISBN.setSelected(false);
        filtroLivroAutor.setSelected(false);
        filtroLivroTitulo.setSelected(false);
        FIltroLivroEditora.setSelected(false);
    }//GEN-LAST:event_filtroResetActionPerformed

    private void campoPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPesquisarFocusGained
        // TODO add your handling code here:
        if(campoPesquisar.getText().equalsIgnoreCase("pesquisa"))
            campoPesquisar.setText("");
    }//GEN-LAST:event_campoPesquisarFocusGained

    private void campoPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPesquisarFocusLost
        // TODO add your handling code here:
        if(campoPesquisar.getText().equalsIgnoreCase(""))
            campoPesquisar.setText("Pesquisa");
    }//GEN-LAST:event_campoPesquisarFocusLost

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
            java.util.logging.Logger.getLogger(RegistrarEmpreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEmpreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox FIltroLivroEditora;
    private javax.swing.JButton botaoConfirmaEmprestimo;
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoSacola;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JPanel filtroDissertacao;
    private javax.swing.JCheckBox filtroDissertacaoAluno;
    private javax.swing.JCheckBox filtroDissertacaoAno;
    private javax.swing.JCheckBox filtroDissertacaoAreaDePesquisa;
    private javax.swing.JCheckBox filtroDissertacaoOrientador;
    private javax.swing.JCheckBox filtroDissertacaoPalavraChave;
    private javax.swing.JCheckBox filtroDissertacaoTitulo;
    private javax.swing.JPanel filtroLivro;
    private javax.swing.JCheckBox filtroLivroAutor;
    private javax.swing.JCheckBox filtroLivroISBN;
    private javax.swing.JCheckBox filtroLivroTitulo;
    private javax.swing.JButton filtroReset;
    private javax.swing.JTabbedPane filtros;
    private javax.swing.JPanel frameRealizeConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelBiblioteca;
    private javax.swing.JLabel labelFaculdade;
    private javax.swing.JLabel labelFiltros;
    private javax.swing.JPanel lateral;
    private javax.swing.JPanel painelFIltros;
    // End of variables declaration//GEN-END:variables
}
