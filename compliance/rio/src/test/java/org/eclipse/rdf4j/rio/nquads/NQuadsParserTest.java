/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.rio.nquads;

import org.eclipse.rdf4j.rio.RDFParser;
import org.eclipse.rdf4j.testsuite.rio.nquads.AbstractNQuadsParserTest;

import junit.framework.Test;

/**
 * JUnit test for the N-Quads parser.
 *
 * @author Arjohn Kampman
 */
public class NQuadsParserTest extends AbstractNQuadsParserTest {

	public static Test suite() throws Exception {
		return new NQuadsParserTest().createTestSuite();
	}

	@Override
	protected RDFParser createRDFParser() {
		return new NQuadsParser();
	}
}
