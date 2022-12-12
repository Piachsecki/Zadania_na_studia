package Lab5;

import java.time.LocalDate;

public class DateOfUsage {
    private LocalDate localDate;

    @Override
    public String toString() {
        return "DateOfUsage{" +
                "localDate=" + localDate +
                '}';
    }

    public DateOfUsage() {
        localDate = LocalDate.of(2022, 12, 31);
    }

    public DateOfUsage(LocalDate localDate) {
        this.localDate = localDate;
    }
}
