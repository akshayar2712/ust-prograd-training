public class Probability {
    public double probabilityCalculation(double possibleEvents, double totalEvents) {
        return possibleEvents / totalEvents;
    }
    public double probabilityOfEvent(double possibleEvents, double totalEvents) {
        return probabilityCalculation(possibleEvents, totalEvents);
    }
}
