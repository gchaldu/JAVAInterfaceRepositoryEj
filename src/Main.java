import com.gchaldu.usuario.controller.UsuarioController;
import com.gchaldu.usuario.model.repository.UsuarioRepository;
import com.gchaldu.usuario.view.UsuarioView;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UsuarioView usuarioView = new UsuarioView();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        UsuarioController usuarioController = new UsuarioController(usuarioRepository, usuarioView);

        usuarioController.addUsuario();
        usuarioController.mostrarUsuario();
    }
}