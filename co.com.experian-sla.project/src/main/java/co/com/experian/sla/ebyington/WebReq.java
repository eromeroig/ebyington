package co.com.experian.sla.ebyington;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;

import co.com.experian.sla.apphub.api.proxy.AppHubRequest;

public class WebReq {
	 
	private static final Logger log = LoggerFactory.getLogger(WebReq.class);

	public WebApplicationContext ctx() {
		return WebApp.get().ctx();
	}

	public AppHubRequest getRequest() {
		return WebApp.get().get(AppHubRequest.class);
	}
	
	public <T> T get(Class<T> c) {
		return ctx().getBean(c);
	}

	public <T> T get(Class<T> c, String id) {
		return ctx().getBean(id, c);
	}
	
	public final void destroy() {
		log.debug("Web request bean destroyed");
	}

	public static WebReq get() {
		return WebApp.get().get(WebReq.class);
	}
}