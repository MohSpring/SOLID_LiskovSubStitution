package hr.personnel;

public class Subcontractor {

    private String name;
    private int monthlyIncome;
    private int nbHoursPerWeek;


    public Subcontractor( String name, int monthlyIncome, int nbHoursPerWeek) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public boolean approveSLA(ServiceLicenseAgreement sla) {
        /*
        Business logic for approving a
        service license agreement for a subcontractor
         */
        boolean result = false;
        if (sla.getMinUptimePercent() >= 98
                && sla.getProblemResolutionTimeDays() <= 2) {
            result=  true;
        }

        System.out.println("SLA approval for " + this.name + ": " + result);
        return result;
    }
}
