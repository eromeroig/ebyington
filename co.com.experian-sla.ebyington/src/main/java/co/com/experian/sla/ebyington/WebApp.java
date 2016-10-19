package co.com.experian.sla.ebyington;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import co.com.experian.sla.apphub.api.AbstractGuestApplication;
import co.com.experian.sla.apphub.api.GuestApplication;

public class WebApp extends AbstractGuestApplication implements GuestApplication, ServletContextListener {
	
	private static WebApp instance;
	
	public static WebApp get() {
		return instance;
	}
	
	@Override
	public void contextInitialized(ServletContextEvent evt) {
		super.contextInitialized(evt);
		instance = this;
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent evt) {
		super.contextDestroyed(evt);
		instance = null;
	}
	
}
