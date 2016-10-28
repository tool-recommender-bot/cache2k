package org.cache2k.core.util;

/*
 * #%L
 * cache2k core
 * %%
 * Copyright (C) 2000 - 2016 headissue GmbH, Munich
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.cache2k.CacheManager;
import org.cache2k.core.Cache2kManagerProviderImpl;

import java.sql.Timestamp;

/**
 * A set of utility stuff we need often.
 *
 * @author Jens Wilke; created: 2014-12-18
 */
public class Util {

  public static final String NAME_SEPARATOR = ":";

  /**
   * Format milliseconds since epoch to a compact timestamp.
   */
  public static String formatMillis(long _millis) {
    return new Timestamp(_millis).toString();
  }

  /**
   * Always throws exception. Used to mark a place in the code that needs work.
   *
   * @throws UnsupportedOperationException always throws an exception
   */
  public static void TODO() {
    throw new UnsupportedOperationException("TODO");
  }

  public static String compactFullName(CacheManager mgr, String _cacheName) {
    if (!Cache2kManagerProviderImpl.STANDARD_DEFAULT_MANAGER_NAME.equals(mgr.getName())) {
      return mgr.getName() + NAME_SEPARATOR + _cacheName;
    }
    return _cacheName;
  }

}
