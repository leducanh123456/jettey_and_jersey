package testjettyembedet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorld {
 @GET
 @Path("test")
 @Produces(MediaType.TEXT_PLAIN)
 public String test() {
  return "Test";
 }
}