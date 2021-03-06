/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2018 Cognifide Ltd.
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
package com.cognifide.qa.bb.aem.core.component.actions;

import com.cognifide.qa.bb.aem.core.actions.Action;
import com.cognifide.qa.bb.aem.core.actions.ActionData;
import com.cognifide.qa.bb.aem.core.actions.ActionException;


/**
 *
 */
public class ComponentData implements Action, ActionData {

  private String componentPath;

  private String componentName;

  private int componentOrder;

  public ComponentData(String componentPath, String componentName,
      int componentOrder) {
    this.componentPath = componentPath;
    this.componentName = componentName;
    this.componentOrder = componentOrder;
  }

  public String getComponentPath() {
    return componentPath;
  }

  public String getComponentName() {
    return componentName;
  }

  public int getComponentOrder() {
    return componentOrder;
  }

  public void execute(String action) throws ActionException {

  }

  public void execute(String action, ActionData data) throws ActionException {

  }

  @Override
  public void execute() throws com.cognifide.qa.bb.aem.core.actions.ActionException {

  }
}
