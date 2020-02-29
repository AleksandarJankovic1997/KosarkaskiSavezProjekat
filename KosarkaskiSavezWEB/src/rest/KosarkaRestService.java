package rest;

import java.util.List;
import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Kosarkasi;
import sessionBeans.StatelessBeanKolokvijumRemote;

@Path("savez")
public class KosarkaRestService {
	
	StatelessBeanKolokvijumRemote bin;
	
	private static Context initialContext;
	
	private static final String PKG_INTERFACES = "org.jboss.ejb.client.naming";

	public static Context getInitialContext() throws NamingException {
		if (initialContext == null) {
			Properties properties = new Properties();
			properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
			initialContext = new InitialContext(properties);
		}
		return initialContext;
	}
	
	private static String getLookupName() {
		
		return "ejb:KosarkaskiSavezEAR/KosarkaskiSavezEJB//StatelessBeanKolokvijum!sessionBeans.StatelessBeanKolokvijumRemote";
	}
	private static StatelessBeanKolokvijumRemote doLookup() {
		Context context = null;
		StatelessBeanKolokvijumRemote bean = null;
		try {
			context = getInitialContext();
			String lookupName = getLookupName();
			System.out.println("JNDI ime:   "+lookupName);
			bean = (StatelessBeanKolokvijumRemote) context.lookup(lookupName);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return bean;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("igraciTim/{imetima}")
	public List<Kosarkasi> vratiIgraceTima(@PathParam("imetima")String imetima){
		bin=doLookup();
		List<Kosarkasi> kosarkasi=bin.vratiKosarkase(imetima);
		return kosarkasi;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("azurirajTim/{id}/{noviTim}")
	public void azurirajTim(@PathParam("id")int id,@PathParam("noviTim")String novitim) {
		bin=doLookup();
		bin.azurirajTim(id, novitim);
	}
}
