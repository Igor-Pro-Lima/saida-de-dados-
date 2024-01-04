import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		int a, b, idade;
		a = 10;
		b = 20;
		idade = 23;
				
		double x, salario;
		x = 2.2345;
		salario = 4000.0;
		
		String nome;
		nome = "Igor Lima";
		
		char sexo;
		sexo = 'M';
		
		
		
		// O println serve para quebra de linha. Ao contrário e quando não necessário pode utilizar apenas o print;
		System.out.println("Bom dia");
		System.out.println("Boa noite");
		
		System.out.println(a);
		System.out.println(b);
		
		// Placeholder para double é o 'f' deixando o 2.f para duas casas decimais;
		System.out.println(String.format("%.2f", x));
		
		// Concatenação de frases com variáveis;
		System.out.println("O " + nome + "," + " sexo " + sexo + " tem " + idade + " anos " + "e recebe " + String.format("%.2f", salario) + " reais. ");
		
		
	}

}
