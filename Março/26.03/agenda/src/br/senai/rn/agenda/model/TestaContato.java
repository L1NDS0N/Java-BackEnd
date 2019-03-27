package br.senai.rn.agenda.model;

public class TestaContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato jose = new Contato();
		jose.setNome("José");
		jose.setFone("3333-5555");
		jose.setEmail("Jose@aoksd.com.br");
		
		Contato maria = new Contato("Maria", "2222-2222", "maria@terra.com.br");
		System.out.println(jose);
		System.out.print(maria);
		
//		
//		Contato c1 = new Contato("Maria", "2222-2222", "maria@terra.com.br");
//		Contato c2 = new Contato("Maria", "2222-2222", "maria@terra.com.br");
//		
//		System.out.println(c1 == c2);
	}

}
