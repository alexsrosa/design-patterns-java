package study.design.patterns.singleton.example1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 07/07/2023 19:54
 */
@ExtendWith(OutputCaptureExtension.class)
class ActionGreatUseCaseTest {

    private final ActionGreatUseCase actionUseCase = new ActionGreatUseCase();

    @AfterEach
    void clean(){
        actionUseCase.deleteAllGreat();
    }

    @Test
    void Given_ActionUseCaseASingleton_When_AddGreatValueAndSeeSize_Then_ReturnsCorrectlySizeAndLogs(CapturedOutput output) {
        actionUseCase.putGreatValue("abc", 123);
        assertEquals(1, actionUseCase.sizeGreat());
        assertEquals("abc", actionUseCase.fetchLastGreat().getKey());
        assertEquals(123, actionUseCase.fetchLastGreat().getValue());

        assertThat(output)
                .contains("Uses existent instance");
    }

    @Test
    void Given_ActionUseCaseASingleton_When_AddSomeGreatValueAndSeeSizeAndFetchLastGreat_Then_ReturnsCorrectlySizeAndLogsAndFetch(CapturedOutput output) {
        actionUseCase.putGreatValue("aaa", 123);
        actionUseCase.putGreatValue("bbb", 934);
        actionUseCase.putGreatValue("ccc", 897);
        assertEquals(3, actionUseCase.sizeGreat());
        assertEquals("ccc", actionUseCase.fetchLastGreat().getKey());
        assertEquals(897, actionUseCase.fetchLastGreat().getValue());

        assertThat(output)
                .contains("Uses existent instance");
    }
}