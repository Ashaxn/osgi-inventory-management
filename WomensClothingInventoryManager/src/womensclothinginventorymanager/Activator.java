package womensclothinginventorymanager;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import clothingprofitcalculator.ServiceProfitCalc;
import womensclothing.ServiceWomensCloths;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		
        try {
            do {
        		System.out.println();
        		System.out.println("#####################################################################");
        		System.out.println("###    Welcome to Womens Clothing Inventory Management Section    ###");
        		System.out.println("#####################################################################");
        		System.out.println();
        		System.out.println();
        		System.out.println("###########################################");
        		System.out.println("##                                       ##");
        		System.out.println("##    1. View Womens Cloths              ##");
        		System.out.println("##    2. Calculate Women Cloths Profit   ##");
        		System.out.println("##                                       ##");
        		System.out.println("##   99. Exit                            ##");
        		System.out.println("##                                       ##");
        		System.out.println("###########################################");
        		System.out.println();
        		System.out.print("Enter Number: ");
                answer = scan.nextInt();
                switch (answer) {
                    case 1: {
                        this.serviceReference = bundleContext.getServiceReference(ServiceWomensCloths.class.getName());
                        final ServiceWomensCloths servicewomenscloths = (ServiceWomensCloths)bundleContext.getService(this.serviceReference);
                        if (servicewomenscloths != null) {
                        	servicewomenscloths.womenscloths();
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
		System.out.println("##########################################################");
		System.out.println("###    Womens Clothing Inventory Manager Logged Out    ###");
		System.out.println("##########################################################");
		System.out.println();
	}

}
