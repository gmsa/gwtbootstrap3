package com.svenjacobs.gwtbootstrap3.demo.client.demos.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.svenjacobs.gwtbootstrap3.client.ui.Row;

/**
 * @author Joshua Godi
 */
public class Tables extends Composite {
    interface TablesUiBinder extends UiBinder<Row, Tables> {
    }

    private static TablesUiBinder ourUiBinder = GWT.create(TablesUiBinder.class);

    public Tables() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}