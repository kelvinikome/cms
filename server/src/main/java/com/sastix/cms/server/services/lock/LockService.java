/*
 * Copyright(c) 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sastix.cms.server.services.lock;

import com.sastix.cms.common.api.LockApi;
import com.sastix.cms.common.lock.LockDTO;
import com.sastix.cms.common.lock.NewLockDTO;
import com.sastix.cms.common.lock.QueryLockDTO;
import com.sastix.cms.common.lock.exceptions.LockNotAllowed;
import com.sastix.cms.common.lock.exceptions.LockNotFound;
import com.sastix.cms.common.lock.exceptions.LockNotHeld;
import com.sastix.cms.common.lock.exceptions.LockValidationException;

/**
 * Distributed Lock interface.
 */
public interface LockService extends LockApi{
    // Add any additional implementation
}
