public class DAO {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("JdbcTemplate")
    JdbcTemplate jdbcTemplateObj;

    public List<String> getGasVehicles(String modelYear) {
        String sql = "select VIN_CD from VEHICLE_TABLE where ENGINE_TYPE = 'GAS' and MODEL_YEAR = " + modelYear;
        List<String> results = jdbcTemplateObj.queryForList(sql, String.class);

        logger.info(results);

        return results;
    }

    public List<String> getElectricVehicles(String modelYear) {
        String sql = "select VIN_CD from VEHICLE_TABLE where ENGINE_TYPE = 'ELECTRIC' and MODEL_YEAR = " + modelYear;
        List<String> results = jdbcTemplateObj.queryForList(sql, String.class);

        logger.info(results);

        return results;
    }
}