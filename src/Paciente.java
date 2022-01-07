public class Paciente {
	double peso;
	double altura;
		
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public double calculaIMC() {
		return peso/(altura *altura);
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public String diagnostico() {
		String estado = null;
		calculaIMC();
		
		if (calculaIMC()<16) {
			estado="Baixo peso muito grave ";
		}
		
		if (calculaIMC()>=16 && calculaIMC()<=16.99) {
			estado="Baixo peso grave";
		}
		
		if (calculaIMC()>=17 && calculaIMC()<=18.49) {
			estado="Baixo peso";
		}
		
		if (calculaIMC()>=18.50 && calculaIMC()<=24.99) {
			estado="Peso normal";
		}
		
		if (calculaIMC()>=25 && calculaIMC()<=29.99) {
			estado="Sobrepeso";
	    }
		
		if (calculaIMC()>=30 && calculaIMC()<=34.99) {
			estado="Obesidade grau I";
	    }
		
		if (calculaIMC()>=35 && calculaIMC()<=39.99) {
			estado="Obesidade grau II";
	    }
		
		if (calculaIMC()> 40) {
			estado="Obesidade grau III";
	    }
		return estado;
	}

	@Override
	public String toString() {
		return "Paciente [peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
