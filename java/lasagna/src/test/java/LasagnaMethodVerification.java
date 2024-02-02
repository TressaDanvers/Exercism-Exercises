import org.junit.jupiter.api.*;

import java.lang.reflect.*;
import java.util.concurrent.atomic.*;

import static org.assertj.core.api.Assertions.*;

public class LasagnaMethodVerification {
  @Test
  @Tag("task:1")
  @DisplayName("Implemented the expectedMinutesInOven method")
  public void implemented_expected_minutes_in_oven() {
    AtomicReference<Method> m = new AtomicReference<>(null);

    assertThatNoException()
      .describedAs("Method expectedMinutesInOven must be created")
      .isThrownBy(() -> m.set(Lasagna.class
        .getDeclaredMethod("expectedMinutesInOven")));
    assertThat(Modifier.isPublic(m.get().getModifiers()))
      .withFailMessage("Method expectedMinutesInOven must be public")
      .isTrue();
    assertThat(m.get().getReturnType().equals(int.class))
      .withFailMessage("Method expectedMinutesInOven must return an int")
      .isTrue();
  }

  @Test
  @Tag("task:2")
  @DisplayName("Implemented the remainingMinutesInOven method")
  public void implemented_remaining_minutes_in_oven() {
    AtomicReference<Method> m = new AtomicReference<>(null);

    assertThatNoException()
      .describedAs("Method remainingMinutesInOven must be created")
      .isThrownBy(() -> m.set(Lasagna.class
        .getDeclaredMethod("remainingMinutesInOven", int.class)));
    assertThat(Modifier.isPublic(m.get().getModifiers()))
      .withFailMessage("Method remainingMinutesInOven must be public")
      .isTrue();
    assertThat(m.get().getReturnType().equals(int.class))
      .withFailMessage("Method remainingMinutesInOven must return an int")
      .isTrue();
  }

  @Test
  @Tag("task:3")
  @DisplayName("Implemented the preparationTimeInMinutes method")
  public void implemented_preparation_time_in_minutes() {
    AtomicReference<Method> m = new AtomicReference<>(null);

    assertThatNoException()
      .describedAs("Method preparationTimeInMinutes must be created")
      .isThrownBy(() -> m.set(Lasagna.class
        .getDeclaredMethod("preparationTimeInMinutes", int.class)));
    assertThat(Modifier.isPublic(m.get().getModifiers()))
      .withFailMessage("Method preparationTimeInMinutes must be public")
      .isTrue();
    assertThat(m.get().getReturnType().equals(int.class))
      .withFailMessage("Method preparationTimeInMinutes must return an int")
      .isTrue();
  }

  @Test
  @Tag("task:4")
  @DisplayName("Implemented the totalTimeInMinutes method")
  public void implemented_total_time_in_minutes() {
    AtomicReference<Method> m = new AtomicReference<>(null);

    assertThatNoException()
      .describedAs("Method totalTimeInMinutes must be created")
      .isThrownBy(() -> m.set(Lasagna.class
        .getDeclaredMethod("totalTimeInMinutes", int.class, int.class)));
    assertThat(Modifier.isPublic(m.get().getModifiers()))
      .withFailMessage("Method totalTimeInMinutes must be public")
      .isTrue();
    assertThat(m.get().getReturnType().equals(int.class))
      .withFailMessage("Method totalTimeInMinutes must return an int")
      .isTrue();
  }
}
