/*
 * Created on Apr 29, 2007
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2007-2011 the original author or authors.
 */
package org.fest.util;

import static org.junit.Assert.*;

import java.io.File;
import java.util.*;

import org.junit.Test;

/**
 * Tests for <code>{@link Maps#format(Map)}</code>.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class Maps_format_Test {

  @Test public void should_return_null_if_Map_is_null() {
    assertNull(Maps.format(null));
  }

  @Test public void should_return_empty_braces_if_Map_is_empty() {
    assertEquals(Maps.format(new HashMap<String, String>()), "{}");
  }

  @Test public void should_format_Map() {
    Map<String, Class<?>> map = new LinkedHashMap<String, Class<?>>();
    map.put("One", String.class);
    map.put("Two", File.class);
    assertEquals("{'One'=java.lang.String, 'Two'=java.io.File}", Maps.format(map));
  }
}
