package com.marson.cursojavamc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marson.cursojavamc.domain.Categoria;
import com.marson.cursojavamc.domain.Cidade;
import com.marson.cursojavamc.domain.Cliente;
import com.marson.cursojavamc.domain.Endereco;
import com.marson.cursojavamc.domain.Estado;
import com.marson.cursojavamc.domain.Produto;
import com.marson.cursojavamc.domain.enums.TipoCliente;
import com.marson.cursojavamc.repositories.CategoriaRepository;
import com.marson.cursojavamc.repositories.CidadeRepository;
import com.marson.cursojavamc.repositories.ClienteRepository;
import com.marson.cursojavamc.repositories.EnderecoRepository;
import com.marson.cursojavamc.repositories.EstadoRepository;
import com.marson.cursojavamc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursojavamcApplication implements CommandLineRunner {
	
	
	@Autowired
	private CategoriaRepository categoriaRepository ;  
	
	@Autowired
	private ProdutoRepository produtoRepository ;
	
	@Autowired
	private EstadoRepository estadoRepository ;
	
	@Autowired
	private CidadeRepository cidadeRepository ;
	
	@Autowired
	private ClienteRepository clienteRepository ;
	
	@Autowired
	private EnderecoRepository enderecoRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(CursojavamcApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria cat1 = new Categoria(null , "Informática");
		Categoria cat2 = new Categoria(null , "Escritório");
		Produto p1 = new Produto(null , "Computador" , 2000.00);
		Produto p2 = new Produto(null , "Impressora" , 800.00);
		Produto p3 = new Produto(null , "Mouse" , 80.00);
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2 , p3));
		
		
		Estado est1 = new Estado(null , "Minas Gerais");
		Estado est2 = new Estado(null , "São Paulo");
		Cidade c1 = new Cidade(null , "Uberlândia" , est1);
		Cidade c2 = new Cidade(null , "São Paulo" , est2);
		Cidade c3 = new Cidade(null , "Campinas" , est2);
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2,c3));
		
		
		Cliente cli1 = new Cliente(null,"Maria da silva" , "maria@gmail.com","36378912377",TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("33334556","999788765"));
		Endereco e1 = new Endereco(null , "Rua flores" , "300" , "apto 303" , "Jardim" , "38220834" , cli1 , c1);
		Endereco e2 = new Endereco(null , "Rua matos" , "320" , "sala 309" , "Centro" , "38770834" , cli1 , c2);
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
		
	}

}
