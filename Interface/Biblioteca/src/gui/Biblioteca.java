/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.LivroDAO;
import controller.*;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author guilherme
 */
public class Biblioteca {
    /* testando 1223 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RegistrarEmpreView registrarEmpreView = new RegistrarEmpreView();
        registrarEmpreView.setVisible(true);
        //System.out.println(registrarEmpreView.getComponent(21));
        //jPanel2.setVisible(false);
        
        //DB conexao = new DB();
        Date now = new Date();
        
        System.out.println("date: " + now);
        
        
        DateFormat df = DateFormat.getDateInstance();
        String s = df.format(now);
        System.out.println("Hoje é " + s);
        
        Calendar calendar = Calendar.getInstance();
        
        calendar.add(calendar.DATE, 1);
        Date dt = calendar.getTime();
        //calendar.add(-2, Calendar.DAY_OF_YEAR);
        
        //DateTime dtOrg = new DateTime(dt);
        System.out.println(calendar);
        System.out.println(dt);

        //String novoFormato = novoFormatador.format(data);  
        //System.out.println(data);
        /*
        testes teste = new testes();
        teste.setVisible(true);
        */
        
        LivroDAO pesquisa = new LivroDAO();
        
        //System.out.println("nome: "+ registrarEmpreView.campoPesquisar.getText());
        
        ResultSet resultado = pesquisa.busca(registrarEmpreView.getComponent(6).getName());
    }
    
}
