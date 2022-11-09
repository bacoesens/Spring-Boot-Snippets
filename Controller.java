public class Controller {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Service service;

    @RequestMapping(value = "/getGasVehicles", method = RequestMethod.GET)
    public List<String> getGasVehicles(@RequestParam(value = "model_year") String modelYear) {
        logger.info("In gas controller");
        return service.getGasVehicles();
    }

    @RequestMapping(value = "/getElectricVehicles", method = RequestMethod.GET)
    public List<String> getElectricVehicles(@RequestParam(value = "model_year") String modelYear) {
        logger.info("In electric controller");
        return service.getElectricVehicles();
    }
}