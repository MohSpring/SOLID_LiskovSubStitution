package hr.main;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personnel.ServiceLicenseAgreement;
import hr.personnel.Subcontractor;

import java.util.ArrayList;
import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository( employeeFileSerializer );

        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement( minTimeOffPercent, maxResolutionDays );

        // Grab subcontractors
        // Subcontractors

        List<Subcontractor> subcontractors = new ArrayList<>(  );
        Subcontractor subcontractor = new Subcontractor( "Rebekah Jackson", 3000, 40 );
        subcontractors.add( subcontractor );
        subcontractors.forEach( sub -> sub.approveSLA( companySla ) );

    }
}
