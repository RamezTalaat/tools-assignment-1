package api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@Path("/test")
public class test extends Application{
	@GET
	public String testMessage () {
		return "working properly";
	}
}
