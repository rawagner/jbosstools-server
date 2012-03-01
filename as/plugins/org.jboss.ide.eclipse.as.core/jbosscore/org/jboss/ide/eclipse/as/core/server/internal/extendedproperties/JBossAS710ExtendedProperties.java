/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/ 
package org.jboss.ide.eclipse.as.core.server.internal.extendedproperties;

import org.eclipse.wst.server.core.IServer;

/**
 *
 */
public class JBossAS710ExtendedProperties extends JBossAS7ExtendedProperties {

	public JBossAS710ExtendedProperties(IServer server) {
		super(server);
	}

	public int getJMXProviderType() {
		return JMX_AS_710_PROVIDER;
	}
}