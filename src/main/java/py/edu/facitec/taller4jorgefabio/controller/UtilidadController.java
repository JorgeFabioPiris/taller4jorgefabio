/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.taller4jorgefabio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jorge Fabio
 */

@Controller
public class UtilidadController {
    @RequestMapping("/comollegar")
    public String index(){
        
        System.out.println("Pagina cargada");
        
        return "comollegar";
    }
}
