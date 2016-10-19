package co.com.experian.sla.ebyington;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.com.experian.sla.business.ExtendedSessionBean;

@SuppressWarnings("serial")
public class WebSsn extends ExtendedSessionBean {
	
	private static final Logger log = LoggerFactory.getLogger(WebSsn.class);
	
	public WebSsn() {
		
	}
	
	public final void destroy() {
		log.info("Web session bean destroyed");
	}

	public static WebSsn get() {
		WebSsn ssn = WebApp.get().get(WebSsn.class);
		log.debug("Using session with id {}", ssn.getId());
		return WebApp.get().get(WebSsn.class);
	}
	
	public static WebSsn create() {
		return new WebSsn();
	}
}