/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.RecemnascidoDao;
import javax.swing.JOptionPane;
import modelo.Recemnascido;
import tela.manutencao.ManutencaoRecemnascido;

/**
 *
 * @author Administrador
 */
public class ControladorRecemnascido {

    public static void inserir(ManutencaoRecemnascido man){
        Recemnascido objeto = new Recemnascido();
        
        objeto.setNomemae(man.jtfNomemae.getText());
        objeto.setPeso(Double.parseDouble(man.jtfPeso.getText()));
        objeto.setNumeroquarto(Integer.parseInt(man.jtfNumeroquarto.getText()));
        objeto.setSexo(man.jtfSexo.getText());
        
      
        
        boolean resultado = RecemnascidoDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

   public static void alterar(ManutencaoRecemnascido man){
        Recemnascido objeto = new Recemnascido();
        //definir todos os atributos
        
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNomemae(man.jtfNomemae.getText());
        objeto.setPeso(Double.parseDouble(man.jtfPeso.getText()));
        objeto.setNumeroquarto(Integer.parseInt(man.jtfNumeroquarto.getText()));
        objeto.setSexo(man.jtfSexo.getText());
        
        boolean resultado = RecemnascidoDao.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
   
    public static void excluir(ManutencaoRecemnascido man){
        Recemnascido objeto = new Recemnascido();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = RecemnascidoDao.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
