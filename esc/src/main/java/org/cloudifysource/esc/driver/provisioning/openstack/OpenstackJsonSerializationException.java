/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.cloudifysource.esc.driver.provisioning.openstack;

/**
 * Exception to be thrown when then is a serialization issue with Openstack request/response.
 * 
 * @author victor
 * 
 */
public class OpenstackJsonSerializationException extends OpenstackException {

	private static final long serialVersionUID = 1L;

	public OpenstackJsonSerializationException() {
	}

	public OpenstackJsonSerializationException(final String message) {
		super(message);
	}

	public OpenstackJsonSerializationException(final Throwable cause) {
		super(cause);
	}

	public OpenstackJsonSerializationException(final String message, final Throwable cause) {
		super(message, cause);

	}

}
