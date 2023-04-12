package sistema;

import java.util.HashMap;

public class CadastroUsuarioESenha {
	private HashMap<String, String> usuarios;

    public CadastroUsuarioESenha() {
        usuarios = new HashMap<>();
    }

    public void cadastrarUsuario(String usuario, String senha) {
        usuarios.put(usuario, senha);
    }

    public boolean verificarUsuario(String usuario, String senha) {
        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
            return true;
        }
        return false;
    }
    
   

}
