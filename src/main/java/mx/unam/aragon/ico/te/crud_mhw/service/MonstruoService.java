package mx.unam.aragon.ico.te.crud_mhw.service;
import java.util.List;
import mx.unam.aragon.ico.te.crud_mhw.models.Monstruo;
import mx.unam.aragon.ico.te.crud_mhw.repository.MonstruoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonstruoService {
    @Autowired
    private MonstruoRepository monstruoRepository;
    public List<Monstruo> obtenerMonstruos() {
        return monstruoRepository.findAll();
    }
    public Monstruo encontrarPorId(Integer id) {
        return monstruoRepository.findById(id).orElseThrow(() -> new RuntimeException("Monstruo no encontrado"));
    }
    public boolean guardarNuevoMonstruo(Monstruo monstruo){
        Monstruo result = monstruoRepository.save(monstruo);
        return result != null;
    }
    public boolean editarMonstruoExistente(Monstruo monstruo) {
        if (monstruoRepository.existsById(monstruo.getId())) {
            monstruoRepository.save(monstruo);
            return true;
        }
        return false;
    }
    public boolean eliminarMonstruoPorId(Integer id) {
        if (monstruoRepository.existsById(id)) {
            monstruoRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
