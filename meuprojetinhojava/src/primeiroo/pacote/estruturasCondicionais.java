package primeiroo.pacote;

public class estruturasCondicionais {

	    public static void main(String[] args) {
	    	

	    	int condicao = 10;
//	    		estruturasCondicionais:
	    	if (condicao == 11) {
	    	    // código a ser executado se a condição for verdadeira
	    		return; //codigo para de ser executado.
	    	} else if (condicao == 10) {
	    	    // código a ser executado se a outra condição for verdadeira
	    	} else {
	    	    // código a ser executado se nenhuma das condições for verdadeira
	    		System.out.println("nao cai em nenhum if acima");
	    	}
	    	
	        int dia = 3;
	        String nomeDoDia;

	        switch (dia) {
	            case 1:
	                nomeDoDia = "Domingo";
	                break;
	            case 2:
	                nomeDoDia = "Segunda-feira";
	                break;
	            case 3:
	                nomeDoDia = "Terça-feira";
	                break;
	            case 4:
	                nomeDoDia = "Quarta-feira";
	                break;
	            case 5:
	                nomeDoDia = "Quinta-feira";
	                break;
	            case 6:
	                nomeDoDia = "Sexta-feira";
	                break;
	            case 7:
	                nomeDoDia = "Sábado";
	                break;
	            default:
	                nomeDoDia = "Dia inválido";
	        }

	        System.out.println(nomeDoDia);  // Imprime: Terça-feira
	    }
}

