/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cloudifysource.rest.validators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.cloudifysource.dsl.internal.CloudifyMessageKeys;
import org.junit.Before;
import org.junit.Test;

public class ValidateCloudConfigurationFileSizeTest extends InstallServiceValidatorTest {

    private ValidateCloudConfigurationFileSize validator;
    private static final long TEST_FILE_SIZE_LIMIT = 3;


    @Before
    public void initValidator() {
        validator = new ValidateCloudConfigurationFileSize();
        validator.setCloudConfigurationFileSizeLimit(TEST_FILE_SIZE_LIMIT);
    }

    @Test
    public void testSizeLimitExeeded() throws IOException {
        File cloudConfig = File.createTempFile("cloudConfig", "");
        FileUtils.writeStringToFile(cloudConfig, "I'm longer than 3 bytes !");
        testValidator(null, null, null, null, null, null, cloudConfig,
                CloudifyMessageKeys.CLOUD_CONFIGURATION_SIZE_LIMIT_EXCEEDED.getName());
        cloudConfig.delete();
    }

    @Override
    public InstallServiceValidator getValidatorInstance() {
        return validator;
    }

}
