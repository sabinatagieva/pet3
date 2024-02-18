import org.testng.annotations.Test;
import step.PetSteps;


public class GenerateTest {

    private final PetSteps steps = new PetSteps();

    @Test
void shouldBeAddPet() {
    steps.getPet();
}
}
