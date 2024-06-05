package org.ox26res

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class CodingExerciseKotlinTest {

  @Test
  fun `test add`() {
    add(1, 2) shouldBe 3
  }
}
