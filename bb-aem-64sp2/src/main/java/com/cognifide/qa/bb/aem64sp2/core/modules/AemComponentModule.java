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
package com.cognifide.qa.bb.aem64sp2.core.modules;

import com.cognifide.qa.bb.aem.core.actions.ActionWithData;
import com.cognifide.qa.bb.aem.core.api.AemActions;
import com.cognifide.qa.bb.aem.core.component.actions.ConfigureComponent;
import com.cognifide.qa.bb.aem.core.component.actions.EditComponent;
import com.cognifide.qa.bb.aem.core.component.dialog.ConfigDialog;
import com.cognifide.qa.bb.aem.core.component.dialog.ConfigDialogImpl;
import com.cognifide.qa.bb.aem.core.component.dialog.DialogFieldRetriever;
import com.cognifide.qa.bb.aem.core.component.toolbar.CommonToolbarOption;
import com.cognifide.qa.bb.aem.core.component.toolbar.CommonToolbarOptions;
import com.cognifide.qa.bb.aem.core.component.toolbar.ComponentToolbar;
import com.cognifide.qa.bb.aem.core.component.toolbar.ComponentToolbarImpl;
import com.cognifide.qa.bb.aem.core.component.toolbar.ToolbarOption;
import com.cognifide.qa.bb.aem64sp2.core.component.dialog.DialogFieldRetrieverImpl;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import java.util.Arrays;

/**
 * Module that contains bindings for AEM 6.4 components
 */
public class AemComponentModule extends AbstractModule {

  @Override
  protected void configure() {
    bindComponentActions();
    bind(ComponentToolbar.class).to(ComponentToolbarImpl.class);
    bind(ConfigDialog.class).to(ConfigDialogImpl.class);
    bind(DialogFieldRetriever.class).to(DialogFieldRetrieverImpl.class);
    bindCommonToolbarOptions();
  }

  private void bindComponentActions() {
    MapBinder<String, ActionWithData> componentActions =
            MapBinder.newMapBinder(binder(), String.class, com.cognifide.qa.bb.aem.core.actions.ActionWithData.class);
    componentActions.addBinding(AemActions.EDIT_COMPONENT).to(EditComponent.class);
    componentActions.addBinding(AemActions.CONFIGURE_COMPONENT)
            .to((Class<? extends com.cognifide.qa.bb.aem.core.actions.ActionWithData>) ConfigureComponent.class);
  }

  private void bindCommonToolbarOptions() {
    MapBinder<String, ToolbarOption> toolbarOptions =
        MapBinder.newMapBinder(binder(), String.class, ToolbarOption.class);
    Arrays.stream(CommonToolbarOptions.values()).forEach(
        option -> toolbarOptions.addBinding(option.getTitle())
            .toInstance(new CommonToolbarOption(option.getTitle())));
  }
}
