/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.core.api.longarray;

import static org.assertj.core.test.LongArrays.arrayOf;
import static org.mockito.Mockito.verify;

import org.assertj.core.api.LongArrayAssert;
import org.assertj.core.api.LongArrayAssertBaseTest;

/**
 * Tests for <code>{@link LongArrayAssert#containsSubsequence(long...)}</code>.
 * 
 * @author Marcin Mikosik
 */
public class LongArrayAssert_containsSubsequence_Test extends LongArrayAssertBaseTest {

  @Override
  protected LongArrayAssert invoke_api_method() {
    return assertions.containsSubsequence(6L, 8L);
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertContainsSubsequence(getInfo(assertions), getActual(assertions), arrayOf(6L, 8L));
  }
}
