package mensclothing;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import mensclothing.ServiceMensCloths;
import mensclothing.ServiceMensClothsImpl;

public class Activator implements BundleActivator {
	
	ServiceRegistration serviceRegistration; 


	public void start(BundleContext bundleContext) throws Exception {
		 final ServiceMensCloths servicemenscloths = new ServiceMensClothsImpl();
	        this.serviceRegistration = bundleContext.registerService(ServiceMensCloths.class.getName(), (Object)servicemenscloths, null);
	System.out.println();
	System.out.println("######################################");
	System.out.println("###          Mens Cloths           ###");
	System.out.println("###     Stock Status : In Stock    ###");
	System.out.println("######################################");
	System.out.println();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println();
		System.out.println("######################################");
		System.out.println("###          Mens Cloths           ###");
		System.out.println("###   Stock Status : Out of Stock  ###");
		System.out.println("######################################");
		System.out.println();
	}

}
