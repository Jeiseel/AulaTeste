// QUESTÃO 1
public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo(){
		this.largura = 0;
		this.altura = 0;
	}
	
	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	public String toString (){
		return "\n Largura" + this.largura + "\n Altura" + this.altura +":";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo ret = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(ret.altura))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(ret.largura))
			return false;
		return true;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void setLargura(double largura){
		this.largura = largura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public double getLargura(){
		return this.largura;
	}
	
	public double calculaPerimetroDoRetangulo(){
		return this.largura*2+2* this.altura;
	}
	
	public double calculaAreaDoRetangulo(){
		return this.largura*altura;
	}
	
}
   