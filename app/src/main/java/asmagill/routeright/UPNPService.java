package asmagill.routeright;

/**
 * Created by William on 3/27/2016.
 */

import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.android.AndroidUpnpServiceConfiguration;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDAServiceType;


public class UPNPService extends AndroidUpnpServiceImpl {

    @Override
    protected UpnpServiceConfiguration createConfiguration() {
        return new AndroidUpnpServiceConfiguration() {

            // DOC:REGISTRY
            @Override
            public int getRegistryMaintenanceIntervalMillis() {
                return 7000;
            }
            // DOC:REGISTRY

            // DOC:SERVICE_TYPE
            @Override
            public ServiceType[] getExclusiveServiceTypes() {
                return new ServiceType[]{
                        new UDAServiceType("SwitchPower")
                };
            }
            // DOC:SERVICE_TYPE
        };
    }
}
