/**
 * Copyright 2012 Alex Yanchenko
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
 */
package org.droidparts.reflect.model.sql;

import org.droidparts.reflect.model.FieldSpec;
import org.droidparts.reflect.model.sql.ann.ColumnAnn;

public class EntitySpec extends FieldSpec {

	public final ColumnAnn column = new ColumnAnn();

	@Override
	public String toString() {
		return super.toString() + ", columnName: " + column.name
				+ ", columnNullable: " + column.nullable + ", columnUnique: "
				+ column.unique + ", columnEager: " + column.eager;
	}
}