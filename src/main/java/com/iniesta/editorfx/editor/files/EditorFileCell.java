/** 
 * Copyright [2013] Antonio J. Iniesta
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 * File created: 03/02/2013 at 11:49:55 by antonio
 */
package com.iniesta.editorfx.editor.files;

import java.io.File;

import javafx.scene.control.TreeCell;

/**
 * @author antonio
 *
 */
public class EditorFileCell extends TreeCell<File> {

	
	
	/* (non-Javadoc)
	 * @see javafx.scene.control.Cell#updateItem(java.lang.Object, boolean)
	 */
	@Override
	protected void updateItem(File arg0, boolean arg1) {		
		super.updateItem(arg0, arg1);
		setText(getString());
	}

	private String getString() {
        return getItem() == null ? "" : getItem().getName();
    }
}
