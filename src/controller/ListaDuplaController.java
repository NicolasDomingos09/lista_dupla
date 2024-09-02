package controller;

import model.estrutura.ListaDupla;
import model.estrutura.No;

public class ListaDuplaController{
	public ListaDuplaController(){
		super();
	}
	
	public String teste() throws Exception{
		ListaDupla lista = new ListaDupla();
		
		lista.append(1);
		lista.append(2);
		lista.append(3);
		lista.insert(1, 0);
		
		return lista.toString();
	}
}