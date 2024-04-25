import com.gchaldu.biblioteca.model.entity.Biblioteca;
import com.gchaldu.libro.model.repository.LibroRepository;
import com.gchaldu.libro.view.LibroView;
import com.gchaldu.prestamo.controller.PrestamoController;
import com.gchaldu.prestamo.model.entity.Prestamo;
import com.gchaldu.prestamo.model.repository.PrestamoRepository;
import com.gchaldu.prestamo.view.PrestamoView;
import com.gchaldu.usuario.controller.UsuarioController;
import com.gchaldu.usuario.model.repository.UsuarioRepository;
import com.gchaldu.usuario.view.UsuarioView;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        UsuarioView usuarioView = new UsuarioView();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        LibroView libroView = new LibroView();
        LibroRepository libroRepository = new LibroRepository();
        PrestamoView prestamoView = new PrestamoView();
        PrestamoRepository prestamoRepository = new PrestamoRepository();


        PrestamoController prestamoController = new PrestamoController(
                usuarioRepository,
                usuarioView,
                libroRepository,
                libroView,
                prestamoView,
                prestamoRepository);

        Biblioteca biblioteca = new Biblioteca(prestamoController);

        biblioteca.realizarPrestamo();
        List<Prestamo> list = biblioteca.getPrestamoController().getPrestamoRepository().getListaPrestamos();
        biblioteca.getPrestamoController().getPrestamoView().listadoPrestamos(list);
    }
}