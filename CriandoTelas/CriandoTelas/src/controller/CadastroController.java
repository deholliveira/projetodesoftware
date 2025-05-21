package controller;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.CadastroUsuario;
import model.Usuario;

public class CadastroController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSenha;

    @FXML
    void onClickCadastrar(ActionEvent event) throws SQLException {
    	//Criando um Id
    	int id = (int) (Math.random() * 100);
    	
    	//Capturando as informações digitadas nos input
    	String login = this.txtLogin.getText();
    	String nome = this.txtNome.getText();
    	String senha = this.txtSenha.getText();
    	
    	//Instancia um objeto da classe Usuario
    	Usuario usuario = new Usuario(id, login, nome, senha);
    	
    	//Instancia um objeto da classe CadastroUsuario
    	CadastroUsuario cadastroUsuario = new CadastroUsuario();
    	cadastroUsuario.cadastrarUsuario (usuario);
    }

}
