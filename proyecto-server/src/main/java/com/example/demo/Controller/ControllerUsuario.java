package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping("/apiUsuario")
public class ControllerUsuario {
	@Autowired
	private UsuarioRepository usuarioRepository;
	@GetMapping("/listarUsuario")
	public List<Usuario> listarUsuario(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/registrarUsuario")
	public String registrarUsuario(@RequestBody Usuario usuario) {
		try {
			usuarioRepository.save(usuario);
			return "{saluda:/'hola /'}";
		} catch (Exception e) {
			// TODO: handle exception
			return "{saluda:/'mal /'}";
		}
		
	}
	
}
