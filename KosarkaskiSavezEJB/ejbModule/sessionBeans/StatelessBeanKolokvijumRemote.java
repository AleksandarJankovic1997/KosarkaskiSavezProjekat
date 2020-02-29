package sessionBeans;

import java.util.List;

import javax.ejb.Remote;

import model.Kosarkasi;

@Remote
public interface StatelessBeanKolokvijumRemote {

	public void unesiIgraca(Kosarkasi k);
	
	public List<Kosarkasi> vratiKosarkase(String tim);
	
	public void azurirajTim(int id, String noviTim);
	
}
