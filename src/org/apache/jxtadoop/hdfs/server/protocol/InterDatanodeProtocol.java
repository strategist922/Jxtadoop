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

package org.apache.jxtadoop.hdfs.server.protocol;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.jxtadoop.hdfs.protocol.Block;
import org.apache.jxtadoop.ipc.VersionedProtocol;

/** An inter-datanode protocol for updating generation stamp
 */
public interface InterDatanodeProtocol extends VersionedProtocol {
  public static final Log LOG = LogFactory.getLog(InterDatanodeProtocol.class);

  /**
   * 3: added a finalize parameter to updateBlock
   */
  public static final long versionID = 3L;

  /** @return the BlockMetaDataInfo of a block;
   *  null if the block is not found 
   */
  BlockMetaDataInfo getBlockMetaDataInfo(Block block) throws IOException;

  /**
   * Update the block to the new generation stamp and length.  
   */
  void updateBlock(Block oldblock, Block newblock, boolean finalize) throws IOException;
}
