package com.vaadin.tests.tickets;

import java.net.URL;

import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class Ticket2287 extends Ticket2292 {

    @Override
    public void init() {
        final Window main = new Window(getClass().getName().substring(
                getClass().getName().lastIndexOf(".") + 1));
        setMainWindow(main);
        URL url = getURL();
        main.addComponent(new Label(
                "Icon is built by servlet with a slow method, so it will show the bug (components not firing requestLayout)."));

        Label l = new Label();
        l.setContentMode(Label.CONTENT_XHTML);
        l.setValue("This is a label with as slow image. <img src=\"" + url
                + "/icon.png\" />");
        main.addComponent(l);

        l = new Label();
        l.setContentMode(Label.CONTENT_XHTML);
        l.setValue("This is a label with as slow image. <img src=\"" + url
                + "/icon.png\" />");
        main.addComponent(l);

    }
}