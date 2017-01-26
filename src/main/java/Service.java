public class Service {

private ClockService clockService;

    public Service(ClockService clockService) {
        this.clockService = clockService;
    }

    public String welcome(String skool4) {
        if(clockService.getTime()>12){
            return "Bonsoir "+skool4;
        }
        return "Bonjour "+skool4;
    }
}
