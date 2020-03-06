/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.taglib.html_basic;

import javax.servlet.jsp.JspException;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.event.MethodExpressionValueChangeListener;
import jakarta.faces.validator.MethodExpressionValidator;
import jakarta.faces.webapp.UIComponentELTag;


/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */


public class SelectOneRadioTag extends UIComponentELTag {


    // Setter Methods
    // PROPERTY: converter
    private javax.el.ValueExpression converter;
    public void setConverter(javax.el.ValueExpression converter) {
        this.converter = converter;
    }

    // PROPERTY: converterMessage
    private javax.el.ValueExpression converterMessage;
    public void setConverterMessage(javax.el.ValueExpression converterMessage) {
        this.converterMessage = converterMessage;
    }

    // PROPERTY: immediate
    private javax.el.ValueExpression immediate;
    public void setImmediate(javax.el.ValueExpression immediate) {
        this.immediate = immediate;
    }

    // PROPERTY: required
    private javax.el.ValueExpression required;
    public void setRequired(javax.el.ValueExpression required) {
        this.required = required;
    }

    // PROPERTY: requiredMessage
    private javax.el.ValueExpression requiredMessage;
    public void setRequiredMessage(javax.el.ValueExpression requiredMessage) {
        this.requiredMessage = requiredMessage;
    }

    // PROPERTY: validator
    private javax.el.MethodExpression validator;
    public void setValidator(javax.el.MethodExpression validator) {
        this.validator = validator;
    }

    // PROPERTY: validatorMessage
    private javax.el.ValueExpression validatorMessage;
    public void setValidatorMessage(javax.el.ValueExpression validatorMessage) {
        this.validatorMessage = validatorMessage;
    }

    // PROPERTY: value
    private javax.el.ValueExpression value;
    public void setValue(javax.el.ValueExpression value) {
        this.value = value;
    }

    // PROPERTY: valueChangeListener
    private javax.el.MethodExpression valueChangeListener;
    public void setValueChangeListener(javax.el.MethodExpression valueChangeListener) {
        this.valueChangeListener = valueChangeListener;
    }

    // PROPERTY: accesskey
    private javax.el.ValueExpression accesskey;
    public void setAccesskey(javax.el.ValueExpression accesskey) {
        this.accesskey = accesskey;
    }

    // PROPERTY: border
    private javax.el.ValueExpression border;
    public void setBorder(javax.el.ValueExpression border) {
        this.border = border;
    }

    // PROPERTY: dir
    private javax.el.ValueExpression dir;
    public void setDir(javax.el.ValueExpression dir) {
        this.dir = dir;
    }

    // PROPERTY: disabled
    private javax.el.ValueExpression disabled;
    public void setDisabled(javax.el.ValueExpression disabled) {
        this.disabled = disabled;
    }

    // PROPERTY: disabledClass
    private javax.el.ValueExpression disabledClass;
    public void setDisabledClass(javax.el.ValueExpression disabledClass) {
        this.disabledClass = disabledClass;
    }

    // PROPERTY: enabledClass
    private javax.el.ValueExpression enabledClass;
    public void setEnabledClass(javax.el.ValueExpression enabledClass) {
        this.enabledClass = enabledClass;
    }

    // PROPERTY: group
    private javax.el.ValueExpression group;
    public void setGroup(javax.el.ValueExpression group) {
        this.group = group;
    }

    // PROPERTY: hideNoSelectionOption
    private javax.el.ValueExpression hideNoSelectionOption;
    public void setHideNoSelectionOption(javax.el.ValueExpression hideNoSelectionOption) {
        this.hideNoSelectionOption = hideNoSelectionOption;
    }

    // PROPERTY: label
    private javax.el.ValueExpression label;
    public void setLabel(javax.el.ValueExpression label) {
        this.label = label;
    }

    // PROPERTY: lang
    private javax.el.ValueExpression lang;
    public void setLang(javax.el.ValueExpression lang) {
        this.lang = lang;
    }

    // PROPERTY: layout
    private javax.el.ValueExpression layout;
    public void setLayout(javax.el.ValueExpression layout) {
        this.layout = layout;
    }

    // PROPERTY: onblur
    private javax.el.ValueExpression onblur;
    public void setOnblur(javax.el.ValueExpression onblur) {
        this.onblur = onblur;
    }

    // PROPERTY: onchange
    private javax.el.ValueExpression onchange;
    public void setOnchange(javax.el.ValueExpression onchange) {
        this.onchange = onchange;
    }

    // PROPERTY: onclick
    private javax.el.ValueExpression onclick;
    public void setOnclick(javax.el.ValueExpression onclick) {
        this.onclick = onclick;
    }

    // PROPERTY: ondblclick
    private javax.el.ValueExpression ondblclick;
    public void setOndblclick(javax.el.ValueExpression ondblclick) {
        this.ondblclick = ondblclick;
    }

    // PROPERTY: onfocus
    private javax.el.ValueExpression onfocus;
    public void setOnfocus(javax.el.ValueExpression onfocus) {
        this.onfocus = onfocus;
    }

    // PROPERTY: onkeydown
    private javax.el.ValueExpression onkeydown;
    public void setOnkeydown(javax.el.ValueExpression onkeydown) {
        this.onkeydown = onkeydown;
    }

    // PROPERTY: onkeypress
    private javax.el.ValueExpression onkeypress;
    public void setOnkeypress(javax.el.ValueExpression onkeypress) {
        this.onkeypress = onkeypress;
    }

    // PROPERTY: onkeyup
    private javax.el.ValueExpression onkeyup;
    public void setOnkeyup(javax.el.ValueExpression onkeyup) {
        this.onkeyup = onkeyup;
    }

    // PROPERTY: onmousedown
    private javax.el.ValueExpression onmousedown;
    public void setOnmousedown(javax.el.ValueExpression onmousedown) {
        this.onmousedown = onmousedown;
    }

    // PROPERTY: onmousemove
    private javax.el.ValueExpression onmousemove;
    public void setOnmousemove(javax.el.ValueExpression onmousemove) {
        this.onmousemove = onmousemove;
    }

    // PROPERTY: onmouseout
    private javax.el.ValueExpression onmouseout;
    public void setOnmouseout(javax.el.ValueExpression onmouseout) {
        this.onmouseout = onmouseout;
    }

    // PROPERTY: onmouseover
    private javax.el.ValueExpression onmouseover;
    public void setOnmouseover(javax.el.ValueExpression onmouseover) {
        this.onmouseover = onmouseover;
    }

    // PROPERTY: onmouseup
    private javax.el.ValueExpression onmouseup;
    public void setOnmouseup(javax.el.ValueExpression onmouseup) {
        this.onmouseup = onmouseup;
    }

    // PROPERTY: onselect
    private javax.el.ValueExpression onselect;
    public void setOnselect(javax.el.ValueExpression onselect) {
        this.onselect = onselect;
    }

    // PROPERTY: readonly
    private javax.el.ValueExpression readonly;
    public void setReadonly(javax.el.ValueExpression readonly) {
        this.readonly = readonly;
    }

    // PROPERTY: role
    private javax.el.ValueExpression role;
    public void setRole(javax.el.ValueExpression role) {
        this.role = role;
    }

    // PROPERTY: style
    private javax.el.ValueExpression style;
    public void setStyle(javax.el.ValueExpression style) {
        this.style = style;
    }

    // PROPERTY: styleClass
    private javax.el.ValueExpression styleClass;
    public void setStyleClass(javax.el.ValueExpression styleClass) {
        this.styleClass = styleClass;
    }

    // PROPERTY: tabindex
    private javax.el.ValueExpression tabindex;
    public void setTabindex(javax.el.ValueExpression tabindex) {
        this.tabindex = tabindex;
    }

    // PROPERTY: title
    private javax.el.ValueExpression title;
    public void setTitle(javax.el.ValueExpression title) {
        this.title = title;
    }


    // General Methods
    public String getRendererType() {
        return "jakarta.faces.Radio";
    }

    public String getComponentType() {
        return "jakarta.faces.HtmlSelectOneRadio";
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        jakarta.faces.component.UISelectOne selectone = null;
        try {
            selectone = (jakarta.faces.component.UISelectOne) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected: jakarta.faces.component.UISelectOne.  Perhaps you're missing a tag?");
        }

        if (converter != null) {
            if (!converter.isLiteralText()) {
                selectone.setValueExpression("converter", converter);
            } else {
                Converter conv = FacesContext.getCurrentInstance().getApplication().createConverter(converter.getExpressionString());
                selectone.setConverter(conv);
            }
        }

        if (converterMessage != null) {
            selectone.setValueExpression("converterMessage", converterMessage);
        }
        if (immediate != null) {
            selectone.setValueExpression("immediate", immediate);
        }
        if (required != null) {
            selectone.setValueExpression("required", required);
        }
        if (requiredMessage != null) {
            selectone.setValueExpression("requiredMessage", requiredMessage);
        }
        if (validator != null) {
            selectone.addValidator(new MethodExpressionValidator(validator));
        }
        if (validatorMessage != null) {
            selectone.setValueExpression("validatorMessage", validatorMessage);
        }
        if (value != null) {
            selectone.setValueExpression("value", value);
        }
        if (valueChangeListener != null) {
            selectone.addValueChangeListener(new MethodExpressionValueChangeListener(valueChangeListener));
        }
        if (accesskey != null) {
            selectone.setValueExpression("accesskey", accesskey);
        }
        if (border != null) {
            selectone.setValueExpression("border", border);
        }
        if (dir != null) {
            selectone.setValueExpression("dir", dir);
        }
        if (disabled != null) {
            selectone.setValueExpression("disabled", disabled);
        }
        if (disabledClass != null) {
            selectone.setValueExpression("disabledClass", disabledClass);
        }
        if (enabledClass != null) {
            selectone.setValueExpression("enabledClass", enabledClass);
        }
        if (group != null) {
            selectone.setValueExpression("group", group);
        }
        if (hideNoSelectionOption != null) {
            selectone.setValueExpression("hideNoSelectionOption", hideNoSelectionOption);
        }
        if (label != null) {
            selectone.setValueExpression("label", label);
        }
        if (lang != null) {
            selectone.setValueExpression("lang", lang);
        }
        if (layout != null) {
            selectone.setValueExpression("layout", layout);
        }
        if (onblur != null) {
            selectone.setValueExpression("onblur", onblur);
        }
        if (onchange != null) {
            selectone.setValueExpression("onchange", onchange);
        }
        if (onclick != null) {
            selectone.setValueExpression("onclick", onclick);
        }
        if (ondblclick != null) {
            selectone.setValueExpression("ondblclick", ondblclick);
        }
        if (onfocus != null) {
            selectone.setValueExpression("onfocus", onfocus);
        }
        if (onkeydown != null) {
            selectone.setValueExpression("onkeydown", onkeydown);
        }
        if (onkeypress != null) {
            selectone.setValueExpression("onkeypress", onkeypress);
        }
        if (onkeyup != null) {
            selectone.setValueExpression("onkeyup", onkeyup);
        }
        if (onmousedown != null) {
            selectone.setValueExpression("onmousedown", onmousedown);
        }
        if (onmousemove != null) {
            selectone.setValueExpression("onmousemove", onmousemove);
        }
        if (onmouseout != null) {
            selectone.setValueExpression("onmouseout", onmouseout);
        }
        if (onmouseover != null) {
            selectone.setValueExpression("onmouseover", onmouseover);
        }
        if (onmouseup != null) {
            selectone.setValueExpression("onmouseup", onmouseup);
        }
        if (onselect != null) {
            selectone.setValueExpression("onselect", onselect);
        }
        if (readonly != null) {
            selectone.setValueExpression("readonly", readonly);
        }
        if (role != null) {
            selectone.setValueExpression("role", role);
        }
        if (style != null) {
            selectone.setValueExpression("style", style);
        }
        if (styleClass != null) {
            selectone.setValueExpression("styleClass", styleClass);
        }
        if (tabindex != null) {
            selectone.setValueExpression("tabindex", tabindex);
        }
        if (title != null) {
            selectone.setValueExpression("title", title);
        }
    }
    // Methods From TagSupport
    public int doStartTag() throws JspException {
        try {
            return super.doStartTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    public int doEndTag() throws JspException {
        try {
            return super.doEndTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    // RELEASE
    public void release() {
        super.release();

        // component properties
        this.converter = null;
        this.converterMessage = null;
        this.immediate = null;
        this.required = null;
        this.requiredMessage = null;
        this.validator = null;
        this.validatorMessage = null;
        this.value = null;
        this.valueChangeListener = null;

        // rendered attributes
        this.accesskey = null;
        this.border = null;
        this.dir = null;
        this.disabled = null;
        this.disabledClass = null;
        this.enabledClass = null;
        this.group = null;
        this.hideNoSelectionOption = null;
        this.label = null;
        this.lang = null;
        this.layout = null;
        this.onblur = null;
        this.onchange = null;
        this.onclick = null;
        this.ondblclick = null;
        this.onfocus = null;
        this.onkeydown = null;
        this.onkeypress = null;
        this.onkeyup = null;
        this.onmousedown = null;
        this.onmousemove = null;
        this.onmouseout = null;
        this.onmouseover = null;
        this.onmouseup = null;
        this.onselect = null;
        this.readonly = null;
        this.role = null;
        this.style = null;
        this.styleClass = null;
        this.tabindex = null;
        this.title = null;
    }

    public String getDebugString() {
        return "id: " + this.getId() + " class: " + this.getClass().getName();
    }

}