import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class GetComputerProcessorDetails {
	public static String generateLicenseKey() throws Exception
    {     	
        SystemInfo systemInfo = new SystemInfo();
        
        //OperatingSystem operatingSystem = systemInfo.getOperatingSystem();
        HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();
        CentralProcessor centralProcessor = hardwareAbstractionLayer.getProcessor();

        //String vendor = operatingSystem.getManufacturer();
        String processorSerialNumber = centralProcessor.getProcessorID();
        //String processorIdentifier = centralProcessor.getIdentifier();
        //int processors = centralProcessor.getLogicalProcessorCount();
        //String delimiter = "#";

        return processorSerialNumber;
    }

    public static void main(String[] arguments) throws Exception
    {
        String identifier = generateLicenseKey();
        System.out.println("Computer Processor ID:" + identifier);
    }
}
