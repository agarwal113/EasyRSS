/*******************************************************************************
 * Copyright (c) 2012 Pursuer (http://pursuer.me).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Pursuer - initial API and implementation
 ******************************************************************************/

package com.pursuer.reader.easyrss.listadapter;

import com.pursuer.reader.easyrss.R;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class ListItemEndDisabled extends AbsListItem {
    public ListItemEndDisabled(final String id) {
        super(id);
    }

    @Override
    public View inflate(View view, final LayoutInflater inflater, final int fontSize) {
        if (view == null || view.getId() != R.id.ListItemEndDisabled) {
            view = inflater.inflate(R.layout.list_item_end_disabled, null);
        }
        final Button btn = (Button) view.findViewById(R.id.BtnLoadMore);
        btn.setTextSize(TypedValue.COMPLEX_UNIT_DIP, fontSize);
        return view;
    }
}
