package study.design.patterns.singleton.example2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import study.design.patterns.singleton.example1.ActionGreatUseCase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 09/07/2023 20:54
 */
@ExtendWith(OutputCaptureExtension.class)
class ActionAmazingUseCaseTest {

    private final ActionAmazingUseCase actionUseCase = new ActionAmazingUseCase();

    @AfterEach
    void clean() {
        actionUseCase.deleteAllAmazing();
    }

    @Test
    void Given_ActionUseCaseASingleton_When_AddAmazingValueAndSeeSize_Then_ReturnsCorrectlySizeAndLogs(CapturedOutput output) {
        actionUseCase.putAmazingValue("abc", 123);
        assertEquals(1, actionUseCase.sizeAmazing());
        assertEquals("abc", actionUseCase.fetchLastAmazing().getKey());
        assertEquals(123, actionUseCase.fetchLastAmazing().getValue());

        assertThat(output)
                .contains("Uses existent instance");
    }

    @Test
    void Given_ActionUseCaseASingleton_When_AddSomeAmazingValueAndSeeSizeAndFetchLastAmazing_Then_ReturnsCorrectlySizeAndLogsAndFetch(CapturedOutput output) {
        actionUseCase.putAmazingValue("aaa", 123);
        actionUseCase.putAmazingValue("bbb", 934);
        actionUseCase.putAmazingValue("ccc", 897);
        assertEquals(3, actionUseCase.sizeAmazing());
        assertEquals("ccc", actionUseCase.fetchLastAmazing().getKey());
        assertEquals(897, actionUseCase.fetchLastAmazing().getValue());

        assertThat(output)
                .contains("Uses existent instance");
    }
}