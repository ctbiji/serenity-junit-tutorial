package seleniumeasy.Assertions;

import io.cucumber.java.bs.A;
import io.cucumber.java.sl.In;
import net.serenitybdd.core.Serenity;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AssertionsUsingAssertJ {

    @Test
    public void assertJAssertions(){
        int age =40;
        List<Integer> ages = Arrays.asList(12,15,48,52);
        Assertions.assertThat(age).isEqualTo(15);
        Assertions.assertThat(ages).contains(age)
                .allMatch(a -> a >= 0 && a <= 100);//each age here is greater than zero and less than or equal to 100

        Serenity.reportThat(" This is how we assert in serenity",
                () -> Assertions.assertThat(age).isEqualTo(20));
        Serenity.recordReportData().withTitle("Sometitle")
                .andContents("Credentials");
    }

}
