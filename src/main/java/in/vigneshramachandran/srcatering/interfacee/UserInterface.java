package in.vigneshramachandran.srcatering.interfacee;

import in.vigneshramachandran.srcatering.model.User;

public interface UserInterface extends Base<User>{

	public abstract User findByEmail(String email);

	public abstract int count();






}
