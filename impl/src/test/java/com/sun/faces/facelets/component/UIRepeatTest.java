/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.faces.facelets.component;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.lang.reflect.Method;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.IAnswer;
import org.junit.Test;

public class UIRepeatTest extends TestCase {

	private FacesContext jsf;

	private FacesMessage.Severity maximumSeverity = FacesMessage.SEVERITY_WARN;

	private Method uiRepeatHasErrorMessages;

	@Test
	public void testHasErrorMessages() throws Exception {
		jsf = EasyMock.createMock(FacesContext.class);
		expect(jsf.getMaximumSeverity()).andAnswer(new IAnswer<Severity>() {
			@Override
			public Severity answer() throws Throwable {
				return maximumSeverity;
			}
		}).anyTimes();
		replay(jsf);

		maximumSeverity = FacesMessage.SEVERITY_WARN;
		assertEquals(false, hasErrorMessages(jsf));
		maximumSeverity = FacesMessage.SEVERITY_INFO;
		assertEquals(false, hasErrorMessages(jsf));
		maximumSeverity = FacesMessage.SEVERITY_ERROR;
		assertEquals(true, hasErrorMessages(jsf));
		maximumSeverity = FacesMessage.SEVERITY_FATAL;
		assertEquals(true, hasErrorMessages(jsf));
	}

	private boolean hasErrorMessages(FacesContext context) throws Exception {
		if (uiRepeatHasErrorMessages == null) {
			Class<?> uiRepeatClass = Class.forName(UIRepeat.class.getName());
			uiRepeatHasErrorMessages = uiRepeatClass.getDeclaredMethod(
					"hasErrorMessages", new Class[] { FacesContext.class });
			uiRepeatHasErrorMessages.setAccessible(true);
		}
		return (Boolean)uiRepeatHasErrorMessages.invoke(new UIRepeat(),
				new Object[] { context });
	}
}
