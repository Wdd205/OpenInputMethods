/*
    Changjie Chinese Input Method for Android
    Copyright (C) 2012 LinkOmnia Ltd.

    Author: Wan Leung Wong (wanleung@linkomnia.com)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.xgimi.ime.changjie;

import android.content.Context;
import android.inputmethodservice.Keyboard;

public class ChangjieKeyBoard extends Keyboard {

    public ChangjieKeyBoard(Context context, int xmlLayoutResId) {
        super(context, xmlLayoutResId);
    }

    public ChangjieKeyBoard(
            Context context,
            int layoutTemplateResId,
            CharSequence characters,
            int columns,
            int horizontalPadding) {
        super(context, layoutTemplateResId, characters, columns, horizontalPadding);
    }

}
