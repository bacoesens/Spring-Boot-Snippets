public class Service {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DAO dao;

    public List<String> getGasVehicles(String modelYear) {
        logger.info("In gas service");
        return dao.getGasVehicles(modelYear);
    }

    public List<String> getElectricVehicles(String modelYear) {
        logger.info("In electric service");
        return dao.getElectricVehicles(modelYear);
    }
}