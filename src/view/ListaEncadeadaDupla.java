package view;

import controller.ListaDuplaController;

public class ListaEncadeadaDupla{
	public static void main (String[] args){
		try{
			ListaDuplaController obj = new ListaDuplaController();
			System.out.println(obj.teste());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}