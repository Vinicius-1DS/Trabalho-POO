import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//Criação da classe usuario.
//Declarando as variaveis usadas.
public class Usuario implements Serializable {
    private String login;
    private String senhaCriptografada;
    //Usando o this para referir-se à variável de instância e diferenciar ela de parametros.
    public Usuario(String login, String senha) {
        this.login = login;
        this.senhaCriptografada = criptografarSenha(senha);
    }
    //Inserindo a criptografia das senhas ditas pelo o usuario.
    private String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao criptografar senha", e);
        }
    }
    //Verificando o login do usuario.
    public String getLogin() {
        return login;
    }
    //Validando a senha do usuario.
    public boolean validarSenha(String senha) {
        return this.senhaCriptografada.equals(criptografarSenha(senha));
    }
}
