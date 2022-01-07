
public class Principal {

	public static void main(String[] args) {
		Paciente c1 = new Paciente(84,1.83);
		System.out.println("O IMC do primeiro paciente é: "+c1.calculaIMC());
		System.out.println("O Diagnóstico do primeiro paciente é: "+c1.diagnostico());
		System.out.println();		
		Paciente c2 = new Paciente (80,1.83);
		System.out.println("O IMC do primeiro paciente é: "+c2.calculaIMC());
		System.out.println("O Diagnóstico do primeiro paciente é: "+c2.diagnostico());
		System.out.println();		
		Paciente c3 = new Paciente (47,1.65);
		System.out.println("O IMC do primeiro paciente é: "+c3.calculaIMC());
		System.out.println("O Diagnóstico do primeiro paciente é: "+c3.diagnostico());
		
	}

}
