import Drivers.ChromeDriverManager;
import Drivers.DriverManager;
import Drivers.IEDriverManager;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){

        DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case IE:
                driverManager = new IEDriverManager();
                break;
        }
        return driverManager;
    }
}
