import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ServiceUTest {

    @InjectMocks
    Service service;
    @Mock
    ClockService clock;

    @Test
    public void welcomeShouldReturnBonjourSkool4WhenTimeIs11h() {
        //Given
        //When
        Mockito.when(clock.getTime()).thenReturn(11);
        String result = service.welcome("Skool4");
        //Then
        Assertions.assertThat(result).isEqualTo("Bonjour Skool4");
    }

    @Test
    public void welcomeShouldReturnBonsoirSkool4WhenTimeIs17h33() {
        //Given
        //When
        Mockito.when(clock.getTime()).thenReturn(17);
        String result = service.welcome("Skool4");
        //Then
        Assertions.assertThat(result).isEqualTo("Bonsoir Skool4");
    }
}