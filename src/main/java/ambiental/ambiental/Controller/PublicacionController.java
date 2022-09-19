package ambiental.ambiental.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ambiental.ambiental.Model.Publicacion;
import ambiental.ambiental.Service.PublicacionRepository;

@Controller
public class PublicacionController {
  
    @Autowired
    private PublicacionRepository publicacionrepository ;

    //Lista
 
  @GetMapping("/publicacions")
  public String listarPublicacions(Model model){
      List<Publicacion> listaPublicacions = publicacionrepository.findAll();
      model.addAttribute("listaPublicacions", listaPublicacions);
      return "views/publicacion/publicacions";
  }

  /*
  //Formulario agregar
  @GetMapping("/publicacions/nuevo")
  public String mostrarFormularioNuevaPublicidad(Model model){
    List<Publicacion> listaPublicacion = publicacionrepository.findAll();
    model.addAttribute("publicacion", new Publicacion());
    model.addAttribute("listaPublicacions", listaPublicacion);
    return "publicacion/publicacion_formulario";
  }

  //Guardar
  @PostMapping("/publicacions/guardar")
  public String guardarPublicidad(Publicacion publicacion){
    publicacionrepository.save(publicacion);
    return "redirect:/publicacions";
  }


//Editar

  @GetMapping("/publicacions/editar/{idPublicacion}")
  public String mostrarFormularioModeficarPublicacion(@PathVariable("idPublicacion")Integer idPublicacion,Model model){
    Publicacion publicacion = publicacionrepository.findById(idPublicacion).get();
    model.addAttribute("publicaicon", publicacion);
    return "/";
  }

  //Eliminar
  @GetMapping("/publicacions/eliminar/{idPublicacion}")
  public String eliminarPublicacion(@PathVariable("idPublicacion") Integer idPublicacion,Model model){
    publicacionrepository.deleteById(idPublicacion);
    return "redirect:/publicacions";
  }*/
}