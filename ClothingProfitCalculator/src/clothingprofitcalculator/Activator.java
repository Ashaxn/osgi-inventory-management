package clothingprofitcalculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		 final ServiceProfitCalc serviceprofitcalc = new ServiceProfitCalcImpl();
	        this.serviceRegistration = bundleContext.registerService(ServiceProfitCalc.class.getName(), (Object)serviceprofitcalc, null);
	System.out.println();
	System.out.println("###########################################");
	System.out.println("###      Profit Calculator Started      ###");
	System.out.println("###########################################");
	System.out.println();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println();
		System.out.println("###########################################");
		System.out.println("###      Profit Calculator Stopped      ###");
		System.out.println("###########################################");
		System.out.println();
	}

}
