package accessoriesmanager;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import accessories.ServiceAccessories;
import clothingprofitcalculator.ServiceProfitCalc;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		
        try {
            do {
        		System.out.println();
        		System.out.println("#################################################################");
        		System.out.println("###    Welcome to Accessories Inventory Management Section    ###");
        		System.out.println("#################################################################");
        		System.out.println();
        		System.out.println();
        		System.out.println("########################################");
        		System.out.println("##                                    ##");
        		System.out.println("##    1. View Accessories             ##");
        		System.out.println("##    2. Calculate Accessory Profit   ##");
        		System.out.println("##                                    ##");
        		System.out.println("##   99. Exit                         ##");
        		System.out.println("##                                    ##");
        		System.out.println("########################################");
        		System.out.println();
        		System.out.print("Enter Number: ");
                answer = scan.nextInt();
                switch (answer) {
                    case 1: {
                        this.serviceReference = bundleContext.getServiceReference(ServiceAccessories.class.getName());
                        final ServiceAccessories serviceAccessory = (ServiceAccessories)bundleContext.getService(this.serviceReference);
                        if (serviceAccessory != null) {
                        	serviceAccessory.accessories();
                            continue;
                        }
                        continue;
                    }
                    case 2: {
                        this.serviceReference = bundleContext.getServiceReference(ServiceProfitCalc.class.getName());
                        final ServiceProfitCalc serviceProfitCalc = (ServiceProfitCalc)bundleContext.getService(this.serviceReference);
                        if (serviceProfitCalc != null) {
                        	serviceProfitCalc.profitcalculate();
                            continue;
                        }
                        continue;
                    }
                    case 99: {
                        continue;
                    }
                    default: {
                        System.out.println("Invalid number. Please choose a given service number.");
                        continue;
                    }
                }
            } while (answer != 99);
	}catch (Exception ex) {
        System.out.println("Exception occured. ");
    }
		
		
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println();
		System.out.println("######################################################");
		System.out.println("###    Accessories Inventory Manager Logged Out    ###");
		System.out.println("######################################################");
		System.out.println();
	}

}
