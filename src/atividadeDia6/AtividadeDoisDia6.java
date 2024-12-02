package atividadeDia6;

public class AtividadeDoisDia6 {

	public static void main(String[] args) {
		
		// Primeiro vou criar as variáveis de notas para receber os valores:
		float n1 = 10.0f;
		float n2 = 8.0f;
		float n3 = 7.0f;
		float n4 = 7.5f;
		float media = (n1 + n2 + n3 + n4) / 4;
		
		// Aqui após já ter unido os valores das notas e dividido por 4 na variavel media, vou apenas 
		// apresentar a média na tela
		System.out.printf("Sua média é: %.2f", media);
		
		// coloquei o printf ao invés do println, pois estava aparecendo mais de dias casas decimais
		// e com o printf consegui colocar %.2f para definir a quantidade de casas para aparecer
		
	}

}
