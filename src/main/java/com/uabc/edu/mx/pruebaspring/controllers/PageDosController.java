package com.uabc.edu.mx.pruebaspring.controllers;



import com.uabc.edu.mx.pruebaspring.model.ExperienciaProfesional;
import com.uabc.edu.mx.pruebaspring.model.InformacionAcademica;
import com.uabc.edu.mx.pruebaspring.model.InformacionPersonal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class PageDosController {

    @GetMapping(value = "/curriculum")
    public String pagina(Model model){
        {
            InformacionPersonal ip = new InformacionPersonal();
            InformacionAcademica ia = new InformacionAcademica();
            ExperienciaProfesional ep = new ExperienciaProfesional();

            ip.setFechaN("23 de Diciembre de 1997");
            ip.setLugarN("Mexicali BC.");
            ip.setDir("Arnulfo R. Gomez #2373 - Mexicali");
            ip.setNombre("Jesus Miguel Angel Pio Hernandez");
            ip.setTel("(686)354-7543");
            ip.setMail("jesuspiold@gmail.com");

            ia.setDato1("Estudiante de la carrera Licenciado en Sistemas Computacionales- UABC");

            ia.setDato2("Congreso de Recursos Humanos CANACINTRA - Mexicali 2018");
            ia.setDato3("Intro to SQL for Data Science - DataCamp 2018");
            ia.setDato4("Joining Data in SQL - DataCamp 2018");

            ep.setDato1("2018 Agente de ventas en TELVISTA ABG");

            ip.setIdioma1("Nivel Alto- 6to Universidad Autonoma de Baja California Facultad de Idiomas");
            ip.setIdioma2("Nivel intermedio- A2 CETYS Universidad Escuela de Idiomas");
            ip.setIdioma3("Nivel Basico- 1ro Universidad Autonoma de Baja California Facultad de Idiomas");

            ip.setInformatica1("Dominio de los lenguajes de programacion: C, Python, Java");
            ip.setInformatica2("Conocimiento de bases de datos en MySQL");
            ip.setInformatica3("Conocimieno de utilizacion de sistemas bajo SO Linux");
            ip.setInformatica4("Conocimiento de las metodologias Agiles");

            model.addAttribute("InfoPers", ip);
            model.addAttribute("InfoAcad", ia);
            model.addAttribute("ExpProf", ep);


            return "pagina";
        }
    }
}
