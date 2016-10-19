package co.com.experian.sla.ebyington;

import javax.servlet.http.HttpServletRequest;

public class AppHubRequestImpl extends co.com.experian.sla.apphub.api.proxy.AppHubRequest {

	protected AppHubRequestImpl(HttpServletRequest request) {
		super(request);
	}

	@Override
	protected co.com.experian.sla.apphub.api.proxy.AppHubRequest newInstance(HttpServletRequest request) {
		return new AppHubRequestImpl(request);
	}
	
}
