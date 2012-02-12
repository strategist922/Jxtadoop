/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jxtadoop.fs.s3;

/**
 * Thrown when Hadoop cannot read the version of the data stored
 * in {@link S3FileSystem}.
 */
public class VersionMismatchException extends S3FileSystemException {
  public VersionMismatchException(String clientVersion, String dataVersion) {
    super("Version mismatch: client expects version " + clientVersion +
        ", but data has version " +
        (dataVersion == null ? "[unversioned]" : dataVersion));
  }

public VersionMismatchException(byte b, byte version) {
	this("a","b");
}  
}