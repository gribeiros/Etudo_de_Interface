package model.servive;

public class IpvaBrasil implements Ipva {

	@Override
	public double calIpva(double preco, Double porcentagem) {
		return preco * (porcentagem);
	}

}
