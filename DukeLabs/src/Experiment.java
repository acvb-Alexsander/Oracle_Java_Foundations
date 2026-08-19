public class Experiment {

    String summary;
    Measurement[] measurements = new Measurement[10];

    void addMeasurement(String note, double value, String unit){
        for (int i=0;i< measurements.length;i++){
            if (measurements[i]==null){
                measurements[i] = new Measurement();
                measurements[i].setMeasurementsDetails(note, value, unit);
                break;
            }
        }
    }

    String experimentReport(){
        String report;
        report = "\n"+summary+"\n"+"Measurements: ";
        for (int i=0; i< measurements.length;i++){

            if (measurements[i]==null){
                break;
            }
            report+= "\n\t"+(i+1)+
                    " "+measurements[i].note +
                    " "+measurements[i].value+
                    " "+measurements[i].unit;
        }
        return report;
    }
}
