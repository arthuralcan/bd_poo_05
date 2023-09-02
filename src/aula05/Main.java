package aula05;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver carregado com sucesso!");
		} catch (Exception ex) {
			System.out.println("Driver não carregado!");
		}

	}

}
