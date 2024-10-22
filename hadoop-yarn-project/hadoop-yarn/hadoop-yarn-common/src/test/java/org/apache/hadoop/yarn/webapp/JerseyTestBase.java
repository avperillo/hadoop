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

package org.apache.hadoop.yarn.webapp;

import java.io.IOException;
import java.util.Random;


import org.apache.hadoop.net.ServerSocketUtil;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.spi.TestContainerFactory;

public abstract class JerseyTestBase extends JerseyTest {

  public JerseyTestBase(TestContainerFactory factory) {
    super(factory);
  }
//
//  protected int getPort(int port) {
//    Random rand = new Random();
//    int jerseyPort = port + rand.nextInt(1000);
//    try {
//      jerseyPort = ServerSocketUtil.getPort(jerseyPort, 10);
//    } catch (IOException e) {
//      // Ignore exception even after 10 times free port is
//      // not received.
//    }
//    return super.getPort(jerseyPort);
//  }
}
