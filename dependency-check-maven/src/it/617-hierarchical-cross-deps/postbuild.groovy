/*
 * This file is part of dependency-check-maven.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) 2014 Jeremy Long. All Rights Reserved.
 */

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
 
// Save NVD-CVE for next IT (if not already done)
File datasDwl = new File("target/local-repo/org/owasp/dependency-check-data/3.0", "dc.h2.db");
File datasSave = new File("target/nvd-cve-backup", "dc.h2.db");
if (datasDwl.exists() && !datasSave.exists()){
    System.out.println("Save NVD-CVE into backup");
    FileUtils.copyFile(datasDwl, datasSave);    
}
