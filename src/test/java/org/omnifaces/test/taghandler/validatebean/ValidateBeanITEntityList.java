/*
 * Copyright 2020 OmniFaces
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.omnifaces.test.taghandler.validatebean;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

public class ValidateBeanITEntityList {

	private List<@Valid ValidateBeanITEntity> nestedList;

	public ValidateBeanITEntityList() {
		// Default c'tor.
	}

	public ValidateBeanITEntityList(ValidateBeanITEntityList other) {
		// Copy c'tor.
		this.nestedList = new ArrayList<>(other.nestedList);
	}

	public List<ValidateBeanITEntity> getNestedList() {
		return nestedList;
	}

	public void setNestedList(List<ValidateBeanITEntity> nestedList) {
		this.nestedList = nestedList;
	}
}