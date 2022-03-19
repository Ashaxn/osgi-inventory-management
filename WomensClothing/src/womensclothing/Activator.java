package womensclothing;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		 final ServiceWomensCloths servicewomenscloths = new ServiceWomensClothsImpl();
	        this.serviceRegistration = bundleContext.registerService(ServiceWomensCloths.class.getName(), (Object)servicewomenscloths, null);
	System.out.println();
	System.out.println("######################################");
	System.out.println("###          Womens Cloths         ###");
	System.out.println("###     Stock Status : In Stock    ###");
	System.out.println("######################################");
	System.out.println();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println();
		System.out.println("######################################");
		System.out.println("###          Womens Cloths         ###");
		System.out.println("###   Stock Status : Out of Stock  ###");
		System.out.println("######################################");
		System.out.println();
	}

}
