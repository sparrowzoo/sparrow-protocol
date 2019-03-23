/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sparrow.protocol.enums;

/**
 * @author harry
 */

public enum DATABASE_SPLIT_STRATEGY {
    /**
     * 默认无
     */
    DEFAULT,
    /**
     * 语言
     */
    LANGUAGE,
    /**
     * 用户id
     */
    USER_ID,
    /**
     * 用户自定义
     */
    USER_DEFINED,
    /**
     * 外键与分表一起使用
     */
    FOREIGN_KEY
}
