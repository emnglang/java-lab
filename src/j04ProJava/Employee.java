package j04ProJava;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    Integer Id;
    String name;
    Double netWorth;

    Employee(Integer Id, String nameArg, Double netWorth) {
        this.Id = Id;
        this.name = nameArg;
        this.netWorth = netWorth;
    }

    public String getName() {
        return name;
    }


}
