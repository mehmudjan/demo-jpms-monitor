package monitor.observer.alpha;

import monitor.observer.ServiceObserver;
import monitor.observer.ServiceObserverFactory;

import java.util.Optional;

public class AlphaServiceObserverFactory implements ServiceObserverFactory {

	public AlphaServiceObserverFactory() {
		System.out.println("CREATED: AlphaServiceFactory\n");
	}

	@Override
	public Optional<ServiceObserver> createIfMatchingService(String service) {
		return AlphaServiceObserver.createIfAlphaService(service);
	}

}
