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
package com.cognifide.qa.bb.aem.core.login.actions;

import com.cognifide.qa.bb.aem.core.actions.Action;
import com.cognifide.qa.bb.aem.core.actions.ActionData;
import com.cognifide.qa.bb.aem.core.actions.ActionException;
import com.cognifide.qa.bb.aem.core.constants.AemConfigKeys;
import com.cognifide.qa.bb.aem.core.login.AemAuthCookieFactory;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;



public class LogIn implements Action {
  @Inject
  private WebDriver webDriver;

  @Inject
  private AemAuthCookieFactory aemAuthCookieFactory;

  @Inject
  @Named(AemConfigKeys.AUTHOR_URL)
  private String authorUrl;

  @Inject
  @Named(AemConfigKeys.AUTHOR_LOGIN)
  private String authorLoginProperty;

  @Inject
  @Named(AemConfigKeys.AUTHOR_PASSWORD)
  private String authorPassword;

  @Step("Logging in to AEM")
  public void execute() {
    webDriver.get(authorUrl + "/libs/granite/core/content/login.html");
    webDriver.manage()
        .addCookie(aemAuthCookieFactory.getCookie(authorUrl, authorLoginProperty, authorPassword));
  }

  public void execute(String action) throws ActionException {

  }

  public void execute(String action, ActionData data) throws ActionException {

  }
}
