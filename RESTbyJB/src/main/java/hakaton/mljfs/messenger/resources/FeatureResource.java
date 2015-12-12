package hakaton.mljfs.messenger.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import hakaton.mljfs.messenger.dao.BuildingDao;
import hakaton.mljfs.messenger.dao.FeatureDao;
import hakaton.mljfs.messenger.model.Building;
import hakaton.mljfs.messenger.model.Feature;

@Path("/features")
@Consumes(MediaType.APPLICATION_JSON + "; charset=UTF-8")
@Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
public class FeatureResource {
	
	@GET	
	public List<Feature> getFeatures() {		
		return FeatureDao.getAllFeatures();
	}
}
