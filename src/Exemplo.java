import java.awt.Dialog;

public class Exemplo {

	public static void main(String[] args) {
		int idade = 17;

		ehMaiorIdade(524);
		classificar(20);
		System.out.println("Nome:" + concatenar("Andreas", "Faria"));
		System.out.println("Quantidade:" + tamanhoNomeCompleto()));
	}

	 //public=todos acessam; 
	 //void=não retorna valor; 
	 //após a última coluna de palavras-chave, aidcionar o nome da função e os argumentos;
	
	public static void ehMaiorIdade(int idade) {

		if (idade < 18) {

			System.out.print("menor de idade\n");

		} else {

			System.out.print("maior de idade\n");

		}
	}

	public static void classificar(int num) {
		String mensagem;
		if (num > 0) {

			mensagem = "Positivo";

		} else if (num < 0) {

			mensagem = "Negativo";

		} else {

			mensagem = "Zero";

		}

		System.out.print(String.format("%s é %s\n", num, mensagem));

	}

	public static String concatenar(String nome, String sobrenome) {

		String nomecompleto = String.format("%s %s", nome, sobrenome);

		return nomecompleto;

	}

	public static int tamanhoNomeCompleto() {
		String nomecompleto = concatenar("Andreas", "Faria");

		return nomecompleto.length();
	}

}
