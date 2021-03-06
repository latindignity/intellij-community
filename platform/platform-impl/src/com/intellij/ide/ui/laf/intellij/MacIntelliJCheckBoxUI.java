/*
 * Copyright 2000-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.ide.ui.laf.intellij;

import com.intellij.ide.ui.laf.darcula.DarculaLaf;
import com.intellij.util.ui.EmptyIcon;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * @author Konstantin Bulenkov
 */
public class MacIntelliJCheckBoxUI extends IntelliJCheckBoxUI {
  public static final Icon DEFAULT_ICON = EmptyIcon.create(14);
  public static final Icon CHECKED_ICON = DarculaLaf.loadIcon("/com/intellij/ide/ui/laf/icons/checkboxSelectedMac.png");
  public static final Icon UNCHECKED_ICON = DarculaLaf.loadIcon("/com/intellij/ide/ui/laf/icons/checkboxMac.png");

  @SuppressWarnings({"MethodOverridesStaticMethodOfSuperclass", "UnusedDeclaration"})
  public static ComponentUI createUI(JComponent c) {
    return new MacIntelliJCheckBoxUI();
  }

  @Override
  protected void drawCheckIcon(JComponent c, Graphics2D g, JCheckBox b, Rectangle iconRect, boolean selected, boolean enabled) {
    getIcon(selected).paintIcon(c, g, iconRect.x, iconRect.y);
  }

  private Icon getIcon(boolean selected) {
    return selected ? CHECKED_ICON : UNCHECKED_ICON;
  }

  @Override
  public Icon getDefaultIcon() {
    return DEFAULT_ICON;
  }
}
