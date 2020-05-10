package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-

		if(salarioBase <= 1039.0){
			return 0;
		}

		double salarioLiquido = descontaIrrf(descontaInss(salarioBase));


		return Math.round(salarioLiquido);
	}
	
	

	private double descontaInss(double salarioBruto) {

		if(salarioBruto <= 1500.0){
			return salarioBruto - (salarioBruto * 0.08);

		} else if(salarioBruto >= 1500.01 && salarioBruto <= 4000.0){
			return salarioBruto - ( salarioBruto * 0.09);

		}else{
			return  salarioBruto - ( salarioBruto * 0.11);
		}
	}

	private double descontaIrrf(double salarioDescontadoInss){

		if(salarioDescontadoInss <= 3000.0){
			return salarioDescontadoInss;

		} else if( salarioDescontadoInss > 3000.01 && salarioDescontadoInss <= 6000.0 ){
			return salarioDescontadoInss - (salarioDescontadoInss * 0.075);

		} else {
			return salarioDescontadoInss - (salarioDescontadoInss * 0.15);
		}
	}




}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/