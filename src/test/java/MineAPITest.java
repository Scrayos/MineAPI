import io.github.open_code_community.mineapi.MineAPI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MineAPITest {

    @Test
    void generalAvailability() {
        Assertions.assertNotNull(MineAPI.getInstance());
    }
}
