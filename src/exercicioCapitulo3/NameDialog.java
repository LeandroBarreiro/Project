package exercicioCapitulo3;


// Obtendo a entrada de usuário a partir de um diálogo.
import javax.swing.JOptionPane;

public class NameDialog{

    public static void main(String[] args) {
        
        // pede para o usuário inserir seu nome 
        String name = JOptionPane.showInputDialog("What is your name?");

        //Crie a mensagem.
        String menssage = String.format("Welcome, %s, to Java Programming", name);

        // exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, menssage);

    }
}