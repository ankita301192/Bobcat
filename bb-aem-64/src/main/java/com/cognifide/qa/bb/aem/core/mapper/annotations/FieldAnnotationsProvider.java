/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2016 Cognifide Ltd.
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
package com.cognifide.qa.bb.aem.core.mapper.annotations;

import com.cognifide.qa.bb.utils.AnnotationsHelper;
import com.google.inject.Injector;
import org.openqa.selenium.support.pagefactory.AbstractAnnotations;
import org.openqa.selenium.support.pagefactory.Annotations;

import java.lang.reflect.Field;

/**
 * Responsible for providing proper {@link AbstractAnnotations} implementation based on the encountered field annotation.
 */
public final class FieldAnnotationsProvider {

  private FieldAnnotationsProvider() {
    //util
  }

  public static AbstractAnnotations create(Field field, Injector injector) {
    if (AnnotationsHelper.isFindByAnnotationPresent(field)) {
      return new Annotations(field);
    }
    if (AnnotationsHelper.isFindPageObjectAnnotationPresent(field)) {
      return new BobcatAnnotations(field, injector);
    }
    throw new IllegalArgumentException(
        "Field is not marked by any supported annotation: " + field.toGenericString());
  }

}
